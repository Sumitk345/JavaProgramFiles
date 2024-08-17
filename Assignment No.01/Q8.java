import java.util.Scanner;

class Calculator {
    Scanner sc = new Scanner(System.in);
    int[] Arr = new int[5];

    public void Calculate() {

        System.out.println("Enter 5 numbers :");
        for (int i = 0; i < Arr.length; i++) {
            int a = sc.nextInt();
            Arr[i] = a;
        }
    }

    int display() {
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 3 == 0) {
                sum = sum + Arr[i];
            }
        }
        return sum;
    }

    void Factorial() {
        int sum = 1;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 2 == 0) {
                for (int j = 1; j <= Arr[i]; j++) {
                    sum = sum * j;
                }
                System.out.println("Factorail of " + Arr[i] + " is " + sum);
                sum = 1;

            }
        }
    }

}

public class Q8 {
    public static void main(String[] args) {

        Calculator Cal = new Calculator();
        Cal.Calculate();
        int sum = Cal.display();
        System.out.println("Sum of numbers divisible by 3 : " + sum);
        Cal.Factorial();

    }
}
