import java.util.Date;
import java.util.List;

public class Facturacion {
    private String serie;
    private int numero;
    private Date fecha;
    private List<DetalleVenta> detallesVenta;

    public Facturacion(String serie, int numero, Date fecha, List<DetalleVenta> detallesVenta) {
        this.serie = serie;
        this.numero = numero;
        this.fecha = fecha;
        this.detallesVenta = detallesVenta;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleVenta detalleVenta : detallesVenta) {
            total += detalleVenta.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder detalles = new StringBuilder();
        for (DetalleVenta detalleVenta : detallesVenta) {
            detalles.append(detalleVenta.toString()).append("\n");
        }

        return "Facturacion:\n" +
                "Serie: " + serie +
                "\nNumero: " + numero +
                "\nFecha: " + fecha +
                "\nDetalles de Venta:\n" + detalles.toString() +
                "Total: " + calcularTotal();
    }
}
