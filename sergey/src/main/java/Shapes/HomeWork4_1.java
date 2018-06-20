package Shapes;

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
                System.out.println("Площадь квадрата равна " + square.calculateSquare());
                System.out.println("Периметр квадрата равен " + square.calculatePerimeter());
                break;

            case 2:
                System.out.println("Введи длину и ширину сторон прямоугольника" + "\n");
                Rectangle rectangle = new Rectangle();
                System.out.println("Площадь прямоугольника равна " + rectangle.calculateSquare());
                System.out.println("Периметр прямоугольника равен " + rectangle.calculatePerimeter());
                break;

            case 3:
                System.out.println("Введи радиус окружности" + "\n");
                Round round = new Round();
                System.out.println("Площадь окружности равна " + round.calculateSquare());
                System.out.println("Периметр окружности равен " + round.calculatePerimeter());
                break;

            case 4:
                System.out.println("Введи длины сторон треугольника" + "\n");
                Triangle triangle = new Triangle();
                System.out.println("Площадь треугольника равна " + triangle.calculateSquare());
                System.out.println("Периметр треугольника равен " + triangle.calculatePerimeter());
                break;

            case 5:
                exit();

            default:
                System.out.println("Ошибка при выборе" + "\n" + "Повтори попытку" + "\n");
        }

    }


    private static int intMenu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static class Square implements GeometryShape {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        public double calculateSquare() {
            return i * i;
        }

        public double calculatePerimeter() {
            return 4 * i;
        }
    }

    public static class Rectangle implements GeometryShape {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();

        public double calculateSquare() {
            return i * i1;
        }

        public double calculatePerimeter() {
            return (i + i1) * 2;
        }

    }

    public static class Round implements GeometryShape {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        final double PI = 3.14;

        public double calculateSquare() {
            return PI * (i * i);
        }

        public double calculatePerimeter() {
            return (i * PI) * 2;
        }
    }

    public static class Triangle implements GeometryShape {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();

        public double calculateSquare() {
            double p = (i + i1 + i2) / 2;
            return Math.sqrt(p * (p - i) * (p - i1) * (p - i2));
        }

        public double calculatePerimeter() {
            return i + i1 + i2;
        }
    }

    private static void exit() {

        System.exit(0);
    }
}

