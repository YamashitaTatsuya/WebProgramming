<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/sakujyo.css">
<title>Insert title here</title>
</head>
<body>

	<div class="header">
	<p class="namename">ユーザー名さん</p>
	<a href="#" class="logout">ログアウト</a>
	</div>


		<h1 class="hello">ユーザー削除確認</h1>

	<div class="sakujyo">
	<p>ログインID:id0001</p>
	<p>を本当に削除してよろしいでしょうか？</p>
	</div>


	<input type="submit" value="キャンセル" class="kyanseru">
	<input type="submit" value="OK" class="ok">


</body>
</html>