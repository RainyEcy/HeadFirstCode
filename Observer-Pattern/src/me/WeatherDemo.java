package me;

import me.observer.CurrentConditionsDisplay;
import me.subject.WeatherSubject;

public class WeatherDemo {

  public static void main(String[] args) {
    WeatherSubject weatherSubject = new WeatherSubject();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherSubject);
    weatherSubject.setWaatherDetail(111,222,333);
    currentConditionsDisplay.display();
  }

}
