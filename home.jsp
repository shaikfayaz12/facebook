<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String s=(String)request.getAttribute("msg");
out.println(s+"<br>");
%>
<jsp:include page="home.html"></jsp:include>
</body>
</html>