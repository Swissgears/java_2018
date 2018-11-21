import java.util.Scanner;
/*
ДЕЛЕНИЕ С ОСТАТКОМ
 */
public class JavaWork_1_1 {

    public static void main(String[] args) {
        System.out.println("Введи числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a / b;
        int d = a % b;
        System.out.println(a + " / " + b + " = " + c + " и остаток " + d);
    }
}