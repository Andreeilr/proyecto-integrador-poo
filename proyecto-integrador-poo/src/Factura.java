public class Factura {

    private int idFactura;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;

    public Factura() {
    }

    public Factura(int idFactura, String fecha,
                   double subtotal, double iva,
                   double total) {

        this.idFactura = idFactura;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", fecha='" + fecha + '\'' +
                ", subtotal=" + subtotal +
                ", iva=" + iva +
                ", total=" + total +
                '}';
    }
}