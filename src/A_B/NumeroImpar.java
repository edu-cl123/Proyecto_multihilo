package A_B;

public class NumeroImpar extends Thread {

    private Lista l;
    private String nombre;

    public NumeroImpar(Lista l, String nombre) {
        this.l = l;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        l.sacarImpares(nombre);

    }

}
