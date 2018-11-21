
/*
ПРОВЕРКА ВВОДА ЦЕЛОГО ЧИСЛА
 */

import java.util.Scanner;

public class JavaWork_4_1 {
    public static void main(String[] args) {

        System.out.println("Введи целое число:");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            n = n % 2;
            if (n == 0) {
                System.out.println("Число четное");
            } else System.out.println("Число НЕчетное");

        } else {
            System.out.println("Ты ввел не целое число");
        }
    }
}
