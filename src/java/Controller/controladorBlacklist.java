/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
import entidades.Animal;
import entidades.Blacklist;
import entidades.Empleado;
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
public class controladorBlacklist {
     //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaBlacklist.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Blacklist());
        modelAndView.setViewName("altaBlacklist");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaBlacklist.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Blacklist b){
        String sql = "insert into blacklist(idBlacklist, idadopcion, idseguimiento) values(?,?,?)";
        this.jdbcTemplate.update(sql, b.getIdBlacklist(), b.getIdadopcion(), b.getIdseguimiento());
        return new ModelAndView("redirect:/altaBlacklist.htm");
        
    }
    
    
    int idBlacklist;
    List datos;
    //Metodo para listar
    @RequestMapping("listablacklist.htm")   
    public ModelAndView Listar(){
        String sql="select * from blacklist";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listablacklist");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarBlacklist.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idBlacklist = Integer.parseInt(request.getParameter("idBlacklist"));
        String sql = "select * from blacklist where idBlacklist="+idBlacklist;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarBlacklist");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarBlacklist.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Blacklist b){
        String sql = "update blacklist set idadopcion=?, idseguimiento=? where idBlacklist=?";
        this.jdbcTemplate.update(sql, b.getIdadopcion(), b.getIdseguimiento(), idBlacklist);
        return new ModelAndView("redirect:/listablacklist.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminarblacklist.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idBlacklist = Integer.parseInt(request.getParameter("idBlacklist"));
        String sql = "delete from blacklist where idBlacklist="+idBlacklist;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listablacklist.htm");
    }
}
