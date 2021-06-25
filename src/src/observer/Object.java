package observer;

/**
 * 观察者类，接收主题的广播并采取动作
 */
public interface Object {
    void hearMessage(String msg);
}
