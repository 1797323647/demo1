package demo1;

public class Test {
    public static void main(String[] args) {
        SingleInstance1 s1 = SingleInstance1.singleInstance1;
        SingleInstance1 s2 = SingleInstance1.singleInstance1;
        SingleInstance1 s3 = SingleInstance1.singleInstance1;
        System.out.println(s1 + "," + s2 + "," + s3);
        System.out.println("=================================");
        SingleInstance2 singleInstance21 = SingleInstance2.getSingleInstance2();
        SingleInstance2 singleInstance22 = SingleInstance2.getSingleInstance2();
        SingleInstance2 singleInstance23 = SingleInstance2.getSingleInstance2();
        System.out.println(singleInstance21);
        System.out.println(singleInstance22);
        System.out.println(singleInstance23);
    }
}
