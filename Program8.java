// import java.util.ArrayList;

/* WAP to input percentage scored by student in final exam. compare following conditions
   and print grade of student
   a. more than 75 : "Distincion"  		b. more than 60: "First Class"
   c. more than 50 : "Second Class"		d. more than 40: "Pass"  otherwise "Fail"  */

// class Program8
// {
// 	public static void main(String []args)	//{"98"}
// 	{
// 		int n = args.length;

// 		if(n==1)
// 		{
// 			float percentage = Float.parseFloat(args[0]);
// 			String grade = "";

// 			if(percentage>=75)
// 				grade = "Ditinction";
// 			else if(percentage>=60)
// 				grade = "First Class";
// 			else if(percentage>=50)
// 				grade = "Second Class";
// 			else if(percentage>=40)
// 				grade = "Pass";
// 			else
// 				grade = "Fail";

// 			System.out.println("You Scored Grade = " + grade);

// 		}
// 		else
// 		{
// 			System.out.println("Invalid number of Arguments");
// 		}
// 	}
// }

//*************************************************************** */

/* Assignment1: WAP to input a number at command line and check whether number is even or odd */
// class Program8
// {
// 	public static void main(String[] args) {

// 		int a = Integer.parseInt(args[0]);
// 		if(a%2==0)
// 		{
// 			System.out.println("Number is even");
// 		}
// 		else{
// 			System.out.println("Number is odd");
// 		}
// 	}
// }

//*************************************************************** */

/* Assignment2: WAP to input 5 digit integer number at command line and replace its last digit
   with product of first and last digit.    example: no = 74619  then output = 746163  */
// class Program8
// {
// 	public static void main(String[] args) {
// 		int l = args[0].length();
// 		System.out.println(l);
// 		if(l==5)
// 		{
//             String org = args[0];
// 			int n = Integer.parseInt(String.valueOf(org.charAt(4)));
// 			System.out.println("Original string :"+args[0]);
// 			System.out.println("Square : "+n*n);
// 			int c = n*n;
// 			String s = Integer.toString(c);
// 			String NewString = org.replace(String.valueOf(org.charAt(4)),s);
// 			System.out.println("New String "+NewString);

// 		}
// 	}
// }

/* Assignment3: WAP to input 3 digit integer number in command line argument. compare and print
   big digit from a number.     example: no = 697  then output = 9	*/

// class Program8 {
//     public static void main(String args[]) {		//{"697"}
//         String Str = args[0];
//         String max = String.valueOf(Str.charAt(0)); //"6"->"9"

//         for (int i = 0; i < Str.length(); i++) {
//             for (int j = i + 1; j < Str.length(); j++) {
//                 if (Integer.parseInt(String.valueOf(Str.charAt(i))) > Integer.parseInt(String.valueOf(Str.charAt(j)))) {
//                     max = String.valueOf(Str.charAt(i));
//                 }
//             }
//         }

//         System.out.println("Maximum number is " + max);
//     }

// }

/*
 * Assignment4: WAP to input 3 unique numbers and arrange them in ascending
 * order
 * example: a = 49, b = 48 c = 31 then output = 31,48,49
 */

// class Program8
//  {
//     public static void main(String args[])
//     {
//         System.out.println("Code ..");
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         int a = Integer.parseInt(args[0]);
//         int b = Integer.parseInt(args[1]);
//         int c = Integer.parseInt(args[2]);

//         for (int i = 1; i > 0; i++) {
//         if(a == i)
//         {
//           arr.add(a);
//         }
//         else if(b == i)
//         {
//             arr.add(b);
//         }
//         else if(c == i)
//         {
//             arr.add(c);
//         }
//     }
//     System.out.println(arr);

// }
// }
