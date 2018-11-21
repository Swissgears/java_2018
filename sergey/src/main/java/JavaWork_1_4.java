import java.util.Scanner;

/*
СУММА ЦИФР ТРЕХЗНАЧНОГО ЧИСЛА
 */
public class JavaWork_1_4 {
    public static void main(String[] args) {
        System.out.println("Введи целое трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sum = n % 10; // получаю третью цифру числа
        double n1 = n / 10;
        double n2 = Math.floor(n1); // получаю две первых цифры числа
        double sum1 = n2 % 10; // получаю вторую цифру числа
        double n3 = n2 / 10;
        double n4 = Math.floor(n3); //  получаю первую цифру числа
        double n5 = sum + sum1 + n4;
        System.out.printf("Сумма цифр числа %.0f равна %.0f", n, n5);

    }

}

