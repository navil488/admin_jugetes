import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inventario {
    private List<Producto> listaProductos;
    private Venta venta;
    private int idVenta;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
        Cliente clienteEjemplo = new Cliente(1, "Ejemplo", 123456789, "DirecciónEjemplo", "correo@ejemplo.com");
        Date fechaEjemplo = new Date();  // Puedes usar la fecha actual o crear una específica
        int cantidadEjemplo = 10;

        this.venta = new Venta(/* Aquí proporcionas los parámetros necesarios para la venta */);
        this.idVenta = venta.getIdVenta();  // Actualizado el idVenta
    }





    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado al inventario.");
    }

    public Producto buscarProductoPorId(int idProducto) {
        for (Producto producto : listaProductos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
        return null;
    }

    public int obtenerStockProducto(int idProducto) {
        Producto producto = buscarProductoPorId(idProducto);
        if (producto != null) {
            return producto.getStock();
        }
        return -1; // Valor indicativo de que el producto no se encontró en el inventario
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

    public void getListaProductos() {
        // Lógica para obtener la lista de productos si es necesario
    }

    // Otro código de la clase...

    // Getter para idVenta
    public int getIdVenta() {
        return idVenta;
    }
}
