
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<Plato>();

        
        System.out.print("¿Cuántos platos deseas cargar? "); // Cargar platos
        int cantidadPlatos = in.nextInt();
        in.nextLine(); 

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("");
            System.out.println("Plato " + (i + 1) + ":");

            System.out.print("Nombre del plato: ");
            String nombrePlato = in.nextLine();
            System.out.print("Precio: ");
            double precio = in.nextDouble();
            in.nextLine();

            System.out.print("¿Es bebida? (true/false): ");
            boolean esBebida = in.nextBoolean();
            in.nextLine(); 

            
            Plato plato = new Plato(nombrePlato, precio, esBebida);

            
            if (!esBebida) { //verifico que no sea bebida para pedir los ingredientes
                System.out.print("¿Cuántos ingredientes tiene el plato? ");
                int cantidadIngredientes = in.nextInt();
                in.nextLine(); 

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("");
                    System.out.println("Ingrediente " + (j + 1) + ":");
                    System.out.print("Nombre: ");
                    String nombreIngrediente = in.nextLine();
                    System.out.print("Cantidad: ");
                    double cantidad = in.nextDouble();
                    in.nextLine(); 
                    System.out.print("Unidad de Medida: ");
                    String unidadMedida = in.nextLine();

                     
                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidadMedida); //Agregar el ingrediente al plato
                    plato.agregarIngrediente(ingrediente);
                }
            }
            
            platosMenu.add(plato);
        }
        System.out.println("");
        System.out.println("--- MENÚ DEL RESTAURANTE ---"); //Muestro el menú
        for (Plato plato : platosMenu) {
            plato.mostrarInfo();
        }
    }
}
