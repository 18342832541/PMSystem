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
<style>
tr {
	height: 40px;
}
</style>
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
					class="icon icon-user"></i> <span class="text"> </span>
			</a></li>
			<li class="btn btn-inverse"><a href="login.jsp"> <i
					class="icon icon-share-alt"></i> <span class="text">注销</span>
			</a></li>
		</ul>
	</div>
	<div id="sidebar">
		<ul>
			<li class="active"><a href="main.jsp"> <i
					class="icon icon-home"></i> <span>首页</span>
			</a></li>
			<li><a href="changePassword.jsp"> <i
					class="icon icon-ok-circle"></i> <span>修改登录密码</span>
			</a></li>
			<li><a
				href="${pageContext.request.contextPath }/GetAllEmpsServle"> <i
					class="icon icon-user"></i> <span>员工信息管理</span>
			</a></li>
			<li><a
				href="${pageContext.request.contextPath }/GetAllDeptServlet"> <i
					class="icon icon-flag"></i> <span>部门信息管理</span>
			</a></li>
			<li class="active"><a
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
			<h1>查看职位信息</h1>
		</div>
		<div id="breadcrumb">
			<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
			</a> <a class="current" href="${pageContext.request.contextPath }/GetAllJobServlet">职位信息管理</a> <a href="#" class="current">查看职位</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i>
							</span>
							<h5>基础信息</h5>
						</div>
						<table width="100%">
							<tr>
								<td width="15%" align="right">编号:</td>
								<td width="60%" align="left">&nbsp;&nbsp;&nbsp; ${job.id}</td>
								<td></td>
							</tr>
							<tr>
								<td align="right">名称:</td>
								<td align="left">&nbsp;&nbsp;&nbsp; ${job.ename}</td>
								<td></td>
							</tr>
							<tr>
								<td align="right">岗位类型:</td>
								<td align="left">&nbsp;&nbsp;&nbsp; ${job.postType}</td>
								<td></td>
							</tr>
							<tr>
								<td align="right">岗位编制:</td>
								<td align="left">&nbsp;&nbsp;&nbsp; ${job.postAllot}</td>
								<td></td>
							</tr>

						</table>
					</div>
				</div>
			</div>
		</div>
		<hr />
		<div class="widget-box">
			<div class="widget-title">
				<span class="icon"> <i class="icon-th"></i>
				</span>
				<h5>职位员工信息</h5>
			</div>
			<div class="widget-content nopadding">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>员工编号</th>
							<th>姓名</th>
							<th>部门</th>
							<th>性别</th>
							<th>年龄</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="row-fluid">&nbsp;</div>
	<div class="row-fluid">
		<div id="footer" class="span12">2016 &copy; 企业人事管理平台</div>
	</div>
</body>
</html>

