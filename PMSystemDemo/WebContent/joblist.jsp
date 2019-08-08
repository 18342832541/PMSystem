<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<title>企业人事管理平台</title>
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
		<div id="header"><h1></h1></div>
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse">
                    <a href="#">
                        <i class="icon icon-user"></i>
                        <span class="text">
                            张三
                        </span>
                    </a>
                </li>
                <li class="btn btn-inverse">
                    <a href="login.jsp">
                        <i class="icon icon-share-alt"></i>
                        <span class="text">注销</span>
                    </a>
                </li>
            </ul>
        </div>
        <div id="sidebar">
            <ul>
                <li>
                    <a href="main.jsp">
                        <i class="icon icon-home"></i> 
                        <span>首页</span>
                    </a>
                </li>
                <li>
                    <a href="empinfo.jsp">
                        <i class="icon icon-tag"></i> 
                        <span>查看个人信息</span>
                    </a>
                </li>
                <li>
                    <a href="changePassword.jsp">
                        <i class="icon icon-ok-circle"></i> 
                        <span>修改登录密码</span>
                    </a>
                </li>
                <li>
                    <a href="emplist.jsp">
                        <i class="icon icon-user"></i> 
                        <span>员工信息管理</span> 
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/GetAllDeptServlet">
                        <i class="icon icon-flag"></i> 
                        <span>部门信息管理</span> 
                    </a>
                </li>
                <li class="active">
                    <a href="${pageContext.request.contextPath }/GetAllJobServlet">
                        <i class="icon icon-briefcase"></i> 
                        <span>职位信息管理</span> 
                    </a>
                </li>
            </ul>
        </div>
        
		<div id="content">
			<div id="content-header">
				<h1>职位信息管理</h1>
			</div>
			<div id="breadcrumb">
				<a href="main.jsp" class="tip-bottom">
                	<i class="icon-home"></i>
                                                    首页
                </a>
				<a href="${pageContext.request.contextPath }/GetAllJobServlet" class="current">职位信息管理</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="control-group">
						<span class="span3">
							编号：<input id="btnId" name="id" type="number" style="width:65%"/>
						</span>
                        <span class="span3">
							<button class="btn btn-info" onclick="selectById()">
								<i class="icon-white icon-search"></i>
								查询
							</button>
							<input type="reset" name="button" id="button" value="重置" />
						</span>
					</div>
				</div>
			</div>
			<hr/>
			<div class="row-fluid">
				<div class="span12" style="padding-left:30px;">
					<button class="btn btn-info" onclick="addJob();">
						<i class="icon-white icon-plus"></i>
						新增
					</button>
				</div>
				<div class="span12">
					<div class="widget-box">
						<div class="widget-content nopadding">
							<table class="table table-bordered table-striped">
									<tr>
										<th>编号</th>
										<th>名称</th>
										<th>岗位类型</th>
										<th>岗位编制</th>
										<th>操作</th>
									</tr>
                                   
              <c:forEach items="${list}" var="job" varStatus="vs">
              <tr>
	              <td>${job.id}</td>
	              <td>${job.ename }</td>
	              <td>${job.postType }</td>
	              <td>${job.postAllot}</td>
	              <td>
	                                            <button class="btn btn-info" onclick="allmessage${vs.index}()">
	                                                <i class="icon-white icon-eye-open"></i>
	                                                查看
	                                            </button>
	                                            <button class="btn btn-warning" onclick="gotomodify${vs.index}()">
	                                                <i class="icon-white icon-refresh"></i>
	                                                修改
	                                            </button>
	                                            <button class="btn btn-danger" onclick="delJob${vs.index}()">
	                                                <i class="icon-white icon-minus"></i>
	                                                删除
	                                            </button>
	                                            <script type="text/javascript">
	
		                                            	function allmessage${vs.index}(){
			                                                location.href="${pageContext.request.contextPath}/GetByIdServlet?id=${job.id}";
			                                            }
			                                           function gotomodify${vs.index}(){
			                                               location.href="${pageContext.request.contextPath}/UpdateJobServlet?id=${job.id}";
			                                           }
			                                           function delJob${vs.index}(){
			                                         	if( confirm("确定删除吗")){
			                                         		
			                                         	 location.href="${pageContext.request.contextPath}/DelJobServlet?id=${job.id}";	
			                                         		
			                                         	};
			                                           }
			                                           
	                                            </script>
					</td>
				</tr>	
              </c:forEach>                                                              
  <tr>
  <td colspan="5">
  <c:if test="${pageNum==1 }">
     首页 上一页
  </c:if>
  <c:if test="${pageNum>1 }">
<a href="${ pageContext.request.contextPath }/GetAllJobServlet?pageNum=1">[首页]</a>
  <a href="${ pageContext.request.contextPath }/GetAllJobServlet?pageNum=${ pageNum-1 }">[上一页]</a>
  </c:if>
 
   <c:forEach begin="1" end="${ page }" var="pageNum1">
    <c:if test="${pageNum1==pageNum }">
      [${pageNum1 }]
   </c:if>
    <c:if test="${pageNum1!=pageNum }">
      <a href="${ pageContext.request.contextPath }/GetAllJobServlet?pageNum=${ pageNum1 }">[${ pageNum1 }]</a>
   </c:if>				
   </c:forEach>
   <c:if test="${pageNum==page }">
      下一页   末页
   </c:if>
   <c:if test="${pageNum<page }">
   <a href="${ pageContext.request.contextPath }/GetAllJobServlet?pageNum=${ pageNum+1 }">下一页</a>
   <a href="${ pageContext.request.contextPath }/GetAllJobServlet?pageNum=${ page}">末页</a> 
   </c:if>
  </td>
 </tr>                                                 
							</table>							
						</div>
					</div>
				</div>
			</div>
			<div class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix"> 	 
			</div>
			</div>		
        <div class="row-fluid">&nbsp;</div>
        <div class="row-fluid">
            <div id="footer" class="span12">
                2019 &copy; 企业人事管理平台
            </div>
        </div>
		
	</body>
	<script type="text/javascript">
	function addJob(){
		location.href="${pageContext.request.contextPath}/addJob.jsp";
	}
	function selectById(){
 	   location = "${pageContext.request.contextPath}/GetByIdServlet?id="+$("#btnId").val();
    }
	}
    </script>
</html>

