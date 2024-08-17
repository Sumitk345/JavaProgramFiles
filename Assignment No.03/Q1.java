
class Artist {
    int id;
    String name;

    void createNewArtist(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID :" + id + " Name :" + name;
    }

}

public class Q1 {
    public static void main(String[] args) {
        Artist A[] = new Artist[5];
        A[0] = new Artist();
        A[0].createNewArtist(101, "Ram");

        A[1] = new Artist();
        A[1].createNewArtist(101, "Ram");

        A[2] = new Artist();
        A[2].createNewArtist(101, "Ram");

        A[3] = new Artist();
        A[3].createNewArtist(104, "Sam");

        A[4] = new Artist();
        A[4].createNewArtist(101, "Ram");

        showArrayObject(A);
        System.out.println("\n");
        System.out.println("Duplicates :");
        findDuplicates(A);
    }

    private static void findDuplicates(Artist[] a) {
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].id == a[j].id && a[i].name.equals(a[j].name)) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println(a[i]);
            }
        }
    }

    public static void showArrayObject(Artist[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("ID :" + a[i].id + " Name of author :" + a[i].name);
        }
    }

}