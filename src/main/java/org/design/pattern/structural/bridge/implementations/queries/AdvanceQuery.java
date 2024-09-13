package org.design.pattern.structural.bridge.implementations.queries;

import org.design.pattern.structural.bridge.interfaces.Database;

/**
 * Advance Query extend the BaseQuery but it provide additional APIs to query DB.
 * Now, Advance Query can be developed independently.
 */
public class AdvanceQuery extends BasicQuery {

    public AdvanceQuery(Database database) {
        super(database);
    }

    public void returnJsonResponse(String request) {
        System.out.printf("AdvanceQuery:: successfully return JSON response for \"%s\" %n", request);
        System.out.printf("Hello from DB :: %s%n", super.database.getClass().getSimpleName());
    }
}
