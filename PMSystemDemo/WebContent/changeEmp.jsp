<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>企业人事管理平台</title>
<title>Insert title here</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/unicorn.main.css" />
<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-colorpicker.js"></script>
<script src="js/bootstrap-datepicker.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/unicorn.js"></script>
</head>
<body>
	<div id="header">
		<h1></h1>
	</div>
	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav btn-group">
			<li class="btn btn-inverse"><a href="#"> <i
					class="icon icon-user"></i> <span class="text"> 张三 </span>
			</a></li>
			<li class="btn btn-inverse"><a href="login.jsp"> <i
					class="icon icon-share-alt"></i> <span class="text">注销</span>
			</a></li>
		</ul>
	</div>
	<div id="sidebar">
		<ul>
			<li><a href="main.jsp"> <i class="icon icon-home"></i> <span>首页</span>
			</a></li>
			<li><a href="changePassword.jsp"> <i
					class="icon icon-ok-circle"></i> <span>修改登录密码</span>
			</a></li>
			<li class="active"><a
				href="${pageContext.request.contextPath }/GetAllEmpsServle"> <i
					class="icon icon-user"></i> <span>员工信息管理</span>
			</a></li>
			<li><a
				href="${pageContext.request.contextPath }/GetAllDeptServlet"> <i
					class="icon icon-flag"></i> <span>部门信息管理</span>
			</a></li>
			<li><a
				href="${pageContext.request.contextPath }/GetAllJobServlet"> <i
					class="icon icon-briefcase"></i> <span>职位信息管理</span>
			</a></li>
			<li class="submenu"><a href="#"> <i class="icon icon-time"></i>
					<span>报表信息管理</span>
			</a>
				<ul>
					<li><a href="LogsServlet?logsInfo=inEmp">新聘员工报表</a></li>
					<li><a href="LogsServlet?logsInfo=outEmp">离职员工报表</a></li>
					<li><a href="LogsServlet?logsInfo=deptTrans">部门调动员工报表</a></li>
					<li><a href="LogsServlet?logsInfo=postTrans">岗位调动员工报表</a></li>
					<li><a href="LogsServlet?logsInfo=Personnel">人事月报</a></li>
				</ul></li>
		</ul>
	</div>



	<div id="content">
		<div id="content-header">
			<h1>查看个人信息</h1>
		</div>
		<div id="breadcrumb">
			<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
			</a> <a class="current" href="${pageContext.request.contextPath }/GetAllEmpsServle">员工列表</a> <a href="#" class="current">员工调转</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i>
							</span>
							<h5>部门调转</h5>
						</div>
						<div class="widget-content nopadding">
							<form id="pform1" action="#" method="post"
								class="form-horizontal">
								<div id="info1" class="control-group">
									<label class="control-label"> 员工姓名: </label>
									<div class="controls" style="padding-top: 15px">张三</div>
								</div>
								<div id="info2" class="control-group">
									<label class="control-label"> 当前部门: </label>
									<div class="controls" style="padding-top: 15px">研发一部</div>
								</div>
								<div id="info3" class="control-group">
									<label class="control-label"> <span style="color: red">*</span>
										新部门:
									</label>
									<div class="controls">
										<select id="new_depart">
											<option value="-1">=请选择=</option>
											<option value="1">研发一部</option>
											<option value="2">研发二部</option>
										</select>
									</div>
								</div>
								<div class="form-actions">
									<input type="submit" value="调转" class="btn btn-primary" />
								</div>
								<div class="alert alert-error">保存失败</div>
								<div class="alert alert-success">保存成功</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i>
							</span>
							<h5>职位调转</h5>
						</div>
						<div class="widget-content nopadding">
							<form id="pform2" action="#" method="post"
								class="form-horizontal">
								<div id="info1" class="control-group">
									<label class="control-label"> 员工姓名: </label>
									<div class="controls" style="padding-top: 15px">张三</div>
								</div>
								<div id="info2" class="control-group">
									<label class="control-label"> 当前职位: </label>
									<div class="controls" style="padding-top: 15px">高级软件工程师</div>
								</div>
								<div id="info3" class="control-group">
									<label class="control-label"> <span style="color: red">*</span>
										新职位:
									</label>
									<div class="controls">
										<select id="new_depart">
											<option value="-1">=请选择=</option>
											<option value="1">软件工程师</option>
											<option value="2">高级软件工程师</option>
										</select>
									</div>
								</div>
								<div class="form-actions">
									<input type="submit" value="调转" class="btn btn-primary" />
								</div>
								<div class="alert alert-error">保存失败</div>
								<div class="alert alert-success">保存成功</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row-fluid">&nbsp;</div>
	<div class="row-fluid">
		<div id="footer" class="span12">2016 &copy; 企业人事管理平台</div>
	</div>
</body>
</html>

