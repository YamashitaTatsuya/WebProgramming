<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/shinkistyle.css">
<title>Insert title here</title>
</head>
<body>


<div class="header">
<p class="namename">ユーザー名さん</p>
<a href="LogoutServlet" class="logout">ログアウト</a>
</div>



<h1 class="hello">ユーザー新規登録</h1>
	<form class="form-signin" action="UserNewCreateServlet" method="post">
	<div class="loginid">
	<p class="login">ログインID</p>
	<input type="text" name="loginId" class="botan1">
	</div>

	<div class="passwordid">
	<p class="password">パスワード</p>
	<input type="text" name="password" class="botan2">
	</div>

	<div class="passwordid2">
	<p class="password2">パスワード（確認）</p>
	<input type="text" name="password" class="botan3">
	</div>

	<div class="username">
	<p class="user">ユーザー名</p>
	<input type="text" name="name" class="botan4">
	</div>

	<div class="seinengappi">
	<p class="seinen">生年月日</p>
	<input type="text" name="birthDate" class="botan5">
	</div>

	<input type="hidden" value="<%= System.currentTimeMillis() %>">



	<input type="submit" value="登録" class="tourokubotan">
	</form>

	<a href="UserListServlet" class="modoru">戻る</a>

</body>
</html>