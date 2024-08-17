public class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operand = args[2];
        switch (operand) {
            case "+":
                System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction of " + b + " From " + a + " is " + (a - b));
                break;
            case "x":
                System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
                break;

            case "/":
                System.out.println("Division of " + a + " and " + b + " is " + (a / b));
                break;

            default:
                System.out.println("Choose correct Operator!");
                break;
        }

    }
}
