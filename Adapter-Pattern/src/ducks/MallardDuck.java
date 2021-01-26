package ducks;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("MallardDuck quack!");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly!");
    }
}
