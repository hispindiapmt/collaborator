<%@ include file="../common/tagLibraries.jsp"%>
<br>
<a href="/addActivity/${project.id}.html" class="btn btn-success"
	data-toggle="modal" data-target="#activityModel">Add a new Activity</a>
<a href="/addMilestone/${project.id}.html" class="btn btn-success" data-toggle="modal" data-target="#milestoneModel">Add
	a new Milestone</a>
<br>
<br>

<table class="table table-hover">
	<tbody>
		<tr>
			<td>Name</td>
			<td>${project.name}</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${project.description}</td>
		</tr>
	</tbody>
</table>

<!-- ADD NEW MILESTONE *********************************************************** -->
<div class="modal fade" id="activityModel" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<form:form modelAttribute="newActivity"
				action="/addProjectActivityAction/${project.id}.html">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Add New Activity</h4>
				</div>
				<div class="modal-body">
					<!-- MODEL BODY ***************************************   -->
					<div class="panel-body">
						<br />
						<div class="form-group input-group">
							<span class="input-group-addon"><i
								class="fa fa-circle-o-notch"></i></span>
							<form:input placeholder="Project Name" cssClass="form-control"
								path="description" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-tag"></i></span>
							<form:input placeholder="Description" cssClass="form-control"
								path="type" />
						</div>


					</div>
					<!-- ***************************************************   -->
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
			</form:form>
		</div>
	</div>
</div>
<!-- ********************************************************************************** -->
<!-- ADD NEW MILESTONE ***************************************************************** -->

<div class="modal fade" id="milestoneModel" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<form:form modelAttribute="newMilestone"
				action="/addProjectMilestoneAction/${project.id}.html">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Add New Milestone</h4>
				</div>
				<div class="modal-body">
					<!-- MODEL BODY ***************************************   -->
					<div class="panel-body">
						<br />
						<div class="form-group input-group">
							<span class="input-group-addon"><i
								class="fa fa-circle-o-notch"></i></span>
							<form:input placeholder="Project Name" cssClass="form-control"
								path="description" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-tag"></i></span>
							<form:input placeholder="Description" cssClass="form-control"
								path="name" />
						</div>


					</div>
					<!-- ***************************************************   -->
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
			</form:form>
		</div>
	</div>
</div>

<!-- ACTIVITIES ************************************************************** -->
<table
	class="table table-striped table-bordered table-hover table-responsive"
	data-height="299">
	<thead>
		<tr>
			<th>Activity id</th>

			<th>Activity Name</th>
			<th>Operations</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${activities}" var="activity">
			<tr>
				<td>${activity.id}</td>

				<td><a
					href='<spring:url value="/activity/${activity.id}.html"></spring:url>'>
						${activity.description}</a></td>
				<td><a
					href='<spring:url value="/editActivity/${activity.id}.html"></spring:url>'>
						<button type="button" class="btn btn-info">Edit</button>
				</a><a
					href='<spring:url value="/deleteActivity/${activity.id}.html"></spring:url>'>
						<button type="button" class="btn btn-danger">Delete</button>
				</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<!-- MILESTONES **********************************************************************  -->
<table
	class="table table-striped table-bordered table-hover table-responsive"
	data-height="299">
	<thead>
		<tr>
			<th>Milestone id</th>

			<th>Milestone Name</th>
			<th>Operations</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${milestones}" var="milestone">
			<tr>
				<td>${milestone.id}</td>

				<td><a
					href='<spring:url value="/milestone/${milestone.id}.html"></spring:url>'>
						${milestone.description}</a></td>
				<td><a
					href='<spring:url value="/editMilestone/${milestone.id}.html"></spring:url>'>
						<button type="button" class="btn btn-info">Edit</button>
				</a><a
					href='<spring:url value="/deleteMilestone/${milestone.id}.html"></spring:url>'>
						<button type="button" class="btn btn-danger">Delete</button>
				</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
