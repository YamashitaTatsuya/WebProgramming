<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/kousinstyle.css">
<title>Insert title here</title>
</head>
<body>


<div class="header">
<p class="namename">ユーザー名さん</p>
<a href="#" class="logout">ログアウト</a>
</div>



<h1 class="hello">ユーザー情報更新</h1>

	<div class="loginid">
	<p class="login">ログインID</p>
	<p class="id">id0001</p>
	</div>

	<div class="passwordid">
	<p class="password">パスワード</p>
	<input type="text" name="名前" class="botan2">
	</div>

	<div class="passwordid2">
	<p class="password2">パスワード（確認）</p>
	<input type="text" name="名前" class="botan3">
	</div>

	<div class="username">
	<p class="user">ユーザー名</p>
	<input type="text" name="名前" class="botan4" placeholder="田中太郎">
	</div>

	<div class="seinengappi">
	<p class="seinen">生年月日</p>
	<input type="text" name="名前" class="botan5" placeholder="1989/04/26" >
	</div>


	<input type="submit" value="更新" class="tourokubotan">

	<a href="alluser.jsp" class="modoru">戻る</a>

</body>
</html>