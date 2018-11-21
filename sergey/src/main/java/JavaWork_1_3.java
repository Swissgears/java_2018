import java.util.Scanner;
/*
ОКРУГЛЕНИЕ ДРОБИ
 */
public class JavaWork_1_3 {
    public static void main(String[] args) {
        System.out.println("Введи дробь в формате 3,25: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Дробь округлена до " + Math.round(a));

    }
}
