package strategy;

public abstract class Context {
    Strategy strategy;

    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    void execute(){
        strategy.function();
    }
}
