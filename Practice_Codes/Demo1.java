import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter number :");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print(" Threefive");
            } else {
                if (arr[i] % 3 == 0) {
                    System.out.print(" Three");
                } else if (arr[i] % 5 == 0) {
                    System.out.print(" Five");
                } else {
                    System.out.print(" " + arr[i]);
                }
            }
        }
    }
}
