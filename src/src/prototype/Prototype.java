package prototype;

/**
 * 原型，提供一个克隆自己的方法
 */
public interface Prototype {
    /**
     * 当需要初始化一个实例代价过于昂贵时，采用复制的手段提升效率
     * 可以动态地保存对象的状态
     * 创建对象时可以无视其继承结构等内容复制
     * 动态地添加、删除复制品
     */
    public Object cloneMe() throws CloneNotSupportedException;
}
