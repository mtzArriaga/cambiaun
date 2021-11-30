/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.conexionBD;
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
public class controladorEmpleado {
    //Instancia 
    conexionBD con = new conexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView modelAndView = new ModelAndView(); //Importar la de servlet       
    
    //METODO PARA LA VISTA DE AGREGAR
    @RequestMapping(value = "altaEmpleado.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregar(){
        modelAndView.addObject(new Empleado());
        modelAndView.setViewName("altaEmpleado");
        return modelAndView;
    }
    
    //METODO PARA AGREGAR
    @RequestMapping(value = "altaEmpleado.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Empleado e){
        String sql = "insert into empleado(idEmpleado, nombreEmpleado, apellidoPaterno, apellidoMaterno, fechaNacimiento, direccionEmpleado, telefonoEmpleado, sueldoEmpleado, emailEmpleado, puestoEmpleado, idsucursal) values(?,?,?,?,?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, e.getIdEmpleado(), e.getNombreEmpleado(), e.getApellidoPaterno(), e.getApellidoMaterno(), e.getFechaNacimiento(), e.getDireccionEmpleado(), e.getTelefonoEmpleado(), e.getSueldoEmpleado(), e.getEmailEmpleado(), e.getPuestoEmpleado(), e.getIdsucursal());
        return new ModelAndView("redirect:/altaEmpleado.htm");
        
    }
    
    
    int idEmpleado;
    List datos;
    //Metodo para listar
    @RequestMapping("listaempleado.htm")   
    public ModelAndView Listar(){
        String sql="select * from empleado";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listaempleado");
        return modelAndView;
    }
    
    //Metodo para vista del formulario editar
    @RequestMapping(value = "editarEmpleado.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
        String sql = "select * from empleado where idEmpleado="+idEmpleado;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarEmpleado");
        return modelAndView;
    }
    
    //Metodo para editar
    @RequestMapping(value = "editarEmpleado.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Empleado e){
        String sql = "update empleado set nombreEmpleado=?, apellidoPaterno=?, apellidoMaterno=?, fechaNacimiento=?, direccionEmpleado=?, telefonoEmpleado=?, sueldoEmpleado=?, emailEmpleado=?, puestoEmpleado=?, idsucursal=? where idEmpleado=?";
        this.jdbcTemplate.update(sql, e.getNombreEmpleado(), e.getApellidoPaterno(), e.getApellidoMaterno(), e.getFechaNacimiento(), e.getDireccionEmpleado(), e.getTelefonoEmpleado(), e.getSueldoEmpleado(), e.getEmailEmpleado(), e.getPuestoEmpleado(), e.getIdsucursal(), idEmpleado);
        return new ModelAndView("redirect:/listaempleado.htm");
    }
    
    //Metodo para eliminar
    @RequestMapping(value="eliminarempleado.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
        String sql = "delete from empleado where idEmpleado="+idEmpleado;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listaempleado.htm");
    }
    
    
    
    
    
}
