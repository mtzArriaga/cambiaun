/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
import entidades.Blacklist;
import entidades.Donaciones;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PC7
 */
public class controladorDonaciones {
    
     //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaDonaciones.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Donaciones());
        modelAndView.setViewName("altaDonaciones");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaDonaciones.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Donaciones d){
        String sql = "insert into donaciones(idDonacion, nombreDonador, telefonoDonador, emailDonador, montoDonacion, fechaDonacion, direccionDonador, direccionFactura, cuentaBancaria, idsucursal) values(?,?,?,?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, d.getIdDonacion(), d.getNombreDonador(), d.getTelefonoDonador(), d.getEmailDonador(), d.getMontoDonacion(), d.getFechaDonacion(), d.getDireccionDonador(), d.getDireccionFactura(), d.getCuentaBancaria(), d.getIdsucursal());
        return new ModelAndView("redirect:/altaDonaciones.htm");
        
    }
    
    
    int idDonacion;
    List datos;
    //Metodo para listar
    @RequestMapping("listadonaciones.htm")   
    public ModelAndView Listar(){
        String sql="select * from donaciones";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listadonaciones");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarDonaciones.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idDonacion = Integer.parseInt(request.getParameter("idDonacion"));
        String sql = "select * from donaciones where idDonacion="+idDonacion;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarDonaciones");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarDonaciones.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Donaciones d){
        String sql = "update donaciones set nombreDonador=?, telefonoDonador=?, emailDonador=?, montoDonacion=?, fechaDonacion=?, direccionDonador=?, direccionFactura=?, cuentaBancaria=?, idsucursal=? where idDonacion=?";
        this.jdbcTemplate.update(sql, d.getNombreDonador(), d.getTelefonoDonador(), d.getEmailDonador(), d.getMontoDonacion(), d.getFechaDonacion(), d.getDireccionDonador(), d.getDireccionFactura(), d.getCuentaBancaria(), d.getIdsucursal(), idDonacion);
        return new ModelAndView("redirect:/listadonaciones.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminardonaciones.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idDonacion = Integer.parseInt(request.getParameter("idDonacion"));
        String sql = "delete from donaciones where idDonacion="+idDonacion;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listadonaciones.htm");
    }
    
}
