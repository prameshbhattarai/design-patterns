package singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private String value;
    
    private ThreadSafeSingleton(String value) {
        this.value = value;
    }
    
    public static ThreadSafeSingleton getInstance(String value) {
        // double-checked locking (DCL)
        if (instance == null) { // check one
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) { // check two
                    instance = new ThreadSafeSingleton(value);
                }
            }
        }
        return instance;
    }
}
