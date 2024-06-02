package Observer_Pattern.Weather.WeatherStation;

import java.util.ArrayList;
import java.util.List;
import Observer_Pattern.Weather.WeatherObservers.*;

public class WeatherStationImpl implements WeatherStationInterface {

    private int temp;

    List<WeatherObserverInterce> observers=new ArrayList<>(); 

    @Override
    public void add(WeatherObserverInterce observer) {
        observers.add(observer);
    }

    @Override
    public void remove(WeatherObserverInterce observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserverInterce observer:observers){
            observer.update();
        }
        
    }

    @Override
    public int getTemperature() {
        return temp;
    }


    @Override
    public void setTemperature(int temp) {
        if(this.temp!=temp){
            this.temp=temp;   
            notifyObservers();
        }
        
    }

}
