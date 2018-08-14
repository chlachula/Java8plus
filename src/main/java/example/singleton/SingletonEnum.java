package example.singleton;

public enum SingletonEnum {
    INSTANCE;

    /**
     * Method can be called like:
     * SingletonEnum.INSTANCE.printSingleton();
     */
    public void printSingleton() {
        System.out.println("Inside print Singleton");
    }

}
