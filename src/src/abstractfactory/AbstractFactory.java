package abstractfactory;

/**
 * 抽象工厂，提供一系列或相互依赖对象的接口，无需指定他们的具体的类
 * 抽象工厂，包括多个抽象产品，并将产生多种实现派生
 */
public abstract class AbstractFactory {
    /**
     * 工厂中包括多个抽象产品，提升维度来降低工厂数量
     * 工厂与产品方法都是抽象的
     * 用户可以方便地配置工厂
     */
    public abstract Clothes createClothes();
    public abstract Skirt createSkirt();
}
