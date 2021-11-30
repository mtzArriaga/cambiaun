<%-- 
    Document   : editarDonaciones
    Created on : 21/03/2021, 03:56:17 AM
    Author     : PC7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="img/logo.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Editar Donaciones</title>
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
        
        
        <div class="container mt-4 col-lg-4">
            <div class="card border-warning">
                <img src="img/backgroundDon.png">
                <div class="card-header bg-warning">
                    <h4>Actualizar registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>nombre del donador:</label>
                        <input type="text" name="nombreDonador" class="form-control" value="${lista[0].nombreDonador}" required="true">
                        <label>Telefono:</label>
                        <input type="text" name="telefonoDonador" class="form-control" value="${lista[0].telefonoDonador}" required="true">
                        <label>Email:</label>
                        <input type="text" name="emailDonador" class="form-control" value="${lista[0].emailDonador}" required="true">
                        <label>Monto:</label>
                        <input type="number" name="montoDonacion" class="form-control" value="${lista[0].montoDonacion}" required="true">
                        <label>Fecha de la donación:</label>
                        <input type="text" name="fechaDonacion" class="form-control" value="${lista[0].fechaDonacion}" required="true">
                        <label>Dirección del donador:</label>
                        <input type="text" name="direccionDonador" class="form-control" value="${lista[0].direccionDonador}" required="true">
                        <label>Dirección de la factura:</label>
                        <input type="text" name="direccionFactura" class="form-control" value="${lista[0].direccionFactura}" required="true">
                        <label>Cuenta Bancaría:</label>
                        <input type="text" name="cuentaBancaria" class="form-control" value="${lista[0].cuentaBancaria}" required="true">
                        <label>ID de la sucursal:</label>
                        <input type="text" name="idsucursal" class="form-control" value="${lista[0].idsucursal}" required="true">
                        <input type="submit" value="Actualizar" class="btn btn-warning">
                        <a href="listadonaciones.htm" class="btn btn-warning">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
        
        
    </body>
</html>
