<%@page import="Logica.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Logica.controladoraJPA"%>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Administracion de Parque</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">

    <!--datables CSS básico-->
    <link rel="stylesheet" type="text/css" href="vendor/datatables/datatables.min.css"/>
    <!--datables estilo bootstrap 4 CSS-->  
    <link rel="stylesheet"  type="text/css" href="vendor/datatables/DataTables-1.10.18/css/dataTables.bootstrap4.min.css">      
    
</head>

<body id="page-top">

  <!-- Page Wrapper -->
 



<!--INICIO del cont principal---->
<div class="container">
    <h1>Tabla de Empleados:</h1>
    
<div class="container">
        <div class="row">
            <div class="col-lg-12"> 
              <text class="label" >Ingrese el id a borrar</text>
              <input class="input--style-4" type="text" name="ID"</input>
            <button id="btnNuevo" type="button" class="btn btn-success" data-toggle="modal">Borrar</button>    
            </div>    
        </div>    
    </div>    
    <br>  
<div class="container">
        <div class="row">
                <div class="col-lg-12">
                    <div class="table-responsive">        
                        <table id="tablaPersonas" class="table table-striped table-bordered table-condensed" style="width:100%">
                        <thead>
							<tr class="table100-head">
								<th class="column1">Id Empleado</th>
								<th class="column2">Nombre</th>
								<th class="column3">Apellido</th>
								<th class="column4">DNI</th>
                                                                <th class="column7">Direccion</th>
                                                                <th class="column8">Telefono</th>
							</tr>
						</thead>
						<tbody>
						<tr>
                                                                    
                                                        <%
                                                        controladoraJPA control = new controladoraJPA();
                                                            //Controladora 

                                                        List<Empleado> empleados;
                                                        empleados = control.getListaEmpleados();
                                                        for (Empleado emple : empleados)
                                                        {
                                                            %>
                                                            <td class="column1"><%=String.valueOf(emple.getId_persona())%></td>
                                                            <td class="column2"><%=emple.getNombre()%></td>
                                                            <td class="column3"><%=emple.getApellido()%></td>
                                                            <td class="column4"><%=String.valueOf(emple.getDni())%></td>
                                                            <td class="column5"><%=emple.getPuesto()%></td>
                                                            <td class="column8"><%=String.valueOf(emple.getEdad())%></td>
                                                    </tr>
                                                    <% }%>

								
						</tbody>
					</table>
				</div>
			</div>
                                                    
		</div>
    </div>
    
      
<!--Modal para CRUD-->
<div class="modal fade" id="modalCRUD" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel"></h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
            </div>
        <form id="formPersonas">    
            <div class="modal-body">
                <div class="form-group">
                <label for="nombre" class="col-form-label">Nombre:</label>
                <input type="text" class="form-control" id="nombre">
                </div>
                <div class="form-group">
                <label for="pais" class="col-form-label">Apellido:</label>
                <input type="text" class="form-control" id="apellido">
                </div>   
                <div class="form-group">
                <label for="pais" class="col-form-label">Legajo:</label>
                <input type="text" class="form-control" id="legajo">
                </div>  
                <div class="form-group">
                <label for="pais" class="col-form-label">Horario:</label>
                <input type="text" class="form-control" id="horario">
                </div>  
                <div class="form-group">
                <label for="pais" class="col-form-label">Puesto:</label>
                <input type="text" class="form-control" id="puesto">
                </div>  
                <div class="form-group">
                <label for="edad" class="col-form-label">Edad:</label>
                <input type="number" class="form-control" id="edad">
                </div>            
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-light" data-dismiss="modal">Cancelar</button>
                <button type="submit" id="btnGuardar" class="btn btn-dark">Guardar</button>
            </div>
        </form>    
        </div>
    </div>
</div>  
      
    
    
</div>
                                                    
                                                    
    <!-- datatables JS -->
<script type="text/javascript" src="vendor/datatables/datatables.min.js"></script>    
    <!-- código propio JS --> 
<script type="text/javascript" src="main.js"></script>  
    
                    
</body>

</html>
<!--FIN del cont principal-->


