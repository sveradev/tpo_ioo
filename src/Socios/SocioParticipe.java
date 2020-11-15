package Socios;

import lineasYoperaciones.Cheque;
import lineasYoperaciones.LineaCredito;
import lineasYoperaciones.TipoOperacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocioParticipe extends Socio{
    private int accionesA;

    private LineaCredito lineaCredito;

    public SocioParticipe(String cuit
            , String razonSocial
            , Date fecha_inicio
            , String tipo
            , String actividad
            , String direccion
            , String telefono
            , String email
            , Date fechaDeRecepcion
            , EstadoDocumentacion estadoDocumentacion
            , String usuarioIngreso
            , int accionesA) {
        super(cuit
                , razonSocial
                , fecha_inicio
                , tipo
                , actividad
                , direccion
                , telefono
                , email
                , fechaDeRecepcion
                , estadoDocumentacion
                , usuarioIngreso
                );
        this.accionesA = accionesA;
    }


    public boolean abrirLineaCredito(
            Date fechaVencimiento
            , double montoMaximo
            , ArrayList<TipoOperacion> operacionesValidas){
        if (this.isPleno()){
            System.out.println("Abriendo linea de credito");
            lineaCredito = new LineaCredito(fechaVencimiento
                    , montoMaximo
                    , operacionesValidas);
            return true;
        }else {
            System.out.println("Socio NO ES PLENO, no se puede abrir");
            return false;
        }

    }

    public LineaCredito getLineaCredito() {
        return lineaCredito;
    }

    public int getAccionesA() {
        return accionesA;
    }

    @Override
    public String toString() {
        return "SocioParticipe{" +
                "accionesA=" + accionesA +
                ", lineaCredito=" + lineaCredito +
                '}';
    }
}
