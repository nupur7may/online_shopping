<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- include JSP standard tag library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Adding a spring tag library -->
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- Creating images using spring:url element for variable names: css,js,images, which are in the assets folder -->
<spring:url var="css" value="/resources/css" />
<!-- This location comes from the dispatcher servlet, where mapping is specified as resources** -->
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath} }" />



<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online-Shopping -${title}</title>

<script>
	window.menu = '${title}'; // This tittle will be fetched from the pageController, so it will have the value as Home, About US and Contact Us.
	window.contextRoot = '${contextRoot}' // NEW
</script>

<!-- Bootstrap core CSS -->
<!--  <link href="vendor/bootstrap/${css}/bootstrap.min.css"rel="stylesheet">  -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- NEW -->

<!-- Bootstarp readable theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">		<!-- NEW -->
		


		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- Page Content -->
		<!-- Loading Home Content -->
		<!-- This container should load only when the user clicks on Home -->
 		<div class="content">   <!-- NEW -->		
		
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load this only when User clicks About -->

			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load this only when User clicks Contact -->

			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
	 	</div>		
		
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>
		
		<!-- jQuery -->
		<script src="${js}/jquery.js"></script>			<!-- NEW -->

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
		



		<%-- <!-- Bootstrap core JavaScript -->
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/popper/popper.min.js"></script>
		<script src="vendor/bootstrap/${js}/bootstrap.min.js"></script>
		 --%>

		<!-- Self coded javascript , link to your js file -->
		<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>
