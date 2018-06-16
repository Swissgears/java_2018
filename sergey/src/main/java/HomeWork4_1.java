import java.util.Scanner;

public class HomeWork4_1 {


    public static void main(String[] args) {

        System.out.println("Выбери фигуру из меню и введи ее номер" + "\n");

        System.out.println("1: КВАДРАТ");
        System.out.println("2: ПРЯМОУГОЛЬНИК");
        System.out.println("3: КРУГ");
        System.out.println("4: ТРЕУГОЛЬНИК");
        System.out.println("5: Выход из программы");
        int menuInt = intMenu();


        switch (menuInt) {
            case 1:
                System.out.println("Введи длину боковой грани квадрата" + "\n");
                Square square = new Square();
                System.out.println("Площадь квадрата равна " + square.square());
                System.out.println("Периметр квадрата равен " + square.perimeter());
                break;

            case 2:
                System.out.println("Введи длину и ширину сторон прямоугольника" + "\n");
                Rectangle rectangle = new Rectangle();
                System.out.println("Площадь прямоугольника равна " + rectangle.square());
                System.out.println("Периметр прямоугольника равен " + rectangle.perimeter());
                break;

            case 3:
                System.out.println("Введи радиус окружности" + "\n");
                Round round = new Round();
                System.out.println("Площадь окружности равна " + round.square());
                System.out.println("Периметр окружности равен " + round.perimeter());
                break;

            case 4:
                System.out.println("Введи длины сторон треугольника" + "\n");
                Triangle triangle = new Triangle();
                System.out.println("Площадь треугольника равна " + triangle.square());
                System.out.println("Периметр треугольника равен " + triangle.perimeter());
                break;

            case 5:
                exit();

            default:
                System.out.println("Ошибка при выборе" + "\n" + "Повтори попытку" + "\n");
        }

    }


    private static int intMenu(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static class Square {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int square() {
            return i * i;
        }

        int perimeter() {
            return 4 * i;
        }
    }

    public static class Rectangle {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();

        int square() {
            return i * i1;
        }

        int perimeter() {
            return (i + i1) * 2;
        }

    }

    public static class Round {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        final double PI = 3.14;

        double square() {
            return PI * (i * i);
        }

        double perimeter() {
            return (i * PI) * 2;
        }
    }

    public static class Triangle {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();

        double square() {
            double p = (i + i1 + i2) / 2;
            return Math.sqrt(p * (p - i) * (p - i1) * (p - i2));
        }

        double perimeter() {
            return i + i1 + i2;
        }
    }

    private static void exit() {

        System.exit(0);
    }
}
