package me.observer;

import me.doobj.WeatherDO;
import me.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private WeatherDO weatherDO;

  private Subject weatherSubject;

  public CurrentConditionsDisplay(Subject weatherSubject) {
    this.weatherSubject = weatherSubject;
    weatherSubject.registerObserver(this);
  }

  @Override
  public void update(WeatherDO weatherDO) {
    this.weatherDO = weatherDO;
  }

  @Override
  public void display() {
    System.out.println(weatherDO.toString());
  }
}
