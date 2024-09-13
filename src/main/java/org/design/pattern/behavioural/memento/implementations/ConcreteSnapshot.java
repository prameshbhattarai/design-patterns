package org.design.pattern.behavioural.memento.implementations;

import org.design.pattern.behavioural.memento.interfaces.Snapshot;

import java.sql.Timestamp;


/**
 * The Concrete Memento contains the infrastructure for storing the Originator's
 * state.
 */
public class ConcreteSnapshot implements Snapshot {

    private final String state;
    private final Timestamp timestamp;

    public ConcreteSnapshot(String state) {
        this.state = state;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getName() {
        return this.timestamp.toString().concat("-").concat(this.state.substring(0, 10)).concat("...");
    }

    @Override
    public String getDate() {
        return this.timestamp.toString();
    }
}
