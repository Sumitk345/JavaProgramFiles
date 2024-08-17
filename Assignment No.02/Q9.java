import java.util.Scanner;

public class Q9 {
    static Scanner s1 = new Scanner(System.in);
    static int error = -1;

    public static void main(String[] args) {
        enrollStudent();
    }

    private static void enrollStudent() {
        System.out.println("Enter Student name :");
        String name = s1.next();
        System.out.println("\nEnter Student Qualification :");
        String Qulification = s1.next();
        System.out.println("\nEnter Student scored marks :");
        int marks = s1.nextInt();
        System.out.println("\nEnter Student University Name :");
        String Uname = s1.next();

        Object[] details = { name, Qulification, marks, Uname };

        int Error = validateinput(name, Qulification, marks, Uname);
        switch (Error) {
            case -1:
                System.out.println("\nEverythig Correct");
                System.out.println("\nStudent Registration Successful");
                break;
            case 101:
                System.out.println("\nInvalid name");
                break;
            case 102:
                System.out.println("\nInvalid Qulification");
                break;
            case 103:
                System.out.println("\nInvalid Scored marks");
                break;
            case 104:
                System.out.println("\nInvalid University Name");
                break;

            default:
                break;
        }
    }

    private static int validateinput(String name, String qulification, int marks, String uname) {

        String[] Qul = { "ssc", "hsc", "graduate", "post" };
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                continue;
            } else {
                error = 101;
                break;
            }
        }

        if (error != 101) {
            for (int j = 0; j < Qul.length; j++) {
                if (qulification.equals(Qul[j])) {
                    error = -1;
                    break;
                } else {
                    error = 102;
                }
            }

        }

        if (error != 101 && error != 102) {
            if (marks >= 1 && marks <= 100) {
                error = -1;
            } else {
                error = 103;
            }
        }

        if (error != 101 && error != 102 && error != 103) {
            for (int i = 0; i < uname.length(); i++) {
                char ch = uname.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == '.') {
                    continue;
                } else {
                    error = 104;
                    break;
                }
            }
        }

        return error;
    }
}
