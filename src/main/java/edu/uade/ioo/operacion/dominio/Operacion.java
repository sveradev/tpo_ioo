package edu.uade.ioo.operacion.dominio;

import java.math.BigDecimal;

public abstract class Operacion {

    protected EstadoOperacion estadoOperacion;
    protected BigDecimal importeDeOperacion;
    protected String certificadoGarantia;

    protected Comision comision;

    public Operacion(
        BigDecimal importeDeOperacion
            ) {
        this.estadoOperacion = EstadoOperacion.INGRESADO;
        this.importeDeOperacion = importeDeOperacion;
        this.comision = new Comision();
    }

    public Comision getComision() {
        return comision;
    }

    public BigDecimal getImporteDeOperacion() {
        return importeDeOperacion;
    }

    public abstract BigDecimal importeVivo();


    public abstract void emiteCertificado(String numeroCertificado);


}
