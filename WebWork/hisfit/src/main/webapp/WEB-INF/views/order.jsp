<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<div>
			<jsp:include page="publicDiv/subTitle.jsp"></jsp:include>
		</div>
		<br>
		<ul class="nav nav-tabs fontSize">
			<li class="active"><a data-toggle="tab" href="#domestic">주문내역조회(0)</a></li>
			<li><a data-toggle="tab" href="#overseas">취소/반품/교환 내역(0)</a></li>
		</ul>
		<div class="tab-content">
			<div id="orderList" class="tab-pane fade in active">
				<jsp:include page="order/orderList.jsp"></jsp:include>
			</div>
			<div id="cancelList" class="tab-pane fade">
				<jsp:include page="order/cancelList.jsp"></jsp:include>
			</div>
		</div>
	</div>
</body>

<jsp:include page="publicDiv/footer.jsp"></jsp:include>
<script>
$('#after').bootstrapNumber();
</script>
</html>