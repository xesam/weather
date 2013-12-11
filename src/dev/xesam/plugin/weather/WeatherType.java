package dev.xesam.plugin.weather;

import java.util.HashMap;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-6
 */
public class WeatherType {
    public static class Weather {

        public static final int SUNNY = 0;
        public static final int CLOUDY = 1;
        public static final int OVERCAST = 2;
        public static final int SHOWERS = 3;
        public static final int THUNDERSHOWERS = 4;
        public static final int THUNDERSHOWERS_HAIL = 5;
        public static final int SLEET = 6;
        public static final int LIGHT_RAIN = 7;
        public static final int MODERATE_RAIN = 8;
        public static final int HEAVY_RAIN = 9;
        public static final int STORM = 10;
        public static final int Heavy_STORM = 11;
        public static final int SEVERE_STORM = 12;
        public static final int SNOW_FLURRY = 13;
        public static final int LIGHT_SNOW = 14;
        public static final int MODERATE_SNOW = 15;
        public static final int HEAVY_SNOW = 16;
        public static final int SNOW_STORM = 17;
        public static final int FOGGY = 18;
        public static final int ICE_RAIN = 19;
        public static final int DUSTSTORM = 20;
        public static final int LIGHT_TO_MODERATE_RAIN = 21;
        public static final int MODERATE_TO_HEAVY_RAIN = 22;
        public static final int HEAVY_RAIN_TO_STORM = 23;
        public static final int STORM_TO_HEAVY_STORM = 24;
        public static final int HEAVY_TO_SEVERE_STORM = 25;
        public static final int LIGHT_TO_MODERATE_SNOW = 26;
        public static final int MODERATE_TO_HEAVY_SNOW = 27;
        public static final int HEAVY_SNOW_TO_SNOWSTORM = 28;
        public static final int DUST = 29;
        public static final int SAND = 30;
        public static final int SANDSTORM = 31;
        public static final int HAZE = 53;
        public static final int UNKNOWN = 99;

        public static final String SUNNY_D = "晴";
        public static final String CLOUDY_D = "多云";
        public static final String OVERCAST_D = "阴";
        public static final String SHOWERS_D = "阵雨";
        public static final String THUNDERSHOWERS_D= "雷阵雨";
        public static final String THUNDERSHOWERS_HAIL_D = "雷阵雨伴有冰雹";
        public static final String SLEET_D = "雨夹雪";
        public static final String LIGHT_RAIN_D = "小雨";
        public static final String MODERATE_RAIN_D = "中雨";
        public static final String HEAVY_RAIN_D = "大雨";
        public static final String STORM_D = "暴雨";
        public static final String Heavy_STORM_D = "大暴雨";
        public static final String SEVERE_STORM_D = "特大暴雨";
        public static final String SNOW_FLURRY_D = "阵雪";
        public static final String LIGHT_SNOW_D = "小雪";
        public static final String MODERATE_SNOW_D = "中雪";
        public static final String HEAVY_SNOW_D = "大雪";
        public static final String SNOW_STORM_D = "暴雪";
        public static final String FOGGY_D = "雾";
        public static final String ICE_RAIN_D = "冻雨";
        public static final String DUSTSTORM_D = "沙尘暴";
        public static final String LIGHT_TO_MODERATE_RAIN_D = "小到中雨";
        public static final String MODERATE_TO_HEAVY_RAIN_D = "中到大雨";
        public static final String HEAVY_RAIN_TO_STORM_D = "大到暴雨";
        public static final String STORM_TO_HEAVY_STORM_D = "暴雨到大暴雨";
        public static final String HEAVY_TO_SEVERE_STORM_D = "大暴雨到特大暴雨";
        public static final String LIGHT_TO_MODERATE_SNOW_D = "小到中雪";
        public static final String MODERATE_TO_HEAVY_SNOW_D = "中到大雪";
        public static final String HEAVY_SNOW_TO_SNOWSTORM_D = "大到暴雪";
        public static final String DUST_D = "浮尘";
        public static final String SAND_D = "扬沙";
        public static final String SANDSTORM_D = "强沙尘暴";
        public static final String HAZE_D = "霾";
        public static final String UNKNOWN_D = "";

        private static HashMap<Integer, String> mapper = new HashMap<Integer, String>();

