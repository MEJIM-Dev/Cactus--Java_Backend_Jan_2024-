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

    public String powerOn(){
        return "booting System";
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
    public boolean equals(Object o){
        if(false) {// if they are not the same instance
            return false;
        }
        return true;
    }
}
