<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Declare + Code + Expression</title>
</head>
<body>
<%! int x=10; int y; int z = 0; %>
<%
	y=200;
	z=x+y;
	out.append("kết quả là: ");
	//out là một đối tượng mặc định, luồng xuất kết quả về cho Client(PrintWriter)
	out.append(String.valueOf(z));
%>
<h2>Hoặc ta có thể xuất kiểu Expression</h2>
<hr>
<%="Kết quả là" %>
<%=z %>

</body>
</html>