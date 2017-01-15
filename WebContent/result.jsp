<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>State Capitals</title>
<script>

  function redirect(){
  
  window.location.href="/quiz/home";
  }
</script>
</head>
<body>

<h3><%=request.getAttribute("result")%></h3><input type="button" onClick="javascript:redirect();" value="next"/>

</body>
</html>