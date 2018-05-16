import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку");
        String string = scanner.nextLine();
        System.out.println("Выбери действие из меню" + "\n");
        System.out.println("A: СТРОКА ЗАГЛАВНЫМИ БУКВАМИ");
        System.out.println("B: строка в нижнем регистре");
        System.out.println("C: С Заглавной Буквы");
        System.out.println("D: пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ");
        System.out.println("E: Как в предложении");
        System.out.println("F: Выход из программы");

        char c = scanner.next().charAt(0); // пункт меню выбора в верхнем или нижнем регистре
        char c1 = Character.toUpperCase(c);

        String s1 = string.toLowerCase(); // строка в нижнем регистре
        String s2 = string.toUpperCase();// строка в верхнем регистре
        String s3 = s1.trim(); // отсекаю пробелы в начале и в конце строки
        String s4 = s2.trim();

        String s5 = s3.substring(0, 1); // меню выбора "Е"
        String s6 = s5.toUpperCase();
        String s7 = s3.substring(1);

        switch (c1) {
            case 'A':
                System.out.println(s4); // меню выбора "А" , строка в верхнем регистре
                break;
            case 'B':
                System.out.println(s3); // меню выбора "В" , строка в нижнем регистре
                break;
            case 'C':
                String[] words1 = s3.split(" "); // создаю массив строк и вызываю метод split
                for (String w : words1) { // цикл для вывода строк массива
                    String w0 = w.substring(0, 1); // беру первую букву из каждой строки
                    String w1 = w0.toUpperCase(); // возвожу букву в верхний регистр
                    String w2 = w.substring(1); // беру каждую строку массива начиная со второй буквы
                    System.out.print(w1 + w2 + " "); // конкатенирую первую букву с последующими и пробелом
                }
                break;

            case 'D':
                String[] words = s4.split(" "); // повторяю действия case 'C', но в верхнем регистре
                for (String w : words) {
                    String w0 = w.substring(0, 1);
                    String w1 = w0.toLowerCase();
                    String w2 = w.substring(1);
                    System.out.print(w1 + w2 + " ");
                }
                break;

            case 'E':
                System.out.println(s6 + s7);
                break;
            case 'F':
                System.out.println("Программа завершена");
                System.exit(0);
            default:
                System.out.println("Ошибка при выборе");
                System.out.println("Повтори попытку");
        }
    }
}
