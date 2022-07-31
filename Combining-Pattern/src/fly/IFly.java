package fly;

public interface IFly {
    default void fly() {
        System.out.println("can't fly");
    }

}
