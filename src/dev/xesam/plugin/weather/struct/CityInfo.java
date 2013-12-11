package dev.xesam.plugin.weather.struct;

/**
 * User: xesamguo@gmail.com
 * Date: 13-12-5
 */
public class CityInfo {
    //城市九位 ID 号
    public String areaId;
    //站点对应英文名称
    public String nameEN;
    //站点对应中文名称
    public String nameCN;
    //地市对应英文名称
    public String cityNameEN;
    //地市对应中文名称
    public String cityNameCN;
    //省对应英文名
    public String provinceNameEN;
    //省对应中文名称
    public String provinceNameCN;
    //国家对应英文名称
    public String countryNameEN;
    //国家对应中文名称
    public String countryNameCN;
    //站点级别(1 省会 2 地级市 3 县级)
    public String level;
    //电话区号
    public String telCode;
    //邮编
    public String zipCode;
    //经度
    public String longitude;
    //纬度
    public String latidute;
    //海拔高度(单位 m)
    public String altitude;
    //雷达站号
    public String radioSNumber;

    @Override
    public String toString() {
        return "CityInfo{" +
                "areaId='" + areaId + '\'' +
                ", nameEN='" + nameEN + '\'' +
                ", nameCN='" + nameCN + '\'' +
                ", cityNameEN='" + cityNameEN + '\'' +
                ", cityNameCN='" + cityNameCN + '\'' +
                ", provinceNameEN='" + provinceNameEN + '\'' +
                ", provinceNameCN='" + provinceNameCN + '\'' +
                ", countryNameEN='" + countryNameEN + '\'' +
                ", countryNameCN='" + countryNameCN + '\'' +
                ", level='" + level + '\'' +
                ", telCode='" + telCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latidute='" + latidute + '\'' +
                ", altitude='" + altitude + '\'' +
                ", radioSNumber='" + radioSNumber + '\'' +
                '}';
    }
}
