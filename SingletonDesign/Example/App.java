package SingletonDesign.Example;

public class App {
    public static void main(String[] args) {
        // Retrieve the singleton instance
        Singleton onlyInstance = Singleton.getInstance();
        Singleton secondton = Singleton.getInstance();

        // Demonstrate that both references point to the same object
        onlyInstance.doSomething();
        System.out.println("onlyInstance: " + onlyInstance);
        System.out.println("secondton: " + secondton);

        // Check if both references are the same
        System.out.println("Are onlyInstance and secondton the same? " + (onlyInstance == secondton));
    }
}