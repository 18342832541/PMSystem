<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">l>
<html>
	<head>
		<title>企业人事管理平台</title>
		<title>Insert title here</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="css/fullcalendar.css" />	
		<link rel="stylesheet" href="css/unicorn.main.css" />
		<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />
		<script src="js/excanvas.min.js"></script>
        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.ui.custom.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.flot.min.js"></script>
        <script src="js/jquery.flot.resize.min.js"></script>
        <script src="js/jquery.peity.min.js"></script>
        <script src="js/fullcalendar.min.js"></script>
        <script src="js/unicorn.js"></script>
        <script src="js/unicorn.dashboard.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
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
                <li class="active">
                    <a href="main.jsp">
                        <i class="icon icon-home"></i> 
                        <span>假的·首页</span>
                    </a>
                </li>
                <li>
                    <a href="empinfo.jsp">
                        <i class="icon icon-tag"></i> 
                        <span>假的·查看个人信息</span>
                    </a>
                </li>
                <li>
                    <a href="changePassword.jsp">
                        <i class="icon icon-ok-circle"></i> 
                        <span>假的·修改登录密码</span>
                    </a>
                </li>
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-time"></i> 
                        <span>假的·休假管理</span> 
                        <!--
                        <span class="label">2</span>
                        -->
                    </a>
                    <ul>
                        <li><a href="#">申请休假</a></li>
                        <li><a href="#">审批休假</a></li>
                        <li><a href="#">查看休假记录</a></li>
                        <li><a href="#">查看审批记录</a></li>
                        <li><a href="#">休假记录统计</a></li>
                        <li><a href="#">休假报表</a></li>
                        <li><a href="vtypelist.jsp">假期类型管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/GetAllEmpsServle">
                        <i class="icon icon-user"></i> 
                        <span>真的·员工信息管理</span> 
                    </a>
                </li>
                <li>
                    <a href="deptlist.jsp">
                        <i class="icon icon-flag"></i> 
                        <span>假的·部门信息管理</span> 
                    </a>
                </li>
                <li>
                    <a href="joblist.jsp">
                        <i class="icon icon-briefcase"></i> 
                        <span>假的·职位信息管理</span> 
                    </a>
                </li>
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-briefcase"></i> 
                        <span>报表信息管理</span> 
                    </a>
                    <ul>
                        <li><a href="LogsServlet?logsInfo=inEmp">新聘员工报表</a></li>
                        <li><a href="LogsServlet?logsInfo=outEmp">离职员工报表</a></li>
                        <li><a href="LogsServlet?logsInfo=deptTrans">部门调动员工报表</a></li>
                        <li><a href="LogsServlet?logsInfo=postTrans">岗位调动员工报表</a></li>
                        <li><a href="LogsServlet?logsInfo=Personnel">人事月报</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        
        
		<div id="content">
			<div id="content-header">
				<h1>首页</h1>
			</div>
			<div id="breadcrumb">
				<a href="#" class="tip-bottom">
                	<i class="icon-home"></i>
                                                    首页
                </a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12 center" >					
						<div class="widget-box">
							<div class="widget-title">
                            	<span class="icon">
                                	<i class="icon-file"></i>
                                </span>
                                
                                <h5>待办事项</h5>
                                <span class="label label-info tip-left" 
                                style="float:left">1</span>
                            </div>
							<div class="widget-content nopadding">
								<ul class="recent-posts">
									<li>
										<div class="article-post">
											<span class="user-info">
                                            	2个员工请假申请，请<a href="#">点击这里</a>进行审批
                                            </span>
										</div>
									</li>
								</ul>
							</div>
						</div>
					
					</div>	
				</div>
			</div>
			 
		</div>
        <div class="row-fluid">&nbsp;</div>
        <div class="row-fluid">
            <div id="footer" class="span12">
                2016 &copy; 企业人事管理平台
            </div>
        </div>
		
	</body>
</html>