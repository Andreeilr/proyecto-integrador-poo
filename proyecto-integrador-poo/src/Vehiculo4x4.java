public class Vehiculo4x4 extends Vehiculo {

    private int idVehiculo4x4;
    private String tipoTerreno;
    private boolean suspensionEspecial;

    public Vehiculo4x4() {
    }

    public Vehiculo4x4(int idVehiculo4x4,
                       String tipoTerreno,
                       boolean suspensionEspecial) {

        this.idVehiculo4x4 = idVehiculo4x4;
        this.tipoTerreno = tipoTerreno;
        this.suspensionEspecial = suspensionEspecial;
    }

    public int getIdVehiculo4x4() {
        return idVehiculo4x4;
    }

    public void setIdVehiculo4x4(int idVehiculo4x4) {
        this.idVehiculo4x4 = idVehiculo4x4;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public boolean isSuspensionEspecial() {
        return suspensionEspecial;
    }

    public void setSuspensionEspecial(boolean suspensionEspecial) {
        this.suspensionEspecial = suspensionEspecial;
    }

    @Override
    public String toString() {
        return "Vehiculo4x4{" +
                "idVehiculo4x4=" + idVehiculo4x4 +
                ", tipoTerreno='" + tipoTerreno + '\'' +
                ", suspensionEspecial=" + suspensionEspecial +
                '}';
    }
}