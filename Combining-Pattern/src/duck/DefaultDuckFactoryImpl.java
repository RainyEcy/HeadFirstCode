package duck;

public class DefaultDuckFactoryImpl implements IDuckFactory {
    @Override
    public AbstractDuck createBlueDuck() {
        return new BlueDuck();
    }

    @Override
    public AbstractDuck createRedDuck() {
        return new RedDuck();
    }
}
