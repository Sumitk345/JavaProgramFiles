import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side :");
        int side = sc.nextInt();

        int area = sideOFSquare(side);
        System.out.println("Area of square : " + area);
    }

    private static int sideOFSquare(int side) {
        return side * side;
    }
}
