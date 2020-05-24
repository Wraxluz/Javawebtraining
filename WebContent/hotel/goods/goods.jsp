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
	<div id="content" class="container">
		
		<form class="bs-example bs-example-form" role="form">
        <div class="row">
	        <div class="col-sm-1">
	        	<a class="btn btn-primary btn-sm" href="/Hotel/hotel/goods/addGoods.jsp" role="button">添加商品</a>
	        </div>
            <div class="col-sm-3">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="请输入商品名称" id="goodNameMo" value="${goodsNameMo!=null?goodsNameMo:"" }">
                    <span class="input-group-btn">
                        <button class="btn btn-primary btn-sm" type="button" onclick="findByNameMo()">查找</button>
                    </span>
                    <span class="input-group-btn">
                        <button class="btn btn-danger btn-sm" type="button" onclick="resetMo()">重置</button>
                    </span>
                </div><!-- /input-group -->
            </div><!-- /.col-lg-6 -->
        </div><!-- /.row -->
        <br>
    </form>
		<table class="table table-striped table-bordered" style="text-align: center;">
			<thead>
				<tr>
					<td>商品名称</td>
					<td>商品类别</td>
					<td>价格</td>
					<td>单位</td>
					<td>备注</td>
					<td colspan="2">操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${goodsList}" var="s">
						<tr>
		        			<td>${s.goods_name}</td>
		        			<td>${s.goods_type}</td>
		        			<td>${s.goods_price}</td>
		        			<td>${s.goods_unit}</td>
		        			<td>${s.goods_note}</td>
		        			<td><a href="editGoods.do?goodsId=${s.goods_id}">修改</a></td>
		        			<td><a href="delGoods.do?goodsId=${s.goods_id}" onclick="if(confirm('确定删除?')==false)return false;">删除</a></td>
						</tr>
   				</c:forEach>
			</tbody>
		</table>
		<c:if test="${error!=null}">
			<div class="alert alert-warning">
			    <a href="#" class="close" data-dismiss="alert">
			        &times;
			    </a>
			    <strong>错误！</strong>${error}
			</div>	
		</c:if>
	</div>
	<%@ include file="/ModelDown.jsp"%>
	
<script type="text/javascript">
	function findByNameMo() {
		var goodsName = $("#goodNameMo").val().trim();
		window.location.href = "http://localhost:8080/Hotel/findByNameMo.do?goodsName="+goodsName;
	}
	
	function resetMo() {
		window.location.href = "http://localhost:8080/Hotel/goods.do";
	}
</script>
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