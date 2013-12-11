package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-6
 */
public abstract class CityRelative {
    public String cityId;
    public String cityName;
    public String datetime;

    @Override
    public String toString() {
        return "CityRelative{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}
