package A_B;

import static java.lang.Thread.sleep;

public class NumeroPar extends Thread {

    private Lista l;
    private String nombre;

    public NumeroPar(Lista l, String nombre) {
        this.l = l;
        this.nombre = nombre;
    }

    /**
     * Metodo Run para ejecutar un hilo para poder enumerar los numeros impares
     */
    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            l.sacarPares(nombre);

    }

}
