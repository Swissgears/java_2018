import java.util.Scanner;
public class HomeWork3_1 {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Выбери действие из меню и введи строку" + "\n");
            System.out.println("A: СТРОКА ЗАГЛАВНЫМИ БУКВАМИ");
            System.out.println("B: строка в нижнем регистре");
            System.out.println("C: С Заглавной Буквы");
            System.out.println("D: пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ");
            System.out.println("E: Как в предложении");
            System.out.println("F: Выход из программы");

            switch (inputMenu()) {
                case 'A':
                    System.out.println(caseA() + "\n"); // меню выбора "А" , строка в верхнем регистре
                    break;
                case 'B':
                    System.out.println(caseB() + "\n"); // меню выбора "В" , строка в нижнем регистре
                    break;
                case 'C':
                    System.out.println(caseC() + "\n"); // меню выбора "С" , каждое слово с заглавной буквы
                    break;
                case 'D':
                    System.out.println(caseD() + "\n"); // меню выбора "D" ,первая буква каждого слова в нижнем регистре
                    break;
                case 'E':
                    System.out.println(caseE() + "\n"); // меню выбора "E", строка с заглавной буквы
                    break;
                case 'F':
                    caseF(); // меню выбора "F" , выход из программы
                default:
                    System.out.println("Ошибка при выборе" + "\n" + "Повтори попытку" + "\n");
            }
        }
    }

    static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    static char inputMenu() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0); // пункт меню выбора в верхнем или нижнем регистре
        char c1 = Character.toUpperCase(c);
        return c1;
    }

    static String caseA() {

        String s2 = inputString().toUpperCase();// строка в верхнем регистре
        String s4 = s2.trim(); // отсекаю пробелы в начале и в конце строки
        return s4;
    }


    static String caseB() {
        String s1 = inputString().toLowerCase(); // строка в нижнем регистре
        String s3 = s1.trim(); // отсекаю пробелы в начале и в конце строки
        return s3;
    }

    static String caseC() {
        String w3 = "";
        String[] words1 = caseB().split(" "); // создаю массив строк и вызываю метод split
        for (String w : words1) {
            String w0 = w.substring(0, 1); // беру первую букву из каждой строки
            String w1 = w0.toUpperCase(); // возвожу букву в верхний регистр
            String w2 = w.substring(1); // беру каждую строку массива начиная со второй буквы
            w3 = w1 + w2 + " ";
        }
        return w3;
    }

    static String caseD() {
        String w3 = "";
        String[] words = caseA().split(" "); // повторяю действия case 'C', но в верхнем регистре
        for (String w : words) {
            String w0 = w.substring(0, 1);
            String w1 = w0.toLowerCase();
            String w2 = w.substring(1);
            w3 = w1 + w2 + " ";
        }
        return w3;
    }

    static String caseE() {
        String s1 = inputString().toLowerCase(); // строка в нижнем регистре
        String s2 = s1.trim(); // отсекаю пробелы в начале и в конце строки
        String s3 = s2.substring(0, 1);
        String s4 = s3.toUpperCase();
        String s5 = s2.substring(1);
        return s4 + s5;
    }

    static void caseF() {
        System.exit(0);
    }
}