package command;

/**
 * 发起者，带有 Command 接口来发布指令
 */
public abstract class Invoker {
    Command command;
    abstract void setCommand(Command command);
    abstract void startExecuteCommand();
}
