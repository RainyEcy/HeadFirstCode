package duck;

import talk.impl.GuaTalkImpl;

public class BlueDuck extends AbstractDuck {

    /**
     * @see DefaultDuckFactoryImpl
     */
    public BlueDuck() {
        super.setTalk(GuaTalkImpl.getInstance());
    }
}
