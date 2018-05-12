import java.util.Scanner;

public class One {
    public static void main(String[] args){
        double x;
        double y;
        double z;
        double n;
        long f1;
        int f2;
        float f3;
        double f4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("введи число x");
        x = scanner.nextDouble();
        System.out.println("введи число y");
        y = scanner.nextDouble();
        System.out.println("введи число z");
        z = scanner.nextDouble();
        System.out.println("введи число n");
        n = scanner.nextDouble();

        f1 = (long)(x + (y - 100) * z / n);
        System.out.println("f1 = x + (y - 100) * z / n)");
        System.out.println("f1 = " + f1);
        System.out.println("");

        f2 = (int)((x - (50 + y * z) * n) + x);
        System.out.println("f2 = (x - (50 + y * z) * n) + x");
        System.out.println("f2 = " + f2);
        System.out.println("");

        f3 = (float) (x * (y / (z-1) + 555) - n);
        System.out.println("f3 = x * (y / (z-1) + 555) - n");
        System.out.println("f3 = " + f3);
        System.out.println("");

        f4 = -x / y + z * (n+1);
        System.out.println("f4 = -x / y + z * (n+1)");
        System.out.println("f4 = " + f4);
        System.out.println("");

    }
}


