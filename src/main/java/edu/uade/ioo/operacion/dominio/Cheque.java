package edu.uade.ioo.operacion.dominio;

import java.math.BigDecimal;
import java.time.Instant;

public class Cheque extends Operacion {

    public enum TipoCheque {
        PROPIO
        , TERCERO
        , PAGARE
    }

    public final static double PORCENTAJE_COMISION = 0.03;

    private TipoCheque tipoCheque;
    private String banco;
    private String numero;
    private Instant fechaVencimiento;
    private String cuitFirmante;

    private double tasaDescuento;

    public Cheque(
        BigDecimal importeDeOperacion
            , TipoCheque tipoCheque
            , String banco
            , String numero
            , Instant fechaVencimiento2
            , String cuitFirmante
            , double tasaDescuento) {
        super(importeDeOperacion);
        this.tipoCheque = tipoCheque;
        this.banco = banco;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento2;
        this.cuitFirmante = cuitFirmante;
        this.tasaDescuento = tasaDescuento;
    }

    @Override
    public BigDecimal importeVivo() {
        return this.importeDeOperacion;
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "tipoCheque=" + tipoCheque +
                ", banco='" + banco + '\'' +
                ", numero='" + numero + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", cuitFirmante='" + cuitFirmante + '\'' +
                ", tasaDescuento=" + tasaDescuento +
                '}';
    }
}
