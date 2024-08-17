/**
 * Q4
 */

class Labor {
    String name;
    int age;
    String town;
    String contactno;

    public Labor() {
        name = "#Unknown_name";
        town = "#Unknown_town";
        age = 0;
        contactno = "#unknown_contactno";
    }

    public Labor(String name, int age, String town, String contactno) {

        this.town = town;
        this.age = age;
        this.contactno = contactno;
        this.name = name;
    }

    public String toString() {
        return String.format("\t" + "%s" + "\t\t" + "%d" + "\t" + "%s" + "\t" + "%s", name, age, town, contactno);
    }
}

class Lorry {
    String name;
    int Veh_number;
    int weigthInTons;

    Lorry() {
        name = "#Unknown_name";
        Veh_number = 0;
        weigthInTons = 0;
    }

    public Lorry(String name, int Veh_number, int weigthInTons) {

        this.Veh_number = Veh_number;
        this.weigthInTons = weigthInTons;
        this.name = name;
    }

    public String toString() {
        return String.format("\t" + "%s" + "\t\t" + "%d" + "\t" + "%s", name, Veh_number, weigthInTons);
    }
}

class Contract {
    protected int id;
    protected String name;
    protected Labor lab;
    protected Lorry lor;

    Contract() {
        this.id = 0;
        this.name = "#Unknown";
        this.lab.name = "#unknown_labor";
        this.lor.Veh_number = 0;
        this.lor.name = "#Unknown_lorry";
    }

    public Contract(int id, String name, Labor l, Lorry lor) {
        this.id = id;
        this.name = name;
        this.lab = l;
        this.lor = lor;
    }

    public String toString() {
        return String.format("\t" + "%d" + "\t\t" + "%s" + "\t\t" + "%s" + "\t\t" + "%s" + "\t\t" + "%d", id, name,
                lab.name,
                lor.name, lor.Veh_number);
    }
}

public class Q4 {

    public static void main(String[] args) {
        Labor l[] = new Labor[5];
        l[0] = new Labor("John", 37, "California", "7878987565");
        l[1] = new Labor("Smith", 41, "moscow  ", "9099828394");
        l[2] = new Labor("Peter", 29, "bijing   ", "9987364664");
        l[3] = new Labor("Michael", 28, "Francisco", "9388475773");
        l[4] = new Labor();

        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }

        Lorry loy[] = new Lorry[3];
        loy[0] = new Lorry("Panel truck", 83774, 20);
        loy[1] = new Lorry("Flatbed truck,", 9929, 65);
        loy[2] = new Lorry("Dump truck", 10084, 105);

        System.out.println("\n");
        for (int i = 0; i < loy.length; i++) {
            System.out.println(loy[i]);
        }

        Contract con[] = new Contract[6];
        con[0] = new Contract(91, "James", l[1], loy[0]);
        con[1] = new Contract(92, "Robert", l[0], loy[0]);
        con[2] = new Contract(93, "Richard", l[1], loy[2]);
        con[3] = new Contract(94, "Paul", l[3], loy[1]);
        // con[4] = new Contract();
        // con[5] = new Contract();

        System.out.println("\n");
        for (int i = 0; i < con.length; i++) {
            System.out.println(con[i]);
        }

    }
}