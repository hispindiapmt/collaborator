<%@ include file="../common/tagLibraries.jsp"%>
<%@ page session="false"%>

<div class="panel-body">
	<form:form modelAttribute="projectEdit" action="/saveEditedProject.html">
		<br />
		<form:hidden path="id" />
				
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