
public class Nota {
    String catedra;
    double notaExamen;

    
    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    
    public String toString() {
        return "Cátedra: " + catedra + ", Nota Examen: " + notaExamen;
    }
}
