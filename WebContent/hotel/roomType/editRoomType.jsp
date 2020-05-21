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
		<form class="form-horizontal" role="form" action="/Hotel/editConfirmRoomType.do" method="post">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">房间号</label>
		    <div class="col-sm-10">
		      <input class="form-control" name="roomId" value="${room.room_id}" readonly="readonly">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">房间类型</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" placeholder="请输入房间类型"  value="${room.room_type!='暂无数据'?room.room_type:''}" name="roomType">
		    </div>
		  </div>
		  <div class="form-group" style="text-align: center;">
			  <button class="btn btn-primary" type="submit">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			  <button class="btn btn-danger" type="button" onclick="javascript:window.location.href='roomType.do'">取消</button>                  
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
</body>

</html>