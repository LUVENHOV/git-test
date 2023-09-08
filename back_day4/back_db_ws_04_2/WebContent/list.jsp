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
#movie-list {
	border-collapse: collapse;
	width: 100%;
}

#movie-list td, #movie-list th {
	border: 1px solid black;
}
</style>
</head>
<body>
	<h1>영화 목록 목록</h1>
	<!-- c:___태그를 사용해서 빈칸을 작성해보자 -->
	<!-- carCount 값이 존재 한다면 -->
	<c:if test="${not empty movieCount}">
		<h2>지금까지 등록한 영화 수 : ${movieCount}</h2>
	</c:if>
	<table id="movie-list">
		<thead>
			<tr>
				<th>번호</th>
				<th>영화제목</th>
				<th>감독</th>
				<th>장르</th>
				<th>상영 시간</th>
			</tr>
		</thead>
		<tbody>
			<%-- request 영역에 cars로 등록된 자료를 반복문을 이용해 출력한다.--%>
			<!-- c:______태그를 사용해서 반복문을 이용해보자 -->
			<!-- 빈칸이 값 1개를 의미하는게 아닐 수도 있음을 유의한다. -->
			<c:forEach var="movie" items="${movies}" varStatus="status">
				<tr>
					<!-- th를 참고하여 아래의 내용을 작성하라 -->
					<td>${status.count}</td>
					<td>${movie.title}</td>
					<td>${movie.director}</td>
					<td>${movie.genre}</td>
					<td>${movie.runningTime}분</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="regist.jsp">추가등록</a>
</body>
</html>