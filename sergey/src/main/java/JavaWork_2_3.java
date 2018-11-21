import java.util.Scanner;

/*
ОПРЕДЕЛИТЬ КОЛИЧЕСТВО ЦИФР В ЧИСЛЕ
 */
public class JavaWork_2_3 {
    public static void main(String[] args) {

        System.out.println("Введи натуральное число:");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int mas = 0;
        for (int i = 0, a = 1; n > 0; i++, a++) {
            double num[] = new double[a];
            num[i] = n % 10;
            n = n / 10;
            n = Math.floor(n);
            mas = num.length;

        }

        System.out.println("Число содержит " + mas + " цифр");

    }
}