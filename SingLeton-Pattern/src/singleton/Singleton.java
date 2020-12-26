package singleton;

public class Singleton {

  private volatile static Singleton uniqueSingleton;

  private Singleton() {
  }

  public static Singleton getInstance() {

    if (null == uniqueSingleton) {
      synchronized (Singleton.class) {
        if (null == uniqueSingleton) {
          uniqueSingleton = new Singleton();
        }
      }
    }

    return uniqueSingleton;
  }

}
