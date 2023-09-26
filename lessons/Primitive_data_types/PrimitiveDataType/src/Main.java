public class Main {
    public static void main(String[] args) {
        int a = 2;// 32 бита

        short b = 34;//16 бит

        long d = 3423232;//64 бит

        byte v = 123;//8 бит

        boolean bo = true;//

        long l = 34239L;

        int integ = (int) l;

        float flo = integ;

        long longe = a;

        float f = 232.423f;//32 бит

        double doub = 2323.434;//64 бит

        char c = 'r';//16 бит

        System.out.println(bo);

        System.out.println("-----------------------");

        float floatDigit = 343242.54f;
        long digit = Math.round(floatDigit);
        System.out.println(digit);
        System.out.println("-----------------------");
        byte b1 = (byte)128;
        System.out.println(b1);
        System.out.println("-----------------------");
        int x = 1;
        x = Integer.parseInt("342432");
        Integer integer = 123;
        int rew = integer;
        System.out.println(x);
    }
}