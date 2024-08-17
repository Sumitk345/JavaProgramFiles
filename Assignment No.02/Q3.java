import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter Number :"); // 6987
        String num = S1.next();
        int l = num.length();
        char max = num.charAt(0);

        for (int i = 1; i < l; i++) {

            if (Integer.parseInt(String.valueOf(num.charAt(i))) > Integer.parseInt((String.valueOf(max)))) {
                max = num.charAt(i);
            }

        }
        System.out.println("Here , I found " + max + " as Max Digit in " + num);
    }
}
