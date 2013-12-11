package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class ForecastItem {
    //白天天气
    public int dayWeather;
    //晚间天气
    public int nightWeather;
    //白天天气温（摄氏度）
    public String dayTemperature;
    //晚间气温
    public String nightTemperature;
    //白天风向
    public int dayWindDirection;
    //晚间风向
    public int nightWindDirection;
    //白天风力
    public int dayWindLevel;
    //晚间风力
    public int nightWindLevel;
    //日出时间
    public String sunriseTime;
    //日落时间
    public String sunsetTime;

    @Override
    public String toString() {
        return "ForecastItem{" +
                "dayWeather=" + dayWeather +
                ", nightWeather=" + nightWeather +
                ", dayTemperature='" + dayTemperature + '\'' +
                ", nightTemperature='" + nightTemperature + '\'' +
                ", dayWindDirection=" + dayWindDirection +
                ", nightWindDirection=" + nightWindDirection +
                ", dayWindLevel=" + dayWindLevel +
                ", nightWindLevel=" + nightWindLevel +
                ", sunriseTime='" + sunriseTime + '\'' +
                ", sunsetTime='" + sunsetTime + '\'' +
                '}';
    }
}
