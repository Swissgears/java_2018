import java.util.Scanner;

/*
СУММА ЦИФР ДВУЗНАЧНОГО ЧИСЛА
 */
public class JavaWork_1_2 {
    public static void main(String[] args) {
        System.out.println("Введи целое двузначное число:");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sum = n % 10; // получаю вторую цифру числа
        double n1 = n / 10;
        double n2 = Math.floor(n1); // получаю первую цифру числа
        double n3 = n2 + sum;
        System.out.printf("Сумма цифр числа %.0f равна %.0f",n ,n3);
    }

}
