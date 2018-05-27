import java.util.Scanner;

public class HomeWork2_4 {
    public static void main(String[] args) {
        int n = inputInt();
        if (fact(n)) {
            System.out.println("Число " + n + " является степенью двойки" + "\n");
        } else
            System.out.println("Число " + n + " не является степенью двойки" + "\n");
    }

    static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Введи число > 1:");
        result = scanner.nextInt();
        return result;
    }

    static boolean fact(int n) {
        if (n == 1){ 
            return false;
        }
        while (n > 0) {
            if (n % 2 == 0) {
                return fact(n / 2);
            } else if (n == 1) {
                return true;
            } else
                return false;
        }
        return false;
    }
}

