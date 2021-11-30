/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author PC7
 */
public class Sucursal {
    private int idSucursal;
    private String nombre;
    private String direccion;
    private String telefono;
    private int cantidadAnimales;
    private int cupoMaximoAnimales;

    public Sucursal() {
    }

    public Sucursal(int idSucursal, String nombre, String direccion, String telefono, int cantidadAnimales, int cupoMaximoAnimales) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadAnimales = cantidadAnimales;
        this.cupoMaximoAnimales = cupoMaximoAnimales;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }

    public int getCupoMaximoAnimales() {
        return cupoMaximoAnimales;
    }

    public void setCupoMaximoAnimales(int cupoMaximoAnimales) {
        this.cupoMaximoAnimales = cupoMaximoAnimales;
    }

}
