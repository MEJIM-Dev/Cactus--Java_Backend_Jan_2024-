package inheritance;

public class Cat extends Animal{
    private boolean meow;

    public Cat(){
//        super();
    }

    public Cat(boolean meow){
        super();
        this.meow = meow;
    }

    public Cat(int noOfLimb, int noOfEye, boolean tail, String formOfReproduction, boolean meow) {
        super(noOfLimb, noOfEye, tail, formOfReproduction);
        this.meow = meow;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "meow=" + meow +
                "noOfLimb=" + getNoOfLimb() +
                ", noOfEye=" + getNoOfEye() +
                ", tail=" + isTail() +
                ", formOfReproduction='" + getFormOfReproduction() + '\'' +
                '}';
    }
}
