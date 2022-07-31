package talk.impl;

import talk.ITalk;

public class GuaTalkImpl implements ITalk {
    private static volatile GuaTalkImpl guaTalk;

    private GuaTalkImpl() {
    }

    public static final GuaTalkImpl getInstance() {
        if (guaTalk == null) {
            synchronized (GuaTalkImpl.class) {
                if (guaTalk == null) {
                    guaTalk = new GuaTalkImpl();
                }
            }
        }
        return guaTalk;
    }

    @Override
    public boolean talk() {
        System.out.println("Gua");
        return true;
    }
}
