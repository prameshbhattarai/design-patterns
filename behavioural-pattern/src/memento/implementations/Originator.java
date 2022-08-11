package memento.implementations;

import memento.interfaces.Snapshot;

import java.util.*;

/**
 * The Originator holds some important state that may change over time. It also
 * defines a method for saving the state inside a memento and another method for
 * restoring the state from it.
 */
public class Originator {

    private String state;
    
    public Originator(String state) {
        this.state = state;
        System.out.printf("Originator:: current state %s%n", this.state);
    }
    
    public void doSomeAction() {
        System.out.println("Originator:: change the state ...");
        this.state = this.shuffle(this.state);
        System.out.printf("Originator:: state has been changed to \" %s \" %n", this.state);
    }
    
    public Snapshot getSnapshot() {
        return new ConcreteSnapshot(this.state);
    }
    
    public void restore(Snapshot snapshot) {
        System.out.printf("Originator:: restore to \" %s \" snapshot%n", snapshot.getName());
        this.state = snapshot.getState();
        System.out.printf("Originator:: state has been changed to \" %s \" %n", this.state);
    }
    
    private String shuffle(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        Collections.shuffle(words);
        return String.join(" ", words);
    }
}
