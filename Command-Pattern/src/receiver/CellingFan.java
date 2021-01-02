package receiver;

import java.util.function.Consumer;

public class CellingFan {

  public static final String CELLING_ON_HIGH = "onHigh";
  public static final String CELLING_ON_MEDIUM = "onMedium";
  public static final String CELLING_ON_LOW = "onLow";
  public static final String CELLING_OFF = "off";

  private String location;

  private String curentSpeed;

  public Consumer getUndoCurentSpeed() {
    return CommandMapping.methodMap.get(curentSpeed);
  }

  public CellingFan(String location) {
    this.location = location;
  }

  public void onHigh() {
    curentSpeed = CELLING_ON_HIGH;
    System.out.println(location + " celling fan on HIGH! ");
  }

  public void onMedium() {
    curentSpeed = CELLING_ON_MEDIUM;
    System.out.println(location + " celling fan on MEDIUM! ");
  }

  public void onLow() {
    curentSpeed = CELLING_ON_LOW;
    System.out.println(location + " celling fan on LOW! ");
  }

  public void off() {
    curentSpeed = CELLING_OFF;
    System.out.println(location + " celling fan on OFF! ");
  }

}
