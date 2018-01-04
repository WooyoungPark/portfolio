<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table class="table">
	<thead>
		<tr>

			<th style="width: 30px;" class="textAlign-center"><input
				id="allCheck" type="checkbox" class="form-check-input" id="allCheck"
				onchange="allCheck(this)"></th>
			<th style="width: 100px;" class="textAlign-center">이미지</th>
			<th style="width: 350px;" class="textAlign-center">상품정보</th>
			<th style="width: 80px;" class="textAlign-center">판매가</th>
			<th style="width: 120px;" class="textAlign-center">수량</th>
			<th style="width: 90px;" class="textAlign-center">적립금</th>
			<th style="width: 90px;" class="textAlign-center">배송구분</th>
			<th style="width: 90px;" class="textAlign-center">배송비</th>
			<th style="width: 90px;" class="textAlign-center">합계</th>
			<th style="width: 90px;" class="textAlign-center">선택</th>
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
				<form>
					<input type="hidden" id="productID" value=""> <input
						type="hidden" id="productType" value=""> <input
						type="hidden" id="price" value="<%=nPrice%>"> <input
						type="hidden" id="count" value="<%=nCnt%>"> <input
						type="hidden" id="fee" value="<%=nFee%>">
				</form>
				<div class="cartListDiv alignCenter">
					<div class="cartListItem">
						<input type="checkbox" class="cartListItem form-check-input"
							name="itemCheck">
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
				<div class="cartListDiv">
					<span name="objPrice" class="cartListItem"><%=nPrice%>원</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv">
					<div class="cartListItem">
						<input name="itemCount" class="form-control"
							style="width: 55px; height: 27px;" type="number" min="1" max="20"
							value="<%=nCnt%>" onchange="calTotal(this)" />
					</div>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span class="cartListItem">-</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span class="cartListItem">기본배송</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span class="cartListItem">무료</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<span name="objAllPrice" class="cartListItem"><%=nAllPrice%>원</span>
				</div>
			</td>
			<td>
				<div class="cartListDiv alignCenter">
					<div class="cartListItem ">
						<div class="btn-group-vertical ">
							<button type="button" class="btn blackButton"
								style="font-size: 11px;">주문하기</button>
							<button type="button" class="btn basicButton"
								style="font-size: 11px;">관심상품등록</button>
							<button type="button" class="btn basicButton"
								style="font-size: 11px;" onclick="deleteRow(this);">삭제</button>
						</div>
					</div>
				</div>
			</td>
		</tr>
		<%
			}
		%>
		<tr class="listItemColor">
			<td colspan="10">
				<div class="cartLastRow fontSize12">
					<div class=cartListItem>
						<div class="pull-left">
							<span>[기본배송]</span>
						</div>
						<div class="pull-right">
							<span>상품구매금액 <strong><span name="objTotalPrice"><%=nTotalPrice%>원</span></strong>
								+ 배송비 <strong><%=nFee%></strong> (무료) = 합계 : <strong><span
									name="objTotalPrice"><%=nTotalPrice + nFee%>원</span></strong></span>
						</div>
					</div>
				</div>
			</td>
		</tr>

		<tr>
			<td colspan="10">
				<div class="cartLastRow fontSize8">
					<div class=cartListItem>
						<div class="pull-left">
							<span>할인 적용 금액은 주문서작성의 결제예정금액에서 확인 가능합니다.</span>
						</div>
					</div>
				</div>
			</td>
		</tr>

		<tr>
			<td colspan="10">
				<div class="cartBtnRow ">
					<div class=cartListItem>
						<div class="btn-group fontSize8 pull-left">
							<button class="btn blackButton optionButton"
								onclick="deleteCheck()"
								style="font-size: 11px; margin-right: 3px;">삭제하기</button>
							<button class="btn basicButton optionButton"
								style="font-size: 11px; margin-right: 3px;">관심상품등록</button>
							<button class="btn basicButton optionButton"
								style="font-size: 11px; margin-right: 3px;">해외배송상품
								장바구니로 이동</button>
							<button class="btn basicButton optionButton"
								style="font-size: 11px;">상품조르기</button>
						</div>
						<div class="btn-group fontSize8 pull-right">
							<button class="btn basicButton optionButton"
								style="font-size: 11px;">장바구니</button>
							<button class="btn basicButton optionButton"
								style="font-size: 11px; margin-left: 3px;">견적서 출력</button>
						</div>
					</div>
				</div>

			</td>
		</tr>
		<tr class="listItemColor">
			<td colspan="3">
				<div class="cartLastRow">
					<div class=cartListItem>
						<div class="pull-left alignCenter">
							<span><strong>총 상품 금액</strong></span>
						</div>
					</div>
				</div>
			</td>
			<td colspan="3">
				<div class="cartLastRow">
					<div class="cartListItem">
						<div class="pull-left alignCenter">
							<span><strong>총 배송비</strong></span>
						</div>
					</div>
				</div>
			</td>
			<td colspan="4">
				<div class="cartLastRow">
					<div class=cartListItem>
						<div class="pull-left alignCenter">
							<span><strong>결제예정금액</strong></span>
						</div>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<div class="cartLastRow">
					<div class=cartListItem>
						<div class="pull-left alignCenter">
							<strong><span name="objTotalPrice"><%=nTotalPrice%>원</span></strong>
						</div>
					</div>
				</div>
			</td>
			<td colspan="3">
				<div class="cartLastRow">
					<div class="cartListItem">
						<div class="pull-left alignCenter">
							<span><strong>+<%=nFee%>원
							</strong></span>
						</div>
					</div>
				</div>
			</td>
			<td colspan="4">
				<div class="cartLastRow">
					<div class=cartListItem>
						<div class="pull-left alignCenter">
							<strong><span name="objTotalPrice"><%=nTotalPrice + nFee%>원</span></strong>
						</div>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="10">
				<div class="cartListDiv fullWidth">
					<div class="cartListItem text-center">
						<button class="btn blackButton orderBtn">전체상품주문</button>
						<button class="btn basicButton orderBtn">선택상품주문</button>
						<button class="btn basicButton orderBtn pull-right setPadding">쇼핑계속하기</button>
					</div>


				</div>
			</td>

		</tr>
		<tr class="listItemColor">
			<td colspan="10">
				<div class="cartLastRow fontSize12">
					<span class="cartListItem"><strong>이용안내</strong></span>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="10"><span class="fontSize12"> <strong>장바구니
						이용안내<br>
				</strong> <br>1. 해외배송 상품과 국내배송 상품은 함께 결제하실 수 없으니 장바구니 별로 따로 결제해 주시기
					바랍니다. <br>2. 해외배송 가능 상품의 경우 국내배송 장바구니에 담았다가 해외배송 장바구니로 이동하여
					결제하실 수 있습니다. <br>3. 선택하신 상품의 수량을 변경하시려면 수량변경 후 [변경] 버튼을 누르시면
					됩니다. <br>4. [쇼핑계속하기] 버튼을 누르시면 쇼핑을 계속 하실 수 있습니다. <br>5.
					장바구니와 관심상품을 이용하여 원하시는 상품만 주문하거나 관심상품으로 등록하실 수 있습니다. <br>
				<p>6. 파일첨부 옵션은 동일상품을 장바구니에 추가할 경우 마지막에 업로드 한 파일로 교체됩니다.</p> <br>
				<br>
				<strong>무이자할부 이용안내<br></strong> <br>1. 상품별 무이자할부 혜택을 받으시려면
					무이자할부 상품만 선택하여 [주문하기] 버튼을 눌러 주문/결제 하시면 됩니다. <br>2. [전체 상품 주문]
					버튼을 누르시면 장바구니의 구분없이 선택된 모든 상품에 대한 주문/결제가 이루어집니다. <br>3. 단, 전체
					상품을 주문/결제하실 경우, 상품별 무이자할부 혜택을 받으실 수 없습니다.
			</span></td>
		</tr>
		<tr>
			<td colspan="10"><input type="hidden" id="nTotalProductPrice"
				value="<%=nTotalPrice%>"> <input type="hidden"
				id="nTotalFee" value="0"></td>
		</tr>
	</tbody>
</table>