package b_SingletonPattern;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        return instance;
    }
}
