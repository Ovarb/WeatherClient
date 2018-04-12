package tk.ovarb.realweatherlib;

public class TypeSystemWeatherData {
    int sysType;
    int sysId;
    double sysMessage;
    String sysCountryCode;
    long sysTimeSunrise;
    long sysTimeSunset;

    TypeSystemWeatherData(int type, int id, double message, String country, long sunrise, long sunset) {
        sysType = type;
        sysId = id;
        sysMessage = message;
        sysCountryCode = country;
        sysTimeSunrise = sunrise;
        sysTimeSunset = sunset;
    }
}
