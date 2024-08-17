import java.util.Scanner;

public class Q6 {
    static int counter = 1;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int choice = 0;
        System.out.println("1. Add Book ");
        System.out.println("2. Display Book");
        System.out.println("3. Search Book");
        System.out.println("4. Exit.");
        Book b[] = new Book[3];
        while (choice != 4) {
            System.out.print("Enter choice : ");
            choice = s1.nextInt();
            if (choice == 1) {
                b[counter - 1] = new Book();
                // System.out.println(counter);
                b[counter - 1].AddBook();
                counter++;
            } else if (choice == 2) {
                for (int i = 0; i < b.length; i++) {
                    b[i].DisplayBook();
                }
            } else if (choice == 3) {
                System.out.println("Enter Book ID :");
                int id = s1.nextInt(); // 104

                int position = -1;
                for (int i = 0; i < b.length; i++) {
                    if (id == b[i].id) {
                        position = i;
                    }
                }

                if (position == -1) {
                    System.out.println("Book not exist!");
                } else {
                    System.out.println(b[position]);
                }

            } else if (choice == 4) {
                System.out.println("Code Exits");
            }

        }

    }

}

class Book {
    int id;
    String name;
    int price;
    Scanner scan = new Scanner(System.in);

    public void AddBook() {
        System.out.println("Enter Book ID");
        id = scan.nextInt();

        System.out.println("Enter Book name");
        name = scan.next();

        System.out.println("Enter Book price");
        price = scan.nextInt();
    }

    public void DisplayBook() {
        System.out.println("ID :" + id + " Name :" + name + " Price :" + price);
    }

    public String toString() {
        return "ID :" + id + " Name :" + name + " Price :" + price;
    }
}