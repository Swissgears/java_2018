import java.util.Scanner;

public class HomeWork2_3 {
    public static void main(String[] args) {

        HomeWork2_3 fib = new HomeWork2_3();
        int n = inputInt();
        System.out.println("фибоначчи под индексом " + n + " равно " + fib.fib(n));
    }

    static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Введи индекс числа фибоначчи:");
        result = scanner.nextInt();
        return result;
    }

    int fib(int n) {
        int result;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            result = fib(n - 1) + fib(n - 2);
            return result;

        }
    }
}