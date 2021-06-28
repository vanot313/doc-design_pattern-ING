package builder;

/**
 * 构造者，将一个复杂对象的构建过程与它的表示分离，可以理解为将一堆零件组装成具体的成品再交付用户
 * 即对用户隐藏了组装的过程，将组装过程从用户层抽离
 */
public interface Builder {
    /**
     * 组装过程对用户隐藏，用户可以通过不同的构造器构造不同的产品
     * ？ 生成器模式将对象的构造过程与创建该对象类解耦，是对象的创建更加灵活有弹性
     * 指挥者与构造者之间的关系符合开闭原则
     */
    public void buildPartOne();
    public void buildPartTwo();
    public Product buildProduct();
}
