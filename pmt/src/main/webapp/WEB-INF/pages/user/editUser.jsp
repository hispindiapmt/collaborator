<%@ include file="../common/tagLibraries.jsp"%>
<%@ page session="false"%>

<div class="panel-body">
	<form:form modelAttribute="userEdit" action="/saveEdit.html">
		<br />
		<form:hidden path="id" />
				
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

		<input type="submit" class="btn btn-success"
			value="Continue" />
	</form:form>
</div>