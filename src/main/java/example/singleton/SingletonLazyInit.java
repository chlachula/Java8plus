package example.singleton;

public class SingletonLazyInit {

    // Static member holds only one instance of the SingletonLazyInit class
    private static SingletonLazyInit singletonInstance;

    // SingletonLazyInit prevents any other class from instantiating
    private SingletonLazyInit() {
    }

    /* Providing Global point of access
     * This code might create some abrupt behaviour in the results in a multithreaded environment
     * as in this situation multiple threads can possibly create multiple instance of the same SingletonLazyInit class
     * if they try to access the getSingletonInstance() method at the same time.
     */
    public static SingletonLazyInit getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonLazyInit();
        }
        return singletonInstance;
    }

    /* Providing Global point of access
     * Synchronized method below prevents multiple threads access in the same time,
     * but it is expensive, there is an overhead every time when it's called.
     */
    public static synchronized SingletonLazyInit getSingletonInstance_synchronized() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonLazyInit();
        }
        return singletonInstance;
    }

    public void printSingleton() {
        System.out.println("Inside print Singleton");
    }

}
