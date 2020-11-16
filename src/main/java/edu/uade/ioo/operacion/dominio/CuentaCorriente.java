package edu.uade.ioo.operacion.dominio;

import java.math.BigDecimal;
import java.util.Date;

public class CuentaCorriente extends Operacion{
    public enum TipoCuentaCorriente{
        CUENTA_CORRIENTE, TARJETA_CREDITO
    }

    private final static double PORCENTAJE_COMISION = 0.03;

    private String empresa;
    private Date fechaVencimiento;
    private BigDecimal importeUtilizado;

    public CuentaCorriente(BigDecimal importeDeOperacion, String empresa, Date fechaVencimiento, BigDecimal importeUtilizado) {
        super(importeDeOperacion);
        this.empresa = empresa;
        this.fechaVencimiento = fechaVencimiento;
        this.importeUtilizado = importeUtilizado;
    }

    @Override
    public BigDecimal importeVivo() {
        return importeUtilizado;
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }



}
