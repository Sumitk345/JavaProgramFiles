import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inches ");
        int inch = sc.nextInt();
        double yards = inchToYard(inch);
        double feet = inchToFeet(inch);
        System.out.println(inch + " inch = " + yards + " yards");
        System.out.println(inch + " inch = " + feet + " feets");

    }

    static double inchToYard(int inch) {
        return inch * 0.027;
    }

    static double inchToFeet(int inch) {
        return inch * 0.083;
    }

}
