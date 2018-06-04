import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3_3 {
    public static void main(String[] args) {

        do {
        } while (!inputName());
        do {
        } while (!inputNumberPhone());
        do {
        } while (!inputEmail());
    }


    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String result;
        result = scanner.nextLine();
        return result;
    }

    public static boolean inputName() {

        System.out.println("Введи имя в формате Ivanov Ivan Ivanovich");
        Pattern p = Pattern.compile("[a-zA-Z0-9 \\-]{3,}"); // проверка ФИО на валидность
        Matcher m = p.matcher(inputString());
        return m.matches();
    }

    public static boolean inputNumberPhone() {
        System.out.println("Введи номер телефона в формате +380501112233:");
        Pattern p = Pattern.compile("^\\+380(50|66|99|68|73|63|98)[0-9]{7}$"); // проверка номера телефона на валидность
        Matcher m = p.matcher(inputString());
        return m.matches();
    }

    public static boolean inputEmail() {
        System.out.println("Введи email:");
        Pattern p = Pattern.compile("\\w+([\\.-]?\\w)*@\\w+([\\.-]?\\w)*\\.\\w{2,4}"); // проверка  адреса электронной почты на валидность
        Matcher m = p.matcher(inputString());
        return m.matches();
    }
}
