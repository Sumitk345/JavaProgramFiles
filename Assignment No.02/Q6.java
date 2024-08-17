import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter five numbers");
        Scanner s1 = new Scanner(System.in);
        float Arr[] = new float[5];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = s1.nextFloat();
        }
        System.out.print("Original Array :");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }

        boolean isNotfound = false;
        System.out.println("\nEnter a number to search");
        float searchNum = s1.nextFloat();
        for (int i = 0; i < Arr.length; i++) {
            if (searchNum == Arr[i]) {
                isNotfound = false;
                System.out.println(searchNum + " found at array position " + i);
                break;
            } else {
                isNotfound = true;
            }
        }
        if (isNotfound) {
            for (float i = 0.1f; i > 0; i = (float) (i + 0.1)) {
                float a = searchNum + i;
                float b = searchNum - i;
                for (int j = 0; j < Arr.length; j++) {
                    if (Arr[j] == a) {
                        System.out.print("Oops " + searchNum + " not found . But " + a + "is near to " + searchNum
                                + " at position " + j + 1);
                        isNotfound = false;
                        break;
                    } else if (Arr[j] == b) {
                        System.out.print("Oops " + searchNum + " not found . But " + b + " is near to " + searchNum
                                + " at position " + j + 1);
                        isNotfound = false;
                        break;
                    }
                }
                if (!isNotfound) {
                    break;
                }

            }

        }
    }
}
