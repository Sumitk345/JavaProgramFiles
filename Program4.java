/* WAP to create variables a and b using integer datatype. save numbers and show addition,
   subtraction, multiplication, division and remainder */

class Program4
{
	public static void main(String []args)
	{
		int a;
		int b;

		a = 20;
		b = 3;

		int addn = a + b;
		int subt = a - b;
		int mult = a * b;
		int idiv = a / b;
		float fdiv = (float)a/b;		//type casting
		int rem = a % b;

		System.out.println("Addition = " + (a + b));
		System.out.println("Subtraction = " + (a - b));
		

	}
}