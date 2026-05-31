public class Hotel {

    private int idHotel;
    private String nombre;
    private String direccion;
    private int estrellas;
    private String telefono;

    public Hotel() {
    }

    public Hotel(int idHotel, String nombre, String direccion,
                 int estrellas, String telefono) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.telefono = telefono;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estrellas=" + estrellas +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}