package chainofresponsibility;

/**
 * 处理者，当该请求自身无法处理时将该处理传递至下一个处理者
 */
public interface Handler {
    /**
     * 松耦合，处理发起者与处理者是接口关系
     * 开闭原则，可以很简单地在链条上新增处理者
     */
    Handler handler = null;
    void handleRequest();
    void nextHandler();
}
