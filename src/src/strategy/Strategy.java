package strategy;

/**
 * 策略类，其实简单来讲就是某个方面的功能的接口，应对一种问题可能有多种执行策略。策略应当根据具体应用来划分聚集。
 */
public interface Strategy {
    /**
     * 松耦合
     * 开闭原则
     */
    void function();
}
