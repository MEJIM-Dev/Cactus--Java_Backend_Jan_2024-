package abstraction;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("This dog is eating bone");
    }

    @Override
    public void makeSound() {
        System.out.println("Barking....");
    }

    @Override
    public void walks(double distance) {
        System.out.println("This Dogs has walked "+distance+" miles");
    }

    @Override
    public int countLegs(int numberOfLegs){
        return numberOfLegs;
    }
}
