public class GuiaTuristico {

    private int idGuiaTuristico;
    private String nombres;
    private String apellidos;
    private String idioma;
    private String experiencia;

    public GuiaTuristico() {
    }

    public GuiaTuristico(int idGuiaTuristico,
                         String nombres,
                         String apellidos,
                         String idioma,
                         String experiencia) {

        this.idGuiaTuristico = idGuiaTuristico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idioma = idioma;
        this.experiencia = experiencia;
    }

    public int getIdGuiaTuristico() {
        return idGuiaTuristico;
    }

    public void setIdGuiaTuristico(int idGuiaTuristico) {
        this.idGuiaTuristico = idGuiaTuristico;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "idGuiaTuristico=" + idGuiaTuristico +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", idioma='" + idioma + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
}