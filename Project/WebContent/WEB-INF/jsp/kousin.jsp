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
<a href="LogoutServlet" class="logout">ログアウト</a>
</div>



<h1 class="hello">ユーザー情報更新</h1>

	<c:if test="${errMsg != null}" >
	    <div class="alert alert-danger" role="alert">
		  ${errMsg}
		</div>
	</c:if>

	<div class="loginid">
	<p class="login">ログインID</p>
	<p class="id">${kouuser.loginId}</p>
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
	<input type="text" name="名前" class="botan4" placeholder="${kouuser.name}" >
	</div>

	<div class="seinengappi">
	<p class="seinen">生年月日</p>
	<input type="text" name="名前" class="botan5" placeholder="${kouuser.birthDate}" >
	</div>

	<form class="form-signin" action="UserListServlet" method="post">
	<input type="submit" value="更新" class="tourokubotan">
	</form>

	<a href="UserListServlet" class="modoru">戻る</a>

</body>
</html>