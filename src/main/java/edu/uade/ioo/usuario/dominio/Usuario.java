package edu.uade.ioo.usuario.dominio;

import java.util.UUID;

public class Usuario {
  private UUID id;
  private String nombre;

  public Usuario(final UUID id, final String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public UUID getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }
}
