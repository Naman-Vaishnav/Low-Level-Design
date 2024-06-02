package Observer_Pattern.Template.Observable;


import Observer_Pattern.Template.Observer.ObserverInterface;

public interface ObservableInterface {
    void add(ObserverInterface observer);

    void remove(ObserverInterface observer);

    void nofify();

    int getData();

    void setData();
}
