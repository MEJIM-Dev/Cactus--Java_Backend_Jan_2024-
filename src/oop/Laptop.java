package oop;

public class Laptop {
    public int screenSize;
    public int ram;
    public boolean keyboardBacklit;

    public Laptop() {
        screenSize = 16;
        ram = 4;
    }

    public static void staticMethod(){
        System.out.println("Static method is running");
    }

    public void regularMethod(){

    }

    public void listSpecifications(){
//        String msg = "it has a backlit keyboard";
//        if(keyboardBacklit==false){
//            msg = "it does not has a backlit keyboard";
//        }
//        System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+msg);
        if(keyboardBacklit==true){
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it has a backlit keyboard");
        } else {
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it does not has a backlit keyboard");
        }
    }
    public void listSpecifications(int ram){
//        String msg = "it has a backlit keyboard";
//        if(keyboardBacklit==false){
//            msg = "it does not has a backlit keyboard";
//        }
//        System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+msg);
        if(keyboardBacklit==true){
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it has a backlit keyboard");
        } else {
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it does not has a backlit keyboard");
        }
    }
    public void listSpecifications(int ram, String a){
//        String msg = "it has a backlit keyboard";
//        if(keyboardBacklit==false){
//            msg = "it does not has a backlit keyboard";
//        }
//        System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+msg);
        if(keyboardBacklit==true){
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it has a backlit keyboard");
        } else {
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it does not has a backlit keyboard");
        }
    }
    public void listSpecifications(String ram, String a){
//        String msg = "it has a backlit keyboard";
//        if(keyboardBacklit==false){
//            msg = "it does not has a backlit keyboard";
//        }
//        System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+msg);
        if(keyboardBacklit==true){
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it has a backlit keyboard");
        } else {
            System.out.println("The screenSize is "+screenSize+", it has a "+ram+"gb ram, and "+"it does not has a backlit keyboard");
        }
    }

    public String powerOn(){
        listSpecifications("asas","ASas");
        return "booting System";
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isKeyboardBacklit() {
        return keyboardBacklit;
    }

    public void setKeyboardBacklit(boolean keyboardBacklit) {
        this.keyboardBacklit = keyboardBacklit;
    }

    //    @Override
//    public String toString() {
//        return "Laptop{" +
//                "screenSize=" + screenSize +
//                ", ram=" + ram +
//                ", keyboardBacklit=" + keyboardBacklit +
//                '}';
//    }

    @Override
    public boolean equals(Object arg){
        if(this==arg) {
            return true;
        }
        if(!(arg instanceof Laptop)){
            return false;
        }
        Laptop laptop = (Laptop) arg;
//        return this.keyboardBacklit == laptop.keyboardBacklit && this.ram == laptop.ram && this.screenSize == laptop.screenSize;
        if(this.keyboardBacklit == laptop.keyboardBacklit && this.ram == laptop.ram && this.screenSize == laptop.screenSize){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", ram=" + ram +
                ", keyboardBacklit=" + keyboardBacklit +
                '}';
    }
}
