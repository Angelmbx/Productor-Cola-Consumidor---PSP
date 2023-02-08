public class Productor extends Thread{

    private Cola cola;
    private int numeros;

    public Productor(Cola cola, int numeros) {
        this.cola = cola;
        this.numeros = numeros;
    }

    public void run(){

        for (int i=0; i<10; i++){
            cola.llenar(i);
            System.out.println(i + "=>Productor : " + numeros + ", produce: " + i);
        }

        try {
            sleep((int) (Math.random()*100));
        } catch (InterruptedException e)
        {
            System.out.println("Interrupcion del hilo...");
        }


    }


}
