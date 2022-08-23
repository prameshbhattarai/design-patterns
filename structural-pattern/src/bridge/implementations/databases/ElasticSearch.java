package bridge.implementations.databases;

import bridge.interfaces.Database;

public class ElasticSearch implements Database {

    @Override
    public void setUpConnection() {
        System.out.println("ElasticSearch:: Setting up ElasticSearch DB connection...");
    }
}
