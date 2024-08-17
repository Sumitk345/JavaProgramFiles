import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
    static List lc = new ArrayList<Integer>();
    static List<Integer> ls = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                ls.add(n);
                n = n / 2;
            } else {
                ls.add(n);
                n = 3 * n + 1;
            }
            if (n == 1) {
                ls.add(n);
            }
        }
        int x = ls.get(0);
        findmax(x);
        System.out.println(ls);

    }

    public static int count(int i) {
        int counter = 1;
        while (i != 1) {
            if (i == 1) {
                break;
            }
            if (i % 2 == 0) {
                counter++;
                i = i / 2;
            } else {
                counter++;
                i = 3 * i + 1;
            }

        }
        return counter;
    }

    public static void findmax(int n) {
        int maxcount = 1;
        int maxcountlength = 1;
        for (int j = 1; j <= n; j++) {
            if (count(j) > maxcountlength) {
                maxcount = j;
                maxcountlength = count(j);
            }
        }
        ls.add(maxcountlength);
        ls.add(maxcount);
    }
}
