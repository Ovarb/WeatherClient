package tk.ovarb.realweatherlib;

public class TypeWeatherDataMain {
    double tempCurrent;
    double pressureCurrent;
    int humidityCurrent;
    double tempMin;
    double tempMax;
    double pressureCurrentSeaLevel;
    double pressureCurrentGroundLevel;

    TypeWeatherDataMain(double temp, double pressure, int humidity, double tMin, double tMax, double pressSeaLevel, double pressGroundLevel) {
        tempCurrent = temp;
        pressureCurrent = pressure;
        humidityCurrent = humidity;
        tempMin = tMin;
        tempMax = tMax;
        pressureCurrentSeaLevel = pressSeaLevel;
        pressureCurrentGroundLevel = pressGroundLevel;
    }
}
