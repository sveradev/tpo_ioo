package edu.uade.ioo.operacion.dominio;

import java.math.BigDecimal;
import java.util.Date;

public class Comision {
    private EstadoComision estadoComision;
    private  BigDecimal comisionCalculada;
    private  Date fechaComision;


    public BigDecimal calcularComision(double porcentaje, BigDecimal importeDeOperacion){
        if (this.estadoComision == null){
            this.comisionCalculada = importeDeOperacion.multiply(BigDecimal.valueOf(porcentaje));
            this.fechaComision = new Date();
            this.estadoComision = EstadoComision.CALCULADA;
        }
        return comisionCalculada;
    }

    public EstadoComision getEstadoComision() {
        return estadoComision;
    }


    public BigDecimal getComisionCalculada() {
        return comisionCalculada;
    }


    public Date getFechaComision() {
        return fechaComision;
    }

    @Override
    public String toString() {
        return "Comision{" +
                "estadoComision=" + estadoComision +
                ", comisionCalculada=" + comisionCalculada +
                ", fechaComision=" + fechaComision +
                '}';
    }
}
