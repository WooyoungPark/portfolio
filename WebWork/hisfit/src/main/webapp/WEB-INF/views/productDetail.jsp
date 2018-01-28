<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
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
</head>
<body>
	<jsp:include page="publicDiv/menuBar.jsp"></jsp:include>
	<div class="container">
		<jsp:include page="publicDiv/subTitle.jsp"></jsp:include>
		<div class="fontSize12 product">
			<table class="space tableCenter">
				<tbody>
					<tr>
						<td style="width: 600px;">
							<div class="tableDiv">
								<img class="tableCenter" alt="product" src="${product.IMG_PATH}">
							</div>
						</td>
						<td style="width: 500px">
							<table class="pull-right" style="margin-bottom:100px;">
								<thead>
									<tr class="head">
										<th colspan="4" style="width:400px;"><img src="resources/product/custom_24.gif"><br>${product.product_name}</th>
									</tr>
								</thead>
								<tbody>
									<tr class="top">
										<td colspan="4">${product.product_subTitle}</td>
									</tr>
									<tr  class="top">
										<td>소비자가</td>
										<td colspan="3">${product.product_price}</td>
									</tr>
									<tr>
										<td>판매가</td>
										<td colspan="3">${product.product_discount}</td>
									</tr>
									<tr class="top">
										<td colspan="2">${product.color} color / ${product.size} size</td>
									</tr>
									<tr class="top">
										<td>> 컬러</td>
										<td colspan="3"><select style="height: 25px;">
												<option value="0">${product.color}</option>
										</select></td>
									</tr>
									<tr class="top">
										<td colspan="4">최소주문수량 1개 이상</td>
									</tr>
									<tr>
										<td colspan="2">상품명</td>
										<td colspan="1">수량</td>
										<td colspan="1">가격</td>
									</tr>
									<tr class="top">
										<td colspan="2">디테일 롱 패딩<br>-카키
										</td>
										<td><input type="number" value="1"></td>
										<td>78000원</td>
									</tr>
									<tr class="top">
										<td colspan="4">TOTAL: <span>78000원 </span> (1개)
										</td>
									</tr>
									<tr class="top">
										<td colspan="4">
											<button class='btn order'>바로구매</button>
											<button class='btn option'>장바구니</button>
											<button class='btn option'>관심상품</button>
										</td>
									</tr>
									<tr>
										<td colspan="2">SNS LINK&nbsp;&nbsp;<img class="sns" src="resources/product/sns1.gif"> <img class="sns" src="resources/product/sns2.gif"></td>
										<td colspan="2">
											<div class="pull-right">
												<button class="request">REVIEW 0</button>
												<button class="request">Q & A 0</button>
												<button class="request">MAIL</button>
											</div>
										</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr class="top">
						<td colspan="2">
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="tableDiv">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/0start.jpg">			
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (1)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (2)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (3)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (4)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (5)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (6)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (7)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (8)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (9)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (10)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (11)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (12)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (13)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (14)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (15)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (16)_shop1.jpg">
				<img style="display: block; margin-left: auto; margin-right:auto;"alt="" src="resources/product/Detail Long Padding (17)_shop1.jpg">
		</div>
	</div>
</body>
<jsp:include page="publicDiv/footer.jsp"></jsp:include>
</html>