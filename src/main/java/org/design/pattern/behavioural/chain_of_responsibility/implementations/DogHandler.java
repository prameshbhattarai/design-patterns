package org.design.pattern.behavioural.chain_of_responsibility.implementations;

import org.design.pattern.behavioural.chain_of_responsibility.interfaces.AbstractHandler;
import org.design.pattern.behavioural.chain_of_responsibility.interfaces.RequestType;

public class DogHandler extends AbstractHandler<String, RequestType> {

    @Override
    public String handle(RequestType request) {
        // if this request is for this handler then handle it
        // else pass this request to parent class
        if (request == RequestType.MEAT_BALL) {
            return
                    """
                                This request is for Dog, 
                                so handling it from Dog Handler.
                            """;
        }
        // pass the request to next handler from parent class
        return super.handle(request);
    }
}
