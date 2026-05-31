public class TourInternacional extends ServicioTuristico {

    private int idTourInternacional;
    private String paisDestino;
    private boolean visaNecesaria;
    private String aerolinea;
    private boolean hotelIncluido;
    private int cantidadNoches;

    public TourInternacional() {
    }

    public TourInternacional(int idTourInternacional,
                             String paisDestino,
                             boolean visaNecesaria,
                             String aerolinea,
                             boolean hotelIncluido,
                             int cantidadNoches) {

        this.idTourInternacional = idTourInternacional;
        this.paisDestino = paisDestino;
        this.visaNecesaria = visaNecesaria;
        this.aerolinea = aerolinea;
        this.hotelIncluido = hotelIncluido;
        this.cantidadNoches = cantidadNoches;
    }

    public int getIdTourInternacional() {
        return idTourInternacional;
    }

    public void setIdTourInternacional(int idTourInternacional) {
        this.idTourInternacional = idTourInternacional;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public boolean isVisaNecesaria() {
        return visaNecesaria;
    }

    public void setVisaNecesaria(boolean visaNecesaria) {
        this.visaNecesaria = visaNecesaria;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public boolean isHotelIncluido() {
        return hotelIncluido;
    }

    public void setHotelIncluido(boolean hotelIncluido) {
        this.hotelIncluido = hotelIncluido;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    @Override
    public String toString() {
        return "TourInternacional{" +
                "idTourInternacional=" + idTourInternacional +
                ", paisDestino='" + paisDestino + '\'' +
                ", visaNecesaria=" + visaNecesaria +
                ", aerolinea='" + aerolinea + '\'' +
                ", hotelIncluido=" + hotelIncluido +
                ", cantidadNoches=" + cantidadNoches +
                '}';
    }
}