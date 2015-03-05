<%@ include file="../common/tagLibraries.jsp"%>
<table
	class="table table-striped table-bordered table-hover table-responsive"
	data-height="299">
	<thead>
		<tr>
			<th>user id</th>

			<th>User Name</th>
			<th>Operations</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>

				<td><a
					href='<spring:url value="/users/${user.id}.html"></spring:url>'>
						${user.firstName} ${user.lastName} </a></td>
				<td><a
					href='<spring:url value="/editUser/${user.id}.html"></spring:url>'>
						<button type="button" class="btn btn-info">Edit</button>
				</a><a
					href='<spring:url value="/deleteUser/${user.id}.html"></spring:url>'>
						<button type="button" class="btn btn-danger">Delete</button>
				</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
