package command;

public class DummyCommand implements Command{
    @Override
    public void apply() {
        System.out.println("I'm dummy, I apply nothing!");
    }

    @Override
    public void cancel() {
        System.out.println("I'm dummy, I cancel nothing!");
    }

}
