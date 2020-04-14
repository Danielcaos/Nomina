<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Empleado</title>
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
	<div style="width: 500px; margin-left: 550px; margin-top: 25px;">
		<form class="contact_form" method="POST" action="Parametros"
			runat="server">
			<div class="form-group">
				<ul class="list-group">
					<li class="list-group-item">
						<h2>Registrar Empleado</h2> <span class="requiered_notification">*
							Datos requeridos</span>
					<li class="list-group-item"><label for="codigo">Codigo:</label>
						<input class="form-control" type="number" name="codigo" required /></li>
					<li class="list-group-item"><label for="cedula">Cedula:</label>
						<input class="form-control" type="text" name="cedula" required /></li>
					<li class="list-group-item"><label for="nombre">Nombre:</label>
						<input class="form-control" type="text" name="nombre" required /></li>
					<li class="list-group-item"><label for="fechaN">Fecha
							Nacimiento:</label> <input class="form-control" name="fechaN" type="date"
						value="2011-08-19" id="example-date-input" required></li>
					<li class="list-group-item"><label for="fechaI">Fecha
							Ingreso:</label> <input class="form-control" name="fechaI" type="date"
						value="2011-08-19" id="example-date-input" required></li>
					<li class="list-group-item"><label for="fechaR" required>Fecha
							Retiro:</label> <input class="form-control" name="fechaR" type="date"
						value="2011-08-19" id="example-date-input" required></li>
					<br>
				</ul>
				<button type="submit" class="btn btn-primary btn-lg"
					style="width: 150px">Registrar</button>
				<a href="index.jsp" class="btn btn-secondary btn-lg active"
					role="button" aria-pressed="true" style="width: 150px;">Volver</a>
			</div>

		</form>

	</div>
</body>
</html>