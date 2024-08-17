import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price :");
        int price = sc.nextInt();
        System.out.println("Enter quntity :");
        int qnt = sc.nextInt();

        System.out.println("Total bill :" + price * qnt + " Rs");
    }
}
