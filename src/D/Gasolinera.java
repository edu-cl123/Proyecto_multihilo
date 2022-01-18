package D;

public class Gasolinera {

    private boolean enposicion = true;
    private int contadorA=0;
    private int contadorB=0;

    /**
     * Funcion para rellenar en caso de que haya pagado. (Producto-consumidor)
     * @param cantidad Cantidad para rellenar
     */
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

    /**
     * Funcion para pagar y asi poder rellenar (Producto-consumidor)
     * @param cantidad Cantidad para pagar
     */
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
