<jsp:include page="../common/tagLibraries.jsp" />

<div class="container">
	<table class="table table-hover">
		<tbody>
			<tr>
				<td>Name</td>
				<td>${user.firstName} ${user.lastName}</td>
			</tr>
			<tr>
				<td>Employee Id</td>
				<td>${user.employeeId}</td>
			</tr>
			<tr>
				<td>Office</td>
				<td>${user.office.name}</td>
			</tr>
		</tbody>
	</table>
</div>

<a href="/editUserRoles.html?uId=${user.id}" class="btn btn-success">Edit user roles</a>