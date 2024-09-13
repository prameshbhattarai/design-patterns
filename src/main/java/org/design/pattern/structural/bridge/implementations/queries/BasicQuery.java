package org.design.pattern.structural.bridge.implementations.queries;

import org.design.pattern.structural.bridge.interfaces.Database;
import org.design.pattern.structural.bridge.interfaces.Query;

/**
 * Basic Query will accept both Databases and provide some basic operation on those DB.
 */
public class BasicQuery implements Query<String> {

    protected final Database database;

    public BasicQuery(Database database) {
        this.database = database;
    }

    @Override
    public boolean create(String request) {
        System.out.printf("BasicQuery:: successfully created %s%n", request);
        return true;
    }

    @Override
    public String search() {
        System.out.printf("BasicQuery:: successfully read %n");
        return String.format("Hello from DB :: %s", this.database.getClass().getSimpleName());
    }

    @Override
    public boolean update(String request) {
        System.out.printf("BasicQuery:: successfully updated %s%n", request);
        return true;
    }

    @Override
    public boolean delete(String request) {
        System.out.printf("BasicQuery:: successfully deleted %s%n", request);
        return true;
    }
}
