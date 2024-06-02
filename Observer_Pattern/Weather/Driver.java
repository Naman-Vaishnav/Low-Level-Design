package Observer_Pattern.Weather;

import Observer_Pattern.Weather.WeatherObservers.MobileObserver;
import Observer_Pattern.Weather.WeatherObservers.WeatherObserverInterce;
import Observer_Pattern.Weather.WeatherStation.WeatherStationImpl;
import Observer_Pattern.Weather.WeatherStation.WeatherStationInterface;

public class Driver {
    public static void main(String[] args) {
        
        WeatherStationInterface weatherStation=new WeatherStationImpl();

        WeatherObserverInterce mobile=new MobileObserver(weatherStation);

        weatherStation.add(mobile);

        weatherStation.setTemperature(10);

    }
}
