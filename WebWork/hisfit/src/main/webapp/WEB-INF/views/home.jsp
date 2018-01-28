<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여자가 코디해주는 남자쇼핑몰 히즈핏</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet"
	href="resources/bootstrap/css/bootstrap-theme.min.css">
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="publicDiv/menuBar.jsp"></jsp:include>
	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img src="resources/banner/Banner1.PNG" alt="Banner1">
				</div>
				<div class="item">
					<img src="resources/banner/Banner2.PNG" alt="Banner2">
				</div>
				<div class="item">
					<img src="resources/banner/Banner3.PNG" alt="Banner3">
				</div>
			</div>
			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
		<table class="mainBoard">
			<tr>
				<td>
					<div>
						<span>Notice</span><br>
						<c:forEach items="${listNotice}" var="listNotice">
							<input type="hidden" name="idx" value='${listNotice.nIndex}'>
							<a>${listNotice.strTitle }</a>
							<br>
						</c:forEach>
					</div>
				</td>
				<td>
					<div>
						<span>Event</span><br>
						<c:forEach items="${listEvent}" var="listEvent">
							<input type="hidden" name="idx" value='${listEvent.nIndex}'>
							<a>${listEvent.strTitle }</a>
							<br>
						</c:forEach>
					</div>
				</td>
				<td>
					<div>
						<span>Review</span><br>
						<c:forEach items="${listReview}" var="listReview">
							<input type="hidden" name="idx" value='${listReview.nIndex}'>
							<a>${listReview.strTitle }</a>
							<br>
						</c:forEach>
					</div>
				</td>
				<td><span>Q&A</span><br> <c:forEach items="${listQNA}"
						var="listQNA">
						<input type="hidden" name="idx" value='${listQNA.nIndex}'>
						<a>${listQNA.strTitle }</a>
						<br>
					</c:forEach></td>
			</tr>
		</table>
		<img style="width: 100%; height: auto;"
			src='resources/banner/main.jpg'>
		<jsp:include page="bestItem/bestItem.jsp"></jsp:include>
		<div class="row">
			<c:forEach items="${productList}" var="product">
				<div class="col-xs-4" onclick="detailView(this)" style="margin-bottom: 40px">
					<form name="listItem" action="productDetail">
						<div>
							<img style="width: 100%; height:380px;" class="fullWidth"
								src='${product.img_path}'>
						</div>
						<div class="topMargin">${product.product_name}</div>
						<div class="fullWidth topBorder colorGray"
							style="margin-top: 5px; padding-top: 5px;">
							<span style="font-size: 12px; color: #009ADB">${product.product_price}원</span><br>
							<span style="font-size: 12px;">${product.color} Color /
								${product.size} Size</span><br> <span style="font-size: 12px;">${product.product_subTitle}</span>
						</div>
						<input type="hidden" name="productID"
							value="${product.product_ID}"> <input type="hidden"
							name="category" value="${product.category}">
					</form>
				</div>
			</c:forEach>
		</div>

	</div>
</body>
<jsp:include page="publicDiv/footer.jsp"></jsp:include>
</html>

