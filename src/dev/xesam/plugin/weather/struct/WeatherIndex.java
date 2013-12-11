package dev.xesam.plugin.weather.struct;

import java.util.ArrayList;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class WeatherIndex extends CityRelative{
    public ArrayList<WeatherIndexItem> weatherAdviceItems;

    @Override
    public String toString() {
        return "WeatherIndex{" +
                super.toString() +
                "weatherAdviceItems=" + weatherAdviceItems +
                '}';
    }
}
