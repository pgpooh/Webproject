<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>(FORTRIX) WEB STUDY</title>
</head>
<body>
<h1>
	로그인
</h1>
<form action="userlogin.do" method="post">
<input type="hidden" value="login">
<table border="1">
<col width="100"><col width="100">
<tr>
<th>ID</th>
<td><input type="text" name="login_id"></td>
</tr>
<tr>
<th>PW</th>
<td><input type="text" name="login_pw"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="로그인">
<input type="button" value="회원가입" onclick="">
</td>
</tr>


</table>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
