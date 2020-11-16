package edu.uade.ioo.lineaDeCredito.dominio;


import edu.uade.ioo.Controller.ControladorSGR;
import edu.uade.ioo.operacion.dominio.Cheque;
import edu.uade.ioo.operacion.dominio.Operacion;
import edu.uade.ioo.operacion.dominio.TipoOperacion;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class LineaCredito {

    private Instant fechaInicio;
    private Instant fechaVencimiento;
    private BigDecimal montoMaximo;
    private List<TipoOperacion> operacionesValidas;
    private List<Operacion> operaciones;

    public LineaCredito(final Instant fechaInicio, final Instant fechaVencimiento, final BigDecimal montoMaximo, final List<TipoOperacion> operacionesValidas) {
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.montoMaximo = montoMaximo;
        this.operacionesValidas = operacionesValidas;
    }

    public boolean crearOperacionCheque(BigDecimal importeDeOperacion
            , Cheque.TipoCheque tipoCheque
            , String banco
            , String numero
            , Date fechaVencimiento
            , String cuitFirmante
            , double tasaDescuento){
        double fdr = ControladorSGR.calculaFDR();
        if(this.estaVigente()
            && importeDeOperacion.compareTo(this.montoMaximo) < 0
            && this.operacionesValidas.contains(TipoOperacion.CHEQUE)
            && importeDeOperacion.compareTo(BigDecimal.valueOf(0.05*fdr)) < 0){
            operaciones.add(
                    new Cheque(importeDeOperacion
                            ,tipoCheque
                            ,banco
                            ,numero
                            ,fechaVencimiento
                            ,cuitFirmante
                            ,tasaDescuento)
            );
            System.out.println("Operacion Creada");
            return true;
        }
        System.out.println("CONDICIONES NO CUMPLIDAS DE CREAR CHEQUE");
        System.out.println(this.estaVigente());
        System.out.println(importeDeOperacion.compareTo(this.montoMaximo) > 0);
        System.out.println(this.operacionesValidas.contains(TipoOperacion.CHEQUE));
        System.out.println(importeDeOperacion.compareTo(BigDecimal.valueOf(0.05*fdr)) > 0 );
        return false;
    }

    public boolean estaVigente() {
        return Instant.now().isAfter(this.fechaVencimiento);
    }

    public Instant getFechaInicio() {
        return fechaInicio;
    }

    public Instant getFechaVencimiento() {
        return fechaVencimiento;
    }

    public BigDecimal getMontoMaximo() {
        return montoMaximo;
    }

    public List<TipoOperacion> getOperacionesValidas() {
        return operacionesValidas;
    }

    public List<Operacion> getOperaciones() {
        return operaciones;
    }

    @Override
    public String toString() {
        return "LineaCredito{" +
                "fechaVencimiento=" + fechaVencimiento +
                ", montoMaximo=" + montoMaximo +
                ", operacionesValidas=" + operacionesValidas +
                ", operaciones=" + operaciones +
                '}';
    }
}
