function systemManagement() {
	$("#content").html("");
	var str = "<a href='#'>用户管理</a><br>" +
			"<a href='#'>日志管理</a>";
	$("#content").append(str);
}

function informationKeep() {
	$("#content").html("");
	var str = "<a href='/Hotel/roomType.do'>客房类型管理</a><br>" +
			"<a href='/Hotel/roomFloor.do'>楼层管理</a><br>" +
			"<a href='#'>商品类别管理</a><br>" +
			"<a href='/Hotel/goods.do'>商品管理</a><br>" +
			"<a href='/Hotel/hotel/member/member.jsp'>会员管理</a>";
	$("#content").append(str);
}

function roomManagement() {
	$("#content").html("");
	var str = "<a href='#'>客房信息管理</a>";
	$("#content").append(str);
}

function consumptionManagement() {
	$("#content").html("");
	var str = "<a href='#'>附加消费入账</a>";
	$("#content").append(str);
}

function guestManagement() {
	$("#content").html("");
	var str = "<a href='#'>客房预定管理</a><br>" +
			"<a href='#'>入住登记管理</a><br>" +
			"<a href='#'>预定转入住</a><br>" +
			"<a href='#'>换房管理</a><br>" +
			"<a href='#'>结账管理</a>";
	$("#content").append(str);
}


function reportManagement() {
	$("#content").html("");
	var str = "<a href='#'>预定客人报表</a><br>" +
			"<a href='#'>在住客人报表</a><br>" +
			"<a href='#'>离店客人报表</a><br>" +
			"<a href='#'>财务进帐报表</a><br>";
	$("#content").append(str);
}



