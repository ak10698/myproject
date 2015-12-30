<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="include.jsp"></jsp:include>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container" ng-app="translationsModule">
	<div class="panel panel-default">
		<header class="panel-heading">
		</header>
		<section class="panel-body">
			<!-- <cart-info></cart-info> -->
			<div cart-info></div>
			<article class="panel panel-danger panel-body col-sm-3" style="height:500px; overflow: auto;" data-ng-controller="translationsCtrl">
				
			</article>
			<article ng-include="'listConfigurations.jsp'"
				class="panel panel-success panel-body col-md-6">
				
			</article>
		</section>
		<section> 
			
		</section>
		<footer class="well">
			<strong>Copyright &copy; Happiest Minds. All rights reserved 2014-15.</strong>
		</footer>
	</div>
</body>
</html>