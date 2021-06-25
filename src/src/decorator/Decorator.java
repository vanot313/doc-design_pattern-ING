package decorator;

/**
 * 装饰器，同时继承了 Entity，组合了 Entity。继承是为了直接得到 Entity 的功能 function 接口。组合是为了得到具体 Entity 实例
 * 的功能 function 函数。将实例的 function 在装饰器自身的 addFunction 函数加工后接入 function 接口返回，得到装饰过后的实例
 * 功能。
 */
public abstract class Decorator extends Entity{
    /**
     * 装饰者与被装饰者是松耦合的关系，装饰者的拓展无需考虑被装饰者。
     * 可以使用多个不同装饰者装饰具体实例。
     */
    protected Entity entity;
    public Decorator(){};
    public Decorator(Entity entity){
        this.entity = entity;
    }

    @Override
    void function() {
        super.function();
        addFunction();
    }

    void addFunction(){

    }
}
