package duck;

import fly.IFly;
import talk.ITalk;

public abstract class AbstractDuck implements IFly, ITalk {

    protected IFly fly;
    protected ITalk talk;

    public void setFly(IFly fly) {
        this.fly = fly;
    }

    public void setTalk(ITalk talk) {
        this.talk = talk;
    }

    public void fly() {
        System.out.print(this.getClass().getSimpleName() + " : ");
        if (fly == null) {
            IFly.super.fly();
        } else {
            fly.fly();
        }
    }

    public boolean talk() {
        System.out.print(this.getClass().getSimpleName() + " : ");
        if (talk == null) {
            return ITalk.super.talk();
        } else {
            return talk.talk();
        }
    }

}
