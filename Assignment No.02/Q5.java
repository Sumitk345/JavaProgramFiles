import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = S1.nextInt();
        System.out.println("Enter Second number :");
        int b = S1.nextInt();
        System.out.println("1.Even numbers :");
        System.out.println("2.Prime numbers");
        System.out.println("3.Palidrome numbers");
        int Choice = 0;
        while (Choice != 4) {
            System.out.println("\nEnter Choice :");
            Choice = S1.nextInt();
            switch (Choice) {
                case 1:
                    Even(a, b);
                    break;
                case 2:
                    Prime(a, b);
                    break;
                case 3:
                    Palidrome(a, b);
                    break;

                default:
                    break;
            }
        }

    }

    private static void Palidrome(int a, int b) {
        System.out.println("Palidrom numbers");
        for (int i = a; i <= b; i++) {
            String str = "";
            String Str = String.valueOf(i);
            for (int j = Str.length() - 1; j >= 0; j--) {
                str = str + Str.charAt(j);
            }
            if (str.equals(Str)) {
                System.out.print(i + " ");
            }

        }
    }

    private static void Even(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void Prime(int a, int b) {

        for (int i = a; i <= b; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }

            }
            if (counter == 2) {
                System.out.print(i + " ");
            }

        }
    }
}
