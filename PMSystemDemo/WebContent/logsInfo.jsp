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
				$("#pass1").blur(function (){
					validatePass1();
				});
				$("#pass1").focus(function (){
					validatePass1();
				});
				$("#pass2").blur(function (){
					validatePass2();
				});
				$("#pass2").focus(function (){
					validatePass2();
				});
				$("#pass3").blur(function (){
					validatePass3();
				});
				$("#pass3").focus(function (){
					validatePass3();
				});
				$("#pform").submit(function (){
					var flag = true;
					flag = validatePass1() && flag;
					flag = validatePass2() && flag;
					flag = validatePass3() && flag;
					return flag;
				});
				
			});
			function validatePass1(){
				var v = $("#pass1").val();
				if(v == ""){
					$("#info1").removeClass("success");
					$("#info1").addClass("error");
					return false;
				}else{
					$("#info1").removeClass("error");
					$("#info1").addClass("success");
					return true;
				}
			}
			function validatePass2(){
				var v = $("#pass2").val();
				if(v == ""){
					$("#info2").removeClass("success");
					$("#info2").addClass("error");
					return false;
				}else{
					$("#info2").removeClass("error");
					$("#info2").addClass("success");
					return true;
				}
			}
			function validatePass3(){
				var v1 = $("#pass3").val();
				var v2 = $("#pass2").val();
				if(v1 != v2){
					$("#info3").removeClass("success");
					$("#info3").addClass("error");
					return false;
				}else{
					$("#info3").removeClass("error");
					$("#info3").addClass("success");
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
                    <a href="login.html">
                        <i class="icon icon-share-alt"></i>
                        <span class="text">注销</span>
                    </a>
                </li>
            </ul>
        </div>
        <div id="sidebar">
            <ul>
                <li>
                    <a href="main.html">
                        <i class="icon icon-home"></i> 
                        <span>首页</span>
                    </a>
                </li>
                <li>
                    <a href="empinfo.html">
                        <i class="icon icon-tag"></i> 
                        <span>查看个人信息</span>
                    </a>
                </li>
                <li class="active">
                    <a href="changePassword.html">
                        <i class="icon icon-ok-circle"></i> 
                        <span>修改登录密码</span>
                    </a>
                </li>
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
                        <li><a href="vtypelist.html">假期类型管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="emplist.html">
                        <i class="icon icon-user"></i> 
                        <span>员工信息管理</span> 
                    </a>
                </li>
                <li>
                    <a href="deptlist.html">
                        <i class="icon icon-flag"></i> 
                        <span>部门信息管理</span> 
                    </a>
                </li>
                <li>
                    <a href="joblist.html">
                        <i class="icon icon-briefcase"></i> 
                        <span>职位信息管理</span> 
                    </a>
                </li>
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-briefcase"></i> 
                        <span>报表信息管理</span> 
                    </a>
                    <ul>
                        <li><a href="logsInfo.jsp?info=inEmp">新聘员工报表</a></li>
                        <li><a href="logsInfo.jsp?info=outEmp">离职员工报表</a></li>
                        <li><a href="logsInfo.jsp?info=deptTrans">部门调动员工报表</a></li>
                        <li><a href="logsInfo.jsp?info=postTrans">岗位调动员工报表</a></li>
                        <li><a href="logsInfo.jsp?info=Personnel">人事月报</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        
		<div id="content">
			<div id="content-header">
				<h1>报表信息管理</h1>
			</div>
			<div id="breadcrumb">
				<a href="main.html" class="tip-bottom">
                	<i class="icon-home"></i>首页
                </a>
				<a href="#" class="current">报表信息管理</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
						<div class="span12">
							<div class="widget-box">
								<div class="widget-title">
									<span class="icon">
										<i class="icon-align-justify"></i>					
									</span>
									<c:choose>
										<c:when test="">此处根据需要显示界面</c:when>
										<c:when test=""></c:when>
										<c:when test="">此处根据需要显示界面</c:when>
										<c:when test=""></c:when>
										<c:when test=""></c:when>
									</c:choose>
									<!-- 此处也需要做相应变换 -->
									<h5>职位信息管理${ logsInfo }</h5>
								</div>
								<hr/>
			<div class="row-fluid">
				<div class="span12" style="padding-left:30px;">
					<div class="widget-box">
						<div class="widget-content nopadding">
							<c:choose>
								<c:when test="">此处根据需要显示界面</c:when>
								<c:when test=""></c:when>
								<c:when test="">此处根据需要显示界面</c:when>
								<c:when test=""></c:when>
								<c:when test=""></c:when>
							</c:choose>
							<!-- <table class="table table-bordered table-striped">
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
                                    <tr>
                                        此处用estl遍历
                                    </tr>
								</tbody>
							</table>	  -->
						</div>
					</div>
				</div>
			</div>
			<div class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
				<div class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
			<a tabindex="0" href="javascript:"+method+"(1)" class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default">首页</a>
			<a tabindex="0" href="#" class="previous fg-button ui-button ui-state-default">上一页</a>
            <a tabindex="0" href="#" class="fg-button ui-button ui-state-default">1</a>
            <a tabindex="0" class="fg-button ui-button ui-state-default ui-state-disabled">2
            </a>
            <a tabindex="0" href="#" class="fg-button ui-button ui-state-default">3</a>
            <a tabindex="0" href="#" class="previous fg-button ui-button ui-state-default">下一页</a>
			<a tabindex="0" href="#" class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default">尾页</a>
			
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