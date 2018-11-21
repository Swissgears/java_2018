import java.util.Scanner;
/*
ОПРЕДЕЛЕНИЕ ЧИСЛА БЛИЖНЕГО К 10
 */
public class JavaWork_3_2 {
    public static void main(String[] args) {
        System.out.println("Введи число:");
        double num = 10;
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        double m1 = num - m;
        double n1 = num - n;

        if (Math.abs(m1) < Math.abs(n1)) {
            System.out.println("Число " + m + " ближнее к " + num);
        }
        else if (Math.abs(n1) < Math.abs(m1)) {
            System.out.println("Число " + n + " ближнее к " + num);
        }
        else {  //(Math.abs(n1) == Math.abs(m1))
            System.out.println("Числа " + m + " и " + n + " равноудаленны от " + num);
        }

    }
}

