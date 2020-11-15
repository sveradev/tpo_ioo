package lineasYoperaciones;

import java.util.Date;

public class Prestamos extends Operacion {



    enum TipoSistema{
        FRANCES, ALEMAN, AMERICANO
    }

    private final static double PORCENTAJE_COMISION = 0.04;

    private String banco;
    private double tasa;
    private Date fechaAcreditacion;
    private int cantidadDeCuotas;
    private int cantidadDePagas;
    private TipoSistema tipoSistema;


    @Override
    public double importeVivo() {

        double importeCuota = importeDeOperacion/cantidadDeCuotas;
        int cuotasImpagas = cantidadDeCuotas-cantidadDePagas;

        return importeCuota*cuotasImpagas;
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }
}
