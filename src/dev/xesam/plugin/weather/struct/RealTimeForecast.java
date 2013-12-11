package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class RealTimeForecast  extends CityRelative{
    //湿度
    public String humidity;
    //
    public String sm;
    //温度
    //℃ 这个符号可能无法打印出来
    public String temperature;
    //温度
    //℉ 这个符号可能无法打印出来
    public String temperatureF;
    //温度
    public int windDirection;
    public int windLevel;

    @Override
    public String toString() {
        return "RealTimeForecast{" +
                super.toString() +
                "humidity='" + humidity + '\'' +
                ", sm='" + sm + '\'' +
                ", temperature='" + temperature + '\'' +
                ", temperatureF='" + temperatureF + '\'' +
                ", windDirection=" + windDirection +
                ", windLevel=" + windLevel +
                '}';
    }
}
