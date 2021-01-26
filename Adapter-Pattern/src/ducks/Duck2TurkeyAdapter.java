package ducks;

import java.util.Random;

public class Duck2TurkeyAdapter implements Turkey {
    private final Random random;
    private Duck duck;


    public Duck2TurkeyAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }


    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }


}
