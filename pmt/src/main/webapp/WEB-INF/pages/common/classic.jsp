<%@ include file="../common/tagLibraries.jsp"%>
<%@ include file="../common/styleSheetLinks.jsp"%>
<%@ include file="../common/javaScriptLinks.jsp"%>
<!DOCTYPE html>
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title><tiles:getAsString name="title" /></title>
</head>
<body>

	<div class="container">
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
					<a class="navbar-brand" href="<spring:url value="/"/>">Collaboator</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href='<spring:url value="/"/>'>Home</a></li>
						<li><a href='<spring:url value="/users.html"></spring:url>'>Users</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>


		<tiles:insertAttribute name="body" />

		<br> <br>

		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>