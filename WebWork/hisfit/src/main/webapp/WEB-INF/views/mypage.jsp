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
		<div style="display: table; width: 100%">
			<div
				style="width: 130px; border: 1px solid #DDDDDD; padding: 5px; display: table-cell;"
				class="alignCenter">
				<img class="fullWidth"
					src="resources/user/ico_membership_default.png">
			</div>
			<div class="myPageRow">
				<div class="myPageName">
					<span>USER[&nbsp;]</span>
				</div>
				<div style="display: table;" class="fontSize12">
					<div class="myPageDiv-sideBorderNone alignCenter">
						<span>회원등급</span><br> <strong><span>family</span></strong>
					</div>
					<div class="myPageDiv-center alignCenter">
						<span>적립금</span><br> <strong><span>0원</span></strong>
					</div>
					<div class="myPageDiv-center alignCenter">
						<span>쿠폰</span><br> <strong><span>1장</span></strong>
					</div>
					<div class="myPageDiv-center alignCenter">
						<span>구매건수</span><br> <strong><span>0</span></strong>
					</div>
				</div>
				<div class="btn-group fontSize8" style="margin-top: 8px;">
					<button class="btn grayButton optionButton"
						style="font-size: 11px; margin-right: 3px;" id="btnModify">프로필 수정</button>
					<button class="btn grayButton optionButton"
						style="font-size: 11px; margin-right: 3px;">배송주소록 관리</button>
				</div>
			</div>
			<br>

		</div>
		<div class="fontSize12 myPage-Rank">
			<div class="tableCenter" style="width: 200px; height: 70px;">
				<div class="alignCenter myPage-Rank-info">
					<div class="tableCenter">
						<span>회원님의 혜택정보</span>
					</div>
				</div>
			</div>
			<div class="tableCenter">
				<span>Family 등급은 다음과 같은 추가혜택이 있습니다.</span>
			</div>
		</div>
		<br> <br> <span>Mileage Point</span>
		<div class="fontSize12 myPage-details">
			<table class="detailsTable tableCenter">
				<tbody>
					<tr>
						<td style="border-right: 1px solid #DDDDDD">
							<table>
								<tbody>
									<tr>
										<td style="width: 420px;"><strong>가용적립금</strong></td>
										<td style="width: 55px; text-align: right;"><strong>100000원</strong></td>
										<td>
											<button class="btn optionButton pull-left"
												style="font-size: 8px;">조회</button>
										</td>
									</tr>
									<tr>
										<td><strong>사용적립금</strong></td>
										<td style="text-align: right;"><strong>0원</strong></td>

									</tr>
									<tr>
										<td><strong>쿠폰</strong></td>
										<td style="text-align: right;"><strong>1개</strong></td>
										<td>
											<button class="btn grayButton optionButton pull-let"
												style="font-size: 8px;">조회</button>
										</td>
									</tr>
								</tbody>
							</table>
						</td>
						<td>
							<table class="detailsTable">
								<tbody>
									<tr>
										<td style="width: 420px;"><strong>총적립금</strong></td>
										<td style="width: 55px; text-align: right;"><strong>0원</strong></td>

									</tr>
									<tr>
										<td><strong>총주문</strong></td>
										<td style="text-align: right;"><strong>0(0회)</strong></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<br> <br>
		<table class="table">
			<thead>
				<tr class="fontSize12">
					<th style="width: 100px;" class="textAlign-center">주문일자</th>
					<th style="width: 100px;" class="textAlign-center">주문정보</th>
					<th style="width: 100px;" class="textAlign-center">이미지</th>
					<th style="width: 350px;" class="textAlign-center">상품정보</th>
					<th style="width: 120px;" class="textAlign-center">수량</th>
					<th style="width: 90px;" class="textAlign-center">상품구매금액</th>
					<th style="width: 90px;" class="textAlign-center">주문처리상태</th>
				</tr>
			</thead>
			<tbody>
				<%
					//nPrice, nCount => DB Parameter 사용 예정 2018/01/03/PWY	
					int nListCnt = 3;
					int[] arrPrice = { 16500, 20050, 39800 };
					int[] arrCnt = { 3, 1, 2 };
					int nTotalPrice = 0;
					int nFee = 0; //배송비
					for (int nIdx = 0; nIdx < nListCnt; nIdx++) {
						int nPrice = arrPrice[nIdx]; //제품 가격
						int nCnt = arrCnt[nIdx]; //갯수
						int nAllPrice = nPrice * nCnt; //제품 가격 * 갯수

						nTotalPrice += nAllPrice; //주무 최종 합계
				%>
				<tr>
					<td>
						<div class="cartListDiv alignCenter">
							<div class="cartListItem">
								<span class="">2017/12/31</span>
							</div>
						</div>

					</td>
					<td>
						<div class="cartListDiv alignCenter">
							<div class="cartListItem">
								<strong><span class="BasicColor">213006</span></strong>
							</div>
						</div>

					</td>
					<td>
						<div class="cartListDiv alignCenter">
							<img style="width: 80px" class="fullWidth cartListItem"
								src="resources/product/shirts/cart1.jpg">
						</div>
					</td>
					<td>
						<div class="cartListDiv">
							<div class="cartListItem">
								<span>product name</span>
								<p>
									<span class="BasicColor">[옵션: 그레이]</span>
							</div>
						</div>
					</td>
					<td>
						<div class="cartListDiv alignCenter">
							<div class="cartListItem">
								<input name="itemCount"
									class="form-control cartListItem alignCenter"
									style="width: 55px; height: 27px;" type="text" min="1" max="20"
									value="<%=nCnt%>" readonly="readonly" />
							</div>
						</div>
					</td>
					<td>
						<div class="cartListDiv alignCenter">
							<span name="objAllPrice" class="cartListItem"><%=nAllPrice%>원</span>
						</div>
					</td>
					<td>
						<div class="cartListDiv alignCenter">
							<span class="cartListItem">배송완료</span>
						</div>
					</td>
				</tr>
				<%
					}
				%>
				<tr>
					<td colspan="7"></td>
				</tr>
			</tbody>
		</table>
		<div class="fontSize12;" style="width: 100%; display: table;">
			<div style="width: 50%; display: table-cell; padding: 15px;">
				<span>Recently Viewed</span>
				<div style="width: 100%; height: 200px; border: 1px solid #DDDDDD">
				</div>
			</div>
			<div class="textAlign-center"
				style="width: 50%; display: table-cell; padding: 10px;">
				<div>
					<span class="pull-left">My&nbsp;Coupon</span> <span
						class="pull-right">+more</span>
				</div>
				<br>

				<table class="myTable">
					<thead>
						<tr>
							<th class="myTable-coupon">번호</th>
							<th class="myTable-coupon">쿠폰명</th>
							<th class="myTable-coupon">사용기간</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>회원가입쿠폰</td>
							<td>발급일로부터&nbsp;365일&nbsp;이내</td>
						</tr>
						<tr>
							<td>2</td>
							<td>회원가입쿠폰</td>
							<td>발급일로부터&nbsp;365일&nbsp;이내</td>
						</tr>
						<tr>
							<td>3</td>
							<td>회원가입쿠폰</td>
							<td>발급일로부터&nbsp;365일&nbsp;이내</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div>
			<span class="pull-left">My&nbsp;Coupon</span> <span
				class="pull-right">+more</span>
		</div>
		<table class="myTable">
			<thead>
				<tr>
					<th style = "width: 80px;">번호</th>
					<th style = "width: 80px;">분류</th>
					<th style = "width: 500px;">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th style = "width: 80px;">조회</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan = "6">게시물이&nbsp;없습니다.</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
<jsp:include page="publicDiv/footer.jsp"></jsp:include>

<script>
	$("#btnModify").click(function(){
		location.replace("/hisfit/modify");
	});
</script>
</html>