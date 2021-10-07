package observer_pattern;

public class StatisticsDisplay extends Observer implements Display {

    StatisticsDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void display() {
        System.out.println("SHOWS MIN MAX");
        
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        display();
    }
    
}
