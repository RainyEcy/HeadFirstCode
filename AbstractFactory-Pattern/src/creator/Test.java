package creator;

public interface Test {
     int i = 1;

    default void test() {
        System.out.printf("1");
    }
}