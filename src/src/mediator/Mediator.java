package mediator;

/**
 * 中介者，将‘同事’统一注册到容器内，通过接口统一传递分发消息
 */
public interface Mediator {
    /**
     * 与 Colleague 松耦合，为接口调用关系。
     * 避免对象之间的通信导致的相互调用。
     * Colleague 之间是完全解耦的。
     */
    void deliverMess(Colleague colleague, String[] mess);
}
