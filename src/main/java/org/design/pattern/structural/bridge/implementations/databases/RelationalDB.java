package org.design.pattern.structural.bridge.implementations.databases;

import org.design.pattern.structural.bridge.interfaces.Database;

public class RelationalDB implements Database {

    @Override
    public void setUpConnection() {
        System.out.println("RelationalDB:: Setting up Relational DB connection...");
    }
}
