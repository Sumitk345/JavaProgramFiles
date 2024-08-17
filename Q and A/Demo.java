class Fake {
    static int serialNumber = 1080;
    static boolean series = true;

}

public class Demo {
    public static void main(String[] args) {

        Fake fake[] = new Fake[3]; // line n1
        fake[0] = new Fake();

        for (int i = 0; i < fake.length; i++) {
            System.out.println(fake[i].serialNumber + "\t" + !fake[i].series);
        }
    }
}
