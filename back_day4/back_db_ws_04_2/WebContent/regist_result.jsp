<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- jstl의 core 라이브러리를 사용하기 위해 taglib를 이용한다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록 결과</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	border: 1px solid black;
}

th:nth-child(1) {
	width: 130px;
}
</style>
</head>
<body>
	<h1>영화 등록 결과</h1>
	<!-- c:___태그를 사용해서 빈칸을 작성해보자 -->
	<c:if test="${not empty movieCount}">
		<h2>지금까지 등록한 영화 수 : ${movieCount}</h2>
	</c:if>
	<h2>등록된 영화 정보</h2>
	<%-- c:___ 태그를 이용해 request 영역에 car가 있다면 내용을 출력한다. --%>
	<c:if test="${not empty movieCount }">
		<table>
			<thead>
				<tr>
					<th>항목</th>
					<th>내용</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>영화 제목</td>
					<td>${movie.title}</td>
				</tr>
				<tr>
					<td>감독</td>
					<td>${movie.director}</td>
				</tr>
				<tr>
					<td>장르</td>
					<td>${movie.genre}</td>
				</tr>
				<tr>
					<td>상영 시간</td>
					<td>${movie.runningTime}</td>
				</tr>
			</tbody>
		</table>
	</c:if>
	<%-- c:______ 태그를 이용해 request 영역에 car가 없다면 정보가 없음을 출력한다. --%>
	<c:if test="${empty movieCount }">
		<p>등록된 영화가 없습니다.</p>
	</c:if>
	<!-- 다시 자동차를 등록할 수 있는 링크를 제공한다. -->
	<a href="regist.jsp">추가등록</a>
	<a href="./main?action=list">영화 목록</a>
</body>
</html>