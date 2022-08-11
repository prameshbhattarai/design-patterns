package memento;

import memento.implementations.Originator;
import memento.interfaces.Snapshot;

import java.util.*;

/**
 * Memento Application
 * 
 * Create backup.
 * Restore to previous backup.
 * List all the backups.
 */
public class Application {

    private final Stack<Snapshot> snapshotList;
    private final Originator originator;
    
    public Application(Originator originator) {
        this.snapshotList = new Stack<>();
        this.originator = originator;
    }
    
    public void createBackup() {
        System.out.println("Application:: Taking backup...");
        snapshotList.add(originator.getSnapshot());
    }
    
    public void restoreToPreviousState() {
        if (snapshotList.isEmpty()) return;
        
        Snapshot snapshot = snapshotList.pop();
        System.out.printf("Application:: Restoring backup to %s state %n", snapshot.getName());
        this.originator.restore(snapshot);
    }
    
    public void showHistory() {
        System.out.println("Application:: Show history....");
        if (snapshotList.isEmpty()) {
            System.out.println("no history available");
            return;
        }
        for (Snapshot snapshot : snapshotList) {
            System.out.println(snapshot.getName());
        }
    }
}
