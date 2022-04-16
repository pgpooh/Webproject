<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
</head>

<body>
<%@ include file="../include/menu.jsp" %>
<form name="form1" method="post">
<h3>Login TEST</h3>
사용자 아이디: ${sessionScope.home.mb_id } <br/>
사용자 이름: ${sessionScope.home.mb_pw }
</form>
</body>
</html>