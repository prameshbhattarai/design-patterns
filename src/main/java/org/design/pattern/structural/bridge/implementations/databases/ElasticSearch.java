package org.design.pattern.structural.bridge.implementations.databases;

import org.design.pattern.structural.bridge.interfaces.Database;

public class ElasticSearch implements Database {

    @Override
    public void setUpConnection() {
        System.out.println("ElasticSearch:: Setting up ElasticSearch DB connection...");
    }
}
