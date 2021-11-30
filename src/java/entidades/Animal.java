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
public class Animal {
     private int idAnimal;
    private String animal;
    private String vacunas;
    private String genero;
    private int edadMeses;
    private Date fechaIngreso;
    private String saludAnimal;
    private String adoptable;
    private int idsucursal;

    public Animal() {
    }

    public Animal(int idAnimal, String animal, String vacunas, String genero, int edadMeses, Date fechaIngreso, String saludAnimal, String adoptable, int idsucursal) {
        this.idAnimal = idAnimal;
        this.animal = animal;
        this.vacunas = vacunas;
        this.genero = genero;
        this.edadMeses = edadMeses;
        this.fechaIngreso = fechaIngreso;
        this.saludAnimal = saludAnimal;
        this.adoptable = adoptable;
        this.idsucursal = idsucursal;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSaludAnimal() {
        return saludAnimal;
    }

    public void setSaludAnimal(String saludAnimal) {
        this.saludAnimal = saludAnimal;
    }

    public String getAdoptable() {
        return adoptable;
    }

    public void setAdoptable(String adoptable) {
        this.adoptable = adoptable;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }
    
    
}
