import ducks.Tukey2DuckAdapter;
import ducks.WildTurkey;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        Tukey2DuckAdapter duckAdapter = new Tukey2DuckAdapter(wildTurkey);
        duckAdapter.quack();
        duckAdapter.fly();
    }
}
