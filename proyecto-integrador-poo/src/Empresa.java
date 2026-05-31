public class Empresa {

    private int idEmpresa;
    private String nombre;
    private String sector;
    private String ciudad;
    private int numeroEmpleados;
    private boolean tieneCanalesDigitales;
    private String fechaCreacion;

    private EvaluacionMadurezDigital evaluacionActual;

    // Constructor vacío
    public Empresa() {
    }

    // Constructor con parámetros
    public Empresa(int idEmpresa,
                   String nombre,
                   String sector,
                   String ciudad,
                   int numeroEmpleados,
                   boolean tieneCanalesDigitales,
                   String fechaCreacion) {

        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.sector = sector;
        this.ciudad = ciudad;
        this.numeroEmpleados = numeroEmpleados;
        this.tieneCanalesDigitales = tieneCanalesDigitales;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y Setters

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public boolean isTieneCanalesDigitales() {
        return tieneCanalesDigitales;
    }

    public void setTieneCanalesDigitales(boolean tieneCanalesDigitales) {
        this.tieneCanalesDigitales = tieneCanalesDigitales;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Métodos UML

    public void registrarEvaluacion(EvaluacionMadurezDigital e) {
        this.evaluacionActual = e;
    }

    public String obtenerNivelMadurezActual() {

        if (evaluacionActual == null) {
            return "Sin evaluación";
        }

        return evaluacionActual.obtenerNivelMadurez();
    }
}