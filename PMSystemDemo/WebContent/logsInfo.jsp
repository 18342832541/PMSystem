<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>企业人事管理平台</title>
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
			<li class="btn btn-inverse"><a href="login.html"> <i
					class="icon icon-share-alt"></i> <span class="text">注销</span>
			</a></li>
		</ul>
	</div>
	<div id="sidebar">
		<ul>
			<li><a href="main.jsp"> <i
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
			<li><a
				href="${pageContext.request.contextPath }/GetAllJobServlet"> <i
					class="icon icon-briefcase"></i> <span>职位信息管理</span>
			</a></li>
			<li class="submenu active"><a href="#"> <i class="icon icon-time"></i>
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


	<c:choose>
		<c:when test="${ show eq 'inEmp' }">
			<div id="content" decr="第一个模块，信息遍历输出">
				<div id="content-header">
					<h1>报表信息管理</h1>
				</div>
				<div id="breadcrumb">
					<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
					</a> <span class="current">报表信息管理</span>
				</div>
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon"> <i class="icon-align-justify"></i>
									</span>
									<!-- 此处也需要做相应变换 -->
									<h5>
										<a
											href="${pageContext.request.contextPath }/LogsServlet?logsInfo=inEmp">新聘员工报表</a>
									</h5>
								</div>
							</div>
						</div>
					</div>
					<form
						action="${pageContext.request.contextPath }/LogsServlet?logsInfo=inEmp"
						method="post" onsubmit="return checkForm()">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="current">选择查询开始日期：</span> <input type="date"
										name="startDate" id="startDate" /> <span class="current">选择查询截止日期：</span>
									<input type="date" name="endDate" id="endDate" /> <input
										type="submit" value="开始查询">
								</div>
							</div>
						</div>
					</form>
					<script>
						function checkForm() {
							if (document.getElementById("startDate").value == "") {
								alert("未选择开始日期！");
								return false;
							}
							if (document.getElementById("endDate").value == "") {
								alert("未选择截止日期！")
								return false;
							}
							return true;
						}
					</script>

				</div>

				<hr />
				<div class="row-fluid">
					<div class="span12" style="padding-left: 30px;">
						<div class="widget-box">
							<div class="widget-content nopadding">

								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>序号</th>
											<th>部门名称</th>
											<th>岗位</th>
											<th>姓名</th>
											<th>性别</th>
											<th>入职日期</th>
											<th>学历</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${ list }" var="tempMan">
											<tr>
												<td>${ tempMan.id }</td>
												<td>${ tempMan.dName }</td>
												<td>${ tempMan.pName }</td>
												<td>${ tempMan.eName }</td>
												<td>${ tempMan.gender }</td>
												<td>${ tempMan.hiredate }</td>
												<td>${ tempMan.education }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div decr="第二个模块，分页数据组"
				class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
				<div
					class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
					<c:choose>
						<c:when test="${ pageNum!=1 }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=inEmp&page=1&startDate=${ startDate }&endDate=${endDate}"
								class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default">首页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=inEmp&page=${ pageNum-1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">上一页</a>
						</c:when>
					</c:choose>

					<c:forEach begin="1" end="${ pageSum }" var="page">
						<c:if test="${ pageNum==page }">
							<a tabindex="0"
								class="fg-button ui-button ui-state-default ui-state-disabled">${ page }</a>
						</c:if>
						<c:if test="${ pageNum!=page }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=inEmp&page=${ page }&startDate=${ startDate }&endDate=${endDate}"
								class="fg-button ui-button ui-state-default">${ page }</a>
						</c:if>
					</c:forEach>

					<c:choose>
						<c:when test="${ pageNum!=pageSum }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=inEmp&page=${ pageNum+1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">下一页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=inEmp&page=${ pageSum }&startDate=${ startDate }&endDate=${endDate}"
								class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default">尾页</a>
						</c:when>
					</c:choose>
				</div>
			</div>

		</c:when>

		<c:when test="${ show eq 'outEmp' }">
			<div id="content" decr="第一个模块，信息遍历输出">
				<div id="content-header">
					<h1>报表信息管理</h1>
				</div>
				<div id="breadcrumb">
					<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
					</a> <span class="current">报表信息管理</span>
				</div>
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon"> <i class="icon-align-justify"></i>
									</span>
									<!-- 此处也需要做相应变换 -->
									<h5>
										<a
											href="${pageContext.request.contextPath }/LogsServlet?logsInfo=outEmp">离职员工报表</a>
									</h5>
								</div>
							</div>
						</div>
					</div>
					<form
						action="${pageContext.request.contextPath }/LogsServlet?logsInfo=outEmp"
						method="post" onsubmit="return checkForm()">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="current">选择查询开始日期：</span> <input type="date"
										name="startDate" id="startDate" /> <span class="current">选择查询截止日期：</span>
									<input type="date" name="endDate" id="endDate" /> <input
										type="submit" value="开始查询">
								</div>
							</div>
						</div>
					</form>
					<script>
						function checkForm() {
							if (document.getElementById("startDate").value == "") {
								alert("未选择开始日期！");
								return false;
							}
							if (document.getElementById("endDate").value == "") {
								alert("未选择截止日期！")
								return false;
							}
							return true;
						}
					</script>
				</div>

				<hr />
				<div class="row-fluid">
					<div class="span12" style="padding-left: 30px;">
						<div class="widget-box">
							<div class="widget-content nopadding">

								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>序号</th>
											<th>部门名称</th>
											<th>岗位名称</th>
											<th>姓名</th>
											<th>性别</th>
											<th>离职日期</th>
											<th>离职原因</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${ list }" var="tempMan">
											<tr>
												<td>${ tempMan.id }</td>
												<td>${ tempMan.dName }</td>
												<td>${ tempMan.pName }</td>
												<td>${ tempMan.eName }</td>
												<td>${ tempMan.gender }</td>
												<td>${ tempMan.leaveDate }</td>
												<td>${ tempMan.reason }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div decr="第二个模块，分页数据组"
				class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
				<div
					class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
					<c:choose>
						<c:when test="${ pageNum!=1 }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=outEmp&page=1&startDate=${ startDate }&endDate=${endDate}"
								class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default">首页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=outEmp&page=${ pageNum-1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">上一页</a>
						</c:when>
					</c:choose>

					<c:forEach begin="1" end="${ pageSum }" var="page">
						<c:if test="${ pageNum==page }">
							<a tabindex="0"
								class="fg-button ui-button ui-state-default ui-state-disabled">${ page }</a>
						</c:if>
						<c:if test="${ pageNum!=page }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=outEmp&page=${ page }&startDate=${ startDate }&endDate=${endDate}"
								class="fg-button ui-button ui-state-default">${ page }</a>
						</c:if>
					</c:forEach>

					<c:choose>
						<c:when test="${ pageNum!=pageSum }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=outEmp&page=${ pageNum+1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">下一页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=outEmp&page=${ pageSum }&startDate=${ startDate }&endDate=${endDate}"
								class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default">尾页</a>
						</c:when>
					</c:choose>
				</div>
			</div>

		</c:when>

		<c:when test="${ show eq 'deptTrans' }">
			<div id="content" decr="第一个模块，信息遍历输出">
				<div id="content-header">
					<h1>报表信息管理</h1>
				</div>
				<div id="breadcrumb">
					<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
					</a> <span class="current">报表信息管理</span>
				</div>
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon"> <i class="icon-align-justify"></i>
									</span>
									<!-- 此处也需要做相应变换 -->
									<h5>
										<a
											href="${pageContext.request.contextPath }/LogsServlet?logsInfo=deptTrans">部门调动员工报表</a>
									</h5>
								</div>
							</div>
						</div>
					</div>
					<form
						action="${pageContext.request.contextPath }/LogsServlet?logsInfo=deptTrans"
						method="post" onsubmit="return checkForm()">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="current">选择查询开始日期：</span> <input type="date"
										name="startDate" id="startDate" /> <span class="current">选择查询截止日期：</span>
									<input type="date" name="endDate" id="endDate" /> <input
										type="submit" value="开始查询">
								</div>
							</div>
						</div>
					</form>
					<script>
						function checkForm() {
							if (document.getElementById("startDate").value == "") {
								alert("未选择开始日期！");
								return false;
							}
							if (document.getElementById("endDate").value == "") {
								alert("未选择截止日期！")
								return false;
							}
							return true;
						}
					</script>
				</div>

				<hr />
				<div class="row-fluid">
					<div class="span12" style="padding-left: 30px;">
						<div class="widget-box">
							<div class="widget-content nopadding">

								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>序号</th>
											<th>原部门名称</th>
											<th>新部门名称</th>
											<th>姓名</th>
											<th>性别</th>
											<th>调动日期</th>
											<th>调动原因</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${ list }" var="tempMan">
											<tr>
												<td>${ tempMan.id }</td>
												<td>${ tempMan.oldName }</td>
												<td>${ tempMan.newName }</td>
												<td>${ tempMan.name }</td>
												<td>${ tempMan.gender }</td>
												<td>${ tempMan.date }</td>
												<td>${ tempMan.reason }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div decr="第二个模块，分页数据组"
				class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
				<div
					class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
					<c:choose>
						<c:when test="${ pageNum!=1 }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=deptTrans&page=1&startDate=${ startDate }&endDate=${endDate}"
								class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default">首页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=deptTrans&page=${ pageNum-1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">上一页</a>
						</c:when>
					</c:choose>

					<c:forEach begin="1" end="${ pageSum }" var="page">
						<c:if test="${ pageNum==page }">
							<a tabindex="0"
								class="fg-button ui-button ui-state-default ui-state-disabled">${ page }</a>
						</c:if>
						<c:if test="${ pageNum!=page }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=deptTrans&page=${ page }&startDate=${ startDate }&endDate=${endDate}"
								class="fg-button ui-button ui-state-default">${ page }</a>
						</c:if>
					</c:forEach>

					<c:choose>
						<c:when test="${ pageNum!=pageSum }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=deptTrans&page=${ pageNum+1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">下一页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=deptTrans&page=${ pageSum }&startDate=${ startDate }&endDate=${endDate}"
								class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default">尾页</a>
						</c:when>
					</c:choose>
				</div>
			</div>

		</c:when>

		<c:when test="${ show eq 'postTrans' }">
			<div id="content" decr="第一个模块，信息遍历输出">
				<div id="content-header">
					<h1>报表信息管理</h1>
				</div>
				<div id="breadcrumb">
					<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
					</a> <span class="current">报表信息管理</span>
				</div>
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon"> <i class="icon-align-justify"></i>
									</span>
									<!-- 此处也需要做相应变换 -->
									<h5>
										<a
											href="${ pageContext.request.contextPath }/LogsServlet?logsInfo=postTrans">新聘员工报表</a>
									</h5>
								</div>
							</div>
						</div>
					</div>
					<form
						action="${pageContext.request.contextPath }/LogsServlet?logsInfo=postTrans"
						method="post" onsubmit="return checkForm()">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="current">选择查询开始日期：</span> <input type="date"
										name="startDate" id="startDate" /> <span class="current">选择查询截止日期：</span>
									<input type="date" name="endDate" id="endDate" /> <input
										type="submit" value="开始查询">
								</div>
							</div>
						</div>
					</form>
					<script>
						function checkForm() {
							if (document.getElementById("startDate").value == "") {
								alert("未选择开始日期！");
								return false;
							}
							if (document.getElementById("endDate").value == "") {
								alert("未选择截止日期！")
								return false;
							}
							return true;
						}
					</script>
				</div>

				<hr />
				<div class="row-fluid">
					<div class="span12" style="padding-left: 30px;">
						<div class="widget-box">
							<div class="widget-content nopadding">

								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>序号</th>
											<th>部门名称</th>
											<th>原岗位名称</th>
											<th>新岗位名称</th>
											<th>姓名</th>
											<th>性别</th>
											<th>调动日期</th>
											<th>调动原因</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${ list }" var="tempMan">
											<tr>
												<td>${ tempMan.id }</td>
												<td>${ tempMan.dName }</td>
												<td>${ tempMan.oldName }</td>
												<td>${ tempMan.newName }</td>
												<td>${ tempMan.name }</td>
												<td>${ tempMan.gender }</td>
												<td>${ tempMan.date }</td>
												<td>${ tempMan.reason }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div decr="第二个模块，分页数据组"
				class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
				<div
					class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
					<c:choose>
						<c:when test="${ pageNum!=1 }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=postTrans&page=1&startDate=${ startDate }&endDate=${endDate}"
								class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default">首页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=postTrans&page=${ pageNum-1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">上一页</a>
						</c:when>
					</c:choose>

					<c:forEach begin="1" end="${ pageSum }" var="page">
						<c:if test="${ pageNum==page }">
							<a tabindex="0"
								class="fg-button ui-button ui-state-default ui-state-disabled">${ page }</a>
						</c:if>
						<c:if test="${ pageNum!=page }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=postTrans&page=${ page }&startDate=${ startDate }&endDate=${endDate}"
								class="fg-button ui-button ui-state-default">${ page }</a>
						</c:if>
					</c:forEach>

					<c:choose>
						<c:when test="${ pageNum!=pageSum }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=postTrans&page=${ pageNum+1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">下一页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=postTrans&page=${ pageSum }&startDate=${ startDate }&endDate=${endDate}"
								class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default">尾页</a>
						</c:when>
					</c:choose>
				</div>
			</div>

		</c:when>

		<c:when test="${ show eq 'Personnel' }">
			<div id="content" decr="第一个模块，信息遍历输出">
				<div id="content-header">
					<h1>报表信息管理</h1>
				</div>
				<div id="breadcrumb">
					<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>首页
					</a> <span class="current">报表信息管理</span>
				</div>
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon"> <i class="icon-align-justify"></i>
									</span>
									<!-- 此处也需要做相应变换 -->
									<h5>
										<a href="/LogsServlet?logsInfo=Personnel">人事月报</a>
									</h5>
								</div>
							</div>
						</div>
					</div>
					<form
						action="${pageContext.request.contextPath }/LogsServlet?logsInfo=Personnel"
						method="post" onsubmit="return checkForm()">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="current">选择查询开始日期：</span> <input type="date"
										name="startDate" id="startDate" /> <span class="current">选择查询截止日期：</span>
									<input type="date" name="endDate" id="endDate" /> <input
										type="submit" value="开始查询">
								</div>
							</div>
						</div>
					</form>
					<script>
						function checkForm() {
							if (document.getElementById("startDate").value == "") {
								alert("未选择开始日期！");
								return false;
							}
							if (document.getElementById("endDate").value == "") {
								alert("未选择截止日期！")
								return false;
							}
							return true;
						}
					</script>
				</div>

				<hr />
				<div class="row-fluid">
					<div class="span12" style="padding-left: 30px;">
						<div class="widget-box">
							<div class="widget-content nopadding">

								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th rowspan="2">部门名称</th>
											<th colspan="6">人数统计</th>
											<th colspan="4">学历统计</th>
										</tr>
										<tr>
											<th>月初人数</th>
											<th>月末人数</th>
											<th>本月新入职</th>
											<th>本月离职</th>
											<th>本月调入</th>
											<th>本月调出</th>
											<th>研究生</th>
											<th>本科</th>
											<th>大专</th>
											<th>高中及以下</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${ list }" var="tempMan" varStatus="p">
											<tr>
												<td>${ tempMan.dName }</td>
												<td>${ tempMan.earlyMonthAll }</td>
												<td>${ tempMan.endMonthAll }</td>
												<td>${ tempMan.hireNumber }</td>
												<td>${ tempMan.leaveNumber }</td>
												<td>${ tempMan.inNumber }</td>
												<td>${ tempMan.outNumber }</td>
												<td>${ tempMan.graduate }</td>
												<td>${ tempMan.regular }</td>
												<td>${ tempMan.junior }</td>
												<td>${ tempMan.highSchool }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div decr="第二个模块，分页数据组"
				class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
				<div
					class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
					<c:choose>
						<c:when test="${ pageNum!=1 }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=Personnel&page=1&startDate=${ startDate }&endDate=${endDate}"
								class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default">首页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=Personnel&page=${ pageNum-1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">上一页</a>
						</c:when>
					</c:choose>

					<c:forEach begin="1" end="${ pageSum }" var="page">
						<c:if test="${ pageNum==page }">
							<a tabindex="0"
								class="fg-button ui-button ui-state-default ui-state-disabled">${ page }</a>
						</c:if>
						<c:if test="${ pageNum!=page }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=Personnel&page=${ page }&startDate=${ startDate }&endDate=${endDate}"
								class="fg-button ui-button ui-state-default">${ page }</a>
						</c:if>
					</c:forEach>

					<c:choose>
						<c:when test="${ pageNum!=pageSum }">
							<a tabindex="0"
								href="LogsServlet?logsInfo=Personnel&page=${ pageNum+1 }&startDate=${ startDate }&endDate=${endDate}"
								class="previous fg-button ui-button ui-state-default">下一页</a>
							<a tabindex="0"
								href="LogsServlet?logsInfo=Personnel&page=${ pageSum }&startDate=${ startDate }&endDate=${endDate}"
								class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default">尾页</a>
						</c:when>
					</c:choose>
				</div>
			</div>

		</c:when>

	</c:choose>
	<div class="row-fluid">&nbsp;</div>
	<div class="row-fluid">
		<div id="footer" class="span12">2016 &copy; 企业人事管理平台</div>
	</div>

</body>
</html>