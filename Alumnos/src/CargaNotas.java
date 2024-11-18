// CargaNotas.java
import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        System.out.print("¿Cuántos alumnos deseas cargar? ");
        int cantidadAlumnos = in.nextInt();
        in.nextLine(); 

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("");
            System.out.println("Alumno " + (i + 1) + ":");

            System.out.print("Nombre Completo: ");
            String nombre = in.nextLine();
            System.out.print("Legajo: ");
            long legajo = in.nextLong();
            in.nextLine(); 

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.print("¿Cuántas notas desea agregar? ");
            int cantidadNotas = in.nextInt();
            in.nextLine(); 

      
            if (cantidadNotas > 0) {
                for (int j = 0; j < cantidadNotas; j++) {
                    System.out.println("");
                    System.out.println("Nota " + (j + 1) + ":");
                    System.out.print("Cátedra: ");
                    String catedra = in.nextLine();
                    System.out.print("Nota de Examen: ");
                    double notaExamen = in.nextDouble();
                    in.nextLine(); 
                   
                    alumno.agregarNota(new Nota(catedra, notaExamen));
                }
            } else {
                System.out.println("Debe ingresar al menos 1 nota.");
                int j = 0;
                j--; 
            }

            
            alumnos.add(alumno);
        }

        // Mostrar los datos de cada alumno
        System.out.println("");
        System.out.println("--- Información Cargada ---");
        for (Alumno alumno : alumnos) {
            alumno.mostrarInfo();
        }
    }
}
