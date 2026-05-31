public class Conductor {

    private int idConductor;
    private String nombres;
    private String apellidos;
    private String licencia;
    private String telefono;
    private String correo;
    private String experiencia;
    private String estado;

    public Conductor() {
    }

    public Conductor(int idConductor, String nombres,
                     String apellidos, String licencia,
                     String telefono, String correo,
                     String experiencia, String estado) {

        this.idConductor = idConductor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.licencia = licencia;
        this.telefono = telefono;
        this.correo = correo;
        this.experiencia = experiencia;
        this.estado = estado;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "idConductor=" + idConductor +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", licencia='" + licencia + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}