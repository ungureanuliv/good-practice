package interfacesegregation;

public class Eagle implements Animal {
    @Override
    public void makeSound() {

    }

    @Override
    public void run() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        // we have a problem here because eagle can't swim
    }

    @Override
    public void eat() {

    }
}

