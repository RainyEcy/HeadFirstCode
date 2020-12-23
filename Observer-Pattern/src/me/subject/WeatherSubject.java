package me.subject;

import java.util.ArrayList;
import java.util.List;
import me.doobj.WeatherDO;
import me.observer.Observer;

public class WeatherSubject implements Subject {

  private List<Observer> weatherObserverList;

  private WeatherDO weatherDO;

  public WeatherSubject() {
    this.weatherObserverList = new ArrayList<Observer>();
  }

  public void setWeatherDO(WeatherDO weatherDO) {
    this.weatherDO = weatherDO;
  }

  public void setWaatherDetail(float temp, float humidity, float pressure) {
    WeatherDO weatherDO = new WeatherDO();
    weatherDO.setTemp(temp);
    weatherDO.setHumidity(humidity);
    weatherDO.setPressure(pressure);
    this.setWeatherDO(weatherDO);
    notifyObserver();
  }


  @Override
  public void registerObserver(Observer observer) {
    if (!this.weatherObserverList.contains(observer)) {
      this.weatherObserverList.add(observer);
    }
  }

  @Override
  public void removeObserver(Observer observer) {
    if (this.weatherObserverList.contains(observer)) {
      this.weatherObserverList.remove(observer);
    }
  }

  @Override
  public void notifyObserver() {
    this.weatherObserverList.forEach(weatherObserver -> weatherObserver.update(weatherDO));
  }
}
