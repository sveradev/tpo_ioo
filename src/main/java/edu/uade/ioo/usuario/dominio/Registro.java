package edu.uade.ioo.usuario.dominio;

import java.time.Instant;
import java.util.UUID;

public class  Registro {
    final private UUID referencia;
    private String usuario;
    private Instant fechaRegistro;
    private String estadoAnterior;
    private String estadoNuevo;

    public Registro(String estadoAnterior, String estadoNuevo) {
        this.referencia = UUID.randomUUID();
        this.usuario = Usuario.getNombre();
        this.fechaRegistro = Instant.now();
        this.estadoAnterior = estadoAnterior;
        this.estadoNuevo = estadoNuevo;
    }

    public String getReferencia() {
        return String.valueOf(referencia);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getFechaRegistro() {
        return String.valueOf(fechaRegistro);
    }

    public String getEstadoAnterior() {
        return estadoAnterior;
    }

    public String getEstadoNuevo() {
        return estadoNuevo;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "referencia=" + referencia +
                ", usuario='" + usuario + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", estadoAnterior='" + estadoAnterior + '\'' +
                ", estadoNuevo='" + estadoNuevo + '\'' +
                "} \n ";
    }
}
