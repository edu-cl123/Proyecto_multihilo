package GUI;

import A_B.Lista;
import A_B.NumeroImpar;
import A_B.NumeroPar;
import C.AnadirProducto;
import C.EliminarProducto;
import C.Lista_Compra;
import C.Producto;
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
        boolean correcto = false;

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("1- Cola sacando numeros pares y impares");
            System.out.println("2- Sincronizacion de una lista de la compra");
            System.out.println("3- Gasolinera (Producto-Consumidor)");
            System.out.println("----------------");
            System.out.println("Introduce una opcion");
            do {
                try {
                    opcion = teclado.nextInt();
                    correcto=true;
                } catch (Exception e) {
                    System.out.println("Introduce un numero");
                    teclado.nextLine();
                }
            } while (!correcto);

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
                    System.out.println("Pulsa ENTER para continuar");
                    teclado.nextLine();
                    Lista_Compra li = new Lista_Compra();
                    
                    System.out.println("Introduce el nombre para añadir un producto");
                    String nombreProdu = teclado.nextLine();
                    Producto prod = new Producto(nombreProdu);
                    AnadirProducto a1 = new AnadirProducto(li, prod);

                    System.out.println("Introduce el nombre para añadir un producto");
                    String nombreProdu2 = teclado.nextLine();

                    Producto prod2 = new Producto(nombreProdu2);
                    AnadirProducto a2 = new AnadirProducto(li, prod2);

                    System.out.println("Introduce el nombre para eliminar un producto");
                    String nombreProdu3 = teclado.nextLine();
                    EliminarProducto e1 = new EliminarProducto(li, nombreProdu3);
                    
                    System.out.println("Introduce el nombre para eliminar un producto");
                    String nombreProdu4 = teclado.nextLine();                
                    EliminarProducto e2 = new EliminarProducto(li, nombreProdu4);

                    a1.start();
                    a2.start();
                    e1.start();
                    e2.start();
                    System.out.println("Pulsa 1 para ver la lista");
                    int lista=teclado.nextInt();
                    switch(lista){
                        case 1 :
                            System.out.println(li);
                    }
                    break;
                case 3:
                    Gasolinera G = new Gasolinera();
                    System.out.println("Introduce la cantidad para rellenar gasoil");
                    int cantidad = teclado.nextInt();
                    Pagar p = new Pagar(G, cantidad);
                    Rellenar r = new Rellenar(G, cantidad);
                    p.start();
                    r.start();
                    break;
                case 0:
                    break;
            }

        } while (opcion != 0);

    }

}
