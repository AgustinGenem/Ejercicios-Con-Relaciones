import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    // Constructor
    public Factura() {
        detallesFactura = new ArrayList<>();
    }

    // Métodos get/set
    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    // Método para calcular el monto total de la factura
    public void calcularMontoTotal() {
        double total = 0;
        for (DetalleFactura detalle : detallesFactura) {
            total += detalle.getSubtotal();
        }
        this.totalCalculadoFactura = total;
    }

    // Método toString para mostrar la factura
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: ").append(fechaFactura).append("\n");
        sb.append("Factura N°: ").append(numeroFactura).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Detalles de la Factura:\n");

        for (DetalleFactura detalle : detallesFactura) {
            sb.append(detalle.toString()).append("\n");
        }

        sb.append("                                                      Total Factura: $").append(totalCalculadoFactura).append("\n");
        return sb.toString();
    }
}
