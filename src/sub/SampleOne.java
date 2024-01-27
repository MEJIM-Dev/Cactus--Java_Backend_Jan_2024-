package sub;

import subTwo.SampleFour;
import subTwo.SampleThree;

public class SampleOne {


    public static void main(String[] args) {
        run();
        SampleTwo.run();
        SampleThree.run();
        test();
        SampleTwo.test();
//        SampleThree.test();
        classBasedMethod();
//        SampleTwo.classBasedMethod();
        forMeAndMyRelatives();
        SampleTwo.forMeAndMyRelatives();
//        SampleThree.forMeAndMyRelatives();
        SampleFour.forMeAndMyRelatives();
        String msg = getGreetMsg();
        System.out.println(msg);
    }


    public static void run(){
        System.out.println("Sample One method ran");
        classBasedMethod();
        return;
    }

    static void test(){
        System.out.println("S1 Test method ran");
    }

    private static void classBasedMethod(){
        System.out.println("S1 can only access this");
    }

    protected static void forMeAndMyRelatives(){
        System.out.println("For S1 and my relatives");
    }

    public static String getGreetMsg(){
        String msg = "Hello";
        return msg;
    }

    public static int sum() {
        return 1+2;
    }

    int as (){
        return 1;
    }
}