        static {
            mapper.put(SUNNY, SUNNY_D);
            mapper.put(CLOUDY, CLOUDY_D);
            mapper.put(OVERCAST, OVERCAST_D);
            mapper.put(SHOWERS, SHOWERS_D);
            mapper.put(THUNDERSHOWERS, THUNDERSHOWERS_D);
            mapper.put(THUNDERSHOWERS_HAIL, THUNDERSHOWERS_HAIL_D);
            mapper.put(SLEET, SLEET_D);
            mapper.put(LIGHT_RAIN, LIGHT_RAIN_D);
            mapper.put(MODERATE_RAIN, MODERATE_RAIN_D);
            mapper.put(HEAVY_RAIN, HEAVY_RAIN_D);
            mapper.put(STORM, STORM_D);
            mapper.put(Heavy_STORM, Heavy_STORM_D);
            mapper.put(SEVERE_STORM, SEVERE_STORM_D);
            mapper.put(SNOW_FLURRY, SNOW_FLURRY_D);
            mapper.put(LIGHT_SNOW, LIGHT_SNOW_D);
            mapper.put(MODERATE_SNOW, MODERATE_SNOW_D);
            mapper.put(HEAVY_SNOW, HEAVY_SNOW_D);
            mapper.put(SNOW_STORM, SNOW_STORM_D);
            mapper.put(FOGGY, FOGGY_D);
            mapper.put(ICE_RAIN, ICE_RAIN_D);
            mapper.put(DUSTSTORM, DUSTSTORM_D);
            mapper.put(LIGHT_TO_MODERATE_RAIN, LIGHT_TO_MODERATE_RAIN_D);
            mapper.put(MODERATE_TO_HEAVY_RAIN, MODERATE_TO_HEAVY_RAIN_D);
            mapper.put(HEAVY_RAIN_TO_STORM, HEAVY_RAIN_TO_STORM_D);
            mapper.put(STORM_TO_HEAVY_STORM, STORM_TO_HEAVY_STORM_D);
            mapper.put(HEAVY_TO_SEVERE_STORM, HEAVY_TO_SEVERE_STORM_D);
            mapper.put(LIGHT_TO_MODERATE_SNOW, LIGHT_TO_MODERATE_SNOW_D);
            mapper.put(MODERATE_TO_HEAVY_SNOW, MODERATE_TO_HEAVY_SNOW_D);
            mapper.put(HEAVY_SNOW_TO_SNOWSTORM, HEAVY_SNOW_TO_SNOWSTORM_D);
            mapper.put(DUST, DUST_D);
            mapper.put(SAND, SAND_D);
            mapper.put(SANDSTORM, SANDSTORM_D);
            mapper.put(HAZE, HAZE_D);
            mapper.put(UNKNOWN, UNKNOWN_D);
        }

        public static final String getDescribe(int type){
            return mapper.get(type);
        }

    }

    public static class WD {

        public static final int NONE = 0;
        public static final int EN = 1;
        public static final int E = 2;
        public static final int ES = 3;
        public static final int S = 4;
        public static final int WS = 5;
        public static final int W = 6;
        public static final int WN = 7;
        public static final int N = 8;
        public static final int CYCLONE = 9;
        public static final int UNKNOWN = 99;

        public static final String NONE_D = "无持续风向";
        public static final String EN_D = "东北风";
        public static final String E_D = "东风";
        public static final String ES_D = "东南风";
        public static final String S_D = "南风";
        public static final String WS_D = "西南风";
        public static final String W_D = "西风";
        public static final String WN_D = "西北风";
        public static final String N_D = "北风";
        public static final String CYCLONE_D = "旋转风";
        public static final String UNKNOWN_D = "";

        private static HashMap<Integer, String> mapper = new HashMap<Integer, String>();

        static {
            mapper.put(NONE, NONE_D);
            mapper.put(EN, EN_D);
            mapper.put(E, E_D);
            mapper.put(ES, ES_D);
            mapper.put(S, S_D);
            mapper.put(WS, WS_D);
            mapper.put(W, W_D);
            mapper.put(WN, WN_D);
            mapper.put(N, N_D);
            mapper.put(CYCLONE, CYCLONE_D);
            mapper.put(UNKNOWN, UNKNOWN_D);
        }

        public static final String getDescribe(int type){
            return mapper.get(type);
        }
    }


    public static class WL {
        public static final int LEVEL_0 = 0;
        public static final int LEVEL_1 = 1;
        public static final int LEVEL_2 = 2;
        public static final int LEVEL_3 = 3;
        public static final int LEVEL_4 = 4;
        public static final int LEVEL_5 = 5;
        public static final int LEVEL_6 = 6;
        public static final int LEVEL_7 = 7;
        public static final int LEVEL_8 = 8;
        public static final int LEVEL_9 = 9;
        public static final int UNKNOWN = 99;

        public static final String LEVEL_0_D = "微风";
        public static final String LEVEL_1_D = "3-4级";
        public static final String LEVEL_2_D = "4-5级";
        public static final String LEVEL_3_D = "5-6级";
        public static final String LEVEL_4_D = "6-7级";
        public static final String LEVEL_5_D = "7-8级";
        public static final String LEVEL_6_D = "8-9级";
        public static final String LEVEL_7_D = "9-10级";
        public static final String LEVEL_8_D = "10-11级";
        public static final String LEVEL_9_D = "11-12级";
        public static final String UNKNOWN_D = "";

        private static HashMap<Integer, String> mapper = new HashMap<Integer, String>();

        static {
            mapper.put(LEVEL_0, LEVEL_0_D);
            mapper.put(LEVEL_1, LEVEL_1_D);
            mapper.put(LEVEL_2, LEVEL_2_D);
            mapper.put(LEVEL_3, LEVEL_3_D);
            mapper.put(LEVEL_4, LEVEL_4_D);
            mapper.put(LEVEL_5, LEVEL_5_D);
            mapper.put(LEVEL_6, LEVEL_6_D);
            mapper.put(LEVEL_7, LEVEL_7_D);
            mapper.put(LEVEL_8, LEVEL_8_D);
            mapper.put(LEVEL_9, LEVEL_9_D);
            mapper.put(UNKNOWN, UNKNOWN_D);
        }

        public static final String getDescribe(int type){
            return mapper.get(type);
        }

    }

    public static final class RainSnow{
        public static final int NONE = 0;
        public static final int RAIN = 1;
        public static final int SNOW = 2;

        public static final String NONE_D = "无降雨和降雪";
        public static final String RAIN_D = "降雨";
        public static final String SNOW_D = "降雪";

        private static HashMap<Integer, String> mapper = new HashMap<Integer, String>();

        static {
            mapper.put(NONE, NONE_D);
            mapper.put(RAIN, RAIN_D);
            mapper.put(SNOW, SNOW_D);
        }

        public static final String getDescribe(int type){
            return mapper.get(type);
        }
    }
}
