package intro_to_design_patterns;

public class Tester {
    public static void main(String[] args) {

        Duck duck = new Duck(new EagleFly(), new MuteQuack());

        System.out.println(duck.performFly());
        System.out.println(duck.performQuack());
    }
}
