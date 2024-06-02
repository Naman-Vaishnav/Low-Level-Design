package Observer_Pattern.Template.Observable;

import java.util.ArrayList;
import java.util.List;

import Observer_Pattern.Template.Observer.ObserverInterface;

public class ConcreteObservable implements ObservableInterface {

    List<ObserverInterface> observers=new ArrayList<>();

    @Override
    public void add(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void remove(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void nofify() {
        for(ObserverInterface observer:observers){
            observer.update();
        }
    }

    @Override
    public int getData() {
        System.out.println("in getData of Observable");
        return 1;
    }

    @Override
    public void setData() {
        //change the state and notify
        System.out.println("Setting data in observable");
        nofify();
    }

}
