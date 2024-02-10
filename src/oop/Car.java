package oop;

public class Car {

    public Car(){};
    public Car(boolean automatic, int tires){
        this.automatic = automatic;
        this.tires = tires;

        //
        this.active = true;
        this.enabled = true;
        this.deactivated = false;

        System.out.println(automatic);
    }

    public Car(Boolean active, Boolean enabled, Boolean deactivated){
        this.active = active;
        this.deactivated = deactivated;
        this.enabled = enabled;
    }

    public Car(Boolean deactivated, Boolean activated){
        this.deactivated = deactivated;
        this.activated =   activated;
    }


    public Car(boolean automatic, int tires, Boolean active, Boolean deactivated, Boolean enabled) {
        this.automatic = automatic;
        this.tires = tires;
        this.active = active;
        this.deactivated = deactivated;
        this.enabled = enabled;
    }

    public boolean automatic;
    public int tires;
    public Boolean active;
    public Boolean deactivated;

    public Boolean activated;
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



    // Overloaded Methods
    public void drive(String destination){}

    public void drive(Integer distance, Integer speed){}

    public void drive(Integer distance, Integer speed, String direction){}
}
