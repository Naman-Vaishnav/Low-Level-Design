package Memento;

import java.util.ArrayList;
import java.util.List;

import Memento.Originator.Memento;

 
class Caretaker {
   
        List<Memento> savedStates = new ArrayList<Memento>();
        
 
        public void saveState(Memento memento){
            savedStates.add(memento);
        }

        public Memento restoreState(){
            Memento last=savedStates.get(savedStates.size()-1);
            savedStates.remove(savedStates.size()-1);
            return last;
        }

    
}