<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="app">
<head>
<meta charset="UTF-8">
<title>Spring Demo</title>
<link rel="stylesheet" href="resources/css/bootstrap/css/bootstrap.css">

</head>
<body>
	<div class="container">

		<!-- Static navbar -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Spring Demo</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a ui-sref="home">Home</a></li>
						<li><a ui-sref="product-category">Product Category</a></li>
						<li><a ui-sref="product">Product</a></li>
					</ul>
					
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>

		<ui-view></ui-view>

	</div>
	<!-- /container -->

	

	<script type="text/javascript" src="resources/js/jquery-3.2.0.min.js"></script>
	<script type="text/javascript" src="resources/js/angular.js"></script>
	<script type="text/javascript" src="resources/js/angular-ui-router.min.js"></script>
	<script type="text/javascript" src="resources/app/app.js"></script>
	<script type="text/javascript" src="resources/controllers/index.controller.js"></script>
	<script type="text/javascript" src="resources/controllers/product.category.controller.js"></script>
	<script type="text/javascript" src="resources/controllers/product.controller.js"></script>
</body>
</html>