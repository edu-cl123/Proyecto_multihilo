package D;

public class Pagar extends Thread {

    private Gasolinera gasoil;
    private int dinero;

    public Pagar(Gasolinera gasoil, int dinero) {
        this.gasoil = gasoil;
        this.dinero = dinero;
    }

  
  
    
    @Override
    public void run() {

        for (int i = 0; i <= dinero; i++) {
            gasoil.pagar(dinero);          
        }

    }

}
