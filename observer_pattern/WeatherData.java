package observer_pattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    Set<Observer> observers; 

    WeatherData() {
        observers = new HashSet<Observer>();
    }

    public double getTemperature() {
        return Math.random() * 100;
    }
    public double getHumidity() {
        return Math.random() * 100;
    }
    public double getPressure() {
        return Math.random() * 100;
    }

    // gets called everytime one of the metrics changes
    public void measurementsChanged() {
        notifyObservers();
    }

    public void updateMeasurements() {
        measurementsChanged();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        double temperature = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
