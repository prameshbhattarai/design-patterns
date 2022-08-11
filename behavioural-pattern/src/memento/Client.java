package memento;

import memento.implementations.Originator;

/**
 * Memento is a behavioral design pattern that allows making snapshots of an object’s state and restoring it in future.
 */
public class Client {
    
    public static void main(String... args) {
        Originator originator = new Originator("the quick brown fox jumps over the lazy dog");
        Application application = new Application(originator);

        // take first snapshot of the state
        application.createBackup();
        originator.doSomeAction();
        
        // take another snapshot of the state
        application.createBackup();
        originator.doSomeAction();
        
        // take another snapshot of the state
        application.createBackup();
        originator.doSomeAction();

        System.out.println("----------------------------");
        application.showHistory();

        System.out.println("\nRollback to previous state...");
        application.restoreToPreviousState();

        System.out.println("\nAgain rollback to previous state...");
        application.restoreToPreviousState();
        
        System.out.println("\nAgain rollback to previous state...");
        application.restoreToPreviousState();
        
        System.out.println("----------------------------");
        application.showHistory();
    }
}
