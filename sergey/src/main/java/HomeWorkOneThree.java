import java.util.Scanner;

public class HomeWorkOneThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты вектора Х");
        int [] vectorX = new int[2];
        vectorX [0] = scanner.nextInt();
        vectorX [1] = scanner.nextInt();
        System.out.println("Введите координаты вектора Y");
        int [] vectorY = new int[2];
        vectorY [0] = scanner.nextInt();
        vectorY [1] = scanner.nextInt();
        System.out.println("Введите координаты вектора Z");
        int [] vectorZ = new int[2];
        vectorZ [0] = scanner.nextInt();
        vectorZ [1] = scanner.nextInt();
        int subtractionX = vectorX [0] - vectorX [1]; // вычисление базисного вектора
        int subtractionY = vectorY [0] - vectorY [1];
        int subtractionZ = vectorZ [0] - vectorZ [1];
        int exponentiation = 2; // множитель для возведения в степень
        double exponentiationX = Math.pow(subtractionX,exponentiation); // возведение в степень
        double exponentiationY = Math.pow(subtractionY,exponentiation);
        double exponentiationZ = Math.pow(subtractionZ,exponentiation);
        double sum = exponentiationX + exponentiationY + exponentiationZ; // сумма квадратов координат
        double computation = Math.sqrt(sum); // извлечение корня из суммы суммы квадратов координат

        System.out.println("Длина вектора (Х,Y,Z) = " + computation);
    }
}
