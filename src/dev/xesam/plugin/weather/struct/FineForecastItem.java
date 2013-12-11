package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class FineForecastItem {
    //天气
    public int weather;
    //最高温
    public String temporatureMax;
    //最低温
    public String temporatureMin;
    //风向
    public int windDirection;
    //风力
    public int windLevel;
    //区别降雨,降雪,无降雨降雪(0:无降雨和降雪, 1:降雨, 2:降雪)
    public int rainOrSnow;
    //该时间段内降水或降雪区间(单位是mm)
    public String rainOrSnowLevel;
    //该时间段内预报开始时间
    public String startTime;
    //该时间段内预报结束时间
    public String endTime;

    @Override
    public String toString() {
        return "FineForecastItem{" +
                "weather=" + weather +
                ", temporatureMax='" + temporatureMax + '\'' +
                ", temporatureMin='" + temporatureMin + '\'' +
                ", windDirection=" + windDirection +
                ", windLevel=" + windLevel +
                ", rainOrSnow=" + rainOrSnow +
                ", rainOrSnowLevel='" + rainOrSnowLevel + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
