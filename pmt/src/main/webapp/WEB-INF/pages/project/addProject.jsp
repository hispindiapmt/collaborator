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
	<form:form commandName="project" action="/addProjectAction.html">
		<br />
		<div class="form-group input-group">
			<span class="input-group-addon"><i
				class="fa fa-circle-o-notch"></i></span>
			<form:input placeholder="Project Name" cssClass="form-control"
				path="name" />
		</div>
		<div class="form-group input-group">
			<span class="input-group-addon"><i class="fa fa-tag"></i></span>
			<form:input placeholder="Description" cssClass="form-control"
				path="description" />
		</div>

		<input type="submit" class="btn btn-success"
			value="Continue" />
	</form:form>
</div>