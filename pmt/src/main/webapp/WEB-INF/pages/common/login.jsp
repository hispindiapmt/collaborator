<%@ include file="../common/tagLibraries.jsp"%>
<%@ include file="../common/styleSheetLinks.jsp"%>
<%@ include file="../common/javaScriptLinks.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="panel-body">
		<div class="container" style="width:40%">

			<form class="form-signin" form name='f'
				action='/j_spring_security_check' role="form" method='POST'>
				<h2 class="form-signin-heading">Please sign in</h2>
				<input type="text" id="inputEmail" name="j_username" class="form-control"
					placeholder="Username" required autofocus>
				 <input type="password" id="inputPassword" name="j_password" class="form-control"
					placeholder="Password" required>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
					in</button>
			</form>

		</div>
		<!-- /container -->
	</div>
</body>
</html>