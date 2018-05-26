import java.util.Scanner;

public class HomeWork2_3 {
    public static void main(String[] args) {

        int n = inputInt();
        System.out.println("фибоначчи под индексом " + n + " равно " + fib(n) + "\n");
        System.out.println("Ряд чисел фибоначчи до индекса " + n + ":");
          for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
        static int inputInt () {
            Scanner scanner = new Scanner(System.in);
            int result;
            System.out.println("Введи индекс числа фибоначчи:");
            result = scanner.nextInt();
            return result;
        }

        static int fib ( int n){
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
