package prototype;

/**
 * 通过 java 自带的克隆机制克隆自己
 * 除此之外还可以通过序列化与对象流复制
 */
public class ObjectOne implements Prototype, Cloneable{
    double state;
    ObjectOne(double state){
        this.state = state;
    }

    @Override
    public Object cloneMe() throws CloneNotSupportedException{
        /*
         * 这里的 clone 对于基本数据类型是直接复制的，但对于对象是拷贝其地址
         */
        return (ObjectOne)clone();
    }
}
