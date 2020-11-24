package edu.uade.ioo.usuario.dominio;

import java.util.UUID;

public class Usuario {
  private static UUID id;
  private static String nombre;

  public Usuario(final UUID id, final String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public static UUID getId() {
    return id;
  }

  public static String getNombre() {
    return nombre;
  }

  public static void setId(UUID id) {
    Usuario.id = id;
  }

  public static void setNombre(String nombre) {
    Usuario.nombre = nombre;
  }
}
