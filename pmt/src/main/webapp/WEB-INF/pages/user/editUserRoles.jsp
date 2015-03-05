<%@ include file="../common/tagLibraries.jsp"%>
<br>
<script>
	var userId = "<%= request.getParameter("uId") %>";

	$(document).ready(function() {
		getAllUsers();
	});

	function getAllUsers() {
		var xmlhttp;
		if (window.XMLHttpRequest) {
			// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {
			// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				$("#users").append(xmlhttp.responseText+"</br></br>");
				$(".userThumbnail").click(function() {
					
				});
			}
		}
		xmlhttp.open("POST", "/getAllUserRoleObjectsAsList.html?uId="+userId, true);
		xmlhttp.send();
	}
</script>
<div id="users">

</div>