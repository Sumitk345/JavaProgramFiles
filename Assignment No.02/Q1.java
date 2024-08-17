/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        Byte();
        Short();
        Int();
        Float();

    }

    public static void Int() {
        System.out.println("\nMinimun Value : " + Integer.MIN_VALUE + "\nMaximun Value  : " + Integer.MAX_VALUE
                + " Memory size for int : : " + Integer.SIZE);
    }

    public static void Short() {
        System.out.println("\nMinimun Value : " + Short.MIN_VALUE + "\nMaximun Value  : " + Short.MAX_VALUE
                + "\nMemory size for Short : : " + Short.SIZE);
    }

    public static void Float() {
        System.out.println("\nMinimun Value : " + Float.MIN_VALUE + "\nMaximun Value :  " + Float.MAX_VALUE
                + "\nMemory size for Float : : " + Float.SIZE);
    }

    public static void Byte() {
        System.out.println("\nMinimun Value : " + Byte.MIN_VALUE + "\nMaximun Value  : " + Byte.MAX_VALUE
                + " \nMemory size for Byte : : " + Byte.SIZE);
    }

}