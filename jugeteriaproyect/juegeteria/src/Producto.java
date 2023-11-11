public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private double precioUnit;
    private int stock;
    private int idProveedor;

    public Producto(int idProducto, String nombreProducto, String descripcion, String categoria, double precioUnit, int stock, int idProveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioUnit = precioUnit;
        this.stock = stock;
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public int getStock() {
        return stock;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    @Override
    public String toString() {
        return "ID Producto: " + idProducto + "\nNombre Producto: " + nombreProducto +
                "\nDescripción: " + descripcion + "\nCategoría: " + categoria +
                "\nPrecio Unitario: " + precioUnit + "\nStock: " + stock +
                "\nID del Proveedor: " + idProveedor;
    }
}
