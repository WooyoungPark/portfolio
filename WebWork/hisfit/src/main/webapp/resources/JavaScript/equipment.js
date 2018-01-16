$(document).ready(function() {// 페이지 랜더링 완료 후 실행 함수
	SetLocale($("span[name=objPrice]"));
	SetLocale($("span[name=objAllPrice]"));
	SetLocale($("span[name=objTotalPrice]"));
});



function setComma(number) {
	// 정규표현식 : (+- 존재하거나 존재 안함, 숫자가 1개 이상), (숫자가 3개씩 반복)
	var reg = /(^[+-]?\d+)(\d{3})/;

	// 스트링변환
	number += '';
	while (reg.test(number)) {
		// replace 정규표현식으로 3자리씩 콤마 처리
		number = number.replace(reg, '$1' + ',' + '$2');
	}
	return number;
}
function deleteComma(strGet) {
	strGet = deleteOne(strGet);
	var arrSplit = strGet.split(',');
	var result = "";
	for ( var i in arrSplit) {
		result += arrSplit[i];
	}
	return result;
}
function deleteOne(strGet) {
	var length = strGet.length;
	var result = strGet.substring(0, length - 1);
	return result;
}
function SetLocale(strObj) {
	strObj.each(function(idx) {
		var getText = $(this).text();
		var result = deleteOne(getText);
		result = setComma(result) + '원';
		strObj.eq(idx).text(result);
	});
}

function subPrice() {
	var totalPrice = 0;
	var fee = 0;
	var obj = $("span[name=objAllPrice");
	obj.each(function(idx) {
		var getText = $(this).text();
		getText = deleteComma(getText);
		totalPrice += Number(getText);
	});
	var result = setComma(totalPrice) + '원';

	var objTotalPrice = $("span[name=objTotalPrice]");
	objTotalPrice.each(function(idx) {
		objTotalPrice.eq(idx).text(result);
	});
}

function calTotal(obj) {
	var nCnt = $(obj).val();
	var tr = $(obj).parent().parent().parent().parent().parent();
	var nPrice = deleteComma(tr.find("span[name=objPrice]").text());
	var allPrice = nPrice * nCnt;
	allPrice = setComma(allPrice) + '원';
	tr.find("span[name=objAllPrice]").text(allPrice);
	subPrice();
}

function deleteRow(obj) {
	var tr = $(obj).parent().parent().parent().parent().parent();
	var targetPrice = deleteComma(tr.find("span[name=objAllPrice]").text());

	var objTotalPrice = $("span[name=objTotalPrice]");
	objTotalPrice.each(function(idx) {
		var getText = $(this).text();
		getText = deleteComma(getText);
		var result = getText - targetPrice;
		result = setComma(result);
		result += '원';
		objTotalPrice.eq(idx).text(result);
	});
	tr.remove();
}

function allCheck(obj) {
	var bChecked = $(obj).is(":checked");
	$('input[name=itemCheck]').each(function(idx) {
		this.checked = bChecked;
	});
}

function allAgree(obj) {
	var bChecked = $(obj).is(":checked");
	$('input[name=chkAgree]').each(function(idx) {
		this.checked = bChecked;
	});
}
function setDomain(obj){
	var strSelect = $(obj).val();
	if(strSelect == 'none'){
		console.log('select');
		$('#objEmail_domain').attr("readonly", false);
		$('#objEmail_domain').val('');
	}else{
		$('#objEmail_domain').attr("readonly", true);
		$('#objEmail_domain').val($(obj).val());
	}
}
function deleteCheck() {
	$('input[name=itemCheck]').each(function(dix) {
		if (this.checked) {
			var tr = $(this).parent().parent().parent().parent();
			tr.remove();
			subPrice();
		}
	});
}

function login(){
	$('#normalloginForm').submit();
}