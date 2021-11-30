/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
import entidades.Adopcion;
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
public class controladorAdopcion {
    
    //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaAdopcion.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Adopcion());
        modelAndView.setViewName("altaAdopcion");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaAdopcion.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Adopcion a){
        String sql = "insert into adopcion(idAdopcion, nombreAdoptador, direccionAdoptador, telefonoAdoptador, fechaAdopcion, ocupacion, idanimal) values(?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, a.getIdAdopcion(), a.getNombreAdoptador(), a.getDireccionAdoptador(), a.getTelefonoAdoptador(), a.getFechaAdopcion(), a.getOcupacion(), a.getIdanimal());
        return new ModelAndView("redirect:/altaAdopcion.htm");
        
    }
    
    
    int idAdopcion;
    List datos;
    //Metodo para listar
    @RequestMapping("listaadopcion.htm")   
    public ModelAndView Listar(){
        String sql="select * from adopcion";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listaadopcion");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarAdopcion.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idAdopcion = Integer.parseInt(request.getParameter("idAdopcion"));
        String sql = "select * from adopcion where idAdopcion="+idAdopcion;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarAdopcion");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarAdopcion.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Adopcion a){
        String sql = "update adopcion set nombreAdoptador=?, direccionAdoptador=?, telefonoAdoptador=?, fechaAdopcion=?, ocupacion=?, idanimal=? where idAdopcion=?";
        this.jdbcTemplate.update(sql, a.getNombreAdoptador(), a.getDireccionAdoptador(), a.getTelefonoAdoptador(), a.getFechaAdopcion(), a.getOcupacion(), a.getIdanimal(), idAdopcion);
        return new ModelAndView("redirect:/listaadopcion.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminaradopcion.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idAdopcion = Integer.parseInt(request.getParameter("idAdopcion"));
        String sql = "delete from adopcion where idAdopcion="+idAdopcion;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listaadopcion.htm");
    }
    
    
    
}
