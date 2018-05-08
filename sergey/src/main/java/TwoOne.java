import java.util.Scanner;

public class TwoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        final String course = "Course: Java core";
        final String student = "student";
        final String username = "Username: ";
        int a = course.length() + 2; // длина строки + звездочка в таблице
        int b = student.length() + 2;
        int c = name.length();
        int e = username.length() + 2;
        int d = Math.max(a, b); // максимум между курсом и студентом
        int f = Math.max(c, d); // максимум между именем и курсом/студентом
        int g = c + e; // сумма длин именем и юзернейм
        int r = Math.max(g, f) + 4;
        int minusCourse = (r - a) / 2;
        int minusStudent = (r - b) / 2;
        int minusName = (r - g)/2;

        for (int i = 0; i < r; i++) { //верхняя граница рамки
            System.out.print("*");
        }

        System.out.println();
        System.out.print("*");

        for (int i1 = 0; i1 < minusCourse; i1++) { // пробел перед строкой "курс"
            System.out.print(" ");
        }

        System.out.print(course);

        for (int i1 = 0; i1 < minusCourse; i1++) { // пробел после строки "курс"
            System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();
        System.out.print("*");

        for (int i2 = 0; i2 < minusStudent; i2++) { // пробел перед строкой "студент"
            System.out.print(" ");
        }

        System.out.print(student);

        for (int i2 = 0; i2 < minusStudent; i2++) { // пробел после строки "студет"
            System.out.print(" ");
        }
        System.out.print("*");

            System.out.println();
        System.out.print("*");

        for (int i3 = 0; i3 < minusName; i3++) { // пробел перед строкой "имя"
            System.out.print(" ");
        }

        System.out.print(username + name);

        for (int i3 = 0; i3 < minusName; i3++) { // пробел после строки "имя"
            System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();

        for (int i = 0; i < r; i++) { // нижняя граница рамки
            System.out.print("*");
        }
            }
        }


