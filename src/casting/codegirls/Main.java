package casting.codegirls;

public class Main {

    public static void main(String [] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        l1 = 10;

        int i2;
        long l2 = 10000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 100000L;
        i3 = (int) l3;

        double d1;
        d1 = 10.5f;

        float f2;
        float f3;
        double d2 = 1000000.58d;
        f2 = (float) d2;
        double d3 = 10000.5000000000000d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.56778f;
        i4 = (int) f4;

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);

        b1 = (byte) d3;

        System.out.println("b1:" + b1);

    }
}
