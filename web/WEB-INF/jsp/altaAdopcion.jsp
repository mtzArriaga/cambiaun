<%-- 
    Document   : altaAdopcion
    Created on : 21/03/2021, 08:09:08 AM
    Author     : PC7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="img/logo.ico">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ingresar Adopciones</title>
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
        
        
        
        <div class="container mt-5 col-lg-5">
            <div class="card boarder-info">
                
                <img src="img/backgroundAdop.png">
                <div class="card-header bg-warning">
                    <h3>Ingresa los datos de la adopción</h3>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Id Adopción: </label>
                        <input type="number" name="idAdopcion" class="form-control" required="true">
                        <label>Nombre del adoptante: </label>
                        <input type="text" name="nombreAdoptador" class="form-control" required="true">
                        <label>Direccion del adoptante: </label>
                        <input type="text" name="direccionAdoptador" class="form-control" required="true">
                        <label>Telefono del adoptante: </label>
                        <input type="text" name="telefonoAdoptador" class="form-control" required="true">
                        <label>Fecha de adopción: </label>
                        <input type="text" name="fechaAdopcion" class="form-control" required="true">
                        <label>Ocupación del adoptante: </label>
                        <input type="text" name="ocupacion" class="form-control" required="true">
                        <label>ID del animal: </label>
                        <input type="number" name="idanimal" class="form-control" required="true">                        
                        <button type="submit" class="btn btn-warning"> Agregar </button>
                        <a href="index.htm" class="btn btn-warning">Regresar</a>
                        
                    </form>
                </div>
            </div>
        </div> 
        
        
    </body>
</html>