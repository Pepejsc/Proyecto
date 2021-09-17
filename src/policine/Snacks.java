/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
 
 
//                   String impresion= "\n         Policanguil"
//                            + "     $3,50" + "    $" + calcularTotal(Integer.parseInt(txtCantidad.getText()), 3.50);
//                    txaPrecio.append(impresion);
    
    @Override
    public String toString() {

        return  "  ======== 🦉 POLICINE 🦉 ========\n"+
                "Unidades     Descripcion    PvP    Total"+
                "\n"+"        "+cantidad+
                 "\t"+nombre+
                 "\t$"+precio+
                 "      $"+precioTotal+"\n";
    }


}
