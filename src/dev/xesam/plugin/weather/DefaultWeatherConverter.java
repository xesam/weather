package dev.xesam.plugin.weather;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-6
 */
public class DefaultWeatherConverter {

    private static final boolean isEmptyString(String str){
        if("".equals(str) || null == str){
            return true;
        }

        return true;
    }

    //just for test!!
    public static String getCityId(String cityName){
        if(cityName.equals("武汉")){
            return "101200101";
        }else {
            return "101010100"; //"北京"
        }
    }

    public static int getForecastType(String typeStr){
        if(isEmptyString(typeStr)){
            return WeatherType.Weather.UNKNOWN;
        }
        return Integer.valueOf(typeStr);
    }

    public static int getWDType(String typeStr){
        if(isEmptyString(typeStr)){
            return WeatherType.WD.UNKNOWN;
        }
        return Integer.valueOf(typeStr);
    }

    public static int getWDTypeFromDesc(String descStr){
        int type;
        if (descStr.equals("东北风")){
            type = WeatherType.WD.EN;
        }else if (descStr.equals("东风")){
            type = WeatherType.WD.E;
        }else if (descStr.equals("东南风")){
            type = WeatherType.WD.ES;
        }else if (descStr.equals("南风")){
            type = WeatherType.WD.S;
        }else if (descStr.equals("西南风")){
            type = WeatherType.WD.WS;
        }else if (descStr.equals("西风")){
            type = WeatherType.WD.W;
        }else if (descStr.equals("西北风")){
            type = WeatherType.WD.WN;
        }else if (descStr.equals("北风")){
            type = WeatherType.WD.N;
        }else{
            type = WeatherType.WD.NONE;
        }

        return type;
    }

    public static int getWLType(String typeStr){
        if(isEmptyString(typeStr)){
            return WeatherType.WL.UNKNOWN;
        }
        return Integer.valueOf(typeStr);
    }

    public static int getWLTypeFromDesc(String descStr){
        int type;
        if (descStr.startsWith("1")){
            type = WeatherType.WL.LEVEL_0;
        }else if (descStr.startsWith("2")){
            type = WeatherType.WL.LEVEL_0;
        }else if (descStr.startsWith("3")){
            type = WeatherType.WL.LEVEL_1;
        }else if (descStr.startsWith("4")){
            type = WeatherType.WL.LEVEL_2;
        }else if (descStr.startsWith("5")){
            type = WeatherType.WL.LEVEL_3;
        }else if (descStr.startsWith("6")){
            type = WeatherType.WL.LEVEL_4;
        }else if (descStr.startsWith("7")){
            type = WeatherType.WL.LEVEL_5;
        }else if (descStr.startsWith("8")){
            type = WeatherType.WL.LEVEL_6;
        }else if (descStr.startsWith("9")){
            type = WeatherType.WL.LEVEL_7;
        }else if (descStr.startsWith("10")){
            type = WeatherType.WL.LEVEL_8;
        }else if (descStr.startsWith("11")){
            type = WeatherType.WL.LEVEL_9;
        }else if (descStr.startsWith("12")){
            type = WeatherType.WL.LEVEL_9;
        }else {
            type = WeatherType.WL.LEVEL_0;
        }

        return type;
    }

    public static int getRainSnowType(String typeStr){
        return Integer.valueOf(typeStr);
    }

    public static String getAirQualityDescribe(int airp2){
        String desc;
        if (airp2 > 0 && airp2 < 50) {
            desc = "优";
        } else if (airp2 >= 50 && airp2 < 100) {
            desc = "良";
        } else if (airp2 >= 100 && airp2 < 150) {
            desc = "轻污染";
        } else if (airp2 >= 150 && airp2 <= 200) {
            desc = "不健康";
        } else if (airp2 > 200 && airp2 <= 300) {
            desc = "危险";
        } else {
            desc = "有毒";
        }
        return desc;
    }

    private static final String getDatetimeString(String rawDatetime){

        String rawDate = rawDatetime.substring(0, 8);
        String rawTime = rawDatetime.substring(8, 12);
        return getDateString(rawDate) + " " + getTimeString(rawTime);
    }

    private static final String getDateString(String rawDatetime){
        String year = rawDatetime.substring(0, 4);
        String month = rawDatetime.substring(4, 6);
        String day = rawDatetime.substring(6, 8);
        return year + "-" + month + "-" + day ;
    }

    private static final String getTimeString(String rawTime){
        String hour = rawTime.substring(0, 2);
        String minute = rawTime.substring(2, 4);
        return hour + ":" + minute;
    }


    public static String getForecastDatetime(String rawDatetime){
        return getDatetimeString(rawDatetime);
    }

    public static String getFineForecastDatetime(String rawDatetime){
        return rawDatetime ;
    }

    public static String getFineForecastItemDatetime(String rawDatetime){
        return getDatetimeString(rawDatetime.substring(0, 12)) ;
    }

    public static String getRealTimeForecastDatetime(String rawDate, String rawTime){
        return getDateString(rawDate) + " " + rawTime ;
    }

    public static String getAirQualityDatetime(String rawDatetime){
        return getDatetimeString(rawDatetime);
    }
    public static String getWeatherIndexDatetime(String rawDate){
        return getDateString(rawDate) + " 00:00";
    }
}
