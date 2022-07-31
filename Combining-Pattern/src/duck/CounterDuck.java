package duck;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterDuck extends AbstractDuck {
    public static final String DEFAULT_DUCK_COUNTER = "defaultDuckCounter";

    private Set<AbstractDuck> duckSet = new HashSet<>();

    private String listName;

    private static volatile Map<String, AtomicInteger> ATOMIC_COUNTER = new HashMap<>();

    static {
        ATOMIC_COUNTER.put(DEFAULT_DUCK_COUNTER, new AtomicInteger());
    }

    @Override
    public boolean talk() {
        for (AbstractDuck abstractDuck : duckSet) {
            if (abstractDuck.talk()) {
                ATOMIC_COUNTER.get(listName).incrementAndGet();
            }
        }
        return false;
    }

    public CounterDuck(AbstractDuck duck) {
        ArrayList<AbstractDuck> abstractDucks = new ArrayList<>();
        abstractDucks.add(duck);
        initCounter(abstractDucks, DEFAULT_DUCK_COUNTER);
    }

    public CounterDuck(AbstractDuck duck, String listName) {
        ArrayList<AbstractDuck> abstractDucks = new ArrayList<>();
        abstractDucks.add(duck);
        initCounter(abstractDucks, listName);
    }


    public CounterDuck(Collection<AbstractDuck> duckList, String listName) {
        initCounter(duckList, listName);
    }

    private void initCounter(Collection<AbstractDuck> duckList, String listName) {
        if (ATOMIC_COUNTER.get(listName) == null) {
            synchronized (ATOMIC_COUNTER) {
                if (ATOMIC_COUNTER.get(listName) == null) {
                    ATOMIC_COUNTER.put(listName, new AtomicInteger());
                }
            }
        }
        this.duckSet.addAll(duckList);
        this.listName = listName;
    }

    public static final int getCount() {
        return getCountByName(DEFAULT_DUCK_COUNTER);

    }

    public static final int getCountByName(String listName) {
        return ATOMIC_COUNTER.get(listName).get();
    }
}
