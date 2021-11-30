/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author PC7
 */
public class Adopcion {
    private int idAdopcion;
    private String nombreAdoptador;
    private String direccionAdoptador;
    private String telefonoAdoptador;
    private Date fechaAdopcion;
    private String ocupacion;
    private int idanimal;

    public Adopcion() {
    }

    public Adopcion(int idAdopcion, String nombreAdoptador, String direccionAdoptador, String telefonoAdoptador, Date fechaAdopcion, String ocupacion, int idanimal) {
        this.idAdopcion = idAdopcion;
        this.nombreAdoptador = nombreAdoptador;
        this.direccionAdoptador = direccionAdoptador;
        this.telefonoAdoptador = telefonoAdoptador;
        this.fechaAdopcion = fechaAdopcion;
        this.ocupacion = ocupacion;
        this.idanimal = idanimal;
    }

    public int getIdAdopcion() {
        return idAdopcion;
    }

    public void setIdAdopcion(int idAdopcion) {
        this.idAdopcion = idAdopcion;
    }

    public String getNombreAdoptador() {
        return nombreAdoptador;
    }

    public void setNombreAdoptador(String nombreAdoptador) {
        this.nombreAdoptador = nombreAdoptador;
    }

    public String getDireccionAdoptador() {
        return direccionAdoptador;
    }

    public void setDireccionAdoptador(String direccionAdoptador) {
        this.direccionAdoptador = direccionAdoptador;
    }

    public String getTelefonoAdoptador() {
        return telefonoAdoptador;
    }

    public void setTelefonoAdoptador(String telefonoAdoptador) {
        this.telefonoAdoptador = telefonoAdoptador;
    }

    public Date getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(Date fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(int idanimal) {
        this.idanimal = idanimal;
    }

   

    
          
}
