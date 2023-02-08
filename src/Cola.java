/*Implementar una app compuesta por 3 clases:
- Una cola, que será el objeto compartido
- Un productor y un consumidor.
El productor generará 10 numeros y los insertara en el objeto Cola, tras hacer un pequeño sleep
El consumidor los leerá y los mostrará por pantalla
 */

public class Cola {
    public Cola(){}
    int  contenido;
    private boolean lleno=false;

    public synchronized int  vaciar(){
        while (lleno == false)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lleno = false;
        notifyAll();

        return contenido;
    }


    public synchronized int  llenar(int valors){
        while (lleno == true)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        contenido=valors;
        lleno=true;
        notifyAll();

        return contenido;
    }

}
