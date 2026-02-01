package Exercise6_22;

public class TemperatureConversions {
    public static double celsius(double temperatureInFahrenheit){
        return 5/9 * (temperatureInFahrenheit-32);
    }
    public static double fahrenheit(double temperatureInCelsius){
        return 9/5 * temperatureInCelsius + 32;
    }
}
