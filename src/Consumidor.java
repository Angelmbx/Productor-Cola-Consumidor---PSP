public class Consumidor extends Thread {

    private Cola cola;
    private int numeros;

    public Consumidor(Cola cola, int numeros) {
        this.cola = cola;
        this.numeros = numeros;
    }

    public void run(){
        int valor = 0;

        for (int i=0; i<10; i++){
            valor = cola.vaciar();
            System.out.println(i + "=>Consumidor: " + numeros + ", consume: " + valor);
        }

        try {
            sleep((int) (Math.random()*100));
        } catch (InterruptedException e)
        {
            System.out.println("Interrupcion del hilo...");
        }
        try {
            sleep((int) (Math.random()*100));
        } catch (InterruptedException e)
        {
            System.out.println("Interrupcion del hilo...");
        }

    }





}
