package A_B;

public class Lista {

    int numero;

    public Lista(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * Función para sacar los numero impares hasta un numero especifico
     * @param nombre Nombre del proceso que la va a utilizar
     */
    public void sacarImpares(String nombre) {

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 1) {
                System.out.println(nombre + " saca el numero impar " + i);
            }
        }
        System.out.println("Fin Bucle " + nombre);
    }

    /**
     * Función para sacar los numero Pares hasta un numero especifico
     * @param nombre Nombre del proceso que la va a utilizar
     */
    public void sacarPares(String nombre) {
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(nombre + " saca el numero par " + i);
            }
        }
        System.out.println("Fin Bucle " + nombre);
    }

}
