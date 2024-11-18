// Alumno.java
import java.util.ArrayList;

public class Alumno {
    String nombreCompleto;
    long legajo;
    ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<Nota>();
    }

    
    public void agregarNota(Nota nota) {
        this.notas.add(nota);
    }

    
    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Nota nota : notas) {
            sumaNotas += nota.notaExamen;
        }
        return (notas.size() > 0) ? sumaNotas / notas.size() : 0;
    }

    
    public void mostrarInfo() {
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Legajo: " + legajo);
        System.out.println("Notas:");
        for (Nota nota : notas) {
            System.out.println(nota);
        }
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("===============================");
    }
}
