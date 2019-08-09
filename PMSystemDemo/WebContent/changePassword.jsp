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
<link rel="stylesheet" href="css/datepicker.css" />
<link rel="stylesheet" href="css/unicorn.main.css" />
<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/bootstrap-datepicker.js"></script>
<script src="js/jquery.validate.js"></script>
<script src="js/unicorn.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#pass1").blur(function() {
			validatePass1();
		});
		$("#pass1").focus(function() {
			validatePass1();
		});
		$("#pass2").blur(function() {
			validatePass2();
		});
		$("#pass2").focus(function() {
			validatePass2();
		});
		$("#pass3").blur(function() {
			validatePass3();
		});
		$("#pass3").focus(function() {
			validatePass3();
		});
		$("#pform").submit(function() {
			var flag = true;
			flag = validatePass1() && flag;
			flag = validatePass2() && flag;
			flag = validatePass3() && flag;
			return flag;
		});

	});
	function validatePass1() {
		var v = $("#pass1").val();
		if (v == "") {
			$("#info1").removeClass("success");
			$("#info1").addClass("error");
			return false;
		} else {
			$("#info1").removeClass("error");
			$("#info1").addClass("success");
			return true;
		}
	}
	function validatePass2() {
		var v = $("#pass2").val();
		if (v == "") {
			$("#info2").removeClass("success");
			$("#info2").addClass("error");
			return false;
		} else {
			$("#info2").removeClass("error");
			$("#info2").addClass("success");
			return true;
		}
	}
	function validatePass3() {
		var v1 = $("#pass3").val();
		var v2 = $("#pass2").val();
		if (v1 != v2) {
			$("#info3").removeClass("success");
			$("#info3").addClass("error");
			return false;
		} else {
			$("#info3").removeClass("error");
			$("#info3").addClass("success");
			return true;
		}
	}
</script>
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
			<li class="active"><a href="changePassword.jsp"> <i
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
			<h1>修改登录密码</h1>
		</div>
		<div id="breadcrumb">
			<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
			</a> <a href="#" class="current">修改登录密码</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i>
							</span>
							<h5>修改登录密码</h5>
						</div>
						<div class="widget-content nopadding">
							<form id="pform" action="#" method="post" class="form-horizontal">
								<div id="info1" class="control-group">
									<label class="control-label"> <span style="color: red">*</span>
										原密码:
									</label>
									<div class="controls">
										<input type="password" name="pass1" id="pass1" />
									</div>
								</div>
								<div id="info2" class="control-group">
									<label class="control-label"> <span style="color: red">*</span>
										新密码:
									</label>
									<div class="controls">
										<input type="password" name="pass2" id="pass2" />
									</div>
								</div>
								<div id="info3" class="control-group">
									<label class="control-label"> <span style="color: red">*</span>
										确认新密码:
									</label>
									<div class="controls">
										<input type="password" name="pass3" id="pass3" />
									</div>
								</div>
								<div class="form-actions">
									<input type="submit" value="提交" class="btn btn-primary" /> <input
										type="reset" value="重置" class="btn btn-primary" />
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="alert alert-error">保存失败</div>
		<div class="alert alert-success">保存成功</div>
	</div>
	<div class="row-fluid">&nbsp;</div>
	<div class="row-fluid">
		<div id="footer" class="span12">2016 &copy; 企业人事管理平台</div>
	</div>

</body>
</html>

