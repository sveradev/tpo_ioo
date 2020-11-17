package edu.uade.ioo.operacion.dominio;

import java.math.BigDecimal;
import java.time.Instant;

public class Prestamos extends Operacion {

    public enum TipoSistema{
        FRANCES, ALEMAN, AMERICANO
    }

    private final static double PORCENTAJE_COMISION = 0.04;

    private String banco;
    private BigDecimal tasa;
    private Instant fechaAcreditacion;
    private int cantidadDeCuotas;
    private int cantidadDePagas;
    private TipoSistema tipoSistema;


    public Prestamos(
        BigDecimal importeDeOperacion
            , String banco
            , BigDecimal tasa
            , Instant fechaAcreditacion
            , int cantidadDeCuotas
            , int cantidadDePagas
            , TipoSistema tipoSistema) {
        super(importeDeOperacion);
        this.banco = banco;
        this.tasa = tasa;
        this.fechaAcreditacion = fechaAcreditacion;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.cantidadDePagas = cantidadDePagas;
        this.tipoSistema = tipoSistema;
    }

    @Override
    public BigDecimal importeVivo() {

        BigDecimal importeCuota = importeDeOperacion.divide(BigDecimal.valueOf(cantidadDeCuotas));
        int cuotasImpagas = cantidadDeCuotas-cantidadDePagas;

        return importeCuota.multiply(BigDecimal.valueOf(cuotasImpagas));
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }
}
