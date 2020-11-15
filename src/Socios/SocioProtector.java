package Socios;

import lineasYoperaciones.Cheque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocioProtector extends Socio {
    private int accionesB;
    private List<Aportes> aportes;

    public SocioProtector(String cuit
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
            , int accionesB
            ) {
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
        this.accionesB = accionesB;
        this.aportes = new ArrayList<>();
    }

    public boolean agregaAporte(Aportes aporteNuevo){
        if (aportes.contains(aporteNuevo)){
            System.out.println("Aporte ya agregado");
            return false;
        }else{
            aportes.add(aporteNuevo);
            System.out.println("Aporte agregado con exito");
            return true;
        }
    }

    public int getAccionesB() {
        return accionesB;
    }

    public List<Aportes> getAportes() {
        return aportes;
    }

    @Override
    public String toString() {
        return  "SocioProtector{" +
                "accionesB=" + accionesB +
                ", aportes=" + aportes +
                '}';
    }
}
