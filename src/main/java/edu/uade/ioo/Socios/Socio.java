package edu.uade.ioo.Socios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Socio {
    private String cuit;
    private String razonSocial;
    private Date fecha_inicio;
    private String tipo;
    private String actividad;
    private String direccion;
    private String telefono;
    private String email;
    private List<Accionista> accionistas;

    private Date fechaDeRecepcion;
    private EstadoDocumentacion estadoDocumentacion;
    private String usuarioIngreso;

    private boolean pleno;


    public Socio(String cuit
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
            ) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.fecha_inicio = fecha_inicio;
        this.tipo = tipo;
        this.actividad = actividad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.accionistas = new ArrayList<>();
        this.fechaDeRecepcion = fechaDeRecepcion;
        this.estadoDocumentacion = estadoDocumentacion;
        this.usuarioIngreso = usuarioIngreso;
        this.pleno = false;
    }

    public boolean agregaAccionista(Accionista accionistaNuevo) {
        if (!accionistas.contains(accionistaNuevo)) {
            this.accionistas.add(accionistaNuevo);
            System.out.println("Accionista agregado con exito");
            return true;
        } else {
            System.out.println("Accionista ya cargado");
            return false;
        }
    }

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

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Accionista> getAccionistas() {
        return accionistas;
    }


    public Date getFechaDeRecepcion() {
        return fechaDeRecepcion;
    }

    public void setFechaDeRecepcion(Date fechaDeRecepcion) {
        this.fechaDeRecepcion = fechaDeRecepcion;
    }

    public void setAccionistas(List<Accionista> accionistas) {
        this.accionistas = accionistas;
    }

    public boolean isPleno() {
        return pleno;
    }

    public void setPleno(boolean pleno) {
        this.pleno = pleno;
    }

    public EstadoDocumentacion getEstadoDocumentacion() {
        return estadoDocumentacion;
    }

    public void setEstadoDocumentacion(EstadoDocumentacion estadoDocumentacion) {
        this.estadoDocumentacion = estadoDocumentacion;
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }



    @Override
    public String toString() {
        return "Socio{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", tipo='" + tipo + '\'' +
                ", actividad='" + actividad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", accionistas=" + accionistas +
                ", fechaDeRecepcion=" + fechaDeRecepcion +
                ", estadoDocumentacion=" + estadoDocumentacion +
                ", usuarioIngreso='" + usuarioIngreso + '\'' +
                ", esPleno=" + pleno +
                '}';
    }
}
