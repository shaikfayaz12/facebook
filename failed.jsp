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
String m=(String)request.getAttribute("msg");
out.println(m);
%>
<jsp:include page="login.html"></jsp:include>
</body>
</html>