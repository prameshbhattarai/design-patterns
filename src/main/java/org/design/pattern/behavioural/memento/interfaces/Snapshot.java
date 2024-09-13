package org.design.pattern.behavioural.memento.interfaces;

/**
 * The Snapshot interface provides a way to retrieve the memento's metadata, such
 * as creation date or name. However, it doesn't expose the Originator's state.
 */
public interface Snapshot {

    String getState();

    String getName();

    String getDate();
}
