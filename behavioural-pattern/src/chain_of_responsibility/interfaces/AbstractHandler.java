package chain_of_responsibility.interfaces;

/**
 * The default chaining behavior can be implemented inside a base handler class.
 */
public class AbstractHandler<T, R> implements Handler<T, R> {
    
    private Handler<T, R> nextHandler;
    
    @Override
    public Handler<T, R> nextHandler(Handler<T, R> nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    @Override
    public T handle(R request) {
        if (this.nextHandler != null) {
            // pass the request to next handler
            return this.nextHandler.handle(request);
        }
        return null;
    }
}
