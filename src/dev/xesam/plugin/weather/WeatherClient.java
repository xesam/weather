package dev.xesam.plugin.weather;

import dev.xesam.plugin.weather.struct.*;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public interface WeatherClient {
    /**
     * 获取近一周内的天气预报（包括今天）
     * */
    Forecast requestForecast(String cityName);
    /**
     * 获取更详细（精确到小时级别）的天气情况
     * */
    FineForecast requestFineForecast(String cityName);
    /**
     * 获取当前的气象参数报告（不包括天气情况）
     * 天气情况参见 requestForecast
     * */
    RealTimeForecast requestRealTimeForecast(String cityName);
    /**
     * 获取当前的空气质量报告
     * */
    AirQuality requestAirQuality(String cityName);
    /**
     * 获取当前的气象指数报告
     * */
    WeatherIndex requestWeatherIndex(String cityName);
}
