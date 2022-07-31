package talk.impl;

import talk.ITalk;

public class JiTalkImpl implements ITalk {

    private static volatile JiTalkImpl jiTalk;

    private JiTalkImpl() {
    }

    public static final JiTalkImpl getInstance() {
        if (jiTalk == null) {
            synchronized (JiTalkImpl.class) {
                if (jiTalk == null) {
                    jiTalk = new JiTalkImpl();
                }
            }
        }
        return jiTalk;
    }

    
    @Override
    public boolean talk() {
        return ITalk.super.talk();
    }
}
