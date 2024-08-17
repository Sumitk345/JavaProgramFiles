/* WAP to input storage capacity in gigabytes and convert it to Megabytes, Kilobytes, Bytes
  and in bits */

import java.util.Scanner;

class ScannerExample3
{
	public static void main(String []args)
	{
		int gb;
		int mb;
		int kb;
		int b;
		long bit;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Storage Capaciy in gigabytes :");
		gb = s1.nextInt();			//1


		convertToMb(gb);
		/*convertToKb(kb);
		convertToByte(b);
		convertToBit(bit);*/

	}

	public static void convertToMb(int gbg)
	{

		System.out.print("\n In Megabytes = "+ (gbg*1024));

	}

	/*public static void convertToKb(int kb)
	{
		kb = mb*1024;
		System.out.print("\n In Kilobytes = "+ kb);
	}

	public static void convertToByte(int b)
	{
		b = kb*1024;
		System.out.print("\n In Bytes = " + b);
	}

	public static void convertToBit(long bit)
	{
		bit = (long)b*8;
		System.out.print("\n In Bit = " + bit);
	}*/
}

/*
	8 bit			: 1 byte
	1024 byte		: 1 kilo byte
	1024 kb			: 1 mega byte
	1024 mb			: 1 giga byte

*/