package factory;

/**
 * 工厂，定义创建对象的接口，让子类决定实例化哪一个类
 * 简单工厂，一个抽象工厂对应一个抽象产品，其默认的实现唯一
 */
public abstract class Factory {
    /**
     * 可以让用户与某一个特定类的子类解耦
     * 工厂不必了解其产品的构造过程
     */
    abstract public Product create();
}
