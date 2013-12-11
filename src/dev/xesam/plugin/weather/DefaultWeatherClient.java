package dev.xesam.plugin.weather;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import dev.xesam.plugin.weather.struct.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class DefaultWeatherClient implements WeatherClient {

    private static final String DEFAULT_HOST = "mobile.weather.com.cn";

    private static final HashMap<String, String> headers = new HashMap<String, String>();
    static {
        headers.put("Accept", "application/json, text/javascript, */*; q=0.01");
        headers.put("Referer", "http://" + DEFAULT_HOST + "/");
        headers.put("Host", DEFAULT_HOST);
        headers.put("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6");
        headers.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Ubuntu Chromium/25.0.1364.160 Chrome/25.0.1364.160 Safari/537.22");
    }

    private Gson gson;

    public DefaultWeatherClient(){
        gson = new Gson();
    }

    private String get(String url) {
        StringBuffer sb = new StringBuffer();
        HttpRequest.get(url)
                .headers(headers)
                .receive(sb);
        System.out.println(sb.toString());
        return sb.toString();
    }

    private long getDefaultSuffix(){
        return new Date().getTime();
    }

    @Override
    public Forecast requestForecast(String cityName) {
        String cityId = DefaultWeatherConverter.getCityId(cityName);
        String url = "http://" + DEFAULT_HOST + "/data/forecast/" + cityId + ".html?_=" + getDefaultSuffix();
        return parseForecast(cityId, cityName, get(url));
    }

    private Forecast parseForecast(String cityId, String cityName, String jsonStr){
        Map<String, ?> root = gson.fromJson(jsonStr, Map.class);

        Map<String, String> c = (Map<String, String>) root.get("c");
        CityInfo cityInfo = new CityInfo();
        cityInfo.areaId = c.get("c1");
        cityInfo.nameEN = c.get("c2");
        cityInfo.nameCN = c.get("c3");
        cityInfo.cityNameEN = c.get("c4");
        cityInfo.cityNameCN = c.get("c5");
        cityInfo.provinceNameEN = c.get("c6");
        cityInfo.provinceNameCN = c.get("c7");
        cityInfo.countryNameEN = c.get("c8");
        cityInfo.countryNameCN = c.get("c9");
        cityInfo.level = c.get("c10");
        cityInfo.telCode = c.get("c11");
        cityInfo.zipCode = c.get("c12");
        cityInfo.longitude = c.get("c13");
        cityInfo.latidute = c.get("c14");
        cityInfo.altitude = c.get("c15");
        cityInfo.radioSNumber = c.get("c16");


        Map<String, ?> f = (Map) root.get("f");
        ArrayList<Map<String, String>> f1 = (ArrayList<Map<String, String>>) f.get("f1");
        ArrayList<ForecastItem> forecastItems = new ArrayList<ForecastItem>(f1.size());
        for(Map<String, String> m : f1){
            ForecastItem item = new ForecastItem();
            item.dayWeather         = DefaultWeatherConverter.getForecastType(m.get("fa"));
            item.nightWeather       = DefaultWeatherConverter.getForecastType(m.get("fb"));
            item.dayTemperature     = m.get("fc");
            item.nightTemperature   = m.get("fd");
            item.dayWindDirection   = DefaultWeatherConverter.getWDType(m.get("fe"));
            item.nightWindDirection = DefaultWeatherConverter.getWDType(m.get("ff"));
            item.dayWindLevel       = DefaultWeatherConverter.getWLType(m.get("fg"));
            item.nightWindLevel     = DefaultWeatherConverter.getWLType(m.get("fh"));

            String[] times = m.get("fi").split("\\|");
            item.sunriseTime = times[0];
            item.sunsetTime = times[1];
            forecastItems.add(item);
        }
        String datetime = DefaultWeatherConverter.getForecastDatetime(f.get("f0").toString()) ;

        Forecast forecast = new Forecast();
        forecast.cityId = cityId;
        forecast.cityName = cityName;
        forecast.datetime = datetime;

        forecast.cityInfo = cityInfo;
        forecast.forecastItems = forecastItems;


        return forecast;
    }

    @Override
    public FineForecast requestFineForecast(String cityName) {
        String cityId = DefaultWeatherConverter.getCityId(cityName);
        String url = "http://" + DEFAULT_HOST + "/data/forecast3h/" + cityId + ".html?_=" + getDefaultSuffix();
        return parseFineForecast(cityId, cityName, get(url));
    }

    private FineForecast parseFineForecast(String cityId, String cityName, String jsonStr){
        Map<String, ?> root = gson.fromJson(jsonStr, Map.class);
        Map<String, ?> j = (Map<String, ?>) root.get("j");

        String datetime = DefaultWeatherConverter.getFineForecastDatetime(j.get("j0").toString());

        ArrayList<Map<String, ?>> j1 = (ArrayList<Map<String, ?>>)j.get("j1");
        ArrayList<FineForecastItem> fineForecastItems = new ArrayList<FineForecastItem>(j1.size());
        for(Map<String, ?> m : j1){
            FineForecastItem item = new FineForecastItem();
            item.weather = DefaultWeatherConverter.getForecastType(m.get("ja").toString());
            item.temporatureMax = m.get("jb").toString();
            item.temporatureMin = m.get("jc").toString();
            item.windDirection = DefaultWeatherConverter.getWDType(m.get("jd").toString());
            item.windLevel = DefaultWeatherConverter.getWLType(m.get("je").toString());
            item.rainOrSnow = DefaultWeatherConverter.getRainSnowType(m.get("jf").toString());
            item.rainOrSnowLevel = m.get("jg").toString();
            item.startTime = DefaultWeatherConverter.getFineForecastItemDatetime(m.get("jh").toString());
            item.endTime = DefaultWeatherConverter.getFineForecastItemDatetime(m.get("ji").toString());
            fineForecastItems.add(item);
        }

        FineForecast fineForecast = new FineForecast();
        fineForecast.cityId = cityId;
        fineForecast.cityName = cityName;
        fineForecast.datetime = datetime;
        fineForecast.fineForecastItems = fineForecastItems;
        return fineForecast;
    }

    @Override
    public RealTimeForecast requestRealTimeForecast(String cityName){
        String cityId = DefaultWeatherConverter.getCityId(cityName);
        String url = "http://" + DEFAULT_HOST + "/data/sk/" + cityId + ".html?_=" + getDefaultSuffix();
        return parseRealTimeForecast(cityId, cityName, get(url));
    }

    private RealTimeForecast parseRealTimeForecast(String cityId, String cityName, String json_str){
        Map<String, ?> root = gson.fromJson(json_str, Map.class);
        Map<String, ?> root_info = (Map<String, ?>) root.get("sk_info");
        RealTimeForecast realTimeForecast = new RealTimeForecast();
        realTimeForecast.cityId = root_info.get("areaID").toString();
        realTimeForecast.cityName = root_info.get("cityName").toString();
        realTimeForecast.datetime = DefaultWeatherConverter.getRealTimeForecastDatetime(root_info.get("date").toString(), root_info.get("time").toString());
        realTimeForecast.humidity = root_info.get("sd").toString();
        realTimeForecast.sm = root_info.get("sm").toString();
        realTimeForecast.temperature = root_info.get("temp").toString();
        realTimeForecast.temperatureF = root_info.get("tempF").toString();
        realTimeForecast.windDirection = DefaultWeatherConverter.getWDTypeFromDesc(root_info.get("wd").toString());
        realTimeForecast.windLevel = DefaultWeatherConverter.getWLTypeFromDesc(root_info.get("ws").toString());
        return realTimeForecast;
    }

    @Override
    public AirQuality requestAirQuality(String cityName){
        String cityId = DefaultWeatherConverter.getCityId(cityName);
        String url = "http://" + DEFAULT_HOST + "/data/airnow/" + cityId + ".html?_=" + getDefaultSuffix();
        return parseAirQuality(cityId, cityName, get(url));
    }

    private AirQuality parseAirQuality(String cityId, String cityName, String jsonStr){
        Map<String, ?> root = gson.fromJson(jsonStr, Map.class);
        Map<String, ?> p = (Map<String, ?>) root.get("p");

        AirQuality airQuality = new AirQuality();

        airQuality.p1 = p.get("p1").toString();
        airQuality.p2 = p.get("p2").toString();
        airQuality.p3 = p.get("p3").toString();
        airQuality.p4 = p.get("p4").toString();
        airQuality.p5 = p.get("p5").toString();
        airQuality.p6 = p.get("p6").toString();
        airQuality.p7 = p.get("p7").toString();
        airQuality.p8 = p.get("p8").toString();

        airQuality.cityId = cityId;
        airQuality.cityName = cityName;
        airQuality.datetime = DefaultWeatherConverter.getAirQualityDatetime(p.get("p9").toString());
        return airQuality;
    }

    @Override
    public WeatherIndex requestWeatherIndex(String cityName){
        String cityId = DefaultWeatherConverter.getCityId(cityName);
        String url = "http://" + DEFAULT_HOST + "/data/zsM/" + cityId + ".html?_=" + getDefaultSuffix();
        return parseWeatherIndex(cityId, cityName, get(url));
    }

    private WeatherIndex parseWeatherIndex(String cityId, String cityName, String jsonStr){
        Map<String, ?> root = gson.fromJson(jsonStr, Map.class);

        String root_date = DefaultWeatherConverter.getWeatherIndexDatetime(root.get("date").toString());
        ArrayList<Map<String, ?>> root_list = (ArrayList<Map<String, ?>>) root.get("zs");

        ArrayList<WeatherIndexItem> items = new ArrayList<WeatherIndexItem>(root_list.size());
        for(Map<String, ?> m : root_list){
            WeatherIndexItem item = new WeatherIndexItem();
            item.name = m.get("name").toString();
            item.hint = m.get("hint").toString();
            item.describe = m.get("des").toString();
            items.add(item);
        }

        WeatherIndex weatherIndex = new WeatherIndex();
        weatherIndex.cityId = cityId;
        weatherIndex.cityName = cityName;
        weatherIndex.datetime = root_date;
        weatherIndex.weatherAdviceItems = items;
        return weatherIndex;
    }

}
