package sub;

public class SampleTwo {

    public static void run(){
        System.out.println("Sample Two method ran");
    }

    static void test(){
        System.out.println("S2 Test method ran");
        classBasedMethod();
    }

    private static void classBasedMethod(){
        System.out.println("S2 can only access this");
    }

    protected static void forMeAndMyRelatives(){
        System.out.println("For S2 and my relatives");
    }
}
