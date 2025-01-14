package Memento;

class Originator {
    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..
 
    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }
 
    public Memento createMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }
 
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
  //why Memento is static inner class
    /*The key reasons are:

Encapsulation - The Memento class needs access to the private state of the Originator class to save and restore it. Making Memento a nested class gives it this access while still keeping the state private from other classes.

Strong coupling - The Memento is inherently tightly coupled to the Originator since its sole purpose is to store the Originator's state. Making it a nested class reflects this close relationship.

Static vs non-static reasoning:
A static nested class doesn't hold a reference to the enclosing class instance
The Memento only needs to store state values, not maintain a link to its Originator
Making it static prevents memory leaks since it won't keep the Originator instance alive
A non-static inner class would waste memory by maintaining an unnecessary reference*/
    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }
 
        // accessible by outer class only
        private String getSavedState() {
            return state;
        }
    }
}
