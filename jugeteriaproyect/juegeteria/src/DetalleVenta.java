import java.util.Date;

public class DetalleVenta {
    private int idDetalleVenta;
    private Producto producto;
    private int cantidadVendida;
    private double precioUnitario;

    public DetalleVenta(int idDetalleVenta, Producto producto, int cantidadVendida, double precioUnitario) {
        this.idDetalleVenta = idDetalleVenta;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double calcularSubtotal() {
        return cantidadVendida * precioUnitario;
    }

    @Override
    public String toString() {
        return "ID de Detalle de Ventas: " + idDetalleVenta +
                "\nProducto: " + producto.getNombreProducto() +
                "\nCantidad Vendida: " + cantidadVendida +
                "\nPrecio Unitario: " + precioUnitario +
                "\nSubtotal: " + calcularSubtotal();
    }
}
