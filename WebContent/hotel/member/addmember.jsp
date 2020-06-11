<%@ page import="java.io.FileOutputStream"%>
<%@ page import="java.io.OutputStreamWriter"%>
<%@ page import="java.io.OutputStream"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.BufferedWriter"%>

<%@ page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>酒店管理系统-管理员</title>
<meta charset="UTF-8">
<meta name="description" content="overview &amp; stats" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<link rel="stylesheet" href="/Hotel/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="/Hotel/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="/Hotel/assets/css/fonts.googleapis.com.css" />
<link rel="stylesheet" href="/Hotel/assets/css/ace.min.css"
	class="ace-main-stylesheet" id="main-ace-style" />
<link rel="stylesheet" href="/Hotel/assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="/Hotel/assets/css/ace-rtl.min.css" />
<link rel="shortcut icon" href="/Hotel/assets/images/3.ico" type="image/x-icon" />
<script src="/Hotel/assets/js/ace-extra.min.js"></script>
<script src="/Hotel/assets/js/menuControl.js"></script>
</head>

<body class="no-skin">
	<%@ include file="/ModelUp.jsp"%>
	<div id="content">
		<form class="form-horizontal" role="form" action="/Hotel/addmember.do" method="post" id="addMemberForm">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">会员名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="memberName" id="memberName" placeholder="请输入会员名" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">性别</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入性别"  name="memberSex" id="memberSex">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">密码</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入密码"  name="memberPwd" id="memberPwd">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">手机号</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入手机号"  name="memberPhone" id="memberPhone">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">地址</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入地址"  name="memberAddr" id="memberAddr">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">email</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入email"  name="memberEmail" id="memberEmail">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">会员积分</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入积分"  name="memberInte" id="memberInte">
		    </div>
		  </div>
		  <div class="form-group" style="text-align: center;">
			  <button class="btn btn-primary" type="button" onclick="submitAddForm()">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			  <button class="btn btn-danger" type="button" onclick="javascript:window.location.href='/Hotel/goods.do'">取消</button>                  
		  </div>
		</form>			
	</div>
	<%@ include file="/ModelDown.jsp"%>
<script src="/Hotel/assets/js/jquery-2.1.4.min.js"></script>
<script src="/Hotel/assets/js/bootstrap.min.js"></script>
<script src="/Hotel/assets/js/jquery-ui.custom.min.js"></script>
<script src="/Hotel/assets/js/jquery.ui.touch-punch.min.js"></script>
<script src="/Hotel/assets/js/jquery.easypiechart.min.js"></script>
<script src="/Hotel/assets/js/jquery.sparkline.index.min.js"></script>
<script src="/Hotel/assets/js/jquery.flot.min.js"></script>
<script src="/Hotel/assets/js/jquery.flot.pie.min.js"></script>
<script src="/Hotel/assets/js/jquery.flot.resize.min.js"></script>
<script src="/Hotel/assets/js/ace-elements.min.js"></script>
<script src="/Hotel/assets/js/ace.min.js"></script>
<script type="text/javascript">
	function submitAddForm() {
		if ($("#goodsName").val().trim()=="") {
			alert("请输入商品名称");
		} else if ($("#goodsType").val().trim()=="") {
			alert("请输入商品类别");
		} else if ($("#goodsPrice").val().trim()=="") {
			alert("请输入价格");
		} else if ($("#goodsUnit").val().trim()=="") {
			alert("请输入单位");
		} else {
			$("#addGoodsForm").submit();
		}
	}
</script>
</body>

</html>