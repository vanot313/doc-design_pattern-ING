package adapter;

/**
 * 适配器，通过接口转换，使原本不能兼容的类能够一起工作
 */
public abstract class Adapter implements Target{
    /**
     * 松耦合
     * 开闭原则
     * PS: 说实在的，这个东西真正的用处我还有没有体会到
     */
    Adaptee adaptee;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void function() {
        adaptee.function();
    }
}
