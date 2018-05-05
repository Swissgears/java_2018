
public class OneTwo {
    public static void main(String[] args) {

        int[] name = new int[5];
        name[4] = 5;
        name[3] = 8;
        name[2] = 6;
        name[1] = 5;
        name[0] = 4;
        for (int aName : name) {
            System.out.print(aName);
        }
        System.out.println();

            for (int ii : name) {
                System.out.println(ii);
            }
        }
    }