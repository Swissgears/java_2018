/*
ИГРА ПО УГАДЫВАНИЮ СЛУЧАЙНОГО ЧИСЛА
 */

import java.util.Scanner;

public class JavaWork_5_1 {
    public static void main(String[] args) {

        int programNumber;
        int userNumber;
        int counter = 0;

        do {
            programNumber = (int) (Math.random() * (20 + 1) - 10); // исключение числа "0" из ряда чисел programNumber
        }

        while (programNumber == 0);

        System.out.println("Я загадал число от -10 до 10. " + "\n" + "Отгадай его.");

        System.out.println("Введи свое число:");

        Scanner inputNumber = new Scanner(System.in);

        if (inputNumber.hasNextInt()) {

            do {
                userNumber = inputNumber.nextInt();
                counter++; // счетчик попыток пользователя
                if (userNumber == programNumber) {
                    System.out.println("Ты угадал мое число с " + counter + " попытки");
                } else {
                    if (userNumber >= -10 && userNumber <= 10) {
                        System.out.println("Ты не угадал");

                        if (programNumber < 0 && userNumber > 0) {
                            System.out.println("Я загадал число со знаком минус");
                        } else if (programNumber > 0 && userNumber < 0) {
                            System.out.println("Я загадал число со знаком плюс");
                        }
                        if (programNumber < userNumber) {
                            System.out.println("Мое число меньше");

                        } else {
                            System.out.println("Мое число больше");
                        }
                    } else {
                        System.out.println("Твое число вообще не из нужного отрезка");
                    }
                }
            } while (userNumber != programNumber);

        } else {
            System.out.println("Ошибка. Ты ввел не целое число");
        }
        System.out.println("До свидания");

    }

}
