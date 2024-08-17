/* WAP to calcualte basic arithmatic calculations using command line arguments */

// class Program6
// {
// 	public static void main(String []args) //{"10", "3"}
// 	{
// 		int n = args.length;

// 		if(n==2)
// 		{
// 			float a = Float.parseFloat(args[0]);
// 			float b = Float.parseFloat(args[1]);

// 			System.out.println("Addition = " + (a + b));
// 			System.out.println("Subtraction = " + (a - b));
// 			System.out.println("Multiplication = " + (a * b));
// 			System.out.println("Division = " + (a / b));
// 		}
// 		else
// 		{
// 			System.out.println("Invalid number of arguments!");
// 		}
// 	}
// }

/* Assignment1: WAP to input two numbers at command line and show which is Max */
// class Program6
// {
// 	public static void main(String[] args) {
// 		int l = args.length;
// 		if(l==2)
// 		{
// 			int a = Integer.parseInt(args[0]);
// 			int b = Integer.parseInt(args[1]);

// 			// if(a>b)
// 			// {
// 			// 	System.out.println(args[0]+" is greater than "+args[1]);
// 			// }
// 			// else
// 			// {
// 			// 	System.out.println(args[1]+" is greater than "+args[0]);
// 			// }

// 			for (int i = 1; i > 0; i++) {
// 				if(a == i)
// 				{
// 					System.out.println(b+" is max");
// 					break;
// 				}
// 				else if(b == i)
// 				{
// 					System.out.println(a+" is max");
// 					break;
                    
// 				}
				
// 			}
// 		}
// 		else
// 		{
// 			System.out.println("invalid number of arguments");
// 		}

		
// 	}
// }

/* Assignment2: WAP to input any 5 digit number at command line and show addition of all digits */

// class Program6
// {
// 	public static void main(String[] args) {
// 		int l = args.length;
// 		if(l==5)
// 		{
// 			int sum = 0;

// 			for (int i = 0; i < l; i++) {
				
// 				sum = sum + Integer.parseInt(args[i]) ;
// 			}
// 			System.out.println("sum of five numbers is "+sum);
// 		}
// 		else
// 		{
// 			System.out.println("invalid number of arguments");
// 		}

		
// 	}
// }

/* Assignment3: WAP to input any string from user at command line, count and print how many characters are capital and
   how many are small alphabates */

   class Program6
{
	public static void main(String[] args) {
		int l = args.length;
		if(l==1)
		{
			int counter_cap = 0;
			int counter_small = 0;
			String str = args[0];
			for (int i = 0; i < str.length() ; i++) {
				// System.out.println(args.length);
                // System.out.println(str.charAt(i));

				//Method 1
			    // char Char = str.charAt(i);
				// if (Char == Character.toUpperCase(Char)) {
				// 	counter_cap++;
				// } else {
				// 	counter_small++;
				// } 

				//Method 2
			    
				if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(i)).toUpperCase())) {
					counter_cap++;
				} else {
					counter_small++;
				}
				
			}
			System.out.println("Number of capital letters is "+ counter_cap);
			System.out.println("Number of small letters is "+ counter_small);
		}
		else
		{
			System.out.println("invalid number of arguments");
		}

		
	}
}