package C;

//Donde va a añadir un producto
public class AnadirProducto extends Thread{
    Lista_Compra lista;
    Producto p;

    public AnadirProducto(Lista_Compra lista, Producto p) {
        this.lista = lista;
        this.p = p;
    }

    @Override
    public void run() {
        lista.añadirProducto(p);
    }
    
    
    
    
}
