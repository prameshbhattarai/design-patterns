package command;

import command.implementations.ComplexCommand;
import command.implementations.Receiver;
import command.implementations.SimpleCommand;
import command.model.SendEmail;
import command.model.SendPushNotification;

public class Client {

    public static void main(String... args) {
        SimpleCommand simpleCommand = new SimpleCommand("Hello! from Simple Command");

        Receiver receiver = new Receiver();
        ComplexCommand complexCommand = new ComplexCommand(receiver, new SendEmail(), new SendPushNotification());
    
        CommandInvoker invoker = new CommandInvoker();
        invoker.setOnStart(simpleCommand);
        invoker.setOnStop(complexCommand);
        
        invoker.processCommands();
    }
}
