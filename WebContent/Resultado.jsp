<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos del Empleado</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container"">
		<form class="contact_form" method="GET" action="Busqueda"
			runat="server">
			<div class="form-group">
				<ul class="list-group">
					<li class="list-group-item">
						<h2>Registrar Empleado</h2> <span class="requiered_notification">*
							Datos requeridos</span>
					<li class="list-group-item"><label for="codigo">Codigo:</label>
						<h3>${codigo}</h3>
					<li class="list-group-item"><label for="cedula">Cedula:</label>
						<h3>${cedula}</h3>
					<li class="list-group-item"><label for="nombre">Nombre:</label>
						<h3>${nombre}</h3>
					<li class="list-group-item"><label for="fechaN">Fecha
							Nacimiento:</label> 
							<h3>${fechaN}</h3></li>
					<li class="list-group-item"><label for="fechaI">Fecha
							Ingreso:</label>
							<h3>${fechaI}</h3></li>
					<li class="list-group-item"><label for="fechaR" required>Fecha
							Retiro:</label>
							<h3>${fechaR}</h3></li>
					<br>
				</ul>
				<a href="index.jsp" class="btn btn-danger btn-lg active"
					role="button" aria-pressed="true" style="width: 150px;">Volver</a>
			</div>
		</form>
	</div>
</body>
</html>