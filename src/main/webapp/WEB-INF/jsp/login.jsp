<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name='frm' action='valid' method='POST'>
<table border='5' align='center'>
 <tr><td>username123</td>
 <td><input type='text' name='user' value=''/>
 <h5 style="color:red">${umsg}</h5>
 </td></tr>
 <tr><td>PASSWORD</td>
 <td><input type='text' name='pass' value=''/>
 </td></tr>
 <tr>
 <td colspan='2' align='center'>
 <input type='submit' name='s' value='Login'/>
 </td></tr>
</table>
</form>
</body>
</html>