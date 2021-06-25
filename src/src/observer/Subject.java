package observer;

import java.util.ArrayList;

/**
 * 主题类，当自身情况发生变化时向观察者类发送通知
 */
public interface Subject {
    /**
     * 与观察者 Object 是松耦合的关系。仅仅依赖于 Object 的接口。同样 Object 观察者也仅仅只需要 Subject 主题接口。
     * 符合开闭原则。因为上点的松耦合关系，二者之间仅仅是接口依赖，因此二者新增实现类并不影响核心架构。
     */
    ArrayList<Object> objectList = null;

    void addObserver(Object object);
    void deleteObserver(Object object);
    void notifyObservers();
}
