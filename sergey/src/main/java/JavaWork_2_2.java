import java.util.Scanner;

/*
ВЫЧИСЛЕНИЕ ПЛОЩАДИ И ПЕРИМЕТРА ПРЯМОУГОЛЬНОГО ТРЕУГОЛЬНИКА
 */
public class JavaWork_2_2 {
    public static void main(String[] args) {
        System.out.println("Введи длины катетов треугольника:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(); // длина катета
        double b = scanner.nextDouble(); // длина катета
        double pow = 2;
        double c = Math.sqrt(Math.pow(a, pow) + Math.pow(b, pow)); // длина гипотенузы

        System.out.printf("Периметр треугольника равен %.0f \n", (a + b + c));
        System.out.printf("Площадь треугольника равна %.0f \n", (0.5 * a * b));

    }
}
