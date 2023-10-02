package command;

public interface Command { // 1. this is the interface that will be implemented by each real command

    void apply(); // or execute();
    void cancel(); // or revert(); or rollback();
}
