package receiver;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class CommandMapping {

  public static final Map<String, Consumer> methodMap = new HashMap<>();

  static {
    Consumer<CellingFan> onHigh = CellingFan::onHigh;
    Consumer<CellingFan> onMedium = CellingFan::onMedium;
    Consumer<CellingFan> onLow = CellingFan::onLow;
    Consumer<CellingFan> off = CellingFan::off;
    methodMap.put(CellingFan.CELLING_ON_HIGH, onHigh);
    methodMap.put(CellingFan.CELLING_ON_MEDIUM, onMedium);
    methodMap.put(CellingFan.CELLING_ON_LOW, onLow);
    methodMap.put(CellingFan.CELLING_OFF, off);
  }

}
