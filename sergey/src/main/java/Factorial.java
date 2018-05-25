import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        int n = inputInt();
        System.out.println("факториал числа " + n + " = " + factorial.fact(n));
    }

    static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Введи число > 1:");
        result = scanner.nextInt();
        return result;
    }

    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}



