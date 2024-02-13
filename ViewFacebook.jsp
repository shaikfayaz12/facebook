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
String m=(String)request.getAttribute("fl");
out.println("page belongs to "+m+"<br>"+"<br>");

UserBeanFacebook ubf=(UserBeanFacebook)application.getAttribute("uytu");
out.println("firstname="+ubf.getfName()+"<br>"+"lastname="+ubf.getlName()+"<br>"+"gender="+ubf.getGender()+"<br>"+"username="+ubf.getUserName()+"<br>"+"password="+ubf.getPassword()+"<br>"+"mobile="+ubf.getMobileNumber()+"<br>"+"emailid="+ubf.getEmailId()+"<br>");
%>
<a href="ed">EditProfile</a>
<a href="log">Logout</a>
<a href="LoginSuccess.jsp">Back</a>
</body>
</html>