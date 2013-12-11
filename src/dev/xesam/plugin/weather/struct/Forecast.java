package dev.xesam.plugin.weather.struct;

import java.util.ArrayList;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class Forecast extends CityRelative{
    public CityInfo cityInfo;
    public ArrayList<ForecastItem> forecastItems;

    @Override
    public String toString() {
        return "Forecast{" +
                super.toString() +
                "cityInfo=" + cityInfo +
                ", forecastItems=" + forecastItems +
                '}';
    }
}