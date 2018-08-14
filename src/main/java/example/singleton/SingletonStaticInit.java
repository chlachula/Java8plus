package example.singleton;

public class SingletonStaticInit {

    /* Static member holds only one instance of the SingletonStaticInit class
     * Singleton object is created before it is needed.
     * The JVM takes care of the static variable initialization and ensures that the process is thread safe
     * and that the instance is created before the threads tries to access it.
     */
    private static final SingletonStaticInit singletonInstance = new SingletonStaticInit();

    // SingletonStaticInit prevents any other class from instantiating
    private SingletonStaticInit() {
    }

    // Providing Global point of access
    public static SingletonStaticInit getSingletonInstance() {
        return singletonInstance;
    }

    public void printSingleton() {
        System.out.println("Inside print Singleton");
    }

}
