package subTwo;

import sub.SampleOne;
import sub.SampleTwo;

public class SampleThree {

    public static void main(String[] args) {
        SampleOne.run();
        SampleTwo.run();
        run();
        test();
    }

    public static void run(){
        System.out.println("Sample Three method ran");
    }

    static void test(){
        System.out.println("S3 Test method ran");
    }

    private static void classBasedMethod(){
        System.out.println("S3 can only access this");
    }

    protected static void forMeAndMyRelatives(){
        System.out.println("For S3 and my relatives");
    }
}
