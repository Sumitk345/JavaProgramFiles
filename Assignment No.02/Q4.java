public class Q4 {
    public static void main(String[] args) {
        String[] lang = { "Python", "Algol-c", "Java", "Cpp", "Html" };
        for (int j = 65; j <= 90; j++) {
            for (int i = 0; i < lang.length; i++) {
                if ((char) j == args[i].charAt(0)) {
                    System.out.println(lang[i]);
                }
            }
        }
    }
}
