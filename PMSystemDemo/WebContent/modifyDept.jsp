<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
        	$(document).ready(function (){
        		$("form input").blur(function (){
        			validateInput(this);
        		});
        		$("form").submit(function (){
        			var f = true;

        			var a = $("form input"); 
        			
        			for(var i = 0; i < a.size(); i++){
        				var t = validateInput(a.get(i));
        				f = f && t;
        			}
        			return f;
        		});
        		$("#userid").bind("input", function (){
        			var userid = $(this).val();
        			if(userid == 1045){
        				$("#span1").html("李建国");
        			}else{
        				$("#span1").html("员工姓名");
        			}
        		})
        	});

        	function validateInput(obj){
        		var v = $(obj).val();
    			if(v == ""){
    				$(obj).parent().parent().removeClass("success");
					$(obj).parent().parent().addClass("error");
					return false;
    			}else{
    				$(obj).parent().parent().removeClass("error");
					$(obj).parent().parent().addClass("success");
					return true;
    			}
        	}
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
<<<<<<< HEAD
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-time"></i> 
                        <span>休假管理</span> 
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
=======
>>>>>>> refs/remotes/origin/master
                <li>
                    <a href="emplist.jsp">
                        <i class="icon icon-user"></i> 
                        <span>员工信息管理</span> 
                    </a>
                </li>
                <li class="active">
<<<<<<< HEAD
                    <a href="deptlist.jsp">
=======
                    <a href="${pageContext.request.contextPath }/GetAllDeptServlet">
>>>>>>> refs/remotes/origin/master
                        <i class="icon icon-flag"></i> 
                        <span>部门信息管理</span> 
                    </a>
                </li>
                <li>
<<<<<<< HEAD
                    <a href="joblist.jsp">
=======
                    <a href="${pageContext.request.contextPath }/GetAllJobServlet">
>>>>>>> refs/remotes/origin/master
                        <i class="icon icon-briefcase"></i> 
                        <span>职位信息管理</span> 
                    </a>
                </li>
            </ul>
        </div>
		<div id="content">
			<div id="content-header">
				<h1>修改部门</h1>
			</div>
			<div id="breadcrumb">
				<a href="main.jsp" class="tip-bottom">
                	<i class="icon-home"></i>
                                                    首页
                </a>
				<a href="deptlist.jsp">部门列表</a>
				<a href="#" class="current">修改部门</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon">
										<i class="icon-align-justify"></i>									
									</span>
									<h5>部门信息</h5>
								</div>
							<div class="widget-content nopadding">
									<form action="${pageContext.request.contextPath}/UpdateDeptServlet" method="post">                                   
	                                    <div id="info1" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                        	编号：
	                                        </label>
	                                        <div class="controls">
	                                            <input type="number" name="id" id="id" value="${dept.id}" />
	                                        </div>
	                                    </div>
	                                      <div id="info1" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                        	部门名称:
	                                        </label>
	                                        <div class="controls">
	                                            <input type="text" name="dname" id="dname" value="${dept.dname}"  />
	                                        </div>
	                                    </div>
	                                    <div id="info1" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                        	部门类型:
	                                        </label>
	                                        <div class="controls">
	                                            <input type="text" name="type" id="type" value="${dept.type}" />
	                                        </div>
	                                    </div>
	                                    <div id="info2" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                        	电话：
	                                        </label>
	                                        <div class="controls">
	                                            <input type="text" name="phone" id="phone" value="${dept.phone}"/>
	                                        </div>
	                                    </div>
	                                    <div id="info1" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                                                                                                                   邮箱  :
	                                        </label>
	                                        <div class="controls">
	                                            <input type="text" name="email" id="email" value="${dept.email}" />
	                                        </div>
	                                    </div>
	                                     <div id="info1" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                        	描述:
	                                        </label>
	                                        <div class="controls">
	                                            <input type="text" name="depict" id="depict" value="${dept.depict}" />
	                                        </div>
	                                    </div>
	                                     <div id="info1" class="control-group">
	                                        <label class="control-label">
	                                        	<span style="color: red">*</span>
	                                        	上级:
	                                        </label>
	                                        <div class="controls">
	                                            <input type="text" name="mgr" id="mgr" value="${dept.mgr}" />
	                                        </div>
	                                    </div>
	                                            <input type="hidden" name="date" id="date" value="${dept.date}" />
	                                                               
	                                    <div class="form-actions">
	                                        <input type="submit" value="提交" class="btn btn-primary" />
	                                        <input type="reset" value="重置" class="btn btn-primary" />
	                                    </div>
	                                </form>
								</div>
							</div>			
						</div>
				</div>	
			</div>	
<<<<<<< HEAD

            <div class="alert alert-error">
<!--                 保存失败
            </div>

            <div class="alert alert-success">
                保存成功
            </div> -->

			
		</div>		
=======
		</div>	
>>>>>>> refs/remotes/origin/master
        <div class="row-fluid">&nbsp;</div>
        <div class="row-fluid">
            <div id="footer" class="span12">
                2019 &copy; 企业人事管理平台
            </div>
        </div>
		
	</body>
</html>

