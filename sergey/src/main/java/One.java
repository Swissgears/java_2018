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

        System.out.println("введи число");
        x = scanner.nextDouble();
        System.out.println("введи число");
        y = scanner.nextDouble();
        System.out.println("введи число");
        z = scanner.nextDouble();
        System.out.println("введи число");
        n = scanner.nextDouble();

        f1 = (long)(x + (y - 100) * z / n);
        System.out.println("f1 = x + (y - 100) * z / n)");
        System.out.println("f1 = " + f1);
        System.out.println("");

        System.out.print(f2 = (x - (50 + y * z) * n) + x);
        System.out.print(f3 = x * (y / (z-1) + 555) - n);
        System.out.print(f4 = -x / y + z * (n+1));
    }
}


