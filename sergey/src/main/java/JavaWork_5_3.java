/*
ПОДСЧЕТ КОЛИЧЕСТВА СЧАСТЛИВЫХ БИЛЕТОВ В ПАЧКЕ
 */

public class JavaWork_5_3 {
    public static void main(String[] args) {

        int left;
        int right;
        int num = 999999;
        int counter = 0;
        while (num > 0) {
            int num1 = num;
            int[] mas = new int[6];
            for (int i = 0; i < mas.length; i++) { // заполнение массива
                mas[i] = num1 % 10;
                num1 = num1 / 10;
            }
            left = mas[0] + mas[1] + mas[2];
            right = mas[3] + mas[4] + mas[5];
            if (left == right) { // сравнение сумм первых и последних трех чисел
                counter++;
            }
            num--;
        }
        System.out.println("Количество счастливых билетов в одной пачке равно " + counter + " шт.");
    }
}
