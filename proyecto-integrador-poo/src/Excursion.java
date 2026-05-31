public class Excursion extends ServicioTuristico {

    private int idExcursion;
    private String actividadPrincipal;
    private String nivelRiesgo;

    public Excursion() {
    }

    public Excursion(int idExcursion,
                      String actividadPrincipal,
                      String nivelRiesgo) {

        this.idExcursion = idExcursion;
        this.actividadPrincipal = actividadPrincipal;
        this.nivelRiesgo = nivelRiesgo;
    }

    public int getIdExcursion() {
        return idExcursion;
    }

    public void setIdExcursion(int idExcursion) {
        this.idExcursion = idExcursion;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }

    public void setActividadPrincipal(String actividadPrincipal) {
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "idExcursion=" + idExcursion +
                ", actividadPrincipal='" + actividadPrincipal + '\'' +
                ", nivelRiesgo='" + nivelRiesgo + '\'' +
                '}';
    }
}