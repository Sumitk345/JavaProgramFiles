import java.util.Scanner;

public class Task {
    static int num_5_req = 0;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of 1 Rs coins :");
        int coins_1 = s1.nextInt();
        System.out.print("Enter number of 5 Rs coins :");
        int coins_5 = s1.nextInt();
        System.out.print("\nEnter price of Item :");
        int price = s1.nextInt();

        int total_money = coins_1 + coins_5 * 5;
        System.out.println("\nTotal Money :" + total_money + " ruppes");
        Final_output(total_money, price, coins_1, coins_5);
    }

    public static int Final_output(int total_money, int price, int coins_1, int coins_5) {
        int num_5 = 0;
        if (total_money < price) {
            System.out.println("\n-1");
        } else {

            while (num_5 < price) {
                for (int i = 1; i > 0; i++) {
                    if ((5 * i) > price) {
                        num_5_req = i - 1;
                        if (coins_5 < num_5_req) {
                            num_5_req = coins_5;
                        }
                        System.out.println("\n5 rupess coins  : " + num_5_req + " coins");
                        System.out.println("\n1 rupess coins : " + (price - (5 * num_5_req)) + " coins");
                        num_5 = 5 * i;
                        break;
                    }
                }
            }

        }
        return price;
    }
}