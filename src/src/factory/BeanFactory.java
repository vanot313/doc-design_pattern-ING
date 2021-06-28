package factory;

public class BeanFactory extends Factory{
    @Override
    public Product create(){
        return new Bean();
    }
}
