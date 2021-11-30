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
public class Blacklist {
    private int idBlacklist;
    private int idadopcion;
    private int idseguimiento;

    public Blacklist() {
    }

    public Blacklist(int idBlacklist, int idadopcion, int idseguimiento) {
        this.idBlacklist = idBlacklist;
        this.idadopcion = idadopcion;
        this.idseguimiento = idseguimiento;
    }

    public int getIdBlacklist() {
        return idBlacklist;
    }

    public void setIdBlacklist(int idBlacklist) {
        this.idBlacklist = idBlacklist;
    }

    public int getIdadopcion() {
        return idadopcion;
    }

    public void setIdadopcion(int idadopcion) {
        this.idadopcion = idadopcion;
    }

    public int getIdseguimiento() {
        return idseguimiento;
    }

    public void setIdseguimiento(int idseguimiento) {
        this.idseguimiento = idseguimiento;
    }
    
    
}
