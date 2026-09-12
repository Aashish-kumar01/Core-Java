public class Singleton {
    // Private static volatile instance variable
    private static volatile Singleton instance;
    
    // Private constructor to prevent instantiation
    private Singleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already created");
        }
    }
    
    // Public static method to get the instance
    public static Singleton getInstance() {
        // Double-check locking pattern for thread safety
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }
    
    // Example method of the singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

