<%@ include file="../common/tagLibraries.jsp"%>
<%@ page session="false"%>

<script>
	function register() 
	{
		var xmlhttp;
		if (window.XMLHttpRequest) 
		{
			// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else 
		{
			// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function()
		{
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
			{
				alert(xmlhttp.responseText);
			}
		}
		xmlhttp.open("POST", "/doSignup.html", true);
		xmlhttp.send();
	}
</script>


<div class="panel-body">
	<form:form commandName="user" action="/doSignup.html">
		<br />
		<div class="form-group input-group">
			<span class="input-group-addon"><i
				class="fa fa-circle-o-notch"></i></span>
			<form:input placeholder="First Name" cssClass="form-control"
				path="firstName" />
		</div>
		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:input placeholder="Last Name" cssClass="form-control"
				path="lastName" />
		</div>

		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:input placeholder="Employee ID" cssClass="form-control"
				path="employeeId" />
		</div>

		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:input placeholder="Address" cssClass="form-control"
				path="currentDesignation" />
		</div>

		<div class="form-group input-group">
			<span class="input-group-addon">@</span>
			<form:input placeholder="Email Address" cssClass="form-control"
				path="email" />
		</div>

		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:input placeholder="Contact Number" cssClass="form-control"
				path="contactNumber" />
		</div>
		
		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:input placeholder="User Name" cssClass="form-control"
				path="currentCredential.userName" />
		</div>
		
		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:password placeholder="Password" cssClass="form-control"
				path="currentCredential.password" />
		</div>
		
		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<input type="password" class="form-control" placeholder="Confirm Password"/>
		</div>

		<input type="submit" class="btn btn-success"
			value="Continue" />
	</form:form>
</div>