package C;

//Donde va a eliminar un producto
public class EliminarProducto extends Thread{
    Lista_Compra lista;
    String p;

    public EliminarProducto(Lista_Compra lista, String p) {
        this.lista = lista;
        this.p = p;
    }

    @Override
    public void run() {
        lista.EliminarProducto(p);
    }
    
    
}
