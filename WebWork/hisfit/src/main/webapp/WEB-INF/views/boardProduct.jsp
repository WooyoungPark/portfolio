<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet"
	href="resources/bootstrap/css/bootstrap-theme.min.css">
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
<script src="resources/bootstrap/js/bootstrap-number-input.js"></script>
<script src="resources/JavaScript/equipment.js"></script>

</head>
<body>
	<jsp:include page="publicDiv/menuBar.jsp"></jsp:include>
	<div class="container">
		<div>
			<jsp:include page="publicDiv/subTitle.jsp"></jsp:include>
		</div>
		<br>
		<table class="notice">
			<thead>
				<tr>
					<th class="no textCenter">NO.</th>
					<th class="img textCenter">PRODUCT</th>
					<th class="title textCenter">SUBJECT</th>
					<th class="writer textCenter">NAME</th>
					<th class="date textCenter">DATE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${boardList}" var="boardItem">
				<tr>
					<td class="no textCenter">${boardItem.nIndex}</td>
					<td class="img textCenter"><img src='${boardItem.strPath}'></td>
					<td class="title2">${boardItem.strName}<br>${boardItem.strTitle}</td>
					<td class="writer textCenter">${boardItem.strAuth}</td>
					<td class="date textCenter">${boardItem.strDate}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<sec:authorize ifAnyGranted="ROLE_ADMIN">
			<button class="pull-right writeBtn">쓰기</button>
		</sec:authorize>
		<div class="cartListDiv alignCenter">
			<nav aria-label="Page navigation example">
				<ul class="pagination">
					<li class="page-item">
						<a class="page-link" href="#" aria-label="Previous"> 
							<span aria-hidden="true">&laquo;</span>
							<span class="sr-only">Previous</span>
						</a>
					</li>
					<li class="page-item"><a class="page-link" href="#">1</a></li>
					<li class="page-item"><a class="page-link" href="#">2</a></li>
					<li class="page-item"><a class="page-link" href="#">3</a></li>
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
							class="sr-only">Next</span>
					</a></li>
				</ul>
			</nav>
		</div>	
		<div class="search">
			<form action="board">
				<select name="term">
					<option value="0">일주일</option>
					<option value="0">한달</option>
					<option value="0">세달</option>
					<option value="0">전체</option>
				</select>
				<select name="option">
					<option value="0">제목</option>
					<option value="0">내용</option>
					<option value="0">글쓴이</option>
					<option value="0">아이디</option>
					<option value="0">별명</option>
				</select>
				<input type="text" name = "keyword" size="20">
				<button>검색</button>
			</form>
		</div>
	</div>
</body>

<jsp:include page="publicDiv/footer.jsp"></jsp:include>
</html>