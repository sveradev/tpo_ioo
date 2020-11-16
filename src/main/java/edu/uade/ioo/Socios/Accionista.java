package edu.uade.ioo.Socios;

public class Accionista {
    private String cuit;
    private String razonSocial;
    private double porcentajeDeParticipacion;

    public Accionista(String cuit, String razonSocial, double porcentajeDeParticipacion) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.porcentajeDeParticipacion = porcentajeDeParticipacion;
    }
}
