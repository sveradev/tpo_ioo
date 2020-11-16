package edu.uade.ioo.socio.dominio;

import edu.uade.ioo.usuario.dominio.Usuario;

import java.time.Instant;

public class Documento {
  private TipoDocumento tipo;
  private Usuario usuario;
  private Instant fechaIngreso;
  private boolean aprobado;

  public Documento(final TipoDocumento tipo, final Usuario usuario, final Instant fechaIngreso) {
    this.tipo = tipo;
    this.usuario = usuario;
    this.fechaIngreso = fechaIngreso;
  }

  public void aprobar() {
    this.aprobado = true;
  }

  public TipoDocumento getTipo() {
    return tipo;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public Instant getFechaIngreso() {
    return fechaIngreso;
  }

  public boolean isAprobado() {
    return aprobado;
  }
}
