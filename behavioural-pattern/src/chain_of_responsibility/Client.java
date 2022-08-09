package chain_of_responsibility;

import chain_of_responsibility.implementations.DogHandler;
import chain_of_responsibility.implementations.MonkeyHandler;
import chain_of_responsibility.implementations.SquirrelHandler;
import chain_of_responsibility.interfaces.RequestType;

/**
* Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. 
* Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
* 
 * The client code is usually suited to work with a single handler. In most
 * cases, it is not even aware that the handler is part of a chain.
 */
public class Client {
    
    public static void main(String... args) {

        MonkeyHandler monkeyHandler = new MonkeyHandler();
        SquirrelHandler squirrelHandler = new SquirrelHandler();
        DogHandler dogHandler = new DogHandler();
        
        // create chain of responsibility
        monkeyHandler
        .nextHandler(squirrelHandler)
        .nextHandler(dogHandler);
        
    
        for (RequestType request : RequestType.values()) {
            System.out.printf("Client: Handle request for :: %s%n", request.name());
            String result = monkeyHandler.handle(request);
            
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.printf("No handler found for :: %s%n", request.name());
            }
        }
    }
}
