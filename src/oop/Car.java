package oop;

public class Car {

    public boolean automatic;
    public int tires;
    public Boolean active;
    public Boolean deactivated;
    public Boolean enabled;

    @Override
    public String toString() {
        return "Car{" +
                "automatic=" + automatic +
                ", tires=" + tires +
                ", active=" + active +
                ", deactivated=" + deactivated +
                ", enabled=" + enabled +
                '}';
    }
}
