/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.File;
import java.util.Date;

/**
 *
 * @author PC7
 */
public class Seguimiento {
    private int idSeguimiento;
    private String saludAnimal;
    private String alimentacion;    
    private Date fechaRevision;
    private String aprobacion;
    private int idadopcion;

    public Seguimiento() {
    }

    public Seguimiento(int idSeguimiento, String saludAnimal, String alimentacion, Date fechaRevision, String aprobacion, int idadopcion) {
        this.idSeguimiento = idSeguimiento;
        this.saludAnimal = saludAnimal;
        this.alimentacion = alimentacion;
        this.fechaRevision = fechaRevision;
        this.aprobacion = aprobacion;
        this.idadopcion = idadopcion;
    }

    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    public void setIdSeguimiento(int idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public String getSaludAnimal() {
        return saludAnimal;
    }

    public void setSaludAnimal(String saludAnimal) {
        this.saludAnimal = saludAnimal;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }

    public int getIdadopcion() {
        return idadopcion;
    }

    public void setIdadopcion(int idadopcion) {
        this.idadopcion = idadopcion;
    }

    
    
    
}
