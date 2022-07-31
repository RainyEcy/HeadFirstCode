package duck;

public class CounterDuckFactoryImpl implements IDuckFactory {
    @Override
    public AbstractDuck createBlueDuck() {
        return new CounterDuck(new BlueDuck());
    }

    @Override
    public AbstractDuck createRedDuck() {
        return new CounterDuck(new RedDuck());
    }
}
