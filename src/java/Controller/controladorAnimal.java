/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
import entidades.Adopcion;
import entidades.Animal;
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
public class controladorAnimal {
    
    //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaAnimal.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Animal());
        modelAndView.setViewName("altaAnimal");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaAnimal.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Animal a){
        String sql = "insert into animal(idAnimal, animal, vacunas, genero, edadMeses, fechaIngreso, saludAnimal, adoptable, idsucursal) values(?,?,?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, a.getIdAnimal(), a.getAnimal(), a.getVacunas(), a.getGenero(), a.getEdadMeses(), a.getFechaIngreso(), a.getSaludAnimal(), a.getAdoptable(), a.getIdsucursal());
        return new ModelAndView("redirect:/altaAnimal.htm");
        
    }
    
    
    int idAnimal;
    List datos;
    //Metodo para listar
    @RequestMapping("listaanimal.htm")   
    public ModelAndView Listar(){
        String sql="select * from animal";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listaanimal");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarAnimal.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idAnimal = Integer.parseInt(request.getParameter("idAnimal"));
        String sql = "select * from animal where idAnimal="+idAnimal;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarAnimal");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarAnimal.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Animal a){
        String sql = "update animal set animal=?, vacunas=?, genero=?, edadMeses=?, fechaIngreso=?, saludAnimal=?, adoptable=?, idsucursal=? where idAnimal=?";
        this.jdbcTemplate.update(sql, a.getAnimal(), a.getVacunas(), a.getGenero(), a.getEdadMeses(), a.getFechaIngreso(), a.getSaludAnimal(), a.getAdoptable(), a.getIdsucursal(), idAnimal);
        return new ModelAndView("redirect:/listaanimal.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminaranimal.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idAnimal = Integer.parseInt(request.getParameter("idAnimal"));
        String sql = "delete from animal where idAnimal="+idAnimal;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listaanimal.htm");
    }
    
}
