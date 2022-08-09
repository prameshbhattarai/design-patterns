package command;

import command.interfaces.Command;

/**
 * The Command Invoker is associated with one or several commands. It sends a request to
 * the command.
 */
public class CommandInvoker {

    private Command onStart;
    private Command onStop;
    
    public void setOnStart(Command onStart) {
        this.onStart = onStart;
    }
    
    public void setOnStop(Command onStop) {
        this.onStop = onStop;
    }
    
    /**
     * The Invoker does not depend on concrete command or receiver classes. The
     * Invoker passes a request to a receiver indirectly, by executing a
     * command.
     */
    public void processCommands() {
        System.out.println("CommandInvoker:: Does anybody want something done before I begin ?");
        if (this.onStart != null) {
            this.onStart.execute();
        }

        System.out.println("CommandInvoker:: .. processing...");
        sleep(2000);

        System.out.println("CommandInvoker:: Does anybody want something done after I finish ?");
        if (this.onStop != null) {
            this.onStop.execute();
        }
    }
    
    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
