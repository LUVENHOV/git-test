<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- jstl의 core 라이브러리를 사용하기 위해 taglib를 이용한다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 영화 관리</title>
<style>
label {
	display: inline-block;
	width: 130px;
}
</style>
</head>
<body>
	<h1>SSAFY 영화 관리</h1>
	<!-- c:___태그를 사용해서 빈칸을 작성해보자 -->
	<c:if test="${not empty movieCount }">
		<h2>지금까지 등록한 영화 수 : ${movieCount}</h2>
	</c:if>
	<form method="post" action="main">
		<fieldset>
			<legend>영화 정보 입력</legend>
			<!-- front-controller pattern에서 요청을 구분하기 위한 parameter -->
			<input type="hidden" name="action" value="regist"> 
			<label for="title">영화 제목</label> 
			<input type="text" id="title" name="title"><br>
			<label for="director">감독</label> 
			<input type="text" id="director" name="director"><br> 
			<label for="genre">장르</label>
			<input type="text" id="genre" name="genre"><br> 
			<label for="runningTime">상영 시간</label> 
			<input type="number" id="runningTime" name="runningTime"><br> 
			<input type="submit" value="등록">
			<input type="reset" value="초기화">
		</fieldset>
	</form>
</body>
</html>