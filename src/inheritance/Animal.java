package inheritance;

public class Animal {
    private int noOfLimb;
    private int noOfEye;
    private boolean tail;
    private String formOfReproduction;

    public Animal(){}

    public Animal(int noOfLimb, int noOfEye, boolean tail, String formOfReproduction) {
        this.noOfLimb = noOfLimb;
        this.noOfEye = noOfEye;
        this.tail = tail;
        this.formOfReproduction = formOfReproduction;
    }

    public int getNoOfEye() {
        return noOfEye;
    }

    public void setNoOfEye(int noOfEye) {
        this.noOfEye = noOfEye;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getFormOfReproduction() {
        return formOfReproduction;
    }

    public void setFormOfReproduction(String formOfReproduction) {
        this.formOfReproduction = formOfReproduction;
    }

    public int getNoOfLimb() {
        return noOfLimb;
    }

    public void setNoOfLimb(int noOfLimb) {
        this.noOfLimb = noOfLimb;
    }

    public void move(){
        System.out.println("Animal is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noOfLimb=" + noOfLimb +
                ", noOfEye=" + noOfEye +
                ", tail=" + tail +
                ", formOfReproduction='" + formOfReproduction + '\'' +
                '}';
    }
}
