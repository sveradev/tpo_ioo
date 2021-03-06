package edu.uade.ioo.socio.dominio;

import edu.uade.ioo.lineaDeCredito.dominio.LineaCredito;
import edu.uade.ioo.operacion.dominio.TipoOperacion;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;

public class SocioParticipe extends Socio {
    private int accionesA;
    private LineaCredito lineaCredito;

    public SocioParticipe(
        final String cuit,
        final String razonSocial,
        final Instant inicioActividad,
        final TipoEmpresa tipo,
        final String actividad,
        final String direccion,
        final String telefono,
        final String email,
        final int accionesA
    ) {
        super(cuit, razonSocial, inicioActividad, tipo, actividad, direccion, telefono, email);
        this.accionesA = accionesA;
    }

    public boolean abrirLineaCredito(
            Instant fechaVencimiento
            , BigDecimal montoMaximo
            , ArrayList<TipoOperacion> operacionesValidas){
        if (this.isActivo()){
            System.out.println("Abriendo linea de credito");
            lineaCredito = new LineaCredito(
                Instant.now(),
                fechaVencimiento,
                montoMaximo,
                operacionesValidas,
                new ArrayList<>());
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
