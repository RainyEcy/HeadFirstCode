package duck;

public class Duck implements Comparable {
    String name;

    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.weight > ((Duck) o).weight ? 1 : -1;
    }
}
