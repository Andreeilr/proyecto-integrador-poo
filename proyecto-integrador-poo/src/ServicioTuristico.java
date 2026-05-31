public class ServicioTuristico {

    private int idServicioTuristico;
    private String descripcion;
    private double precio;
    private int duracion;
    private String horarioSalida;
    private String disponibilidad;

    public ServicioTuristico() {
    }

    public ServicioTuristico(int idServicioTuristico,
                             String descripcion,
                             double precio,
                             int duracion,
                             String horarioSalida,
                             String disponibilidad) {

        this.idServicioTuristico = idServicioTuristico;
        this.descripcion = descripcion;
        this.precio = precio;
        this.duracion = duracion;
        this.horarioSalida = horarioSalida;
        this.disponibilidad = disponibilidad;
    }

    public int getIdServicioTuristico() {
        return idServicioTuristico;
    }

    public void setIdServicioTuristico(int idServicioTuristico) {
        this.idServicioTuristico = idServicioTuristico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "ServicioTuristico{" +
                "idServicioTuristico=" + idServicioTuristico +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", duracion=" + duracion +
                ", horarioSalida='" + horarioSalida + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                '}';
    }
}