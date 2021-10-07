package observer_pattern;

abstract class Observer {
    private Subject subject;

    Observer(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public abstract void update(double temperature, double humidity, double pressure);
    
    public void unregister() {
        subject.removeObserver(this);
    }
}
