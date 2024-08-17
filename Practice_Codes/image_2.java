import java.util.Scanner;

class image_2
{
    static int counter;
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the milege vehicle ");
        int vehicle_milege = s1.nextInt();
        System.out.println("Enter the amount per liter ");
        int amount_liter = s1.nextInt();
        int amount_to_pay = amount_to_pay(vehicle_milege,amount_liter);
        System.out.println("Amount to be paid by each one:"+amount_to_pay);
        if(amount_to_pay%5==0)
        {
            System.out.println("True");
        }
        for (int i = 0; i <= 10; i++) {
            counter++;
        }
        print_counter();
    }

    private static void print_counter() {
        System.out.println(counter);
    }

    private static int amount_to_pay(int vehicle_milege, int amount_liter) {
        return vehicle_milege*amount_liter/3;
    }
}
