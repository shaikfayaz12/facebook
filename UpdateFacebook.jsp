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

String u=(String)request.getAttribute("up");
out.println(u+"<br>");
%>
<a href="vi">ViewFacebookProfile</a>
<a href="ed">EditProfile</a>
<a href="log">Logout</a>
</body>
</html>