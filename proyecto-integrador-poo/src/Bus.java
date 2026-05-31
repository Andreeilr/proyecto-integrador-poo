public class Bus extends Vehiculo {

    private int idBus;
    private int pisos;
    private boolean wifi;
    private boolean baño;
    private String tipoBus;

    public Bus() {
    }

    public Bus(int idBus,
               int pisos,
               boolean wifi,
               boolean baño,
               String tipoBus) {

        this.idBus = idBus;
        this.pisos = pisos;
        this.wifi = wifi;
        this.baño = baño;
        this.tipoBus = tipoBus;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isBaño() {
        return baño;
    }

    public void setBaño(boolean baño) {
        this.baño = baño;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "idBus=" + idBus +
                ", pisos=" + pisos +
                ", wifi=" + wifi +
                ", baño=" + baño +
                ", tipoBus='" + tipoBus + '\'' +
                '}';
    }
}