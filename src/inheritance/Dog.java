package inheritance;

public class Dog extends Animal{
    private boolean bark;

    @Override
    public void move(){
        System.out.println("Dog is moving");
    }
}
