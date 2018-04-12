package tk.ovarb.realweatherlib;

public class BaseTypeElementaryWeatherForecastComponent {
    String timeRange;
    int value;

    BaseTypeElementaryWeatherForecastComponent(String period, int compValue) {
        timeRange = period;
        value = compValue;
    }
}