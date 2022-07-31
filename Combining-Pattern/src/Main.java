import duck.*;
import talk.ITalk;

import java.util.ArrayList;

public class Main {

    public static final String TEST = "test";

    public static void main(String[] args) {
        AbstractDuck baseDuck = new CounterDuckFactoryImpl().createBlueDuck();
        baseDuck.talk();
        baseDuck.talk();
        baseDuck.talk();
        baseDuck.talk();
        baseDuck.talk();
        System.out.println(CounterDuck.getCount());

        ArrayList<AbstractDuck> abstractDucks = new ArrayList<>();
        abstractDucks.add(new BlueDuck());
        abstractDucks.add(new RedDuck());
        ITalk baseDuck2 = new CounterDuck(abstractDucks, TEST);
        baseDuck2.talk();
        baseDuck2.talk();

        ITalk baseDuck3 = new CounterDuck(new BlueDuck(), TEST);
        baseDuck3.talk();

        System.out.println(CounterDuck.getCountByName(TEST));

    }

}