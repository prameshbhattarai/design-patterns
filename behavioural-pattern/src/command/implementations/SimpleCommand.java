package command.implementations;

import command.interfaces.Command;

/**
 * Some commands can implement simple operations on their own.
 */
public class SimpleCommand implements Command {
    
    private final String payload;
    
    public SimpleCommand(String payload) {
        this.payload = payload;
    }
    
    @Override
    public void execute() {
        System.out.printf("SimpleCommand:: Printing the payload %s%n", this.payload);
    }
}
