<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>State Capitals</title>
</head>
<body>
 <form action="validate" method="POST">
 <h3>What is the capital of <%=request.getAttribute("STATE")%> ?  <input type="text" required="true" name="answer"/><input type="submit" value="Submit"/></h3>
 </form>
 
</body>
</html>