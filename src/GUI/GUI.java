package GUI;

import A_B.Lista;
import A_B.NumeroImpar;
import A_B.NumeroPar;
import D.Gasolinera;
import D.Pagar;
import D.Rellenar;
import java.util.Scanner;

public class GUI {

    public static void main(String[] args) {
        menu();
        System.out.println("hola");
    }

    public static void menu() {
        int opcion = 0;

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("1- Cola sacando numeros pares y impares");
            System.out.println("2- Gasolinera (Producto-Consumidor)");
            System.out.println("----------------");
            System.out.println("Introduce una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce hasta donde se va a hacer el recuento");
                    int numero = teclado.nextInt();
                    Lista l = new Lista(numero);
                    NumeroImpar NI = new NumeroImpar(l, "Proceso impar");
                    NumeroPar NP = new NumeroPar(l, "Proceso par");
                    NI.start();
                    NP.start();
                    try {
                        NI.join();
                        NP.join();
                    } catch (Exception e) {
                    }
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    Gasolinera G=new Gasolinera();
                    System.out.println("Introduce la cantidad para rellenar gasoil");
                    int cantidad=teclado.nextInt();
                    Pagar p=new Pagar(G,cantidad);
                    Rellenar r=new Rellenar(G,cantidad);
                    p.start();
                    r.start();
                    break;
                case 0:
                    break;
            }

        } while (opcion != 0);

    }

}
