public class PagoOnline extends Pago {

    private int idPagoOnline;
    private String plataforma;
    private String correoCuenta;
    private String codigoOperacion;

    public PagoOnline() {
    }

    public PagoOnline(int idPagoOnline,
                      String plataforma,
                      String correoCuenta,
                      String codigoOperacion) {

        this.idPagoOnline = idPagoOnline;
        this.plataforma = plataforma;
        this.correoCuenta = correoCuenta;
        this.codigoOperacion = codigoOperacion;
    }

    public int getIdPagoOnline() {
        return idPagoOnline;
    }

    public void setIdPagoOnline(int idPagoOnline) {
        this.idPagoOnline = idPagoOnline;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCorreoCuenta() {
        return correoCuenta;
    }

    public void setCorreoCuenta(String correoCuenta) {
        this.correoCuenta = correoCuenta;
    }

    public String getCodigoOperacion() {
        return codigoOperacion;
    }

    public void setCodigoOperacion(String codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }

    @Override
    public String toString() {
        return "PagoOnline{" +
                "idPagoOnline=" + idPagoOnline +
                ", plataforma='" + plataforma + '\'' +
                ", correoCuenta='" + correoCuenta + '\'' +
                ", codigoOperacion='" + codigoOperacion + '\'' +
                '}';
    }
}