<%@ page import="java.io.FileOutputStream"%>
<%@ page import="java.io.OutputStreamWriter"%>
<%@ page import="java.io.OutputStream"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.BufferedWriter"%>

<%@ page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<div class="btn-group">
		    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">所有
		        <span class="caret"></span>
		    </button>
		    <ul class="dropdown-menu" role="menu">
		        <li>
		            <a href="#">一层</a>
		        </li>
		        <li>
		            <a href="#">二层</a>
		        </li>
		        <li>
		            <a href="#">三层</a>
		        </li>
		        <li>
		            <a href="#">四层</a>
		        </li>
		    </ul>
		</div>
		<table class="table table-striped table-bordered" style="text-align: center;">
			<thead>
				<tr>
					<td>房间号</td>
					<td>楼层</td>
					<td colspan="2">操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roomList}" var="s">
						<tr>
		        			<td>${s.room_id}</td>
		        			<td>${s.room_floor!=''?s.room_floor:'暂无数据'}</td>
		        			<td><a href="editRoomFloor.do?roomId=${s.room_id}">修改</a></td>
		        			<td><a href="delRoomFloor.do?roomId=${s.room_id}" onclick="if(confirm('确定删除?')==false)return false;">删除</a></td>
						</tr>
   				</c:forEach>
			</tbody>
		</table>
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