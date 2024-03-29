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
<meta http-equiv="Content-Type" content="text/jsp; charset=utf-8" />
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
			<li><a href="main.jsp"> <i class="icon icon-home"></i> <span>首页</span>
			</a></li>
			<li><a href="changePassword.jsp"> <i
					class="icon icon-ok-circle"></i> <span>修改登录密码</span>
			</a></li>
			<li><a
				href="${pageContext.request.contextPath }/GetAllEmpsServle"> <i
					class="icon icon-user"></i> <span>员工信息管理</span>
			</a></li>
			<li class="active"><a
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
			<h1>部门信息管理</h1>
		</div>
		<div id="breadcrumb">
			<a href="main.jsp" class="tip-bottom"> <i class="icon-home"></i>
				首页
			</a> <a class="current" href="${pageContext.request.contextPath }/GetAllDeptServlet">部门信息管理</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="control-group">
					<span class="span3"> 编号：<input id="ename" name="ename"
						type="text" style="width: 65%" />
					</span> <span class="span3">
						<button class="btn btn-info" onclick="selectById()">
							<i class="icon-white icon-search"></i> 查询
						</button> <input type="reset">
					</span>
				</div>
			</div>
		</div>
		<hr />
		<div class="row-fluid">
			<div class="span12" style="padding-left: 30px;">
				<button class="btn btn-info" onclick="addDept();">
					<i class="icon-white icon-plus"></i> 新增
				</button>
				<script type="text/javascript">
						function addDept(){
							location.href="addDept.jsp";
						}
					</script>
			</div>
			<div class="span12">
				<div class="widget-box">
					<div class="widget-content nopadding">
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>编号</th>
									<th>部门名称</th>
									<th>部门类型</th>
									<th>电话</th>
									<th>上级部门</th>
									<th>日期</th>
									<th>状态</th>
									<th>编辑</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${list }" var="dept" varStatus="d">
									<tr>
										<td>${ dept.id }</td>
										<td>${ dept.dname }</td>
										<td>${ dept.type }</td>
										<td>${ dept.phone }</td>
										<td>${ dept.mgr }</td>
										<td>${ dept.date }</td>
										<td>${ dept.depict }</td>
										<td>
											<button class="btn btn-info"
												onclick="GetAllDeptServlet${d.index}()">
												<i class="icon-white icon-eye-open"></i> 查看
											</button>
											<button class="btn btn-warning"
												onclick="UpdateDeptServlet${d.index}()">
												<i class="icon-white icon-refresh"></i> 修改
											</button>
											<button class="btn btn-danger"
												onclick="DelDeptServlet${d.index}()">
												<i class="icon-white icon-minus"></i> 删除
											</button> <c:choose>
												<c:when test="${ dept.depict eq '活动' }">
													<button class="btn btn-danger"
														onclick="updateState${vs.index}()">
														<i class="icon-white icon-minus"></i> 撤销
													</button>
												</c:when>
												<c:when test="${ dept.depict eq '撤销' }">
													<button class="btn btn-info"
														onclick="updateState${vs.index}()">
														<i class="icon-white icon-plus"></i> 恢复
													</button>
												</c:when>
											</c:choose> <script type="text/javascript">
											  
											  function GetAllDeptServlet${d.index}(){

                              location.href="${pageContext.request.contextPath }/GetDeptByIdServlet?id=${dept.id}";
                                               }
                                              function gotomodify(){
                                                  location.href="modifydept.jsp";
                                              }
                                              function UpdateDeptServlet${d.index}(){

                              location.href="${pageContext.request.contextPath}/GetUpDeptServlet?id=${dept.id}";;
                                              }
                                              function DelDeptServlet${d.index}(){
                                            	  if(confirm("确定删除吗？")){
                              location.href="${pageContext.request.contextPath }/DeleteDeptServlet?id=${dept.id}";  
                                            		   
                                            	  }
                                              }
                                              function updateState${d.index}(){
                              location.href="${pageContext.request.contextPath }/UpdateDeptStateServlet?id=${dept.id}";
	                                           }
                                            
                                            </script>

										</td>

									</tr>
								</c:forEach>
								<tr>
									<td colspan="8"><c:if test="${pageNum==1 }">
     首页 上一页
  </c:if> <c:if test="${pageNum>1 }">
											<a
												href="${ pageContext.request.contextPath }/GetAllDeptServlet?pageNum=1">[首页]</a>
											<a
												href="${ pageContext.request.contextPath }/GetAllDeptServlet?pageNum=${ pageNum-1 }">[上一页]</a>
										</c:if> <c:forEach begin="1" end="${ page }" var="pageNum1">
											<c:if test="${pageNum1==pageNum }">
      [${pageNum1 }]
   </c:if>
											<c:if test="${pageNum1!=pageNum }">
												<a
													href="${ pageContext.request.contextPath }/GetAllDeptServlet?pageNum=${ pageNum1 }">[${ pageNum1 }]</a>
											</c:if>
										</c:forEach> <c:if test="${pageNum==page }">
      下一页   末页
   </c:if> <c:if test="${pageNum<page }">
											<a
												href="${ pageContext.request.contextPath }/GetAllDeptServlet?pageNum=${ pageNum+1 }">下一页</a>
											<a
												href="${ pageContext.request.contextPath }/GetAllDeptServlet?pageNum=${ page}">末页</a>
										</c:if></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div
			class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">


		</div>
	</div>
	<div class="row-fluid">&nbsp;</div>
	<div class="row-fluid">
		<div id="footer" class="span12">2019 &copy; 企业人事管理平台</div>
	</div>
</body>
<script type="text/javascript">
		function addDept(){
			
			location.href="${pageContext.request.contextPath }/addDept.jsp";
		
      }
		function selectById(){
			
			location.href="${pageContext.request.contextPath }/GetDeptByIdServlet?id="+$("#ename").val();
		
      }
	</script>
</html>

