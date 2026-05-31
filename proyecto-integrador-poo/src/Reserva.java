public class Reserva {

    private int idReserva;
    private String fechaReserva;
    private String fechaViaje;
    private int cantidadPersonas;
    private String estado;
    private double total;
    private String tipoReserva;
    private String seguroViaje;
    private String observaciones;

    public Reserva() {
    }

    public Reserva(int idReserva, String fechaReserva,
                   String fechaViaje, int cantidadPersonas,
                   String estado, double total,
                   String tipoReserva, String seguroViaje,
                   String observaciones) {

        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.fechaViaje = fechaViaje;
        this.cantidadPersonas = cantidadPersonas;
        this.estado = estado;
        this.total = total;
        this.tipoReserva = tipoReserva;
        this.seguroViaje = seguroViaje;
        this.observaciones = observaciones;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public String getSeguroViaje() {
        return seguroViaje;
    }

    public void setSeguroViaje(String seguroViaje) {
        this.seguroViaje = seguroViaje;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", fechaReserva='" + fechaReserva + '\'' +
                ", fechaViaje='" + fechaViaje + '\'' +
                ", cantidadPersonas=" + cantidadPersonas +
                ", estado='" + estado + '\'' +
                ", total=" + total +
                ", tipoReserva='" + tipoReserva + '\'' +
                ", seguroViaje='" + seguroViaje + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}