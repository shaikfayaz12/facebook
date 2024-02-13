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
String s=(String)request.getAttribute("va");
out.println("page belongs to "+s);
UserBeanFacebook ubf = (UserBeanFacebook)application.getAttribute("uytu");

%>
<form action="up" method="post">
First Name:<input type="text" name="fname" value=<%=ubf.getfName()%>><br><br>
Last Name:<input type="text" name="lname" value=<%=ubf.getlName() %>><br><br>
Gender:<input type="text" name="gd" value=<%=ubf.getGender() %>><br><br>
MobileNumber:<input type="text" name="mno" value=<%=ubf.getMobileNumber() %>><br><br>
EmailId:<input type="text" name="mid"value=<%=ubf.getEmailId() %>><br><br>
<input type="submit" value="UpdateProfile"   maxlength="30">
<a href="LoginSuccess.jsp">Back</a>

</form>

</body>
</html>