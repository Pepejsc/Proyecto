package policine;

/**
 *
 * @author Usuario
 */
public class Snacks {
    
    int cantidad;
    private String nombre;
    double precio;
    double precioTotal;

    public Snacks(int cantidad, String nombre, double precio, double precioTotal) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.precioTotal = precioTotal;
    }
    @Override
    public String toString() {

        return  "\n"+"        "+cantidad+
                 "\t"+nombre+
                 "\t$"+precio+
                 "      $"+precioTotal+"\n";
    }
}
