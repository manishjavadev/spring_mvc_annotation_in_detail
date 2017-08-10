<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<a class="navbar-brand" href="#">Java Development Blog</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
		<h1>${title}</h1>
		<p>
			<c:if test="${not empty name}">
			Hello ${name}
		</c:if>

			<c:if test="${empty name}">
			Lets learn URI data and Query String
		</c:if>
		</p>
		<p>
			<a class="btn btn-primary btn-lg" href="helloController/url1/Divya"
				role="button">@PathVariable Example</a> <a
				class="btn btn-primary btn-lg"
				href="helloController/url2?uname=Divya&password=543432"
				role="button">@RequestParam Example</a> <a
				class="btn btn-primary btn-lg"
				href="helloController/url3/srivastava?uname=Divya&password=543432"
				role="button">@PathVariable And @RequestParam Example</a>
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