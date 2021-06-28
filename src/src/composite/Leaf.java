package composite;

public class Leaf implements Component{
    @Override
    public void add(Component component) {
    }
    @Override
    public void remove(Component component){
    }
    @Override
    public Component getChild(int id){
        return null;
    }

    @Override
    public void operation(){
        // do something...
    }
}
