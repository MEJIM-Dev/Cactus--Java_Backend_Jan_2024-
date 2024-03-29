import LMS.Book;
import LMS.Library;
import assignment.ShoppingList;
import dataStructures.DataStructures;
import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import oop.Car;
import oop.Laptop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static int a = 2139999999;
    String b = "b";
    char c = 'c';
    long l = 9199999999999999999l;
    boolean bol = true;
    float f = 9.0985566f;
    double d = 9.67787676767676;
    byte sI =  127; //-128 to 127 (negative 2^[8-1]) to (positive {2^[8-1] minus 1})
    short sh = 31522;


    //Memory
    //address | value
    //adfags  | 1213 (primitive)
    //ase     | Pool.Integer.1
    //fdg     | Pool.Integer.2
    //               Pool
    //                ||
    //                \/
    //              Integer 1. 123 2. 56
    //              String i 1. "a"
    //              String ii 1. "a" 2. "rtsd"
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        while(true){
            System.out.println("Welcome to LMS");

            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. List All Books");
            System.out.println("4. Check Book Availability");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter the title");
                    String title = scanner.nextLine();

                   // Book book = new Book();
                    break;

                case 2:
                    // Remove a book
                    break;
                case 3:
                    //List all books
                    break;
                case 4:
                    //Check Book Availability
                    break;
                case 5:
                    //Exit
                    System.exit(0);
                    break;

            }

        }

//        increment();
//        decrement();
//        decisionConstructs();
//        loops();
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//        useCar();
//        objectVersionOne();
//        isASeeVehicle(Car);
//        switchStatement(10);
//        fee("school");
//        objectsVersionTwo();
//          createCarObject();
//        equalsTo();
   //     classicalInheritance();

//        DataStructures ds = new DataStructures();

//        ds.doStuff();
//        shoppingCartSolution();
//        uncheckedException();
        //checkedExceptionHandlingMethod();
