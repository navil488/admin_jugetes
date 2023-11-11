import java.util.Date;

public class Pedido {
    private Producto producto;
    private int cantidad;
    private Date fecha;
    private Proveedor proveedor;
    private double montoAPagar;
    private String serie;

    public Pedido(Producto producto, int cantidad, Date fecha, Proveedor proveedor, double montoAPagar, String serie) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.montoAPagar = montoAPagar;
        this.serie = serie;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }

    public String getSerie() {
        return serie;
    }

    @Override
    public String toString() {
        return "Pedido:\n" +
                "Producto: " + producto.getNombreProducto() +
                "\nCantidad: " + cantidad +
                "\nFecha: " + fecha +
                "\nProveedor: " + proveedor.getEmpresa() +
                "\nMonto a Pagar: " + montoAPagar +
                "\nSerie: " + serie;
    }
}
