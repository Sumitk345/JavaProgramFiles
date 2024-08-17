
class Practice {
    public static void main(String[] args) {

        String str = "112244456666";

        if (str.length() == 0) {
            System.out.println("Please provide a string as input.");
            return;
        }

        int l = str.length();

        if (l == 12) {
            int counter = 0;
            char currentChar = str.charAt(0);

            for (int i = 0; i < l; i++) {
                if (str.charAt(i) == currentChar) {
                    counter++;
                } else {
                    System.out.print(counter);
                    currentChar = str.charAt(i);
                    counter = 1;
                }
            }
            System.out.println(counter);
        } else {
            System.out.println("Input string must be of length 12.");
        }
    }
}
