package duck;

import java.util.Arrays;

public class DuckDemo {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[]{
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };
        Arrays.sort(ducks);
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
