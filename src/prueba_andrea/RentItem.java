/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_andrea;


/**
 *
 * @author ar466
 */
public class RentItem {
    private String codigoItem;
    private String nombreItem;
    private double precioRentaItem;
    private int cantidadCopias;

    public RentItem(String codigoItem, String nombreItem, double precioRentaItem) {
        this.codigoItem = codigoItem;
        this.nombreItem = nombreItem;
        this.precioRentaItem = precioRentaItem;
        this.cantidadCopias = 0;
    }
    
    public String toString() {
        return "Código: " + codigoItem + ", Nombre: " + nombreItem + ", Precio Renta: " + precioRentaItem + ", Cantidad Copias: " + cantidadCopias;
    }

    public double pagoRenta(int dias) {
        return 0;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public double getPrecioRentaItem() {
        return precioRentaItem;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public String submenu() {
        return "1-Imprimir";
    }

    public void ejecutarOpcion(int opcion) {
        if (opcion == 1) {
            System.out.println(this.toString());
        } else {
            System.out.println("Opcion No Valida");
        }
    }
}
