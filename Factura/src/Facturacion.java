import java.util.Scanner;

public class Facturacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array de artículos (código, nombre, precio) definido dentro del método main
        String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
        };

        Factura factura = new Factura();

        System.out.print("Ingrese la fecha de la factura: ");
        factura.setFechaFactura(scanner.nextLine());

        long numeroFactura;
        while (true) {
            System.out.print("Ingrese el número de factura: ");
            numeroFactura = scanner.nextLong();
            if (numeroFactura > 0) break;
            System.out.println("El número de factura debe ser un número mayor a 0.");
        }
        factura.setNumeroFactura(numeroFactura);

        scanner.nextLine(); 
        String cliente;
        while (true) {
            System.out.print("Ingrese el nombre del cliente: ");
            cliente = scanner.nextLine();
            if (!cliente.isEmpty()) break;
            System.out.println("El nombre del cliente no puede estar vacío.");
        }
        factura.setCliente(cliente);
        boolean continuar = true;
        while (continuar==true) {
            System.out.print("Ingrese el código del artículo a facturar: "); //Cargo los articulos
            String codigoArticulo = scanner.nextLine();
            boolean articuloEncontrado = false;
            String nombreArticulo = "";
            double precioUnitario = 0;

            // Buscar artículo en el array
            for (String[] articulo : articulos) {
                if (articulo[0].equals(codigoArticulo)) {
                    articuloEncontrado = true;
                    nombreArticulo = articulo[1];
                    precioUnitario = Double.parseDouble(articulo[2]);
                    break;
                }
            }

            if (!articuloEncontrado) { //verifico que el código sea correcto, si no e correcto pido nuevamente los datos
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); 

            
            DetalleFactura detalle = new DetalleFactura(codigoArticulo, nombreArticulo, cantidad, precioUnitario);
            factura.getDetallesFactura().add(detalle);

            System.out.println("¿Desea continuar cargando artículos? ");
            System.out.println("Presione (s) para sí.");
            System.out.println("Presione (n) para no.");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")){
            continuar = false;
            }
        }

        factura.calcularMontoTotal();

        // Muestro la factura por pantalla
        System.out.println("");
        System.out.println("===== Factura ====");
        System.out.println(factura);
    }
}
