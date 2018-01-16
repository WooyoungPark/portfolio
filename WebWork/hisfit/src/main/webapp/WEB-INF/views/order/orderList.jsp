<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 
<link href="resources/bootstrap/js/bootstrap-datepicker.min.js" rel="stylesheet" /> 
<script src="resources/bootstrap/locales/bootstrap-datepicker.ko.min.js"></script> 
<script src="resources/bootstrap/js/bootstrap-datepicker.min.js"></script>

 -->

<link href="resources/bootstrap/css//bootstrap-datetimepicker.min.css"
	rel="stylesheet" media="screen">
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap-datetimepicker.js"
	charset="UTF-8"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/locales/bootstrap-datetimepicker.ko.js"
	charset="UTF-8"></script>


<!--     <script type="text/javascript" src="resources/bootstrap/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="resources/bootstrap/css/bootstrap-datepicker.css" />
								 -->



<div style="width: 100%; height: 100%; border: 1px solid #DDDDDD; margin-top:40px; margin-bottom:40px;">
	<div style="display: table; margin:10px;">
		<div class="dropdown horizontal">
			<select class="fontSize12" style="height: 27px; width: 100px;">
				<option value="volvo">전체 주문처리상태</option>
				<option value="saab">입금전</option>
				<option value="opel">배송준비중</option>
				<option value="audi">배송중</option>
				<option value="audi">배송완료</option>
				<option value="audi">취소</option>
				<option value="audi">교환</option>
				<option value="audi">반품</option>
			</select>
		</div>

		<div class="btn-group btn-group-toggle horizontal"
			data-toggle="buttons"> 
			<label class="btn active btn-custom" style="font-size: 12px;">
				<input type="radio" name="options" id="option1" autocomplete="off"
				checked> 오늘
			</label> <label class="btn btn-custom" style="font-size: 12px;"> <input
				type="radio" name="options" id="option2" autocomplete="off">
				1주일
			</label> <label class="btn btn-custom" style="font-size: 12px;"> <input
				type="radio" name="options" id="option3" autocomplete="off">
				1개월
			</label> <label class="btn btn-custom" style="font-size: 12px;"> <input
				type="radio" name="options" id="option4" autocomplete="off">
				3개월
			</label> <label class="btn btn-custom" style="font-size: 12px;"> <input
				type="radio" name="options" id="option5" autocomplete="off">
				6개월
			</label>
		</div>


		<div class="form-group horizontal" style="width: 400px;">
			<div style="float: left;"
				class="input-group date form_date col-md-5 horizontal" data-date=""
				data-date-format="yyyy MM dd" data-link-field="dtp_input2"
				data-link-format="yyyy-mm-dd">
				<input class="form-control fontSize8" size="16" type="text"> <span
					class="input-group-addon"><span
					class="glyphicon glyphicon-calendar"></span></span> <input type="hidden"
					id="date_start" value="" />
			</div>
			<span style="float: left;" class="horizontal">~</span>
			<div style="float: left ;"
				class="input-group date form_date col-md-5 horizontal" data-date=""
				data-date-format="yyyy MM dd	" data-link-field="dtp_input2"
				data-link-format="yyyy-mm-dd">
				<input class="form-control fontSize8" size="16" type="text"> <span
					class="input-group-addon"><span
					class="glyphicon glyphicon-calendar"></span></span> <input type="hidden"
					id="date_end" value="" />
			</div>
		</div>
		<button class="btn blackButton"style="width:70px; height:100%; margin-top:5px; padding:0">조회</button>
	</div>
</div>
<span class="fontSize12"> 
	1. 기본적으로 최근 3개월간의 자료가 조회되며, 기간 검색시 지난 주문내역을 조회하실 수 있습니다. <br>
	2. 주문번호를 클릭하시면 해당 주문에 대한 상세내역을 확인하실 수 있습니다.<br><br>
</span>

<table class="table">
	<thead>
		<tr class="fontSize12">
			<th style="width:100px;" class="textAlign-center">주문일자<br>[주문정보]</th>
			<th style="width: 100px;" class="textAlign-center">이미지</th>
			<th style="width: 350px;" class="textAlign-center">상품정보</th>
			<th style="width: 100px;" class="textAlign-center">판매가</th>
			<th style="width: 120px;" class="textAlign-center">수량</th>
			<th style="width: 90px;" class="textAlign-center">상품구매금액</th>
			<th style="width: 90px;" class="textAlign-center">주문처리상태</th>
			<th style="width: 90px;" class="textAlign-center">취소/교환/반품</th>
		</tr>
	</thead>
	<tbody>		
		<c:forEach items = "${orderList}" var="order">
		<tr>
			<td>
				<div class="cartListDiv alignCenter">
					<div class="cartListItem">
						<span class ="">${order.order_date}</span>
						<p>
							<strong><span class="BasicColor">[${order.order_NO}]</span></strong>
					</div>
				</div>
				
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<img name ='img' style="width: 80px" class="fullWidth cartListItem"
						src='${order.IMG_path}'>
				</div>
			</td>
			<td>
				<div class="cartListDiv">
					<div class="cartListItem">
						<span>${order.product_name}</span>
						<p>
							<span class="BasicColor">[옵션: ${order.color}]</span>
					</div>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span name="objPrice" class="cartListItem alignCenter">${order.product_price}원</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<div class="cartListItem">
						<input name="itemCount" class="form-control cartListItem alignCenter"
							style="width: 55px; height: 27px;" type="text" min="1" max="20"
							value="${order.order_quantity }" readonly="readonly"/>
					</div>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span name="objAllPrice" class="cartListItem">${order.orderPrice}원</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span class="cartListItem">배송완료</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<div class="cartListItem ">
						<div class="btn-group-vertical ">
							<button type="button" class="btn blackButton"
								style="font-size: 11px;">취소하기</button>
							<button type="button" class="btn basicButton"
								style="font-size: 11px;">교환하기</button>
							<button type="button" class="btn basicButton"
								style="font-size: 11px;">&nbsp;&nbsp;반품하기&nbsp;&nbsp;</button>
						</div>
					</div>
				</div>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan = "8">
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
					    <li class="page-item">
					      <a class="page-link" href="#" aria-label="Next">
					        <span aria-hidden="true">&raquo;</span>
					        <span class="sr-only">Next</span>
					      </a>
					    </li>
					  </ul>
					</nav>
				</div>
			</td>
		
		
		</tr>
		<tr class="listItemColor">
			<td colspan="8">
					<div class="cartLastRow fullWidth">
						<div class="cartListItem text-center">
								<button class="btn basicButton orderBtn pull-right setPadding">쇼핑계속하기</button>
						</div>
					</div>
			</td>
		</tr>
	</tbody>
</table>
<script type="text/javascript">
	$('.form_date').datetimepicker({
		language : 'ko',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		minView : 2,
		forceParse : 0
	});
</script>