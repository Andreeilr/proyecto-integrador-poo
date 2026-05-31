public class CityTour extends ServicioTuristico {

    private int idCityTour;
    private String guiaTuristico;
    private String idioma;
    private String lugaresVisita;

    public CityTour() {
    }

    public CityTour(int idCityTour,
                    String guiaTuristico,
                    String idioma,
                    String lugaresVisita) {

        this.idCityTour = idCityTour;
        this.guiaTuristico = guiaTuristico;
        this.idioma = idioma;
        this.lugaresVisita = lugaresVisita;
    }

    public int getIdCityTour() {
        return idCityTour;
    }

    public void setIdCityTour(int idCityTour) {
        this.idCityTour = idCityTour;
    }

    public String getGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(String guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLugaresVisita() {
        return lugaresVisita;
    }

    public void setLugaresVisita(String lugaresVisita) {
        this.lugaresVisita = lugaresVisita;
    }

    @Override
    public String toString() {
        return "CityTour{" +
                "idCityTour=" + idCityTour +
                ", guiaTuristico='" + guiaTuristico + '\'' +
                ", idioma='" + idioma + '\'' +
                ", lugaresVisita='" + lugaresVisita + '\'' +
                '}';
    }
}