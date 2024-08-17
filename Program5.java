/* commandline arguments */

class Program5
{
	public static void main(String []args)   //{"10","hello","true","99.45"}
	{
		System.out.println("This is Command line argument");
		int n = args.length;
		System.out.println("total arguments = " + n);

		for(int i=0;i<n;i++)
		{
			System.out.println(args[i]);
		}
	}
}