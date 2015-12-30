<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Translations Configuration</title>
</head>
<body>
<form name="configForm"  action="addConfig" method="POST" >
		<!-- MODULE -->
			<div class="form-group">
				Module:<input type="text" name="module" required class="form-control" />
			</div>
		<!-- KEY -->
			<div class="form-group">
				Key:<input type="text" name="key" required class="form-control" />
			</div>
		<!-- VALUE -->
			<div class="form-group">
				Value:<input type="text" name="value" required class="form-control" />
			</div>
		
			<button class="btn btn-success btn-sm" type="submit"
				ng-disabled="reviewForm.$invalid">Save</button>
		</form>
 	