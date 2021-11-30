<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="icon" href="img/logo.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Cambia Un Destino</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link href="img/style.css" rel="stylesheet">
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
                            <a class="nav-link" href="#sucursales">Sucursales</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#donaciones">Donaciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#empleados">Empleados</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#animales">Animales</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#adopcion">Adopciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#seguimiento">Seguimientos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#listanegra">Lista negra</a>
                        </li>
                    </ul>
                </div>
            </div>        
        </nav>
    <!--- Image Slider -->
    
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="sucursales" class="carousel-item active" >
                <img src="img/backgroundSu.png">
                <div class="carousel-caption">
                    <h1 class="display-2">SUCURSALES</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaSucursal.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listasucursal.htm" class="btn btn-outline-light btn-lg">Lista</a>                                      
                </div>
            </div>
        </div>
    </div>
    
     <hr class="my-4">
    <figure>
        <div class="fixed-wrap">
            <div id="fixed">                
            </div>
        </div>
    </figure>
    
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="donaciones" class="carousel-item active" >
                <img src="img/backgroundDon.png">
                <div class="carousel-caption">
                    <h1 class="display-2">DONACIONES</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaDonaciones.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listadonaciones.htm" class="btn btn-outline-light btn-lg">Lista</a>                    
                </div>
            </div>
        </div>
    </div>
    
    
    <hr class="my-4">
    <figure>
        <div class="fixed-wrap">
            <div id="fixed">                
            </div>
        </div>
    </figure>
    
    
    
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="empleados" class="carousel-item active" >
                <img src="img/backgroundEmp.png">
                <div class="carousel-caption">
                    <h1 class="display-2">EMPLEADOS</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaEmpleado.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listaempleado.htm" class="btn btn-outline-light btn-lg">Lista</a>                    
                </div>
            </div>
        </div>
    </div>
    
     <hr class="my-4">
    <figure>
        <div class="fixed-wrap">
            <div id="fixed">                
            </div>
        </div>
    </figure>
    
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="animales" class="carousel-item active" >
                <img src="img/backgroundSuc.png">
                <div class="carousel-caption">
                    <h1 class="display-2">ANIMALES</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaAnimal.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listaanimal.htm" class="btn btn-outline-light btn-lg">Lista</a>                    
                </div>
            </div>
        </div>
    </div>
    
     <hr class="my-4">
    <figure>
        <div class="fixed-wrap">
            <div id="fixed">                
            </div>
        </div>
    </figure>
    
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="adopcion" class="carousel-item active" >
                <img src="img/backgroundAdop.png">
                <div class="carousel-caption">
                    <h1 class="display-2">ADOPCIÓN</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaAdopcion.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listaadopcion.htm" class="btn btn-outline-light btn-lg">Lista</a>                    
                </div>
            </div>
        </div>
    </div>
    
     
      <hr class="my-4">
    <figure>
        <div class="fixed-wrap">
            <div id="fixed">                
            </div>
        </div>
    </figure>
     
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="seguimiento" class="carousel-item active" >
                <img src="img/backgroundSeg.png">
                <div class="carousel-caption">
                    <h1 class="display-2">SEGUIMIENTO</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaSeguimiento.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listaseguimiento.htm" class="btn btn-outline-light btn-lg">Lista</a>                    
                </div>
            </div>
        </div>
    </div>
    
       <hr class="my-4">
    <figure>
        <div class="fixed-wrap">
            <div id="fixed">                
            </div>
        </div>
    </figure>
      
      
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>                                    
        </ul>
        <div class="carousel-inner">
            <div id="listanegra" class="carousel-item active" >
                <img src="img/backgroundBl.png">
                <div class="carousel-caption">
                    <h1 class="display-2">LISTA NEGRA</h1>
                    <h3>CAMBIA UN DESTINO</h3>
                    <a href="altaBlacklist.htm" class="btn btn-primary btn-lg">Ingresar</a>
                    <a href="listablacklist.htm" class="btn btn-outline-light btn-lg">Lista</a>                    
                </div>
            </div>
        </div>
    </div>
    
       <footer>
           <div class="container-fluid padding">
               <div class="row text-center">
                   <div class="col-md-4">
                       <img src="img/logo.png">
                       <hr class="light">
                       <p>Cambia Un Destino</p>
                       <p>Empresa Ficticia</p>
                       <p>CambiaUn@gmail.com</p>
                       <p>México, Edo. México</p>
                       <p>55-98512564</p>                       
                   </div>
                   <div class="col-md-4">
                                           
                       
                   </div>
                   <div class="col-md-4">
                       <hr class="light">
                       <h5>INTEGRANTES</h5>
                       <hr class="light">                       
                       <p>Llanos Gomez Alfredo</p>
                       <p>Martínez Arriaga Jesús Alberto</p>
                       <p>Moya Valdes David Jaciel</p>
                       <p>Palomares Velasco Jaime</p>
                       <p>Usan Fernández Enrique</p>
                   </div>
                   <div class="col-12">
                       <hr class="light1">
                       <h5>&copy; CambiaUnDestino.com</h5>
                   </div>
               </div>
           </div>
                
       </footer>
    
    </body>
</html>
