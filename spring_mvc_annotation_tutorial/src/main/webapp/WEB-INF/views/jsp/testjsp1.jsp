<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring MVC Application</title>

<spring:url value="/resources/css/testjsp.css" var="coreCss" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Spring 3 MVC Project</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
		<h1>${title}</h1>
		<p>
			<c:if test="${not empty name}">
			Welcome ${name}
		</c:if>

			<c:if test="${not empty username}">
			Welcome ${username}
		</c:if>

			<c:if test="${empty username}">
			Welcome user name not Mapped
		</c:if>
		</p>
		<p>
			<a class="btn btn-primary btn-lg" href="Divya" role="button">Learn
				more</a>
		</p>
	</div>
</div>


<spring:url value="/resources/css/testjsp.js" var="coreJs" />
<spring:url value="/resources/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>