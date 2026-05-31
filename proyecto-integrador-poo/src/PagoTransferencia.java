public class PagoTransferencia {

    private int idPagoTransferencia;
    private String bancoOrigen;
    private String numeroCuenta;
    private String codigoTransferencia;
    private String fechaTransferencia;

    public PagoTransferencia() {
    }

    public PagoTransferencia(int idPagoTransferencia,
                             String bancoOrigen,
                             String numeroCuenta,
                             String codigoTransferencia,
                             String fechaTransferencia) {

        this.idPagoTransferencia = idPagoTransferencia;
        this.bancoOrigen = bancoOrigen;
        this.numeroCuenta = numeroCuenta;
        this.codigoTransferencia = codigoTransferencia;
        this.fechaTransferencia = fechaTransferencia;
    }

    public int getIdPagoTransferencia() {
        return idPagoTransferencia;
    }

    public void setIdPagoTransferencia(int idPagoTransferencia) {
        this.idPagoTransferencia = idPagoTransferencia;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public void setBancoOrigen(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigoTransferencia() {
        return codigoTransferencia;
    }

    public void setCodigoTransferencia(String codigoTransferencia) {
        this.codigoTransferencia = codigoTransferencia;
    }

    public String getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(String fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    @Override
    public String toString() {
        return "PagoTransferencia{" +
                "idPagoTransferencia=" + idPagoTransferencia +
                ", bancoOrigen='" + bancoOrigen + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", codigoTransferencia='" + codigoTransferencia + '\'' +
                ", fechaTransferencia='" + fechaTransferencia + '\'' +
                '}';
    }
}