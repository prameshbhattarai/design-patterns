package org.design.pattern.structural.bridge;

import org.design.pattern.structural.bridge.implementations.databases.ElasticSearch;
import org.design.pattern.structural.bridge.implementations.databases.RelationalDB;
import org.design.pattern.structural.bridge.implementations.queries.AdvanceQuery;
import org.design.pattern.structural.bridge.implementations.queries.BasicQuery;
import org.design.pattern.structural.bridge.interfaces.Database;

/**
 * Bridge is a structural design pattern that divides business logic or huge class into separate
 * class hierarchies that can be developed independently.
 */
public class Client {

    private static void query(Database database, String request) {
        System.out.println("Client:: Using Basic Query");
        var basicQuery = new BasicQuery(database);
        basicQuery.create(request);
        basicQuery.search();
        basicQuery.update(request);
        basicQuery.delete(request);

        System.out.println("-----------------------------------");

        System.out.println("Client:: Using Advance Query");
        var advanceQuery = new AdvanceQuery(database);
        advanceQuery.create(request);
        advanceQuery.search();
        advanceQuery.update(request);
        advanceQuery.delete(request);
        advanceQuery.returnJsonResponse(request);
    }

    public static void main(String... args) {
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        query(new RelationalDB(), "Request for Relational DB");

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        query(new ElasticSearch(), "Request for ElasticSearch DB");
    }
}
