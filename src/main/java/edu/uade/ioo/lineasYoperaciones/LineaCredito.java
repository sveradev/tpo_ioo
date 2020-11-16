package edu.uade.ioo.lineasYoperaciones;


import edu.uade.ioo.Controller.ControladorSGR;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class LineaCredito {


    private Date fechaVencimiento;
    private double montoMaximo;
    private ArrayList<TipoOperacion> operacionesValidas;
    private ArrayList<Operacion> operaciones;


    public LineaCredito(Date fechaVencimiento
            , double montoMaximo
            , ArrayList<TipoOperacion> operacionesValidas) {
        this.fechaVencimiento = fechaVencimiento;
        this.montoMaximo = montoMaximo;
        this.operacionesValidas = operacionesValidas;
        this.operaciones = new ArrayList<>();
    }


    public boolean crearOperacionCheque(double importeDeOperacion
            , Cheque.TipoCheque tipoCheque
            , String banco
            , String numero
            , Date fechaVencimiento
            , String cuitFirmante
            , double tasaDescuento){
        double fdr = ControladorSGR.calculaFDR();
        if(this.estaVigente()
            && importeDeOperacion < this.montoMaximo
            && this.operacionesValidas.contains(TipoOperacion.CHEQUE)
            && importeDeOperacion < 0.05*fdr){
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
        System.out.println(importeDeOperacion <= this.montoMaximo);
        System.out.println(this.operacionesValidas.contains(TipoOperacion.CHEQUE));
        System.out.println(importeDeOperacion < 0.05*fdr);
        return false;
    }



    public boolean estaVigente() {
        Calendar actual = Calendar.getInstance();
        Calendar vencimiento = Calendar.getInstance();
        vencimiento.setTime(this.fechaVencimiento);

        return actual.before(vencimiento);
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public ArrayList<TipoOperacion> getOperacionesValidas() {
        return operacionesValidas;
    }

    public ArrayList<Operacion> getOperaciones() {
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
