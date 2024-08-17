/* WAP to read loan details and calculate interest amount per year. */

import java.util.Scanner;

// class ScannerExample2
// {
// 	public static void main(String []args)
// 	{
// 		float loan_amount;	//500000
// 		float rate;	//10%
// 		byte tenure;	//5
// 		Scanner s1 = new Scanner(System.in);

// 		System.out.print("\n Enter loan amount :");
// 		loan_amount = s1.nextFloat();

// 		System.out.print("\n Enter rate of interest :");
// 		rate = s1.nextFloat();

// 		System.out.print("\n Enter Tenure :");
// 		tenure = s1.nextByte();

// 		float interest_amount = loan_amount*rate/100;
// 		System.out.println("Per year interest amount is " + interest_amount);

// 	}
// }

/* Assignment1: WAP to input any number and check whether number is palindrome number or not.
   example no = 381  output: "no palindrome"
           no = 181  output: "it is palindrome"			*/

// class ScannerExample2
// {
// 	public static void main(String[] args) {
// 		Scanner s1 = new Scanner(System.in);
// 		System.out.println("Enter the number :");
// 		String OrgStr = s1.next();
// 		String NewStr = "";
// 		for (int i = 2; i >= 0; i--) {
// 			NewStr = NewStr+OrgStr.charAt(i);		
// 		}
// 		if (OrgStr.equals(NewStr)) {
// 			System.out.println("Palidrome");
// 		} else {
// 			System.out.println("Not Palidrome");

// 		}

// 	}

// }

/* Assingment2: WAP to input any number and check that number is prime number or not
   example no = 39   output : "it is not prime"
           no = 11   output : "it is prime number"			*/

// class ScannerExample2
// {
//   public static void main(String[] args) {
// 	int counter = 0;
// 	Scanner s1 = new Scanner(System.in);
// 	System.out.println("Enter your number");
//     int input = s1.nextInt();
// 	for (int i = 1; i <= input; i++) {
// 		if (input % i == 0) {
// 			counter++;
// 		}
// 	}
// 	if(counter==2)
// 	{
// 		System.out.println("Number is prime");
// 	}
// 	else
// 	{
// 		System.out.println("Number is not prime");
// 	}
//   }
// }

/* Assignment3: WAP to input two numbers from user. perform swapping without using temporary
   variable.
   example	a = 18		b = 39		then output, 	a = 39		b = 18		*/

class ScannerExample2 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value for a");
		int a = s1.nextInt();
		System.out.println("Enter value for b");
		int b = s1.nextInt();
		System.out.println("Before : Value of a :" + a + " value of b :" + b);

		System.out.println("After : Value of a :" + (a + b - a) + " value of b :" + (b + a - b));

	}

}
