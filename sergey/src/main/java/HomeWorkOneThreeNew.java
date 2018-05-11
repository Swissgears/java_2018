import java.util.Scanner;

public class HomeWorkOneThreeNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х");
        double vectorX = scanner.nextDouble();
        System.out.println("Введите координату Y");
        double vectorY = scanner.nextDouble();
        System.out.println("Введите координату Z");
        double vectorZ = scanner.nextDouble();
        double computation = Math.sqrt(Math.pow(vectorX, 2)+ Math.pow(vectorY, 2) + Math.pow(vectorZ, 2)); // извлечение корня из суммы суммы квадратов координат
        System.out.println("Длина вектора (Х,Y,Z) = " + computation);
    }
}
