package example.singleton;

public class SingletonLazyInitDoubleCheckLocking {

    /* Static member holds only one instance of the SingletonLazyInitDoubleCheckLocking class
     * Declaring a variable volatile guarantees the visibility for all threads
     */
    private volatile static SingletonLazyInitDoubleCheckLocking singletonInstance;

    // SingletonLazyInitDoubleCheckLocking prevents any other class from instantiating
    private SingletonLazyInitDoubleCheckLocking() {
    }

    /* Providing Global point of access
     * This code might create some abrupt behaviour in the results in a multithreaded environment
     * as in this situation multiple threads can possibly create multiple instance of the same SingletonLazyInitDoubleCheckLocking class
     * if they try to access the getSingletonInstance() method at the same time.
     */
    public static SingletonLazyInitDoubleCheckLocking getSingletonInstance() {
        if (null == singletonInstance) {
            synchronized (SingletonLazyInitDoubleCheckLocking.class) {
                if (null == singletonInstance) {
                    singletonInstance = new SingletonLazyInitDoubleCheckLocking();
                }
            }
        }
        return singletonInstance;
    }

    public void printSingleton() {
        System.out.println("Inside print Singleton");
    }

}
