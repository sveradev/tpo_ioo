package edu.uade.ioo.socio.dominio;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Socio {
    private String cuit;
    private String razonSocial;
    private Instant inicioActividad;
    private TipoEmpresa tipo;
    private String actividad;
    private String direccion;
    private String telefono;
    private String email;
    private Set<Accionista> accionistas = new HashSet<>();
    private List<Documento> documentos = new ArrayList<>();
    private boolean activo;

    public Socio(final String cuit, final String razonSocial, final Instant inicioActividad, final TipoEmpresa tipo, final String actividad, final String direccion, final String telefono, final String email) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.inicioActividad = inicioActividad;
        this.tipo = tipo;
        this.actividad = actividad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public void agregaAccionista(Accionista accionista) {
        this.accionistas.add(accionista);
    }

    public void activarSocio(){
        this.activo = true;
    }

    //DUDOSO, UN ACCIONISTA NO PODRIA ESTAR COMPARTIDO ENTRO SOCIOS. UN SOCIO NO TENDRIA POR QUE SABER ESA INFORMACION
    public boolean comparteAccionista(Socio otraSocio){
        boolean comparteAccionista = false;

        for (Accionista accionista : accionistas){
            for (Accionista accionistaDeOtra: otraSocio.getAccionistas()){
                if (accionista == accionistaDeOtra){
                    comparteAccionista = true;
                }
            }
        }

        return comparteAccionista;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public Instant getInicioActividad() {
        return inicioActividad;
    }

    public TipoEmpresa getTipo() {
        return tipo;
    }

    public String getActividad() {
        return actividad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Set<Accionista> getAccionistas() {
        return accionistas;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", fecha_inicio=" + inicioActividad +
                ", tipo='" + tipo + '\'' +
                ", actividad='" + actividad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", accionistas=" + accionistas +
                ", activo=" + activo +
                '}';
    }
}
