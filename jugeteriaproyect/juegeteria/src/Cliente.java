public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private int numeroTelefono;
    private String direccion;
    private String correoElectronico;

    public Cliente(int idCliente, String nombreCliente, int numeroTelefono, String direccion, String correoElectronico) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public String toString() {
        return "ID Cliente: " + idCliente + "\nNombre del Cliente: " + nombreCliente +
                "\nNúmero de Teléfono: " + numeroTelefono + "\nDirección: " + direccion +
                "\nCorreo Electrónico: " + correoElectronico;
    }
}
