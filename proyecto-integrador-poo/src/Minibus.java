public class Minibus extends Vehiculo {

    private int idMinibus;
    private int numeroFilas;
    private boolean baño;

    public Minibus() {
    }

    public Minibus(int idMinibus,
                   int numeroFilas,
                   boolean baño) {

        this.idMinibus = idMinibus;
        this.numeroFilas = numeroFilas;
        this.baño = baño;
    }

    public int getIdMinibus() {
        return idMinibus;
    }

    public void setIdMinibus(int idMinibus) {
        this.idMinibus = idMinibus;
    }

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public boolean isBaño() {
        return baño;
    }

    public void setBaño(boolean baño) {
        this.baño = baño;
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "idMinibus=" + idMinibus +
                ", numeroFilas=" + numeroFilas +
                ", baño=" + baño +
                '}';
    }
}