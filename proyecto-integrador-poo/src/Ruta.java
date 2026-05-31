public class Ruta {

    private int idRuta;
    private double distancia;
    private int tiempoEstimado;
    private String ciudadInicio;
    private String ciudadDestino;

    public Ruta() {
    }

    public Ruta(int idRuta,
                 double distancia,
                 int tiempoEstimado,
                 String ciudadInicio,
                 String ciudadDestino) {

        this.idRuta = idRuta;
        this.distancia = distancia;
        this.tiempoEstimado = tiempoEstimado;
        this.ciudadInicio = ciudadInicio;
        this.ciudadDestino = ciudadDestino;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getCiudadInicio() {
        return ciudadInicio;
    }

    public void setCiudadInicio(String ciudadInicio) {
        this.ciudadInicio = ciudadInicio;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "idRuta=" + idRuta +
                ", distancia=" + distancia +
                ", tiempoEstimado=" + tiempoEstimado +
                ", ciudadInicio='" + ciudadInicio + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                '}';
    }
}