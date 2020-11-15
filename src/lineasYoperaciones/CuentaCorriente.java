package lineasYoperaciones;

import java.util.Date;

public class CuentaCorriente extends Operacion{
    enum TipoCuentaCorriente{
        CUENTA_CORRIENTE, TARJETA_CREDITO
    }

    private final static double PORCENTAJE_COMISION = 0.03;

    private String empresa;
    private Date fechaVencimiento;
    private double importeUtilizado;


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
