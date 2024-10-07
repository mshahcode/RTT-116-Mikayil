package homework.M303_2;


class AutoTypeConversion {
    public static void main(String[] args) {
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        // int z = x + y; (1) // Error; cannot convert from double to int.
        double z = x + y;
        System.out.println("Sum of two numbers: " + z);

        // long r = p - q; // (2) // Error; cannot convert from float to long.
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);
    }
}


class AutoPromoteTest {
    public static void main(String[] args)
    {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
        System.out.println("result = " + result);
    }
}

class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
        // explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("z = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("dou = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println("dou = " + dou + " b = " + b);

    }
}





public class GLAB_303_2_2 {
}
