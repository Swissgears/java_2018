import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String s = Integer.toString(x);
        int xl = s.length();
        int a;
        int[] num = new int[xl];

        for ( int i = 0; i < xl; i++) {
            a = x % 10;
            x = x / 10;
            num[i] = a;
        }

        Arrays.sort(num);
        System.out.println(num[0]);
        System.out.println(num[ (xl - 1)]);
    }
}










