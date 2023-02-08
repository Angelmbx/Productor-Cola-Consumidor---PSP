public class Main {

    public static void main(String[] args) {

        Cola c1 = new Cola();


        Productor prod = new Productor(c1, 1);
        Consumidor cons = new Consumidor(c1, 1);


        prod.start();
        cons.start();

    }
}
