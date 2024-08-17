import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int veg = 120;
        int non_veg = 150;
        int item_type = 0;
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter veg - 1 and non-veg - 2 :");
        int choice = S1.nextInt();
        if (choice == 1) {
            item_type = veg;
        } else {
            item_type = non_veg;
        }
        System.out.print("Enter number of quntity :");
        int Qnt = S1.nextInt();
        System.out.print("Enter distance from center :");
        int dist = S1.nextInt();
        if (Qnt >= 1 && dist >= 1) {
            int total_bill = Claculate_price(Qnt, dist, item_type);
            System.out.println("Total Bill :" + total_bill);
        }
    }

    public static int Claculate_price(int qnt, int dist, int item_type) {
        int price = 0;
        if (dist <= 3) {
            price = item_type * qnt;
        } else {
            int new_dist = dist - 3;
            if (new_dist == 1 || new_dist == 2 || new_dist == 3) {
                price = item_type * qnt + (new_dist * 3);
                System.out.println("Item price :" + item_type + " Charges :" + " 0 and " + (new_dist * 3));
            } else {
                new_dist = new_dist - 3;
                price = item_type * qnt + (new_dist * 6) + (3 * 3);
                System.out.println("Item price :" + item_type + " Charges :" + " 9 and " + (new_dist * 6));

            }
        }
        return price;
    }
}
