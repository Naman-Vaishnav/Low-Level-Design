package Observer_Pattern.Template;

import Observer_Pattern.Template.Observable.ConcreteObservable;
import Observer_Pattern.Template.Observable.ObservableInterface;
import Observer_Pattern.Template.Observer.ConcreteObserver;
import Observer_Pattern.Template.Observer.ObserverInterface;

public class Driver {
    public static void main(String[] args) {
        ObservableInterface observable=new ConcreteObservable();

        ObserverInterface observer1=new ConcreteObserver(observable);
        ObserverInterface observer2=new ConcreteObserver(observable);

    
        observable.add(observer1);
        observable.add(observer2);

        observable.setData();

    }
    


}
