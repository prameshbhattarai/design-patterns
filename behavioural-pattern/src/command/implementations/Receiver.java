package command.implementations;

import command.model.SendEmail;
import command.model.SendPushNotification;

/**
 * The Receiver classes contain some important business logic. They know how to
 * perform all kinds of operations, associated with carrying out a request. In
 * fact, any class may serve as a Receiver.
 */
public class Receiver {

    public void processEmail(SendEmail sendEmail) {
        System.out.println("Receiver processing sendEmail...");
        sendEmail.process();
    }
    
    public void processNotification(SendPushNotification sendPushNotification) {
        System.out.println("Receiver processing notification...");
        sendPushNotification.process();
    }
}
