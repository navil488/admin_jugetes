public class Proveedor {
    private int idProveedor;
    private String empresa;
    private int telefono;
    private String correo;
    private String direccion;

    public Proveedor(int idProveedor, String empresa, int telefono, String correo, String direccion) {
        this.idProveedor = idProveedor;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "ID Proveedor: " + idProveedor + "\nEmpresa: " + empresa +
                "\nTeléfono: " + telefono + "\nCorreo: " + correo +
                "\nDirección: " + direccion;
    }
}
