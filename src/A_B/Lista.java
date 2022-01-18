package A_B;

public class Lista {

    int numero;

    public Lista(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void sacarImpares(String nombre) {

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 1) {
                System.out.println(nombre + " saca el numero impar " + i);
            }
        }
        System.out.println("Fin Bucle " + nombre);
    }

    public void sacarPares(String nombre) {
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(nombre + " saca el numero par " + i);
            }
        }
        System.out.println("Fin Bucle " + nombre);
    }

}
