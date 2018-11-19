<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/homestyle.css">
<title>Insert title here</title>
</head>
<body>
	<h1 class="hello">ログイン画面</h1>


	<form class="form-signin" action="LoginServlet" method="post">

	<div class="loginid">
	<p class="login">ログインID</p>
	<input type="text" name="inputloginid" class="botan1">
	</div>

	<div class="passwordid">
	<p class="password">パスワード</p>
	<input type="text" name="inputpassword" class="botan2">
	</div>


	<input type="submit" value="ログイン" class="loginbotan">

	</form>

</body>
</html>