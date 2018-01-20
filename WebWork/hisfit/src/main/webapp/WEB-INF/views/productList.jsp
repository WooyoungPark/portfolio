<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet"
	href="resources/bootstrap/css/bootstrap-theme.min.css">
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="publicDiv/menuBar.jsp"></jsp:include>

	<div class="container">
		<div>
			<jsp:include page="publicDiv/subTitle.jsp"></jsp:include>
			<jsp:include page="bestItem/bestItem.jsp"></jsp:include>
			<div class="row">
				<p class="navbar-text margin0">
					Total <strong>4</strong> items
				</p>
				<div class="pull-right" role="group">
					<button type="button"
						class="fontSize10 btn whiteBtn borderTransparent ">
						<span class="fontSize8">신상품</span>
					</button>
					<button type="button" class="btn whiteBtn leftBorder ">
						<span class="fontSize8">상품명</span>
					</button>
					<button type="button" class=" btn whiteBtn leftBorder ">
						<span class="fontSize8">낮은가격</span>
					</button>
					<button type="button" class=" btn whiteBtn leftBorder ">
						<span class="fontSize8">높은가격</span>
					</button>
					<button type="button" class=" btn whiteBtn leftBorder ">
						<span class="fontSize8">제조사</span>
					</button>
					<button type="button" class=" btn whiteBtn leftBorder ">
						<span class="fontSize8">사용후기</span>
					</button>
				</div>
			</div>

			<hr class="margin0">
			<div class="row">
				<c:forEach items = "${productList}" var="product">
					<div class="col-xs-4">
						<div>
							<img style="width: 100%" class="fullWidth"
								src='${product.img_path}'>
						</div>
						<div class="topMargin">Product name</div>
						<div class="fullWidth topBorder colorGray"
							style="margin-top: 5px; padding-top: 5px;">
							<span style="font-size: 12px; color: #009ADB">${product.product_price}원</span><br>
							<span style="font-size: 12px;">${product.color} Color / ${product.size} Size</span><br>
							<span style="font-size: 12px;">${product.product_subTitle}</span>
						</div>
					</div>
				</c:forEach>
<!-- 
				<div class="col-xs-4">
					<div>
						<img style="width: 100%" class="fullWidth"
							src="resources/product/shirts/best2.jpg">
					</div>
					<div class="topMargin">Product name</div>
					<div class="fullWidth topBorder colorGray"
						style="margin-top: 5px; padding-top: 5px;">
						<span style="font-size: 12px; color: #009ADB">39800원</span><br>
						<span style="font-size: 12px;">2&nbsp;Color&nbsp;/&nbsp;1&nbsp;Size</span><br>
						<span style="font-size: 12px;">두마리 토끼. 패딩과 코트의 하모니!!!</span>
					</div>
				</div>

				<div class="col-xs-4">
					<div>
						<img style="width: 100%" class="fullWidth"
							src="resources/product/shirts/best3.jpg">
					</div>
					<div class="topMargin">Product name</div>
					<div class="fullWidth topBorder colorGray"
						style="margin-top: 5px; padding-top: 5px;">
						<span style="font-size: 12px; color: #009ADB">39800원</span><br>
						<span style="font-size: 12px;">2&nbsp;Color&nbsp;/&nbsp;1&nbsp;Size</span><br>
						<span style="font-size: 12px;">두마리 토끼. 패딩과 코트의 하모니!!!</span>
					</div>
				</div>
				<div class="col-xs-4">
					<div>
						<img style="width: 100%" class="fullWidth"
							src="resources/product/shirts/best1.jpg">
					</div>
					<div class="topMargin">Product name</div>
					<div class="fullWidth topBorder colorGray"
						style="margin-top: 5px; padding-top: 5px;">
						<span style="font-size: 12px; color: #009ADB">39800원</span><br>
						<span style="font-size: 12px;">2&nbsp;Color&nbsp;/&nbsp;1&nbsp;Size</span><br>
						<span style="font-size: 12px;">두마리 토끼. 패딩과 코트의 하모니!!!</span>
					</div>
				</div>
				<div class="col-xs-4">
					<div>
						<img style="width: 100%" class="fullWidth"
							src="resources/product/shirts/best1.jpg">
					</div>
					<div class="topMargin">Product name</div>
					<div class="fullWidth topBorder colorGray"
						style="margin-top: 5px; padding-top: 5px;">
						<span style="font-size: 12px; color: #009ADB">39800원</span><br>
						<span style="font-size: 12px;">2&nbsp;Color&nbsp;/&nbsp;1&nbsp;Size</span><br>
						<span style="font-size: 12px;">두마리 토끼. 패딩과 코트의 하모니!!!</span>
					</div>
				</div>
				<div class="col-xs-4">
					<div>
						<img style="width: 100%" class="fullWidth"
							src="resources/product/shirts/best1.jpg">
					</div>
					<div class="topMargin">Product name</div>
					<div class="fullWidth topBorder colorGray"
						style="margin-top: 5px; padding-top: 5px;">
						<span style="font-size: 12px; color: #009ADB">39800원</span><br>
						<span style="font-size: 12px;">2&nbsp;Color&nbsp;/&nbsp;1&nbsp;Size</span><br>
						<span style="font-size: 12px;">두마리 토끼. 패딩과 코트의 하모니!!!</span>
					</div>
				</div>
				<div class="col-xs-4">
					<div>
						<img style="width: 100%" class="fullWidth"
							src="resources/product/shirts/best1.jpg">
					</div>
					<div class="topMargin">Product name</div>
					<div class="fullWidth topBorder colorGray"
						style="margin-top: 5px; padding-top: 5px;">
						<span style="font-size: 12px; color: #009ADB">39800원</span><br>
						<span style="font-size: 12px;">2&nbsp;Color&nbsp;/&nbsp;1&nbsp;Size</span><br>
						<span style="font-size: 12px;">두마리 토끼. 패딩과 코트의 하모니!!!</span>
					</div>
				</div> -->
			</div>
		</div>
	</div>
</body>
<script src="resources/JavaScript/menu/selectBestItem.js"></script>
<script>
	$(document).ready(function() {
		useBestItem("${BestDIV}");
	});
</script>
<jsp:include page="publicDiv/footer.jsp"></jsp:include>

</html>