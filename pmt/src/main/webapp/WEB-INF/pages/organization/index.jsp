<%@ include file="../common/tagLibraries.jsp"%>
<%@ include file="../common/styleSheetLinks.jsp"%>
<%@ include file="../common/javaScriptLinks.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Collaborator</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../../../resources/css/index/home.css" rel="stylesheet">

</head>

<body id="page-top" class="index">

	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#page-top">Collaborator</a>
			</div>
			<form class="navbar-form navbar-nav navbar-right" name='f'
				action='/j_spring_security_check' role="form" method='POST'>
				<div class="form-group">
					<input type="text" name="j_username" class="form-control"
						placeholder="Username"> <input type="text"
						name="j_password" class="form-control" placeholder="Password">
					<button type="submit" class="btn btn-default">Sign-In</button>
				</div>

			</form>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-left">
					<li class="hidden"><a href="#page-top"></a></li>
					<li class="page-scroll"><a href="#portfolio">Branches</a></li>
					<li class="page-scroll"><a href="#about">About</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<!-- Header -->
	<header>
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<img class="img-responsive"
						src="../../../resources/images/final.png" alt="" width="700"
						height="500">
					<div class="intro-text"></div>
				</div>
			</div>
		</div>
	</header>

	<!-- Portfolio Grid Section -->
	<section id="portfolio">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>Branches</h2>
					<hr class="star-primary">
				</div>
			</div>

			<c:forEach items="${offices}" var="office">
				<c:if test="${offices.size() == 1}">
					<div class="oneBranch">
						<p class="small" align="center">${office.name}<br></br> ${office.location}<br></br>${office.description}<br></br>
						</p>
					</div>
				</c:if>
				<c:if test="${offices.size() == 2}">

					<div class="col-sm-6 oneBranch ">
						<p align="center">${office.name}<br></br> ${office.location}<br></br>${office.description}<br></br>
						</p>
					</div>

				</c:if>
				<c:if test="${offices.size() >= 3}">
					<div class="col-sm-4  portfolio-item">
						<p align="center">${office.name}<br></br> ${office.location}<br></br>${office.description}<br></br>
						</p>
					</div>
				</c:if>

			</c:forEach>

		</div>
	</section>

	<!-- About Section -->
	<section class="success" id="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>About</h2>
					<hr class="star-light">
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 col-lg-offset-2">
					<p>HISP hisp hisp hisp</p>
				</div>
				<div class="col-lg-4">
					<p>HISP hisp hisp hispHISP hisp hisp hispHISP hisp hisp hisp</p>
				</div>
			</div>
		</div>
	</section>

	<!-- Contact Section -->
	<!-- Footer -->
	<footer class="text-center">
		<div class="footer-above">
			<div class="container">
				<div class="row">
					<div class="footer-col col-md-4">
						<h3>Location</h3>
						<p>
							3481 Melrose Place<br>Beverly Hills, CA 90210
						</p>
					</div>
					<div class="footer-col col-md-4">
						<h3>Around the Web</h3>
					</div>
					<div class="footer-col col-md-4">
						<h3>About Collaborator</h3>

					</div>
				</div>
			</div>
		</div>
		<div class="footer-below">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">Copyright &copy; Your Website 2014</div>
				</div>
			</div>
		</div>
	</footer>

	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"> <i
			class="fa fa-chevron-up"></i>
		</a>
	</div>


	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="../../../resources/js/index/jquery-easing.js"></script>
	<script src="../../../resources/js/index/cbpAnimatedHeader.js"></script>
	
	<!-- Contact Form JavaScript -->
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/contact_me.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../../../resources/js/index/home.js"></script>

</body>

</html>
