<%@ include file="../../common/tagLibraries.jsp"%>

<style>
.userRoleThumbnail {
	background: #ccc;
	margin-top: 5px;
	height: 30px;
	padding-top: 5px;
	cursor: pointer;
	margin-left: 5px;
	font-weight: bolder;
	color: #333;
	text-align: center;
}
</style>

<script>
	var allUserRoleObjectsArray = [];
	var currentObject = null;
	var currentIteration = 0;
	
	var selectedUserRolesArray = [];
	selectedUserRoleCount = 0;
	actualSelectedUserRoleCount = 0;
</script>

<script>

	function addUserRolesToUser(roleId) {
		var xmlhttp;
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				//alert("Success");
			}
		}
		xmlhttp.open("POST", "/addUserRolesToUser.html?userId="+userId+"&roleId="+roleId, true);
		xmlhttp.send();
	}

	function removeUserRoleFromUser(roleId) {
		var xmlhttp;
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				//alert("fail");
			}
		}
		xmlhttp.open("POST", "/removeUserRoleFromUser.html?userId="+userId+"&roleId="+roleId, true);
		xmlhttp.send();
	}
</script>

<script>
	function isAlreadySelected(userRoleId)
	{
		var isFound = false;
		var strink = "";
		for(var iterator = 0; iterator < selectedUserRoleCount; iterator++)
		{
			if(selectedUserRolesArray[iterator]==userRoleId)
			{
				isFound = true;
			}
		}
		
		return isFound;
	}
	
	function removeUserRole(userRoleId)
	{
		for(var iterator = 0; iterator < selectedUserRoleCount; iterator++)
		{
			if(selectedUserRolesArray[iterator]==userRoleId)
			{
				selectedUserRolesArray[iterator] = "deleted";
			}
		}
		
		//server side
		removeUserRoleFromUser(userRoleId);
	}
	
	function selectUserRole(userRoleId)
	{
		if(!isAlreadySelected(userRoleId))
		{
			$("#"+userRoleId).css("background","#777");
			selectedUserRolesArray[selectedUserRoleCount]=userRoleId;
			selectedUserRoleCount++;
			actualSelectedUserRoleCount++;
			addUserRolesToUser(userRoleId);
		}
		else
		{
			$("#"+userRoleId).css("background","#ccc");
			removeUserRole(userRoleId);
			actualSelectedUserRoleCount--;
		}
	}
</script>

<c:forEach items="${allUserRoles}" var="userRole">

	<script>
		currentObject = {
			id : ${userRole.id},
			name : "${userRole.name}",
			description : "${userRole.description}"
		};
		
		allUserRoleObjectsArray[currentIteration] = currentObject;
		currentIteration++;
	</script>

	<div class="col-md-3 userRoleThumbnail" id="${userRole.id}"
		onclick="selectUserRole(${userRole.id})">${userRole.name}</div>
</c:forEach>

<c:forEach items="${selectedRoles}" var="selectedRole">
	<script>
		selectUserRole(${selectedRole.id});
	</script>
</c:forEach>