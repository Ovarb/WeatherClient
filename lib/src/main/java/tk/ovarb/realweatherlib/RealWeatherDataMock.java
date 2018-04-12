package tk.ovarb.realweatherlib;

public class RealWeatherDataMock extends RealWeatherData {
    RealWeatherDataMock() {
        locationCoords = new TypeLocationCoordinates(145.77,-16.92);

        atmValue = new TypeWeatherDataAtmElementary[1];
        atmValue[0] = new TypeWeatherDataAtmElementary(803,"Clouds","broken clouds","04n");

        baseInternal = "cmc stations";
        mainWeatherValue = new TypeWeatherDataMain(293.25,1019,83,289.82,295.37,0,0);
        windValue = new TypeWindData(5.1,150);
        cloudsValue = new TypeCloudsData("all", 75);
        rainValue = new TypeRainData("3h", 3);
        snowValue = new TypeSnowData("", 0);
        forecastOriginTime = 1435658272;
        systemData = new TypeSystemWeatherData(1,8166,0.0166,"AU",1435610796,1435650870);
        locationId = 2172797;
        locationName = "Cairns";
        codeInternal = 200;
    }

    public String getLocationName() {
        return locationName;
    }

}
