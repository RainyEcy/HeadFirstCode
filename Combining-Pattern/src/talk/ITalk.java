package talk;

public interface ITalk {
    default boolean talk() {
        System.out.println("can't talk");
        return false;
    }
}
