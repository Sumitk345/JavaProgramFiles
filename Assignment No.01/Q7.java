public class Q7 {

    public static void main(String[] args) {

        even e1 = new even();
        int[] a = e1.display_even();
        System.out.println("Even Numbers :");
        for (int k = 0; k < a.length; k++) {
            System.out.print(" " + a[k]);
        }

        System.out.println("\nOdd Numbers :");

        for (int i = 100; i < 200; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }
}

class even {

    public int[] display_even() {
        int arr[] = new int[50];
        int j = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            arr[j] = i;
            j++;
        }

        return arr;

    }

}