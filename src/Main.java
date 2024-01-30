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

    public static void main(String[] args) {
//        increment();
//        decrement();
//        decisionConstructs();
        loops();
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


}