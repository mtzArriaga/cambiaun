<%-- 
    Document   : listaempleado
    Created on : 21/03/2021, 04:25:00 AM
    Author     : PC7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="img/logo.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Lista Empleados</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link href="style.css" rel="stylesheet">
	<link rel="stylesheet" href="https://m.w3newbie.com/you-tube.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    </head>
    <body>
        
        <nav class="navbar navbar-expand-md navbar-light bg-warning sticky-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.htm"><img src="img/logo.png"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.htm#sucursales">Sucursales</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.htm#donaciones">Donaciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.htm#empleados">Empleados</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.htm#animales">Animales</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.htm#adopcion">Adopciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.htm#seguimiento">Seguimientos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.htm#listanegra">Lista negra</a>
                        </li>
                    </ul>
                </div>
            </div>        
        </nav>
        
        
        
        <div class="container mt-4">
            <div class="card border-info">
                <img src="img/backgroundEmp.png">
                <div class="card-header bg-warning text-white">
                    <h4>Lista de empleados</h4>
                    <div style="float: right">
                        <a class="btn btn-outline-dark" href="index.htm">Regresar</a>
                    </div>
                </div>
                <div class="card-body">
                    <h2>Busqueda</h2>
                    <p>Ingrese el elemento que desea filtrar</p>  
                    <input class="form-control" id="myInput" type="text" placeholder="Buscar..">
                    <br>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>                                
                                <th>Apellido Paterno</th>
                                <th>Apellido Materno</th>
                                <th>Fecha de nacimiento</th>
                                <th>Dirección</th>
                                <th>Telefono</th>
                                <th>Sueldo</th>
                                <th>Email</th>
                                <th>Puesto</th>
                                <th>ID sucursal</th>
                            </tr>
                        </thead>
                        <tbody id="myTable">
                            <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td>${dato.idEmpleado}</td>
                                    <td>${dato.nombreEmpleado}</td>
                                    <td>${dato.apellidoPaterno}</td>
                                    <td>${dato.apellidoMaterno}</td>
                                    <td>${dato.fechaNacimiento}</td>
                                    <td>${dato.direccionEmpleado}</td>
                                    <td>${dato.telefonoEmpleado}</td>
                                    <td>${dato.sueldoEmpleado}</td>
                                    <td>${dato.emailEmpleado}</td>
                                    <td>${dato.puestoEmpleado}</td>
                                    <td>${dato.idsucursal}</td>
                                    <td>
                                        <a href="editarEmpleado.htm?idEmpleado=${dato.idEmpleado}"
                                           class="btn btn-warning">Editar</a>
                                        <a href="eliminarempleado.htm?idEmpleado=${dato.idEmpleado}"
                                           class="btn btn-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>            
        </div>
        <script>
            $(document).ready(function () {
                $("#myInput").on("keyup", function () {
                    var value = $(this).val().toLowerCase();
                    $("#myTable tr").filter(function () {
                        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                    });
                });
            });
        </script>
    </body>
</html>
