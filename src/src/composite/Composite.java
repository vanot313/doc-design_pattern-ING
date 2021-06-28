package composite;

import java.util.LinkedList;

public class Composite implements Component{
    LinkedList<Component> child;
    @Override
    public void add(Component component) {
        child.add(component);
    }
    @Override
    public void remove(Component component){
        child.remove(component);
    }
    @Override
    public Component getChild(int id){
        return child.get(id);
    }

    @Override
    public void operation(){
        // do something...
    }
}