//        stackOverFlowError();
        //dsV2();
    }

    private static void objectVersionOne() {
        String as = new String("ASas");//"ASas";
        as.charAt(2);
        String fghjk = "sadassa";
        fghjk.charAt(2);
        Laptop lenovo = new Laptop();
        Laptop mac = new Laptop();

        int dxfghj = 6779;
        Integer ase = 234;

        char dfg = 'h';
        Character ghj = 'h';

        lenovo.keyboardBacklit=false;
        lenovo.ram=8;
        lenovo.screenSize=14;

        mac.screenSize=13;
        mac.ram=16;
        mac.keyboardBacklit=true;

        Laptop macPro = new Laptop();
        macPro.powerOn();
        lenovo.powerOn();
        mac.powerOn();
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public static void sample (){
        int age = 8;
        System.out.println("I am "+ age +" year old"); // "I am "+ 7 + " year old"
        System.out.println("my age will be "+ (age+1) +" next year");
        System.out.println("Am i older than 8? ans: "+(age>8));
        //        System.out.println("Hello world!");
//        window.console.log("Asas");
    }

    public static void increment(){
        int x = 5;
        ++x;
        System.out.println(x);
    }

    public static void decrement(){
        int x = 5;
        --x;
        System.out.println(x);
    }

    public static void operator(){
        // ++ -- != == && || ! + = - / * %
    }

    public static void multiOperators(){
        // += %= *= /= %=
        a+=5;//+=  equivalent to a = a+5
        a/=2; a = a/2;
    }

    public static void decisionConstructs(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of your choice");
        int input = scanner.nextInt();
        scanner.close();
        int arg = 10;

//        ifStatements(input, arg);
//        ternaryOperation(input, arg);
        switchStatement(input);
    }

    public static void ifStatements(int input, int arg){
        if(input>arg){
            System.out.println(input+" is greater than "+arg);
        } else if(input==arg){
            System.out.println(input+" is equals "+arg);
        } else{
            System.out.println(input+" is lesser than "+arg);
        }
    }

    public static void ternaryOperation(int input, int arg){
        String message = input>arg ? input+" is equals "+arg : input+" is lesser than "+arg;
        System.out.println(message);
    }

    public static void switchStatement(int input){
        switch(input){
            case 10: System.out.println(input+" is equals "+10);
                break;
            case 20: System.out.println(input+" is equals "+20);
                break;
            default: System.out.println("No cases met");
        }
    }

    public static void loops(){
        //for while do-while
        whileLoop();
        doWhileLoop();
    }

    private static void whileLoop() {
        int index = 0;
        int count = 1;
        int max = 10;
        while(index>10){
            System.out.println(index);
//            index++;
            if(count>=max){
                break;
            }
            count++;
        }
        System.out.println("Loop has ended");
    }

    public static void doWhileLoop(){
        int index = 0;
        int count = 1;
        int max = 10;
        do{
            System.out.println(index);
//            index++;
            if(count>=max){
                break;
            }
            count++;
        } while (index>10);
        System.out.println("Loop has ended");
    }

/*
    public static void useCar(){
        Car car = new Car();
//        String as = "asasas";
//        int trfdf= 324567;
        car.tires = 0;
        System.out.println(car);

        isASeeVehicle(car);
//        String value = "fdghjk";
//        System.out.println(car);
    }
*/

    /*public static boolean isASeeVehicle(Car car){
        if(car.tires==0){
            System.out.println("it is a sea vehicle");
            return true;
        }
        return false;
    }*/

    public static void fee(String name){
        System.out.println(name);
    }

    public static void objectsVersionTwo(){
        Laptop laptop = new Laptop();
        Laptop laptop2 = new Laptop();
//        Laptop.staticMethod();
//        laptop2.regularMethod();
        laptop.screenSize = 10;
        laptop.ram = 8;
        laptop2.keyboardBacklit=true;
        laptop.listSpecifications();
        laptop2.listSpecifications();

        System.out.println(laptop);
        System.out.println(laptop2);
//        System.out.println(laptop.keyboardBacklit);
    }

    public static void createCarObject(){
        Car carWithTires = new Car(true,4);

        System.out.println(carWithTires + " Car 1");

       carWithTires.setTires(10);

        System.out.println(carWithTires.getTires()+" After Update");

        //System.out.println(car);
    }

    public static void casting(){
        int i = 1027812912;
        long j = 176528277618271621l;
        long k = (long) i; //up casting
        int l = (int) j; //down casting
        short m = 123;
        int n = (int) m;
//        double and float
        double o = 6556172.67;
        float p = 6552.67f;
        double q = (double) p;// up
        float r = (float) o; //down
        String w = "asas";
        Object obj = (Object) w;
        String s = "a";
        System.out.println(s);
        String t = s;
        String v = (String) obj;
        int a = (int) obj;
        Object obj2 = a;
        test2(1);
    }

    public static void test2 (Object arg){

    }

    public static void equalsTo(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any alphabet");
//        String text = scanner.nextLine();
//        scanner.close();

        String a = new String("a");
        String b = "a";
        String c = "a";

//        System.out.println("text==a "+ text==a);
//        System.out.println("text==b "+ text==b);
//        System.out.println("a==b "+ a==b);
//        System.out.println("c==b "+ c==b);
        //Best way to truly check if an object matches another instance of the same type
//        System.out.println(text.equals(a));
//        System.out.println(text.equals(1));
        Laptop laptop = new Laptop();
        Laptop laptop1 = new Laptop();
        laptop1.keyboardBacklit = true;
        Laptop laptop3 = new Laptop();
//        laptop3.setScreenSize(5);
        System.out.println(laptop1+ " "+laptop);

//        System.out.println(laptop==laptop1);
        System.out.println(laptop.equals(laptop1));
        System.out.println(laptop.equals(laptop));
        System.out.println(laptop.equals(laptop3));
        System.out.println(laptop3.equals("asas"));
    }

    public static void classicalInheritance(){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.move();
        dog.move();
        cat.move();
        System.out.println(animal);
        System.out.println(dog);
        System.out.println(cat);
        Car car = new Car();
        car.drive("lagos");
        Animal a = new Cat();
    }

    public static void shoppingCartSolution(){
        ShoppingList items = new ShoppingList();
        items.displayItems();
        items.removeItem();
        items.displayItems();
        items.addItem();
        items.displayItems();
        items.removeItem();
        items.displayItems();
    }

    public static void uncheckedException(){
        int[] numbers = {7,4,2};
        try {
            int fourthItem = numbers[2];
            System.out.println(fourthItem);
        } catch (Exception exception){
            System.out.println("Something went wrong");
        }
    }

    public static void checkedExceptionSignatureMethod() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("Main.java"));
    }

    public static void checkedExceptionHandlingMethod() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/michaelejim/Documents/NotificationService/csv/default_sms_provider.csv"));
            String line = br.readLine();
            System.out.println(line);
            br.close();
            int[] asa = {1,5};
            System.out.println(asa[1]);
            Object a = new Laptop();
            Laptop b = (Laptop) a;
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Couldn't read the file");
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Invalid position used");
        } catch (ClassCastException e){
            e.printStackTrace();
            System.out.println("Failed to cast");
        } catch (Exception e){
            System.out.println("Something Went wrong");
        } finally {
            System.out.println("Finally got here");
        }
        System.out.println("Doing it without finally BS");
    }

    public static void stackOverFlowError(){
        stackOne();
    }

    public static void stackOne(){
        stackTwo();
    }

    public static void stackTwo(){
       stackOne();
    }

    public static void dsV2(){
        ArrayList<String> user = new ArrayList<>(Arrays.asList("emeka","john","20","male"));
        user.get(0);
        HashMap<String,Object> myUser = new HashMap();
        myUser.put("firstname","emeka");
        myUser.put("lastname","john");
        myUser.put("age",20);
        myUser.put("sex","male");
        System.out.println(myUser.get("sex"));
    }

    // name : value
    // text | String@gashjbasjd
    // a    | String@gashjbaasfghajs == String@gashjbasjd
    // b    | String@gashjbaashjqas
    // c    | String@gashjbaashjqas

    //Read up casting
    //Read up equal method
    //Attempt implementation of equal method for person and employee
    //Read up inheritance
}