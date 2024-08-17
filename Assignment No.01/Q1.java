import java.util.Scanner;

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        int wd = sc.nextInt();
        System.out.println("Enter height");
        int ht = sc.nextInt();

        int area = areaOfRectangle(wd, ht);
        int peri = perimeterOfRectangle(wd, ht);

        System.out.println("Area of Rectangle :" + area);
        System.out.println("Perimeter of Rectangle :" + peri);

    }

    private static int perimeterOfRectangle(int wd, int ht) {
        return 2 * ht * wd;
    }

    private static int areaOfRectangle(int wd, int ht) {
        return wd * ht;
    }
}