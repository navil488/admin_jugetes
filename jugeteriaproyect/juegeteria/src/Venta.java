import java.util.Date;

public class Venta {
    private Cliente cliente;
    private int cantidad;
    private Date fecha;
    private int idVenta;

    public Venta(int idVenta, Cliente cliente, int cantidad, Date fecha) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Venta() {

    }


    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta:\n" +
                "ID Venta: " + idVenta +
                "\nCliente: " + cliente.getNombreCliente() +
                "\nCantidad: " + cantidad +
                "\nFecha: " + fecha;
    }
}
