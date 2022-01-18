package D;

public class Gasolinera {

    private boolean enposicion = true;
    private int contadorA=0;
    private int contadorB=0;

    public synchronized void rellenar(int cantidad) {
        
        while (enposicion == false) {
            try {
                // Esperar a pagar
                wait();
            } catch (InterruptedException e) {
            }
        }
         System.out.println("Rellenando " + (0+contadorB) +" €");
         contadorB++;
        enposicion = false;
        notifyAll();
    }

    public synchronized void pagar(int dinero) {
        while (enposicion == true) {
            try {
                // Esperar a disparar
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Queda por pagar " + (dinero-contadorA)+" €");
        contadorA++;
        enposicion = true;
        notifyAll();
    }

}
