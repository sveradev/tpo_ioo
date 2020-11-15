package lineasYoperaciones;

import java.util.Date;

public class Comision {
    private  EstadoComision estadoComision;
    private  double comisionCalculada;
    private  Date fechaComision;


    public double calcularComision(double porcentaje, double importeDeOperacion){
        if (this.estadoComision == null){
            this.comisionCalculada = porcentaje*importeDeOperacion;
            this.fechaComision = new Date();
            this.estadoComision = EstadoComision.CALCULADA;
        }
        return comisionCalculada;
    }

    public EstadoComision getEstadoComision() {
        return estadoComision;
    }


    public double getComisionCalculada() {
        return comisionCalculada;
    }


    public Date getFechaComision() {
        return fechaComision;
    }


}
