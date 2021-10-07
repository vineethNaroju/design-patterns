package observer_pattern;

public class Tester {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        weatherData.updateMeasurements();

        weatherData.updateMeasurements();
    }
}
