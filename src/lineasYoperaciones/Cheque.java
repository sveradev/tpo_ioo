package lineasYoperaciones;

import java.util.Date;

public class Cheque extends Operacion {

    enum TipoCheque {
        PROPIO, TERCERO, PAGARE
    }

    private final static double PORCENTAJE_COMISION = 0.03;

    private TipoCheque tipoCheque;
    private String banco;
    private String numero;
    private Date fechaVencimiento;
    private String cuitFirmante;

    private double tasaDescuento;


    @Override
    public double importeVivo() {
        return this.importeDeOperacion;
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }

}
