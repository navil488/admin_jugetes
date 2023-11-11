import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Listas para almacenar clientes y proveedores
        List<Cliente> clientes = new ArrayList<>();
        List<Proveedor> proveedores = new ArrayList<>();

        // Ejemplo de cliente preexistente
        Cliente cliente = new Cliente(1, "Cliente1", 123456789, "DirecciónCliente1", "correo@cliente.com");
        clientes.add(cliente);

        // Ejemplo de producto, necesario para crear proveedores
        Producto producto = new Producto(1, "Producto1", "Descripción1", "Categoría1", 10.0, 100, 1);

        // Ejemplo de inventario y agregar producto
        Inventario inventario = new Inventario();
        inventario.agregarProducto(producto);

        // Menú
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Generar Pedido");
            System.out.println("4. Mostrar Facturación");
            System.out.println("5. Registrar Proveedor");
            System.out.println("6. Mostrar Proveedores");
            System.out.println("7. Registrar Producto");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    inventario.mostrarInventario();
                    break;
                case 2:
                    System.out.println("Realizar venta...");
                    // no e terminado poner mas
                    break;
                case 3:
                    System.out.println("Generar pedido...");
                    //  no e terminado poner mas
                    break;
                case 4:
                    System.out.println("Mostrar facturación...");
                    // Aquí deberías mostrar la facturación
                    break;
                case 5:
                    System.out.println("Registrar proveedor...");
                    registrarProveedor(proveedores, producto);
                    break;
                case 6:
                    System.out.println("Mostrar proveedores...");
                    mostrarProveedores(proveedores);
                    break;
                case 7:
                    System.out.println("Registrar producto...");
                    registrarProducto(inventario);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void registrarProveedor(List<Proveedor> proveedores, Producto producto) {
        // Lógica para registrar proveedores
    }

    private static void mostrarProveedores(List<Proveedor> proveedores) {
        // Lógica para mostrar proveedores
    }

    private static void registrarProducto(Inventario inventario) {
        // Lógica para registrar productos
        // Puedes solicitar información al usuario y luego agregar el producto al inventario
    }
}
