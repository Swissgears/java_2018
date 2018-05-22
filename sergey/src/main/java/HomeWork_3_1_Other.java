import java.util.Scanner;

public class HomeWork_3_1_Other {
    public static void main(String[] args) {

        System.out.println("Введи строку");
        String userString = inputString();
        System.out.println("Выбери действие из меню");

        while (true) {
            char userChoice = inputMenu();
            switch (userChoice) {
                case 'A':
                    System.out.println(caseA(userString) + "\n"); // меню выбора "А" , строка в верхнем регистре
                    break;
                case 'B':
                    System.out.println(caseB(userString) + "\n"); // меню выбора "В" , строка в нижнем регистре
                    break;
                case 'C':
                    System.out.println(caseC(userString) + "\n"); // меню выбора "С" , каждое слово с заглавной буквы
                    break;
                case 'D':
                    System.out.println(caseD(userString) + "\n"); // меню выбора "D" ,первая буква каждого слова в нижнем регистре
                    break;
                case 'E':
                    System.out.println(caseE(userString) + "\n"); // меню выбора "E", строка с заглавной буквы
                    break;
                case 'F':
                    caseF(); // меню выбора "F" , выход из программы
                default:
                    System.out.println("Ошибка при выборе, повтори попытку..." + "\n");
            }
        }
    }

    static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s.trim();
        return s;
    }

    static char inputMenu() {
        System.out.println("A: СТРОКА ЗАГЛАВНЫМИ БУКВАМИ");
        System.out.println("B: строка в нижнем регистре");
        System.out.println("C: С Заглавной Буквы");
        System.out.println("D: пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ");
        System.out.println("E: Как в предложении");
        System.out.println("F: Выход из программы");

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0); // пункт меню выбора в верхнем или нижнем регистре
        c = Character.toUpperCase(c);
        return c;
    }

    static String caseA(String s) {
        return s.toUpperCase();// строка в верхнем регистре
    }

    static String caseB(String s) {
        return s.toLowerCase();
    }

    static String caseC(String s) {
//        String[] words = caseB(s).split(" "); // создаю массив строк и вызываю метод split
//        for (String w : words) {
//            String w0 = w.substring(0, 1); // беру первую букву из каждой строки
//            String w1 = w0.toUpperCase(); // возвожу букву в верхний регистр
//            String w2 = w.substring(1); // беру каждую строку массива начиная со второй буквы
//            w3 = w1 + w2 + " ";
//        }
        return s;
    }

    static String caseD(String s) {
//        String[] words = caseA().split(" "); // повторяю действия case 'C', но в верхнем регистре
//        for (String w : words) {
//            String w0 = w.substring(0, 1);
//            String w1 = w0.toLowerCase();
//            String w2 = w.substring(1);
//            w3 = w1 + w2 + " ";
//        }
        return s;
    }

    static String caseE(String s) {
        s = s.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(s);
        char newFirstChar = Character.toUpperCase(stringBuilder.charAt(0));
        stringBuilder.setCharAt(0, newFirstChar);

        return stringBuilder.toString();
    }

    static void caseF() {
        System.exit(0);
    }
}