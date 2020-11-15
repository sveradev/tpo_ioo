package lineasYoperaciones;

import java.util.Date;

public abstract class Operacion {

    protected EstadoOperacion estadoOperacion;
    protected double importeDeOperacion;
    protected String certificadoGarantia;

    protected Comision comision;





    public abstract double importeVivo();


    public abstract void emiteCertificado(String numeroCertificado);




}
