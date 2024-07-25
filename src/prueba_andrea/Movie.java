/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_andrea;

import java.util.Scanner;

/**
 *
 * @author ar466
 */
public class Movie extends RentItem {
    private String estado;

    public Movie(String codigoItem, String nombreItem, double precioRentaItem) {
        super(codigoItem, nombreItem, precioRentaItem);
        this.estado = "ESTRENO";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String toString() {
        return super.toString() + ", Estado: " + estado + " – Movie";
    }

    @Override
    public double pagoRenta(int dias) {
        double pago = getPrecioRentaItem();
        if (estado.equals("ESTRENO") && dias > 2) {
            pago += (dias - 2) * 50;
        } else if (!estado.equals("ESTRENO") && dias > 5) {
            pago += (dias - 5) * 30;
        }
        return pago;
    }

    
    public String submenu() {
        return super.submenu() + "\n2-Cambiar Estado";
    }

    
    public void ejecutarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        if (opcion == 1) {
            System.out.println(this.toString());
        } else if (opcion == 2) {
            System.out.print("Ingrese nuevo estado: ");
            String nuevoEstado = scanner.nextLine();
            setEstado(nuevoEstado);
        } else {
            System.out.println("Opcion No Valida");
        }
    }
}

