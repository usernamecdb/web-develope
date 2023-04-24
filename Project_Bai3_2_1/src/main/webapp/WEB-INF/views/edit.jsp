<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="F" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IStudent edit</title>
</head>
<body>
	<F:form action="update.html" method="post" modelAttribute="student">
    Họ và tên<F:input path="name"/>
    <br>Điểm<F:input path="mark"/>
    <br>Môn học<F:select path="major" items="${mj}"/>
    <input type="submit" name="Cập nhật"/>
	</F:form>
</body>
</html>