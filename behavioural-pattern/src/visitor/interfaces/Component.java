package visitor.interfaces;

/**
 * The Component interface declares an `accept` method that should take the base
 * visitor interface as an argument.
 */
public interface Component {
    
    void accept(Visitor visitor);
}
