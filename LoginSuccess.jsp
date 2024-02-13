<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.UserBeanFacebook"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserBeanFacebook ubf = (UserBeanFacebook)application.getAttribute("uytu");

out.println("Welcome User : "+ubf.getfName()+"<br>");
%>
<a href="vi">ViewFacebookProfile</a>
<a href="ed">EditProfile</a>
<a href="log">Logout</a>
</body>
</html>