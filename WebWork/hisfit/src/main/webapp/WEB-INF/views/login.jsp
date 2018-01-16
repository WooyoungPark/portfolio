<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		<div class="loginForm">
			<span>MEMBER&nbsp;LOGIN</span>
			<form id="normalloginForm" action='<c:url value ="/login"/>'method="post">
				<table>
					<tbody>
						<tr>
							<td colspan="2"><input type="text" name="username"
								placeholder="ID"></td>
						</tr>
						<tr>
							<td colspan="2"><input type="password" name="password"
								placeholder="PASSWORD"> <input type="hidden"
								name="${_csrf.parameterName}" value="${_csrf.token}" /></td>

						</tr>
						<tr>
							<td colspan="2">
								<button class="login" onclick="login()">로그인</button>
							</td>
						</tr>
						<tr>
							<td>
								<button class="sbtn naver">N&nbsp;|&nbsp;&nbsp;&nbsp;네이버&nbsp;로그인&nbsp;</button>
							</td>
							<td>
								<button class="sbtn kakao">K&nbsp;|&nbsp;&nbsp;&nbsp;카카오&nbsp;로그인&nbsp;</button>
							</td>
						</tr>
						<tr>
							<td>
								<button class="sbtn face">F&nbsp;|&nbsp;페이스북&nbsp;로그인</button>
							</td>
						</tr>
						<tr>
							<td><a href="">아이디찾기</a> | <a href="">비밀번호찾기</a></td>
						</tr>
						<tr>
							<td colspan="2">
								<button class="new">회원가입</button>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>

		<div class="loginForm">
			<span>NON-MEMBER&nbsp;LOGIN</span>
			<table>
				<tbody>
					<tr>
						<td colspan="2"><input type="text" id="nonName"
							placeholder="NAME"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="text" id="nonOrderNo"
							placeholder="ORDER NO."></td>
					</tr>
					<tr>
						<td colspan="2"><input type="password" id="nonPWD"
							placeholder="PASSWORD"></td>
					</tr>
					<tr>
						<td colspan="2">
							<button class="new">로그인</button>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
<jsp:include page="publicDiv/footer.jsp"></jsp:include>
</html>