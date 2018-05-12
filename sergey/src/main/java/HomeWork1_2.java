import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a;
        while (x > 0) {
            a = x % 10;
            x = x / 10;
            System.out.println(a);
        }
    }
}
