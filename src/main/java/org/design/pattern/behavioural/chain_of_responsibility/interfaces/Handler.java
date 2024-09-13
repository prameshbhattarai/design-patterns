package org.design.pattern.behavioural.chain_of_responsibility.interfaces;

/**
 * The Handler interface declares a method for building the chain of handlers.
 * It also declares a method for executing a request.
 */
public interface Handler<T, R> {
    Handler<T, R> nextHandler(Handler<T, R> handler);

    T handle(R request);
}
