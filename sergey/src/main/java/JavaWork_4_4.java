/*
ОПРЕДЕЛЕНИЕ НАИМЕНЬШЕГО ПО МОДУЛЮ ИЗ ТРЕХ ВЕЩЕСТВЕННЫХ ЧИСЕЛ
 */
import java.util.Scanner;

public class JavaWork_4_4 {
    public static void main(String[] args) {

        System.out.println("Введи три вещественных числа с любым знаком:");
        Scanner scanner = new Scanner(System.in);
        double first = Math.abs(scanner.nextDouble()); // ввод чисел
        double second = Math.abs(scanner.nextDouble());
        double third = Math.abs(scanner.nextDouble());

        double min = Math.min(Math.min(first, second),Math.min(second, third)); // нахожу минммальное число

        System.out.println("Среди введенных чисел " + min + " наименьшее по модулю");
    }
}




