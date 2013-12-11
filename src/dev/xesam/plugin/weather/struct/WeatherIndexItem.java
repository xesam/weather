package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class WeatherIndexItem {
    public String name;
    public String hint;
    public String describe;

    @Override
    public String toString() {
        return "WeatherIndexItem{" +
                "name='" + name + '\'' +
                ", hint='" + hint + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
