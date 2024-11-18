
import java.util.ArrayList;

public class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Precio: $" + precio);
        if (esBebida) {
            
        } else {
            System.out.println("Ingredientes:");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente);
            }
        }
        System.out.println("===============================");
    }
}
