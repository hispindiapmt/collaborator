<%@ include file="../common/tagLibraries.jsp"%>
<br>
  <a href="/addProject.html" class="btn btn-success">Add New Project</a>
  <br><br>
<table
	class="table table-striped table-bordered table-hover table-responsive"
	data-height="299">
	<thead>
		<tr>
			<th>Project Id</th>

			<th>Project Name</th>
			<th>Operations</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${projects}" var="project">
			<tr>
				<td>${project.id}</td>

				<td><a
					href='<spring:url value="/projects/${project.id}.html"></spring:url>'>
						${project.name}</a></td>
						
				<td><a
					href='<spring:url value="/editProject/${project.id}.html"></spring:url>'>
						<button type="button" class="btn btn-info">Edit</button>
				</a><a
					href='<spring:url value="/deleteProject/${project.id}.html"></spring:url>'>
						<button type="button" class="btn btn-danger">Delete</button>
				</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
