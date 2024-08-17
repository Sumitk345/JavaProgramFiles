/* Scanner Class */

import java.util.Scanner;

class ScannerExample1
{
	public static void main(String []args)
	{
		//read input
		Scanner s1 = new Scanner(System.in);


		String fname;
		String emailid;
		byte age;

		System.out.print("\n Enter first name :");
		fname = s1.next();

		System.out.print("\n Enter email id :");
		emailid = s1.next();

		System.out.print("\n Enter age :");
		age = s1.nextByte();

	}
}

/*
Note: by default java imports lang package
java/....
	lang/...
		System.java
		Object.java
		String.java
		Integer.java
		Float.java

	util/...
		Scanner.java
		Arrays.java
		ArrayList.java

	io/...
	sql/...


	Scanner class functions
	-------------------------
	1. next()			: read string
	2. nextInt()		: read integer number
	3. nextFloat()		: read decimal number
	4. nextDouble()		: read decimal number
	5. nextByte()		: read integer number







	*/