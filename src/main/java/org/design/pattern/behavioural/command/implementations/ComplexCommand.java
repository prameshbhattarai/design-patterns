package org.design.pattern.behavioural.command.implementations;


import org.design.pattern.behavioural.command.interfaces.Command;
import org.design.pattern.behavioural.command.model.SendEmail;
import org.design.pattern.behavioural.command.model.SendPushNotification;

/**
 * Some commands can delegate more complex operations to other objects,
 * called "receivers."
 */
public class ComplexCommand implements Command {

    private final Receiver receiver;
    private final SendEmail requestA;
    private final SendPushNotification requestB;

    /**
     * Complex commands can accept one or several receiver objects along with
     * any context data via the constructor.
     */
    public ComplexCommand(Receiver receiver, SendEmail requestA, SendPushNotification requestB) {
        this.receiver = receiver;
        this.requestA = requestA;
        this.requestB = requestB;
    }

    /**
     * Commands can delegate to any methods of a receiver.
     * Delegate the requesting param to receiver object
     */
    @Override
    public void execute() {
        System.out.printf("ComplexCommand: Complex stuff should be done by a receiver object.%n");
        this.receiver.processEmail(requestA);
        this.receiver.processNotification(requestB);
    }
}
