package dev.test;

import dev.xesam.plugin.weather.DefaultWeatherClient;
import dev.xesam.plugin.weather.WeatherClient;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-6
 */
public class Test {
    public static void main(String[] args) {
        WeatherClient client = new DefaultWeatherClient();
        System.out.println(client.requestForecast("武汉"));
        System.out.println(client.requestFineForecast("武汉"));
        System.out.println(client.requestRealTimeForecast("武汉"));
        System.out.println(client.requestWeatherIndex("武汉"));
        System.out.println(client.requestAirQuality("武汉"));

    }
}
