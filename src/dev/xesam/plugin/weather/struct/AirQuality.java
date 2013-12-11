package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 * 参数意义没有找到说明
 */
public class AirQuality extends CityRelative{
    public String p1;
    public String p2;
    public String p3;
    public String p4;
    public String p5;
    public String p6;
    public String p7;
    public String p8;

    @Override
    public String toString() {
        return "AirQuality{" +
                super.toString() +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3='" + p3 + '\'' +
                ", p4='" + p4 + '\'' +
                ", p5='" + p5 + '\'' +
                ", p6='" + p6 + '\'' +
                ", p7='" + p7 + '\'' +
                ", p8='" + p8 + '\'' +
                '}';
    }
}

