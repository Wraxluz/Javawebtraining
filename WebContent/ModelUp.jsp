<%@ page pageEncoding="utf-8"%>
	<div id="navbar" class="navbar navbar-default          ace-save-state">
		<div class="navbar-container ace-save-state" id="navbar-container">
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<div class="navbar-header pull-left">
				<a href="adminLoginSuccess.jsp" class="navbar-brand"> <small> <i
						class="fa fa-h-square"></i> 后台管理 &nbsp;<small> admin
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

							<li><a href="logout"> <i
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

			<ul class="nav nav-list">
				<li class="">
					<a href="javascript:void(0);" onclick="systemManagement()">
						<i class="menu-icon fa fa-cog"></i> 
						<span class="menu-text">系统管理 </span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				<li class="">
					<a href="javascript:void(0);" onclick="informationKeep()">
						<i class="menu-icon fa fa-cog"></i> 
						<span class="menu-text">基础信息维护 </span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				<li class="">
					<a href="javascript:void(0);" onclick="roomManagement()">
						<i class="menu-icon fa fa-bed"></i>
						<span class="menu-text">客房管理</span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				<li class="">
					<a href="javascript:void(0);" onclick="consumptionManagement()">
						<i class="menu-icon fa fa-cog"></i> 
						<span class="menu-text">消费管理 </span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				<li class="">
					<a href="javascript:void(0);" onclick="guestManagement()">
						<i class="menu-icon fa fa-user"></i> 
						<span class="menu-text">房客管理</span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				<li class="">
					<a href="javascript:void(0);" onclick="reportManagement()">
						<i class="menu-icon fa fa-cog"></i> 
						<span class="menu-text">报表管理 </span> 
					</a>
					<b class="arrow"></b>
				</li>
				
				
			</ul>

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
				