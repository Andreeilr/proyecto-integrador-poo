public class IndicadorDigital {

    private int idIndicador;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double puntaje;
    private String areaRelacionada;

    // Constructor vacío
    public IndicadorDigital() {
    }

    // Constructor con parámetros
    public IndicadorDigital(int idIndicador,
                            String nombre,
                            String descripcion,
                            String categoria,
                            double puntaje,
                            String areaRelacionada) {

        this.idIndicador = idIndicador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.puntaje = puntaje;
        this.areaRelacionada = areaRelacionada;
    }

    // Getters y Setters

    public int getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(int idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public String getAreaRelacionada() {
        return areaRelacionada;
    }

    public void setAreaRelacionada(String areaRelacionada) {
        this.areaRelacionada = areaRelacionada;
    }

    // Métodos UML

    public boolean estaCumplido() {
        return puntaje >= 70;
    }

    public String obtenerEstado() {

        if (puntaje >= 70) {
            return "Cumplido";
        } else {
            return "Pendiente";
        }
    }
}