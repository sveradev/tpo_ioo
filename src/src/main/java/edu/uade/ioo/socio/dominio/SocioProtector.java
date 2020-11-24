package edu.uade.ioo.socio.dominio;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SocioProtector extends Socio {
    private int accionesB;
    private List<Aportes> aportes = new ArrayList<>();

    public SocioProtector(final String cuit, final String razonSocial, final Instant inicioActividad, final TipoEmpresa tipo, final String actividad, final String direccion, final String telefono, final String email, final int accionesB) {
        super(cuit, razonSocial, inicioActividad, tipo, actividad, direccion, telefono, email);
        this.accionesB = accionesB;
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
        return  super.getCuit()+"-"+super.getRazonSocial();
    }
}
