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
<title>酒店管理系统-后台</title>
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

	<div id="navbar" class="navbar navbar-default          ace-save-state">
		<div class="navbar-container ace-save-state" id="navbar-container">
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<div class="navbar-header pull-left">
				<a href="adminLoginSuccess.jsp" class="navbar-brand"> <small> <i
						class="fa fa-h-square"></i> 后台管理 &nbsp;<small> ${loginUser}
					</small>
				</small>
				</a>
			</div>

			<div class="navbar-buttons navbar-header pull-right"
				role="navigation">
				<ul class="nav ace-nav">
					<li class="light-blue dropdown-modal"><a
						data-toggle="dropdown" href="#" class="dropdown-toggle"> <img
							class="nav-user-photo" src="assets/images/avatars/avatar4.png"
							alt="Jason's Photo" /> <span class="user-info"> <small>欢迎,</small>

						</span> <i class="ace-icon fa fa-caret-down"></i>
					</a>

						<ul
							class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">


							<li><a href="profile.jsp"> <i
									class="ace-icon fa fa-user"></i> 个人信息
							</a></li>

							<li class="divider"></li>

							<li><a href="index.jsp"> <i
									class="ace-icon fa fa-power-off"></i> 退出登录
							</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- /.navbar-container -->
	</div>

	<div class="main-container ace-save-state" id="main-container">
		<script type="text/javascript">
		</script>

				<div id="sidebar"
			class="sidebar                  responsive                    ace-save-state">
			<script type="text/javascript">
				try {
					ace.settings.loadState('sidebar')
				} catch (e) {
				}
			</script>

<!-- 			<div class="sidebar-shortcuts" id="sidebar-shortcuts"> -->
<!-- 				<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large"> -->
<!-- 					<a class="btn btn-success" href=""> <i class="ace-icon fa fa-cog"></i></a> -->
<!-- 					<a class="btn btn-info" href=""> <i class="ace-icon fa fa-bed"></i></a> -->
<!-- 					<a class="btn btn-success" href=""> <i class="ace-icon fa fa-cog"></i></a> -->
<!-- 					<a class="btn btn-warning" href=""><i class="ace-icon fa fa-user"></i></a> -->
<!-- 					<a class="btn btn-warning" href=""><i class="ace-icon fa fa-user"></i></a> -->

					<!-- <button class="btn btn-danger">
							<i class="ace-icon fa fa-cogs"></i>
						</button> -->
<!-- 				</div> -->

<!-- 				<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini"> -->
<!-- 						<span class="btn btn-success"></span> -->

<!-- 						<span class="btn btn-info"></span> -->

<!-- 						<span class="btn btn-warning"></span> -->

						
<!-- 					</div> -->
<!-- 			</div> -->
			<!-- /.sidebar-shortcuts -->

			<ul class="nav nav-list">
				<li class="">
					<a href="javascript:void(0);" onclick="reportManagement()">
						<i class="menu-icon fa fa-cog"></i> 
						<span class="menu-text">报表管理 </span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				
			</ul>
			<!-- /.nav-list -->

			<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
				<i id="sidebar-toggle-icon"
					class="ace-icon fa fa-angle-double-left ace-save-state"
					data-icon1="ace-icon fa fa-angle-double-left"
					data-icon2="ace-icon fa fa-angle-double-right"></i>
			</div>
		</div>

		<div class="main-content">
			<div class="main-content-inner">


				<div class="page-content">
					<div class="ace-settings-container" id="ace-settings-container">
						<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
							id="ace-settings-btn">
							<i class="ace-icon fa fa-cog bigger-130"></i>
						</div>

						<div class="ace-settings-box clearfix" id="ace-settings-box">
							<div class="pull-left width-50">
								<div class="ace-settings-item">
									<div class="pull-left">
										<select id="skin-colorpicker" class="hide">
											<option data-skin="no-skin" value="#438EB9">#438EB9</option>
											<option data-skin="skin-1" value="#222A2D">#222A2D</option>
											<option data-skin="skin-2" value="#C6487E">#C6487E</option>
											<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
										</select>
									</div>
									<span>&nbsp; 选择皮肤</span>
								</div>

								<div class="ace-settings-item">
									<input type="checkbox"
										class="ace ace-checkbox-2 ace-save-state"
										id="ace-settings-navbar" autocomplete="off" /> <label
										class="lbl" for="ace-settings-navbar"> 固定导航栏</label>
								</div>

								<div class="ace-settings-item">
									<input type="checkbox"
										class="ace ace-checkbox-2 ace-save-state"
										id="ace-settings-sidebar" autocomplete="off" /> <label
										class="lbl" for="ace-settings-sidebar"> 固定侧边栏</label>
								</div>
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2"
										id="ace-settings-rtl" autocomplete="off" /> <label
										class="lbl" for="ace-settings-rtl"> 镜像</label>
								</div>
							</div>
						</div>
					</div>

					<div class="page-header">
						<h1>欢迎登陆！</h1>
					</div>
					<!-- /.page-header -->

					<div id="content">
					
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
		</div>


		<div class="footer">
	<div class="footer-inner">
		<div class="footer-content">
			<span class="bigger-120"> <span class="blue bolder">LMMHotel</span>
				后台管理 &copy; Azure&nbsp;Tech
			</span> &nbsp; &nbsp; <span class="action-buttons"> <a href="#">
					<i class="ace-icon fa fa-weixin light-green bigger-150"></i>
			</a> <a href="#"> <i
					class="ace-icon fa fa-qq text-primary bigger-150"></i>
			</a> <a href="#"> <i class="ace-icon fa fa-weibo orange bigger-150"></i>
			</a>
			</span>
		</div>
	</div>
</div>

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	
	
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