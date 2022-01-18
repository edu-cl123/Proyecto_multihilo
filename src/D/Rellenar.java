package D;


public class Rellenar extends Thread{
    
    private Gasolinera gasoil;
    private int dinero;

    public Rellenar(Gasolinera gasoil, int dinero) {
        this.gasoil = gasoil;
        this.dinero = dinero;
    }

    public void run() {
        for (int i = 0; i <= dinero; i++) {
            gasoil.rellenar(i);

        }
    }
    
}
