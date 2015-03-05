<%@ include file="../../common/tagLibraries.jsp"%>

<style>
.userThumbnail {
	background: #ccc;
	margin-top: 5px;
	height: 50px;
	padding-top: 5px;
	cursor: pointer;
	margin-left: 5px;
}
</style>

<script>
	var allUserObjectsArray = [];
	var currentObject = null;
	var currentIteration = 0;
	
	var selectedUsersArray = [];
	selectedUserCount = 0;
	actualSelectedUserCount = 0;
</script>


<script>
	function isAlreadySelected(userId)
	{
		var isFound = false;
		var strink = "";
		for(var iterator = 0; iterator < selectedUserCount; iterator++)
		{
			strink += selectedUsersArray[iterator] + " ---";
			if(selectedUsersArray[iterator]==userId)
			{
				isFound = true;
			}
		}
		
		return isFound;
	}
	
	function removeUser(userId)
	{
		for(var iterator = 0; iterator < selectedUserCount; iterator++)
		{
			if(selectedUsersArray[iterator]==userId)
			{
				selectedUsersArray[iterator] = "deleted";
			}
		}
	}
	
	function selectUser(userId)
	{
		if(!isAlreadySelected(userId))
		{
			$("#"+userId).css("background","#777");
			selectedUsersArray[selectedUserCount]=userId;
			selectedUserCount++;
			actualSelectedUserCount++;
		}
		else
		{
			$("#"+userId).css("background","#ccc");
			removeUser(userId);
			actualSelectedUserCount--;
		}
	}
</script>
<c:forEach items="${allusers}" var="user">

	<script>
		currentObject = {
			id : ${user.id},
			firstName : "${user.firstName}",
			lastName : "${user.lastName}",
			currentDesignation : "${user.currentDesignation}",
			officeId: "${user.office.id}",
			officeName: "${user.office.name}"
		};
		
		allUserObjectsArray[currentIteration] = currentObject;
		currentIteration++;
	</script>

	<div class="col-md-3 userThumbnail" id="${user.id}"
		onclick="selectUser(${user.id})">
		<img src="/resources/images/avatar/profile-pic.png" alt="100 X 100"
			class="img-thumbnail" width="40px" height="40px" />
		${user.firstName} ${user.lastName}
	</div>
</c:forEach>