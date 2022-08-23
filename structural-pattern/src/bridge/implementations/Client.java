package bridge.implementations;

import bridge.implementations.databases.ElasticSearch;
import bridge.implementations.databases.RelationalDB;
import bridge.implementations.queries.AdvanceQuery;
import bridge.implementations.queries.BasicQuery;
import bridge.interfaces.Database;

/**
 * Bridge is a structural design pattern that divides business logic or huge class into separate 
 * class hierarchies that can be developed independently.
 */
public class Client {

    private static void query(Database database, String request) {
        System.out.println("Client:: Using Basic Query");
        BasicQuery basicQuery = new BasicQuery(database);
        basicQuery.create(request);
        basicQuery.search();
        basicQuery.update(request);
        basicQuery.delete(request);
        
        System.out.println("-----------------------------------");
        
        System.out.println("Client:: Using Advance Query");
        AdvanceQuery advanceQuery = new AdvanceQuery(database);
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
