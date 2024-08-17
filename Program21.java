import java.util.Scanner;

/* Functional Overloading */

// class Program21
// {
// 	public static void main(String []args)
// 	{
// 		//2
// 		addition("Deesha","Computer");

// 		//4
// 		addition(4.5f, 8.4f);

// 		//3
// 		int x1[] = {5,6,9};
// 		int x2[] = {4,5,6};
// 		addition(x1, x2);

// 	}

// 	//1
// 	public static void addition(int a,int b)
// 	{
// 		System.out.println("Integer addition = " + (a + b));
// 	}

// 	//2
// 	public static void addition(String s1, String s2)
// 	{
// 		System.out.println("String addition = " + (s1 + " " + s2));
// 	}

// 	//3
// 	public static void addition(int x[], int y[])
// 	{
// 		int ans[] = new int[3];
// 		for(int i=0;i<ans.length;i++)
// 		{
// 			ans[i] = x[i]+ y[i];
// 		}

// 		System.out.println("Array Addition = " + ans[0] + ", " + ans[1] + ", " + ans[2]);

// 	}

// 	//4
// 	public static void addition(float a, float b)
// 	{
// 		System.out.println("Float addition = " + (a + b));
// 	}
// }

/*
	Assignment: WAP to define overloaded function to calculate and return area of
	circle, triangle, square and rectangle. */
// class Program21 {
// 	public static void main(String[] args) {

// 		area(2);
// 		area(2, 4, 7);
// 		area(2.1);
// 		area(3, 5);
// 	}

// 	public static void area(double rad) {
// 		System.out.println("Area of circle :" + (2 * 3.14 * rad));
// 	}

// 	public static void area(int a, int b, int c) {
// 		System.out.println("Area of tringle :" + (a * b * c));
// 	}

// 	public static void area(int side) {
// 		System.out.println("Area of square :" + (side * side));
// 	}

// 	public static void area(int length, int breadth) {
// 		System.out.println("Area of rectangle :" + (length * breadth));
// 	}
// }

//............................................................
/*
 * 1. circle
 * 2. triangle
 * 3. rectangle
 * 4. square
 * 
 * write switch case menus as given and show area for respective shape upon
 * dimentions
 * enter by user. user need to choose which shape area to calculate
 * 
 * 
 */

class Program21 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value for a , b , c");
		int a =s1.nextInt() ;
		int b =s1.nextInt() ;
		int c =s1.nextInt() ;
		float pi= 3.14f;
		System.out.println("Select Option :");
		System.out.println("\n1. circle  2. triangle 3. rectangle  4. square");
		int choice = s1.nextInt();
		switch (choice) {
			case 1:
				area(pi,a);
				break;
			case 2:
				area(a,b,c);
				break;
			case 3:
				area(a,b);
				break;
			case 4:
				area(a);

				break;
			default:
				System.out.println("Chose correct option");
		}

	}

	public static void area(float pi,double rad) {
		System.out.println("Area of circle :" + (2 * pi * rad));
	}

	public static void area(int a, int b, int c) {
		System.out.println("Area of tringle :" + (a * b * c));
	}

	public static void area(int side) {
		System.out.println("Area of square :" + (side * side));
	}

	public static void area(int length, int breadth) {
		System.out.println("Area of rectangle :" + (length * breadth));
	}
}