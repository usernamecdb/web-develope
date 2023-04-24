<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="F" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>svcdvdf</title>
</head>
<body>
	${student.name}
	<F:form action="update.html" method="post" modelAttribute="student">
    	Họ và tên<F:input path="name"/>
    	<br>Điểm<F:input path="mark"/>
    	<br>Môn học<F:select path="major" items="${a}"/>
    <input type="submit" name="Cập nhật"/>
	</F:form>
	
</body>
</html>
    