/* WAP to input m and n. Define Function to print even and odd numbers, following function
   prototype as given below
   1. public static int[] filterByEven(int m, int n);
   2. public static int[] filterByOdd(int m, int n);

   */

import java.util.Scanner;

class ScannerExample7 {
	static int a = 0;
	static int b = 0;

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int m;
		int n;

		System.out.print("\n Enter start :");
		m = s1.nextInt(); // 11 3 15 92 44 22 94

		// 5 3

		System.out.print("\n Enter end :");
		n = s1.nextInt(); // 20 9 27 109 56 43 104

		while (m > n) {
			System.out.println("\n End should be greater than start");
			System.out.print("\n Enter end :");
			n = s1.nextInt();
		}

		System.out.println("Range from " + m + " to " + n);
		array_size(m, n);
		int even[] = filterByEven(m, n, a); // while passing value dont specify datatype
		int odd[] = filterByOdd(m, n, b); // while passing value dont specify datatype

		System.out.println("Even numbers are:");

		for (int i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}

		System.out.println("Odd number are:");
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
	}

	public static void array_size(int m, int n) {
		if (m % 2 != 0 && n % 2 != 0) {
			a = (n - m) / 2; // Formulat to calculate number of even if both inputs are odd
			b = a + 1;
			System.out.println("Even A :" + a);
			System.out.println("Odd B :" + b);
		} else {
			a = ((n - m) / 2) + 1; // Formulat to calculate number of odd if one inputs is diffrent than other
			b = a;
			System.out.println("Even A :" + a);
			System.out.println("Odd B :" + b);
		}
		// return a;

	}

	public static int[] filterByEven(int m, int n, int arr_size) // argument must be declare using respective datatype
	{
		// java array declaration syntax
		int arr[] = new int[arr_size];
		int index = 0;

		for (int x = m % 2 == 0 ? m : m + 1; x <= n; x += 2) {

			arr[index] = x;
			index++;
		}

		return arr;
	}

	public static int[] filterByOdd(int m, int n, int arr_size) // argument must be declare using respective datatype
	{
		// java array declaration syntax
		int arry[] = new int[arr_size];
		int index = 0;

		for (int x = m % 2 != 0 ? m : m + 1; x <= n; x += 2) {

			arry[index] = x;
			index++;
		}

		return arry;
	}

}