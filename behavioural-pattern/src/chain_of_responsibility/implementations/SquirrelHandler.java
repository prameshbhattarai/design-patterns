package chain_of_responsibility.implementations;

import chain_of_responsibility.interfaces.AbstractHandler;
import chain_of_responsibility.interfaces.RequestType;

public class SquirrelHandler extends AbstractHandler<String, RequestType> {

    @Override
     public String handle(RequestType request) {
        // if this request is for this handler then handle it
        // else pass this request to parent class
        if (request == RequestType.NUT) {
            return 
                    """
                        This request is for Squirrel, 
                        so handling it from Squirrel Handler.
                    """;
        }
        // pass the request to next handler from parent class
        return super.handle(request);
    }
}
