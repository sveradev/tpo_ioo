package edu.uade.ioo.lineasYoperaciones;

import java.util.Date;

public class CuentaCorriente extends Operacion{
    public enum TipoCuentaCorriente{
        CUENTA_CORRIENTE, TARJETA_CREDITO
    }

    private final static double PORCENTAJE_COMISION = 0.03;

    private String empresa;
    private Date fechaVencimiento;
    private double importeUtilizado;

    public CuentaCorriente(double importeDeOperacion, String empresa, Date fechaVencimiento, double importeUtilizado) {
        super(importeDeOperacion);
        this.empresa = empresa;
        this.fechaVencimiento = fechaVencimiento;
        this.importeUtilizado = importeUtilizado;
    }

    @Override
    public double importeVivo() {
        return importeUtilizado;
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }



}
