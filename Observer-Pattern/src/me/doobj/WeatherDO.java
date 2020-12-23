package me.doobj;

public class WeatherDO {

  private Float temp;

  private Float humidity;

  private Float pressure;

  public Float getTemp() {
    return temp;
  }

  public void setTemp(Float temp) {
    this.temp = temp;
  }

  public Float getHumidity() {
    return humidity;
  }

  public void setHumidity(Float humidity) {
    this.humidity = humidity;
  }

  public Float getPressure() {
    return pressure;
  }

  public void setPressure(Float pressure) {
    this.pressure = pressure;
  }

  @Override
  public String toString() {
    return "me.doobj.WeatherDO{" +
        "temp=" + temp +
        ", humidity=" + humidity +
        ", pressure=" + pressure +
        '}';
  }
}
