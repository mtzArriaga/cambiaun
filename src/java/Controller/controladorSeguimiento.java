/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
import entidades.Donaciones;
import entidades.Seguimiento;
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
public class controladorSeguimiento {
    
    //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaSeguimiento.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Seguimiento());
        modelAndView.setViewName("altaSeguimiento");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaSeguimiento.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Seguimiento s){
        String sql = "insert into seguimiento(idSeguimiento, saludAnimal, alimentacion, fechaRevision, aprobacion, idadopcion) values(?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, s.getIdSeguimiento(), s.getSaludAnimal(), s.getAlimentacion(), s.getFechaRevision(), s.getAprobacion(), s.getIdadopcion());
        return new ModelAndView("redirect:/altaSeguimiento.htm");
        
    }
    
    
    int idSeguimiento;
    List datos;
    //Metodo para listar
    @RequestMapping("listaseguimiento.htm")   
    public ModelAndView Listar(){
        String sql="select * from seguimiento";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listaseguimiento");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarSeguimiento.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idSeguimiento = Integer.parseInt(request.getParameter("idSeguimiento"));
        String sql = "select * from seguimiento where idSeguimiento="+idSeguimiento;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarSeguimiento");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarSeguimiento.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Seguimiento s){
        String sql = "update seguimiento set saludAnimal=?, alimentacion=?, fechaRevision=?, aprobacion=?, idadopcion=? where idSeguimiento=?";
        this.jdbcTemplate.update(sql, s.getSaludAnimal(), s.getAlimentacion(), s.getFechaRevision(), s.getAprobacion(), s.getIdadopcion(), idSeguimiento);
        return new ModelAndView("redirect:/listaseguimiento.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminarseguimiento.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idSeguimiento = Integer.parseInt(request.getParameter("idSeguimiento"));
        String sql = "delete from seguimiento where idSeguimiento="+idSeguimiento;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listaseguimiento.htm");
    }
    
    
    
}
