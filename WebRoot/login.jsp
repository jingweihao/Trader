<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "S" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
   <link rel="stylesheet" type="text/css" href="bootstrap.css">
   <link rel="stylesheet" href="login.css" >
   <script src="jquery-2.2.3.min.js"></script>
   <script src="loginjs.js"></script>
   <!-- <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="login.css" rel="stylesheet">
   <script src="jquery-2.2.3.min.js"></script>
   <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
   <script src="loginjs.js"></script>  -->
</head>
<body>

<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<S:form id="login-form" action="LoginAction" method="get" role="form" cssStyle="display: block;" namespace = "/">
									<div class="form-group">
										<S:textfield name="username" tabindex="1" cssClass="form-control" placeholder="Username" value=""/>
									</div>
									<div class="form-group">
										<S:password name="password" tabindex="2" cssClass="form-control" placeholder="Password"/>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<S:submit tabindex="4" cssClass="form-control btn btn-login" value="Log In"/>
											</div>
										</div>
									</div>
								</S:form>
								<S:form id="register-form" action="RegisterAction" method="get" role="form" cssStyle="display: none;" namespace = "/">
									<div class="form-group">
										<S:textfield name="username" tabindex="1" cssClass="form-control" placeholder="Username" value=""/>
									</div>
									<div class="form-group">
										<S:textfield name="tel" tabindex="1" cssClass="form-control" placeholder="Telephone Number" value=""/>
									</div>
									<div class="form-group">
										<S:password name="password" tabindex="2" cssClass="form-control" placeholder="Password"/>
									</div>
									<div class="form-group">
										<S:password name="confirmpassword" tabindex="2" cssClass="form-control" placeholder="Confirm Password"/>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<S:submit tabindex="4" cssClass="form-control btn btn-register" value="Register Now"/>
											</div>
										</div>
									</div>
								</S:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>