public class PagoEfectivo extends Pago {

    private int idPagoEfectivo;
    private double montoRecibido;
    private String recibidoPor;
    private double cambio;

    public PagoEfectivo() {
    }

    public PagoEfectivo(int idPagoEfectivo,
                        double montoRecibido,
                        String recibidoPor,
                        double cambio) {

        this.idPagoEfectivo = idPagoEfectivo;
        this.montoRecibido = montoRecibido;
        this.recibidoPor = recibidoPor;
        this.cambio = cambio;
    }

    public int getIdPagoEfectivo() {
        return idPagoEfectivo;
    }

    public void setIdPagoEfectivo(int idPagoEfectivo) {
        this.idPagoEfectivo = idPagoEfectivo;
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    public String getRecibidoPor() {
        return recibidoPor;
    }

    public void setRecibidoPor(String recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return "PagoEfectivo{" +
                "idPagoEfectivo=" + idPagoEfectivo +
                ", montoRecibido=" + montoRecibido +
                ", recibidoPor='" + recibidoPor + "'" +
                ", cambio=" + cambio +
                '}';
    }
}