public class EvaluacionMadurezDigital {

    private int idEvaluacion;
    private String fechaEvaluacion;
    private String nivelMadurez;
    private double puntajeTotal;
    private String observaciones;


    public EvaluacionMadurezDigital() {
    }


    public EvaluacionMadurezDigital(int idEvaluacion,
                                    String fechaEvaluacion,
                                    String nivelMadurez,
                                    double puntajeTotal,
                                    String observaciones) {
        this.idEvaluacion = idEvaluacion;
        this.fechaEvaluacion = fechaEvaluacion;
        this.nivelMadurez = nivelMadurez;
        this.puntajeTotal = puntajeTotal;
        this.observaciones = observaciones;
    }



    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(String fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public String getNivelMadurez() {
        return nivelMadurez;
    }

    public void setNivelMadurez(String nivelMadurez) {
        this.nivelMadurez = nivelMadurez;
    }

    public double getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(double puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // Métodos UML

    public double calcularPromedio() {
        return puntajeTotal;
    }

    public String obtenerNivelMadurez() {

        if (puntajeTotal >= 80) {
            return "Alto";
        } else if (puntajeTotal >= 50) {
            return "Medio";
        } else {
            return "Bajo";
        }
    }
}