/*
НА СКЛАДЕ 50000 ПОЛОК С НОМЕРКАМИ. ВСЕ НОМЕРКИ СОДЕРЖАЩИЕ ЦИФРУ 2 НЕОБХОДИМО ЗАМЕНИТЬ. ПОДСЧИТАТЬ КОЛИЧЕСТВО НОМЕРКОВ ДЛЯ ЗАМЕНЫ
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaWork_5_4 {
    public static void main(String[] args) {

        int counter = 0;
        String num = "50000";
        while (true) {

            Pattern p = Pattern.compile("\\d*?[2]\\d*?"); // ищу все таблички содержащие цифру 2
            Matcher m = p.matcher(num);
            if (m.matches()) {
                counter++; // считаю таблички не содержащие цифру 2
            }
            int x = Integer.parseInt(num); // преобразую строку в число
            x--;
            num = Integer.toString(x); // преобразую число обратно в строку
            if (x == 0)
                break;
        }

        System.out.println("Табличек необходимо заменить " + counter + " шт ");
    }


}



