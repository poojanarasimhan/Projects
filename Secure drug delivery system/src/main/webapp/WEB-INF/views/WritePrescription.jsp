<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
    history.forward();
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Write Prescription</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<style>
.danger {
	color: grey;
}
</style>
<script src="https://code.jquery.com/jquery-2.2.3.js"></script>
</head>

<body>

	<c:if test="${(user.name != null) && (user.type == 'Doctor')}">
		<div class="jumbotron">
			<h2 class="text-center">Hospital Management System</h2>
		</div>

		<c:url value="/logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<!-- Data Toogle Navbar -->
		<div class="container-fluid navigation-header">
			<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="homepage2.htm">HOME</a>
				</div>

				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav navbar-right">
						<li id="logOut"><a href="homepage2.htm"><span
								class="glyphicon glyphicon-user"></span>${user.name}</a></li>
						<li id="logOut"><a href="javascript:formSubmit()"><span
								class="glyphicon glyphicon-log-out"></span> Logout</a></li>

					</ul>

				</div>
			</div>
			</nav>
		</div>
		<div class="container">
			<form action="pres.htm" method="GET">
				<input type="text" class="form-control" value="${patient}"
					name="patient1000" readonly />
				<div id="medicinesDiv">
					<div class="row medDiv">
						<div class="col-md-4">
							<select name="medicines" class="form-control">
								<c:forEach var="med" items="${medicine}">
									<option value="${med.medName}"><c:out
											value="${med.medName}"></c:out></option>
								</c:forEach>
							</select>
						</div>
						<div class="col-md-4">
							<input type="number" class="form-control" name="medQuantity"
								value="" />
						</div>

					</div>
				</div>
				<div class="col-md-4">
					<button type="button" class="btn btn-primary" id="add">Add</button>
				</div>

				<input type="submit" class="form-control" value="Submit" />
			</form>
		</div>
		<script>
			$("#add").click(function() {
				var $d = $('.medDiv').clone();
				($d).attr('class', 'xxx row');
				$('#medicinesDiv').append($d);
			});
		</script>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
	</c:if>
	<c:if test="${user.name == null}">
		<p>PLEASE LOGIN TO CONTINUE</p>
		<a href="login.htm">CLICK HERE TO LOGIN</a>
	</c:if>
</html>