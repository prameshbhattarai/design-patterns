package bridge.implementations.databases;

import bridge.interfaces.Database;

public class RelationalDB implements Database {

    @Override
    public void setUpConnection() {
        System.out.println("RelationalDB:: Setting up Relational DB connection...");
    }
}
