package abstract_factory.interfaces;

/**
 * Here's the the base interface of another product. All products can interact
 * with each other, but proper interaction is possible only between products of
 * the same concrete variant.
 */
public interface AbstractProductB {
    String actionAFromProductB();
    String actionBFromProductB();
}
