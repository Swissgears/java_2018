/*
ГЕНЕРАЦИЯ ЧИСЕЛ И РАССТАНОВКА ИХ В ПОРЯДКЕ ВОЗРАСТАНИЯ
 */


import java.util.Arrays;

public class JavaWork_3_5 {
    public static void main(String[] args) {

        int a = (int) (Math.random() * (18 + 1) - 9); // Целое число в интервале [-9; 9]
        int b = (int) (Math.random() * (18 + 1) - 9);
        int c = (int) (Math.random() * (18 + 1) - 9);

        System.out.println(a + " " + b + " " + c); // сгенерированные псевдослучайные цифры

        int n = Math.max(a, b); // нахожу максимум из трех цифр
        int n1 = Math.max(b, c);
        int n2 = Math.max(a, c);
        int n3 = Math.max(n, n1);
        int n4 = Math.max(n1, n2);
        int max = Math.max(n3, n4);

        int m = Math.min(a, b); // нахожу минимум из трех цифр
        int m1 = Math.min(b, c);
        int m2 = Math.min(a, c);
        int m3 = Math.min(m, m1);
        int m4 = Math.min(m1, m2);
        int min = Math.min(m3, m4);

        if (max == a && min == b) {
            System.out.println(b + " " + c + " " + a);
        } else if (max == b && min == a) {
            System.out.println(a + " " + c + " " + b);
        } else if (max == b && min == c) {
            System.out.println(c + " " + a + " " + b);
        } else if (max == c && min == b) {
            System.out.println(b + " " + a + " " + c);
        } else if (max == a && min == c) {
            System.out.println(c + " " + b + " " + a);
        } else if (max == c && min == a) {
            System.out.println(a + " " + b + " " + c);
        }

/*
СОРТИРОВКА ПО ВОЗРАСТАНИЮ ЭЛЕМЕНТОВ МАССИВА
 */

        int[] numbers = new int[3];
        numbers[0] = (int) (Math.random() * (18 + 1) - 9);
        numbers[1] = (int) (Math.random() * (18 + 1) - 9);
        numbers[2] = (int) (Math.random() * (18 + 1) - 9);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}








