<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#domestic">국내배송상품(0)</a></li>
			<li><a data-toggle="tab" href="#overseas">해외배송상품(0)</a></li>
		</ul>

		<div class="tab-content">
			<div id="domestic" class="tab-pane fade in active">
				<jsp:include page="cart/domestic.jsp"></jsp:include>
			</div>
			<div id="overseas" class="tab-pane fade">
				<jsp:include page="cart/overseas.jsp"></jsp:include>
			</div>
		</div>
	</div>
</body>
<jsp:include page="publicDiv/footer.jsp"></jsp:include>

</html>