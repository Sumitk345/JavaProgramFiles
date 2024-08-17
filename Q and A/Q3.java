class Fake {
    static int serialNumber = 1080;
    static boolean series = true;

    Fake(int serialNumber, boolean series) {
        this.serialNumber = serialNumber;
        this.series = series;
    }
}

public class Q3 {
    public static void main(String[] args) {

        Fake fake[] = new Fake[3]; // line n1
        for (int i = 0; i < fake.length; i++) {
            fake[i] = new Fake(fake[i].serialNumber + (i * 100), !fake[i].series); // line n2
        }

        for (int i = 0; i < fake.length; i++) {
            System.out.println(fake[i].serialNumber + "\t" + fake[i].series);
        }

        int _10 = 1_38_455;
        System.out.println(_10);
    }
}

