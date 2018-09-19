

/**
 * 静态内部类
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton instace = new Singleton();
    }

    private Singleton() {
        //private constructor
    }

    public static Singleton getInstance() {
        return SingletonHolder.instace;
    }

}
