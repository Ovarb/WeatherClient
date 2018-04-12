package tk.ovarb.realweatherlib;

public class TypeWeatherDataAtmElementary {
    int weatherDataId;
    String weatherAtmComponent;
    String weatherAtmComponentData;
    String weatherAtmComponentIcon;

    TypeSystemWeatherData(int id, String mainWeather, String description, String icon) {
        weatherDataId = id;
        weatherAtmComponent = mainWeather;
        weatherAtmComponentData = description;
        weatherAtmComponentIcon = icon;
    }
}
