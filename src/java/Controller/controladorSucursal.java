/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
import entidades.Seguimiento;
import entidades.Sucursal;
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
public class controladorSucursal {
    
     //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaSucursal.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Sucursal());
        modelAndView.setViewName("altaSucursal");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaSucursal.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Sucursal s){
        String sql = "insert into sucursal(idSucursal, nombre, direccion, telefono, cantidadAnimales, cupoMaximoAnimales) values(?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, s.getIdSucursal(), s.getNombre(), s.getDireccion(), s.getTelefono(), s.getCantidadAnimales(), s.getCupoMaximoAnimales());
        return new ModelAndView("redirect:/altaSucursal.htm");
        
    }
    
    
    int idSucursal;
    List datos;
    //Metodo para listar
    @RequestMapping("listasucursal.htm")   
    public ModelAndView Listar(){
        String sql="select * from sucursal";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listasucursal");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarSucursal.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idSucursal = Integer.parseInt(request.getParameter("idSucursal"));
        String sql = "select * from sucursal where idSucursal="+idSucursal;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarSucursal");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarSucursal.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Sucursal s){
        String sql = "update sucursal set nombre=?, direccion=?, telefono=?, cantidadAnimales=?, cupoMaximoAnimales=? where idSucursal=?";
        this.jdbcTemplate.update(sql, s.getNombre(), s.getDireccion(), s.getTelefono(), s.getCantidadAnimales(), s.getCupoMaximoAnimales(), idSucursal);
        return new ModelAndView("redirect:/listasucursal.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminarsucursal.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idSucursal = Integer.parseInt(request.getParameter("idSucursal"));
        String sql = "delete from sucursal where idSucursal="+idSucursal;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listasucursal.htm");
    }
    
    
    
}
