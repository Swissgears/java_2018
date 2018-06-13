
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3_2 {
    public static void main(String[] args) {
        String str;
        while (true) {
            str = inputString();
            if (checkPattern(str)) {
                str = str.trim();
                break;
            }
        }
        if (patternA(str) > 0) {
            System.out.println("Буква A повторяется в строке " + patternA(str) + " раз");
        }
        if (patternB(str) > 0) {
            System.out.println("Буква B повторяется в строке " + patternB(str) + " раз");
        }
        if (patternC(str) > 0) {
            System.out.println("Буква C повторяется в строке " + patternC(str) + " раз");
        }
        if (patternD(str) > 0) {
            System.out.println("Буква D повторяется в строке " + patternD(str) + " раз");
        }
        if (patternE(str) > 0) {
            System.out.println("Буква E повторяется в строке " + patternE(str) + " раз");
        }
        if (patternF(str) > 0) {
            System.out.println("Буква F повторяется в строке " + patternF(str) + " раз");
        }
        if (patternG(str) > 0) {
            System.out.println("Буква G повторяется в строке " + patternG(str) + " раз");
        }
        if (patternH(str) > 0) {
            System.out.println("Буква H повторяется в строке " + patternH(str) + " раз");
        }
        if (patternI(str) > 0) {
            System.out.println("Буква I повторяется в строке " + patternI(str) + " раз");
        }
        if (patternJ(str) > 0) {
            System.out.println("Буква J повторяется в строке " + patternJ(str) + " раз");
        }
        if (patternK(str) > 0) {
            System.out.println("Буква K повторяется в строке " + patternK(str) + " раз");
        }
        if (patternL(str) > 0) {
            System.out.println("Буква L повторяется в строке " + patternL(str) + " раз");
        }
        if (patternM(str) > 0) {
            System.out.println("Буква M повторяется в строке " + patternM(str) + " раз");
        }
        if (patternN(str) > 0) {
            System.out.println("Буква N повторяется в строке " + patternN(str) + " раз");
        }
        if (patternO(str) > 0) {
            System.out.println("Буква O повторяется в строке " + patternO(str) + " раз");
        }
        if (patternP(str) > 0) {
            System.out.println("Буква P повторяется в строке " + patternP(str) + " раз");
        }
        if (patternQ(str) > 0) {
            System.out.println("Буква Q повторяется в строке " + patternQ(str) + " раз");
        }
        if (patternR(str) > 0) {
            System.out.println("Буква R повторяется в строке " + patternR(str) + " раз");
        }
        if (patternS(str) > 0) {
            System.out.println("Буква S повторяется в строке " + patternS(str) + " раз");
        }
        if (patternT(str) > 0) {
            System.out.println("Буква T повторяется в строке " + patternT(str) + " раз");
        }
        if (patternU(str) > 0) {
            System.out.println("Буква U повторяется в строке " + patternU(str) + " раз");
        }
        if (patternV(str) > 0) {
            System.out.println("Буква V повторяется в строке " + patternV(str) + " раз");
        }
        if (patternW(str) > 0) {
            System.out.println("Буква W повторяется в строке " + patternW(str) + " раз");
        }
        if (patternX(str) > 0) {
            System.out.println("Буква X повторяется в строке " + patternX(str) + " раз");
        }
        if (patternY(str) > 0) {
            System.out.println("Буква Y повторяется в строке " + patternY(str) + " раз");
        }
        if (patternZ(str) > 0) {
            System.out.println("Буква Z повторяется в строке " + patternZ(str) + " раз");
        }
    }


    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String result;
        System.out.println("Введи строку:");
        result = scanner.nextLine().toLowerCase();
        return result;
    }

    public static boolean checkPattern(String s) {
        Pattern p = Pattern.compile("[a-zA-Z\\s\\-.]+");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static int patternA(String s) {
        Pattern pattern = Pattern.compile("[^a]*a");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternB(String s) {
        Pattern pattern = Pattern.compile("[^b]*b");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternC(String s) {
        Pattern patternC = Pattern.compile("[^c]*c");
        Matcher matcherC = patternC.matcher(s);
        int a = 0;
        while (matcherC.find()) {
            a++;
        }
        return a;
    }

    public static int patternD(String s) {
        Pattern pattern = Pattern.compile("[^d]*d");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternE(String s) {
        Pattern pattern = Pattern.compile("[^e]*e");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternF(String s) {
        Pattern pattern = Pattern.compile("[^f]*f");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternG(String s) {
        Pattern pattern = Pattern.compile("[^g]*g");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternH(String s) {
        Pattern pattern = Pattern.compile("[^h]*h");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternI(String s) {
        Pattern pattern = Pattern.compile("[^i]*i");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternJ(String s) {
        Pattern pattern = Pattern.compile("[^j]*j");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternK(String s) {
        Pattern pattern = Pattern.compile("[^k]*k");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternL(String s) {
        Pattern pattern = Pattern.compile("[^l]*l");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternM(String s) {
        Pattern pattern = Pattern.compile("[^m]*m");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternN(String s) {
        Pattern pattern = Pattern.compile("[^n]*n");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternO(String s) {
        Pattern pattern = Pattern.compile("[^o]*o");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternP(String s) {
        Pattern pattern = Pattern.compile("[^p]*p");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternQ(String s) {
        Pattern pattern = Pattern.compile("[^q]*q");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternR(String s) {
        Pattern pattern = Pattern.compile("[^r]*r");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternS(String s) {
        Pattern pattern = Pattern.compile("[^s]*s");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternT(String s) {
        Pattern pattern = Pattern.compile("[^t]*t");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternU(String s) {
        Pattern pattern = Pattern.compile("[^u]*u");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternV(String s) {
        Pattern pattern = Pattern.compile("[^v]*v");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternW(String s) {
        Pattern pattern = Pattern.compile("[^w]*w");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternX(String s) {
        Pattern pattern = Pattern.compile("[^x]*x");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternY(String s) {
        Pattern pattern = Pattern.compile("[^y]*y");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }

    public static int patternZ(String s) {
        Pattern pattern = Pattern.compile("[^z]*z");
        Matcher matcher = pattern.matcher(s);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }
}