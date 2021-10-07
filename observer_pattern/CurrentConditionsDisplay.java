package observer_pattern;

public class CurrentConditionsDisplay extends Observer implements Display {
    private double temperature;
    private double humidity;
    private double pressure;
   
    public CurrentConditionsDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void display() {
        System.out.println("Current conditions[temperature:" + temperature + ",humidity:" + humidity + ",pressure:" + pressure + "]");
        
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
}
