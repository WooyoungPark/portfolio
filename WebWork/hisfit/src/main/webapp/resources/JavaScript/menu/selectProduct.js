function selectMenu(index) {
	var strTitle;
	switch (index) {
	case 0:
		strTitle = "NEW Discount"
		break;
	case 1: 
		strTitle = "OUTWEAR";
		break;
	case 2: 
		strTitle = "TOP";
		break;
	case 3: 
		strTitle = "SHIRTS";
		break;
	case 4: 
		strTitle = "PANTS";
		break;
	case 5: 
		strTitle = "SHOES";
		break;
	case 6: 
		strTitle = "BAG";
		break;
	case 7: 
		strTitle = "ACC";
		break;
	case 8: 
		strTitle = "SALE";
		break;
	case 9: 
		strTitle = "ONLY ONE";
		break;
	case 10:
		strTitle = "COUPLE";
		break;
	default://error exception
		break;
	}
	var target;
	target = "productList?strFlag=" + strTitle; 
	location.href= target;
}