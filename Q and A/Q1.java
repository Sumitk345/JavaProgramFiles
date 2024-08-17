class Order {
    int id;
    String date;
}

class Q1 {
    public static void main(String[] args) {
        Order[] orders = new Order[3];
        orders[0] = new Order();
        orders[1] = new Order();
        orders[2] = new Order();

        for (int i = 0; i < orders.length; i++) {
            orders[i].id = i % 2;
            orders[i].date = (i + (i * 3) % 2) + "-" + 10 + "-202" + (i % 2);
        }
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i].id + "\t" + orders[i].date);
        }
    }
}
