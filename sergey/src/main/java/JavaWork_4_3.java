/*
ПРОВЕРКА ВВОДА ПАЛИНДРОМА ИЗ ПЯТИ БУКВ
 */

import java.util.Scanner;

public class JavaWork_4_3 {
    public static void main(String[] args) {

        System.out.println("Введи палиндром из пяти букв:");
        Scanner scanner = new Scanner(System.in);

        String inputString;
        inputString = scanner.nextLine()
                .trim()
                .toLowerCase(); //отсекаю пробелы и преобразую буквы в нижний регистр

        if (inputString.length() != 5) {

            System.out.println("Ты ввел слово не из пяти букв");

        } else {

            String firstChar = inputString.substring(0, 1); // первая буква слова
            String lastChar = inputString.substring(4, 5); // пятая буква слова
            boolean firstLastEquals = firstChar.equals(lastChar);
            String secondChar = inputString.substring(1, 2); // вторая буква слова
            String fourthChar = inputString.substring(3, 4); // четвертая буква слова
            boolean secondFourthEquals = secondChar.equals(fourthChar);
            if (firstLastEquals && secondFourthEquals) {
                System.out.println("Ты ввел слово палиндром ");
            } else {
                System.out.println("Ты ввел НЕ палиндром ");
            }

        }
    }
}
