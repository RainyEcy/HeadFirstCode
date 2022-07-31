package duck;

import talk.impl.JiTalkImpl;

public class RedDuck extends AbstractDuck {

    public RedDuck() {
        super.setTalk(JiTalkImpl.getInstance());
    }
}
