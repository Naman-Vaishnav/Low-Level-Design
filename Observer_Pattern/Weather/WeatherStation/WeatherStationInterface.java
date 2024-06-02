package Observer_Pattern.Weather.WeatherStation;
import Observer_Pattern.Weather.WeatherObservers.WeatherObserverInterce;

public interface WeatherStationInterface {
    void add(WeatherObserverInterce observer);

    void remove(WeatherObserverInterce observer);

    void notifyObservers();

    int getTemperature();

    void setTemperature(int temp);
}
