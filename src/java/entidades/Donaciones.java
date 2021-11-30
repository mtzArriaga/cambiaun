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
public class Donaciones {
    private int idDonacion;
    private String nombreDonador;
    private String telefonoDonador;
    private String emailDonador;
    private double montoDonacion;
    private Date fechaDonacion;
    private String direccionDonador;
    private String direccionFactura;
    private String cuentaBancaria;
    private int idsucursal;

    public Donaciones() {
    }

    public Donaciones(int idDonacion, String nombreDonador, String telefonoDonador, String emailDonador, double montoDonacion, Date fechaDonacion, String direccionDonador, String direccionFactura, String cuentaBancaria, int idsucursal) {
        this.idDonacion = idDonacion;
        this.nombreDonador = nombreDonador;
        this.telefonoDonador = telefonoDonador;
        this.emailDonador = emailDonador;
        this.montoDonacion = montoDonacion;
        this.fechaDonacion = fechaDonacion;
        this.direccionDonador = direccionDonador;
        this.direccionFactura = direccionFactura;
        this.cuentaBancaria = cuentaBancaria;
        this.idsucursal = idsucursal;
    }

    public int getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(int idDonacion) {
        this.idDonacion = idDonacion;
    }

    public String getNombreDonador() {
        return nombreDonador;
    }

    public void setNombreDonador(String nombreDonador) {
        this.nombreDonador = nombreDonador;
    }

    public String getTelefonoDonador() {
        return telefonoDonador;
    }

    public void setTelefonoDonador(String telefonoDonador) {
        this.telefonoDonador = telefonoDonador;
    }

    public String getEmailDonador() {
        return emailDonador;
    }

    public void setEmailDonador(String emailDonador) {
        this.emailDonador = emailDonador;
    }

    public double getMontoDonacion() {
        return montoDonacion;
    }

    public void setMontoDonacion(double montoDonacion) {
        this.montoDonacion = montoDonacion;
    }

    public Date getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public String getDireccionDonador() {
        return direccionDonador;
    }

    public void setDireccionDonador(String direccionDonador) {
        this.direccionDonador = direccionDonador;
    }

    public String getDireccionFactura() {
        return direccionFactura;
    }

    public void setDireccionFactura(String direccionFactura) {
        this.direccionFactura = direccionFactura;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }
    
    
    
}

