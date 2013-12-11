package dev.xesam.plugin.weather.struct;

import java.util.ArrayList;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class FineForecast extends CityRelative{
    public ArrayList<FineForecastItem> fineForecastItems;

    @Override
    public String toString() {
        return "FineForecast{" +
                super.toString() +
                "fineForecastItems=" + fineForecastItems +
                '}';
    }
}
