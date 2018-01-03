function selectMenu(index) {
	var nTitle = index;
	var target;
	if (nTitle < 100) {
		target = "productList?nCategory=" + nTitle;
	} else {
		switch (nTitle) {
		case 100:
			target = "cart";
			break;
		case 101:
			target = "order";
			break;
		default:
			// Error Exception
			break;
		}
	}
	location.href = target;

}