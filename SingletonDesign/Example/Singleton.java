package SingletonDesign.Example;

public class Singleton {

    // Static variable to hold the single instance of the class
    private static Singleton onlyInstance = null;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Optional: Initialization logic can go here
    }

    // Static method to provide access to the single instance
    public static Singleton getInstance() {
        if (onlyInstance == null) {
            // Create the instance only if it doesn't exist
            onlyInstance = new Singleton();
        }
        return onlyInstance;
    }

    // Example method to demonstrate functionality
    public void doSomething() {
        System.out.println("I am doing something!");
    }
}