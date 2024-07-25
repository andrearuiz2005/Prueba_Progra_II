/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_andrea;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ar466
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<RentItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1-Agregar Item");
            System.out.println("2-Calcular Pago Renta");
            System.out.println("3-Ejecutar Sub Menú");
            System.out.println("4-Imprimir Todo");
            System.out.println("5-Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            boolean opcion1 = false;

            while (opcion1) {
                
                    System.out.print("Ingrese tipo de item (MOVIE/PS3): ");
                    String tipo = scanner.nextLine().toUpperCase();
                    if (tipo.equals("MOVIE")) {
                        System.out.print("Ingrese código del item: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese nombre del item: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese precio de renta: ");
                        double precio = scanner.nextDouble();
                        items.add(new Movie(codigo, nombre, precio));
                    } else if (tipo.equals("PS3")) {
                        System.out.print("Ingrese código del item: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese nombre del item: ");
                        String nombre = scanner.nextLine();
                    } else {
                        System.out.println("TIPO INCORRECTO");
                    }
                    break;
            }
            
            do {
                    System.out.print("Ingrese código del item: ");
                    String codigo = scanner.nextLine();
                    RentItem item = null;
                    for (RentItem ri : items) {
                        if (ri.getCodigoItem().equals(codigo)) {
                            item = ri;
                            break;
                        }
                    }
                    if (item != null) {
                        System.out.println(item.toString());
                        System.out.print("Ingrese días a rentar: ");
                        int dias = scanner.nextInt();
                        System.out.println("Monto a pagar: " + item.pagoRenta(dias));
                    } else {
                        System.out.println("Item No Existe");
                    }
                    break;
                
            }
            }
    }