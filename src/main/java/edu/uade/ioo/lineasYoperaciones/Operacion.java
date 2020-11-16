package edu.uade.ioo.lineasYoperaciones;

public abstract class Operacion {

    protected EstadoOperacion estadoOperacion;
    protected double importeDeOperacion;
    protected String certificadoGarantia;

    protected Comision comision;

    public Operacion(double importeDeOperacion
            ) {
        this.estadoOperacion = EstadoOperacion.INGRESADO;
        this.importeDeOperacion = importeDeOperacion;
        this.comision = new Comision();
    }

    public Comision getComision() {
        return comision;
    }

    public double getImporteDeOperacion() {
        return importeDeOperacion;
    }

    public abstract double importeVivo();


    public abstract void emiteCertificado(String numeroCertificado);


}
