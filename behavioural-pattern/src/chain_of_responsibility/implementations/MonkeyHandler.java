package chain_of_responsibility.implementations;

import chain_of_responsibility.interfaces.AbstractHandler;
import chain_of_responsibility.interfaces.RequestType;

public class MonkeyHandler extends AbstractHandler<String, RequestType> {
    
    @Override
     public String handle(RequestType request) {
        // if this request is for this handler then handle it
        // else pass this request to parent class
        if (request == RequestType.BANANA) {
            return 
                    """
                        This request is for Monkey, 
                        so handling it from Monkey Handler.
                    """;
        }
        // pass the request to next handler from parent class
        return super.handle(request);
    }
}
