package builder;

/**
 * 指挥类，控制构建器的行为
 * 如果成功生产 Product 便向用户提供成品
 */
public class Director {
    private Builder builder;
    Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        return builder.buildProduct();
    }
}