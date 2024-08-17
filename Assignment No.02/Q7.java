import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter five Strings");
        Scanner s1 = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = s1.next();
        }
        System.out.print("Original Array :");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println("\nResult :");
        boolean print = true; //
        String[] compare = { "@", "#", "%", "&", "*", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                for (int j2 = 0; j2 < compare.length; j2++) {
                    if (String.valueOf(names[i].charAt(j)).equals(compare[j2]) == false) {
                        print = true;
                    } else {
                        print = false;
                        break;

                    }
                }
                if (print == false) {
                    break;
                }
            }
            if (print) {
                System.out.println(names[i]);
            }

        }

    }
}
