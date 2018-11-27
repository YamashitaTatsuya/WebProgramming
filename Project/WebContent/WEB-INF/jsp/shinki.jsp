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

	<div class="loginid">
	<p class="login">ログインID</p>
	<input type="text" name="newloginId" class="botan1">
	</div>

	<div class="passwordid">
	<p class="password">パスワード</p>
	<input type="text" name="newpassword" class="botan2">
	</div>

	<div class="passwordid2">
	<p class="password2">パスワード（確認）</p>
	<input type="text" name="newpassword2" class="botan3">
	</div>

	<div class="username">
	<p class="user">ユーザー名</p>
	<input type="text" name="newusername" class="botan4">
	</div>

	<div class="seinengappi">
	<p class="seinen">生年月日</p>
	<input type="text" name="newbirthdate" class="botan5">
	</div>

	<form class="form-signin" action="UserNewCreateServlet" method="post">
	<input type="submit" value="登録" class="tourokubotan">
	</form>

	<a href="UserListServlet" class="modoru">戻る</a>

</body>
</html>