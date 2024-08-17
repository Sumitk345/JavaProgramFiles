/* WAP to input employee gender and age using command line arguments, compare following conditoins
   and check whether employee is eligible for insurance or not
   a) employee gender is male and age is greater than 25
   b) employee gender is female and age is greater than 21    */

class Program7
{
	public static void main(String []args)	//{"male", "29"}
	{
		int n = args.length;

		if(n==2)
		{
			String gender = args[0];
			byte age = Byte.parseByte(args[1]);

			//using == can not be used to compare strings in java
			//java function equals() or  equalsIgnoreCase() used to compare string

			if(gender.equalsIgnoreCase("male") && age>=25)
			{
				System.out.println("Male employee is eligible");
			}
			else if(gender.equalsIgnoreCase("female") && age>=21)
			{
				System.out.println("Female employee is eligible");
			}
			else
			{
				System.out.println("Employee is Not eligible!!!");
			}
		}
		else
		{
			System.out.println("Invalid number of arguments!");
		}
	}
}