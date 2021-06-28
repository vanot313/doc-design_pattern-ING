package singleton;

/**
 * 单例，保证有且仅有可以被全局访问的一个实例
 */
public class Singleton {
    /**
     * 单例由单例本身控制，可以得到比较好的控制
     * 防止某些可重用类的滥用
     */
    private static Singleton instance;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
