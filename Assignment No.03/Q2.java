class Author {
    int id;
    String name;

    void createNewAuther(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        String str = String.format("ID : %d Name : %s", id, name);
        return str;
    }
}

class Publication {
    int id;
    String name;

    void createNewPublication(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        String str = String.format("ID : %d Name : %s", id, name);
        return str;
    }

}

class Book {
    int id;
    String name;
    Author auther_obj;
    Publication publication_obj;

    public void addBook(int id, String name, Author a, Publication pb) {
        this.id = id;
        this.name = name;
        this.auther_obj = a;
        this.publication_obj = pb;
    }

    public String toString() {
        String str = String.format(
                "Book ID : %d  Book Name : %s   Author ID : %d   Author name : %s    Publication : %s", id,
                name,
                auther_obj.id, auther_obj.name, publication_obj.name);
        return str;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Author A[] = new Author[3];
        A[0] = new Author();
        A[0].createNewAuther(101, "Peter");

        A[1] = new Author();
        A[1].createNewAuther(102, "Smith");

        A[2] = new Author();
        A[2].createNewAuther(103, "James");

        // for (int i = 0; i < A.length; i++) {
        // System.out.println(A[i]);
        // }

        Author data[] = { A[0], A[1], A[2] };

        System.out.println("\n");
        Publication pb[] = new Publication[3];
        pb[0] = new Publication();
        pb[0].createNewPublication(101, "Peter.xyz");

        pb[1] = new Publication();
        pb[1].createNewPublication(102, "Smith.xyz");

        pb[2] = new Publication();
        pb[2].createNewPublication(103, "James.xyz");

        // for (int i = 0; i < pb.length; i++) {
        // System.out.println(pb[i]);
        // }

        Publication data2[] = { pb[0], pb[1], pb[2] };

        Book B[] = new Book[4];
        B[0] = new Book();
        B[0].addBook(101, "C++", A[0], pb[0]); // Peter

        B[1] = new Book();
        B[1].addBook(102, "JAVA", A[1], pb[1]); // Smith

        B[2] = new Book();
        B[2].addBook(103, "Python", A[0], pb[0]); // Peter

        B[3] = new Book();
        B[3].addBook(104, "Kotlin", A[2], pb[2]); // James

        Book data3[] = { B[0], B[1], B[2], B[3] };

        for (int i = 0; i < data3.length; i++) {
            System.out.println(B[i]);
        }

        searchBookByAuther(data3, "Peter");
        sortBookByName(data3);

        System.out.println("\n");
    }

    private static void sortBookByName(Book[] data3) {
        for (int i = 65; i < 90; i++) {
            for (int j = 0; j < data3.length; j++) {
                if ((char) i == data3[j].name.charAt(0)) {
                    System.out.print(data3[j].name + "\t");
                }
            }
        }
    }

    private static void searchBookByAuther(Book[] data3, String name) {
        System.out.println("\n");
        System.out.println("Searched by author name :" + name + "\n");
        for (int i = 0; i < data3.length; i++) {
            if (data3[i].auther_obj.name.equals(name)) {
                System.out.print(data3[i]);
                System.out.println("\n");

            }
        }
    }
}
