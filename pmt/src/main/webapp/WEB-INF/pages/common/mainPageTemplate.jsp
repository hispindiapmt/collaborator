<%@ include file="../common/tagLibraries.jsp"%>
<%@ include file="../common/styleSheetLinks.jsp"%>
<%@ include file="../common/javaScriptLinks.jsp"%>
<title>User</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- STYLE SHEETS -->
<%@ include file="../common/styleSheetLinks.jsp"%>

</head>
<body>
	<div>

		<!--BEGIN BACK TO TOP-->
		<a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
		<!--END BACK TO TOP-->

		<!--BEGIN TOPBAR-->
		<tiles:insertAttribute name="header" />
		<!--END TOPBAR-->

		<div id="wrapper">
			<!--BEGIN SIDEBAR MENU-->
			<tiles:insertAttribute name="leftSideBar" />
			<!--END SIDEBAR MENU-->

			<!--BEGIN CHAT FORM-->
			<tiles:insertAttribute name="chatBar" />
			<!--END CHAT FORM-->

			<!--BEGIN PAGE WRAPPER-->
			<div id="page-wrapper">
				<!--BEGIN TITLE & BREADCRUMB PAGE-->
				<tiles:insertAttribute name="body" />
				<!--END TITLE & BREADCRUMB PAGE-->

				<!--BEGIN FOOTER-->
				<tiles:insertAttribute name="footer" />
				<!--END FOOTER-->
			</div>
			<!--END PAGE WRAPPER-->
		</div>
	</div>

	<!-- JAVASCRIPTS -->
	<%@ include file="../common/javaScriptLinks.jsp"%>
	<!--CORE JAVASCRIPT-->
	<script src="../../resources/js/main.js"></script>