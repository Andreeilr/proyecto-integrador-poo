public class Minivan extends Vehiculo {

    private int idMinivan;
    private String placa;
    private int capacidad;

    public Minivan() {
    }

    public Minivan(int idMinivan,
                   String placa,
                   int capacidad) {

        this.idMinivan = idMinivan;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public int getIdMinivan() {
        return idMinivan;
    }

    public void setIdMinivan(int idMinivan) {
        this.idMinivan = idMinivan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "idMinivan=" + idMinivan +
                ", placa='" + placa + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}