package edu.uade.ioo.usuario.dominio;

import java.util.ArrayList;

public class  Historial {

    public static ArrayList<Registro> registroSocios = new ArrayList<>();
    public static ArrayList<Registro> registroOperaciones = new ArrayList<>();

    public static void agregarRegistroSocio(String estadoAnterior, String estadoNuevo){
        Registro nuevoRegistro = new Registro(estadoAnterior, estadoNuevo);
        registroSocios.add(nuevoRegistro);
    }

    public static void agregarRegistroOperacion(String estadoAnterior, String estadoNuevo){
        Registro nuevoRegistro = new Registro(estadoAnterior, estadoNuevo);
        registroOperaciones.add(nuevoRegistro);
    }
}
