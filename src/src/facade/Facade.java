package facade;

/**
 * 外观类，简单来看就是将需要整合的子系统以组合的方式整合进了一个类里
 */
public class Facade {
    /**
     * 子系统与用户类完全解耦
     * 子系统与外观类符合开闭原则
     */
    SubSystem subSystem;
    // ...... 其他子系统

    public void doFunction(){
        subSystem.function();
        // ...... 其他子系统工作
    }
}
