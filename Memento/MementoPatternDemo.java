package Memento;

import Memento.Originator.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state1");
        Memento snapshot1=originator.createMemento();
        caretaker.saveState(snapshot1);

        originator.setState("state2");
        
        Memento snapshot2=caretaker.restoreState();
        originator.restoreFromMemento(snapshot2);

    }
}
