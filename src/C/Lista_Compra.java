package C;

import java.util.ArrayList;
import java.util.List;

//una lista de compra con array de productos
public class Lista_Compra {

    //Array para añadir productos, Añado algunos en el contructor
    List<Producto> lista;

    public Lista_Compra() {
        this.lista = new ArrayList<Producto>();
        lista.add(new Producto("Raqueta"));
        lista.add(new Producto("Pantalon"));
        lista.add(new Producto("chaqueton"));
    }

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    //Modificar-----
    @Override
    public String toString() {
        return "Lista_Compra{" + "lista=" + lista + '}';
    }

    /**
     * Recibimos un producto para añadirlo a la lista en caso de que no lo 
     * contenga
     * @param p Producto para comprobar
     */
    synchronized public void añadirProducto(Producto p) {

        if (lista.contains(p)==false) {
            lista.add(p);
            System.out.println("Has añadido a la lista el Producto");
        } else {
            System.out.println("Producto ya añadido");
        }
    }
/**
     * Recibimos un producto para Eliminarlo de la lista en caso de que lo 
     * contenga
     * @param p Producto para comprobar
     */
    synchronized public void EliminarProducto(String p) {
        Producto aux = new Producto(p);

        if (lista.contains(aux)==true) {
            lista.remove(aux);
            System.out.println("Has eliminado el producto de la lista");
        } else {
            System.out.println("producto ya eliminado");
        }
    }

}
