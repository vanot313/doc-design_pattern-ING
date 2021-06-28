package composite;

/**
 * 节点类，将对象组合成树形结构以表示‘部分-整体’的层次结构。
 */
public interface Component {
    /**
     * 对象形成树状结构，方便管理
     * 组合对象和个体实现了同样的接口，用户无需区分二者
     * 新增节点时，用户代码不需要作出修改
     */
    void add(Component component);
    void remove(Component component);
    Component getChild(int id);
    void operation();
}
