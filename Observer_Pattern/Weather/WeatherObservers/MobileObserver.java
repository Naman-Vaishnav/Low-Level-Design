package Observer_Pattern.Weather.WeatherObservers;

import Observer_Pattern.Weather.WeatherStation.WeatherStationImpl;
import Observer_Pattern.Weather.WeatherStation.WeatherStationInterface;

public class MobileObserver implements WeatherObserverInterce {

    WeatherStationInterface weatherStation=new WeatherStationImpl();

    public MobileObserver(WeatherStationInterface weatherStation){
        this.weatherStation=weatherStation;
    }
    
    @Override
    public void update() {
        int curTemp=weatherStation.getTemperature();
        System.out.println("Setting mobile display temprature to"+curTemp);
    }

}
