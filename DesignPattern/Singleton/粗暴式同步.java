

/**
 * 粗暴式同步
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // private constructor
    }

    public synchronized static Singleton getInstance() {
        return instance == null ? new Singleton() : instance;
    }

}
