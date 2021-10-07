package intro_to_design_patterns;

public class Duck {
    FlyInterface flyInterface;
    QuackInterface quackInterface;

    Duck(FlyInterface flyInterface, QuackInterface quackInterface) {
        this.flyInterface = flyInterface;
        this.quackInterface = quackInterface;
    }

    public String performFly() {
        return flyInterface.fly();
    }

    public String performQuack() {
        return quackInterface.quack();
    }
}
