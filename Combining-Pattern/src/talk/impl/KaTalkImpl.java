package talk.impl;

import talk.ITalk;

public class KaTalkImpl implements ITalk {
    @Override
    public boolean talk() {
        ITalk.super.talk();
        return true;
    }
}
