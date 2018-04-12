package tk.ovarb.realweatherlib;

public class RealWeatherData {
    TypeLocationCoordinates locationCoords;
    TypeWeatherDataAtmElementary[] atmValue;
    String baseInternal;
    TypeWeatherDataMain mainWeatherValue;
    TypeWindData windValue;
    TypeCloudsData cloudsValue;
    TypeRainData rainValue;
    TypeSnowData snowValue;
    long forecastOriginTime;
    TypeSystemWeatherData systemData;
    int locationId;
    String locationName;
    int codeInternal;
}
