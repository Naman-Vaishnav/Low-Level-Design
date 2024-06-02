package Observer_Pattern.Template.Observer;

import Observer_Pattern.Template.Observable.ConcreteObservable;
import Observer_Pattern.Template.Observable.ObservableInterface;

public class ConcreteObserver implements ObserverInterface {

    ObservableInterface observable=new ConcreteObservable();

    public ConcreteObserver(ObservableInterface observable){
        this.observable=observable;
    }
    
    public void update(){
        observable.getData();
        System.out.println("Updating in observer");
    }
}
