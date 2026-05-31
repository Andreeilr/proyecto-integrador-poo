public class PagoTarjeta extends Pago {

    private int idPagoTarjeta;
    private String numeroTarjeta;
    private String banco;
    private String tipoTarjeta;
    private String titular;
    private String fechaVencimiento;

    public PagoTarjeta() {
    }

    public PagoTarjeta(int idPagoTarjeta,
                       String numeroTarjeta,
                       String banco,
                       String tipoTarjeta,
                       String titular,
                       String fechaVencimiento) {

        this.idPagoTarjeta = idPagoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.tipoTarjeta = tipoTarjeta;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdPagoTarjeta() {
        return idPagoTarjeta;
    }

    public void setIdPagoTarjeta(int idPagoTarjeta) {
        this.idPagoTarjeta = idPagoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "PagoTarjeta{" +
                "idPagoTarjeta=" + idPagoTarjeta +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", banco='" + banco + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", titular='" + titular + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }
}