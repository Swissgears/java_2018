/*
ВЫЧИСЛЕНИЕ COS и SIN УГЛОВ;
сперва преобразую градусы в радианы (Math.toRadians()), а после вычисляю Math.cos() и Math.sin()
 */

public class JavaWork_2_1 {
    public static void main(String[] args) {
        double cos40 = 40;
        double cos45 = 45;
        double cos60 = 60;
        double sin40 = 40;
        double sin45 = 45;
        double sin60 = 60;
        System.out.println("sin 40 градусов равен " + (Math.sin(Math.toRadians(sin40))));
        System.out.println("cos 40 градусов равен " + (Math.cos(Math.toRadians(cos40))));
        System.out.println("sin 45 градусов равен " + (Math.sin(Math.toRadians(sin45))));
        System.out.println("cos 45 градусов равен " + (Math.cos(Math.toRadians(cos45))));
        System.out.println("sin 60 градусов равен " + (Math.sin(Math.toRadians(sin60))));
        System.out.println("cos 60 градусов равен " + (Math.cos(Math.toRadians(cos60))));
    }
}
