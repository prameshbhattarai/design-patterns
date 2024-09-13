package org.design.pattern.behavioural.command;

import org.design.pattern.behavioural.command.implementations.ComplexCommand;
import org.design.pattern.behavioural.command.implementations.Receiver;
import org.design.pattern.behavioural.command.implementations.SimpleCommand;
import org.design.pattern.behavioural.command.model.SendEmail;
import org.design.pattern.behavioural.command.model.SendPushNotification;

public class Client {

    public static void main(String... args) {
        var simpleCommand = new SimpleCommand("Hello! from Simple Command");

        var receiver = new Receiver();
        var complexCommand = new ComplexCommand(receiver, new SendEmail(), new SendPushNotification());

        var invoker = new CommandInvoker();
        invoker.setOnStart(simpleCommand);
        invoker.setOnStop(complexCommand);

        invoker.processCommands();
    }
}
