
public class TwoTwo {
    public static void main(String[] args) {

        int[] number = new int[5];// вывести в консоль наибольшее и наименьшее число
        number[0] = 1;
        number[1] = 5;
        number[2] = 8;
        number[3] = 7;
        number[4] = 5;

        int max = number[0];
        for (int i = 1; i < number.length; i++) max = Math.max(max, number[i]);
        int min = number[0];
        for (int i = 1; i < number.length; i++) min = Math.min(min, number[i]);
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
