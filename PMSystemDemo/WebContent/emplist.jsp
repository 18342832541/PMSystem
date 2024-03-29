<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">
<html>
<head>
<title>企业人事管理平台</title>
<title>Insert title here</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/colorpicker.css" />
<link rel="stylesheet" href="css/datepicker.css" />
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
<script type="text/javascript" language="javascript">
			$(document).ready(function(){
				$('input[type=checkbox],input[type=radio],input[type=file]').uniform();
				$('.datepicker').datepicker();
			});
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
			<li><a href="main.jsp"> <i
					class="icon icon-home"></i> <span>首页</span>
			</a></li>
			<li><a href="changePassword.jsp"> <i
					class="icon icon-ok-circle"></i> <span>修改登录密码</span>
			</a></li>
			<li  class="active"><a
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
			<h1>员工信息管理</h1>
		</div>
		<div id="breadcrumb">
			<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>
				首页
			</a> <a href="${pageContext.request.contextPath }/GetAllEmpsServle" class="current">员工信息管理</a>
		</div>
		<form
			action="${ pageContext.request.contextPath }/GetEmpLikeNameServlet"
			method="post" name="searchForm">
			<input type="hidden" name="pagenum" id="pagenum" />
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="control-group">
						<span class="span3"> 根据姓名查询(支持模糊查询)：<input id="name" name="name"
							type="text" style="width: 65%" />
						</span>
					</div>
					<div class="control-group">
						 <span class="span3">
							<button class="btn btn-info" onclick="submitForm(1);">
								<i class="icon-white icon-search"></i> 查询
							</button>
							<button type="button" class="btn btn-info" onclick="resetForm()">
								<i class="icon-white icon-repeat"></i> 重置
							</button>
						</span>
					</div>
				</div>
			</div>
		</form>
		<hr />
		<div class="row-fluid">
			<div class="span12" style="padding-left: 30px;">
				<button class="btn btn-info" onclick="addemp();">
					<i class="icon-white icon-plus"></i> 新增
				</button>
				<script type="text/javascript">
						function addemp(){
							
							location.href="${ pageContext.request.contextPath }/addEmp.jsp";
						}
					</script>
			</div>

			<div class="span12">
				<div class="widget-box">
					<div class="widget-content nopadding">
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>员工号</th>
									<th>姓名</th>
									<th>性别</th>
									<th>职位</th>
									<th>部门</th>

									<th>操作</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${empls }" var="empl" varStatus="sta">
									<tr>
										<td>${empl.employeeId}</td>
										<td>${empl.name }</td>
										<td>${empl.sex }</td>
										<td>${empl.job }</td>
										<td>${empl.dept }</td>

										<td>
											<button class="btn btn-info"
												onclick="allmessage${sta.count}()">
												<i class="icon-white icon-eye-open"></i> 查看
											</button>
											<button class="btn btn-warning"
												onclick="gotomodify${sta.count}()">
												<i class="icon-white icon-refresh"></i> 修改
											</button>
											<button class="btn btn-danger" onclick="lizhi${sta.count}()">
												<i class="icon-white icon-minus"></i> 离职
											</button>
											<button class="btn btn-success"
												onclick="gotoChange${sta.count}()">
												<i class="icon-white icon-share"></i> 调转
											</button>
											<button class="btn btn-danger" onclick="DelEmp${sta.count}()">
												<i class="icon-white icon-minus"></i> 删除
											</button> <script type="text/javascript">
											  function allmessage${sta.count}(){
                                                   location.href="${pageContext.request.contextPath}/GetEmpByIdServlet?id=${empl.employeeId}";
                                               }
                                              function gotomodify${sta.count}(){
                                                  location.href="${pageContext.request.contextPath}/GetUpServlet?id=${empl.employeeId}";
                                              }
											  function gotoChange${sta.count}(){
                                                  location.href = "changeEmp.jsp";
                                              }
											  function lizhi${sta.count}(){
                                                  location.href = "deletEmp.jsp";
                                              }
											  function DelEmp${sta.count}(){
												  if(confirm("确认删除该员工吗？")){
	                                                  location.href = "${pageContext.request.contextPath}/DelEmplServlet?id=${empl.employeeId}";		  
												  }
                                              }
                                            </script>
										</td>
									</tr>
								</c:forEach>
								<tr>
  <td colspan="7">
  <c:if test="${pageNum==1 }">
     首页 上一页
  </c:if>
  <c:if test="${pageNum>1 }">
<a href="${ pageContext.request.contextPath }/GetAllEmpsServle?pageNum=1">[首页]</a>
  <a href="${ pageContext.request.contextPath }/GetAllEmpsServle?pageNum=${ pageNum-1 }">[上一页]</a>
  </c:if>
 
   <c:forEach begin="1" end="${ page }" var="pageNum1">
    <c:if test="${pageNum1==pageNum }">
      [${pageNum1 }]
   </c:if>
    <c:if test="${pageNum1!=pageNum }">
      <a href="${ pageContext.request.contextPath }/GetAllEmpsServle?pageNum=${ pageNum1 }">[${ pageNum1 }]</a>
   </c:if>				
   </c:forEach>
   <c:if test="${pageNum==page }">
      下一页   末页
   </c:if>
   <c:if test="${pageNum<page }">
   <a href="${ pageContext.request.contextPath }/GetAllEmpsServle?pageNum=${ pageNum+1 }">下一页</a>
   <a href="${ pageContext.request.contextPath }/GetAllEmpsServle?pageNum=${ page}">末页</a> 
   </c:if>
  </td>
 </tr>   
							</tbody>
						</table>
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

