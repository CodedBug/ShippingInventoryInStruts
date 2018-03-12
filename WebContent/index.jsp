<%-- <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping Inventory</title>
<jsp:include page="requiredResources.jsp"></jsp:include>
</head>
<body id="top">

	<div class="wrapper row0">
		<div id="topbar" class="hoc clear">
			<!-- ################################################################################################ -->
			<div class="fl_left">

				Welcome to Shipping Inventory Management Application. <br> Use
				Below Login screen to log in either as Admin/Shipping Official or as
				Service Station

			</div>
		</div>
	</div>

	<div class="wrapper row0">
		<div id="topbar" class="hoc clear">
			<!-- ################################################################################################ -->

			<%-- <html:errors /> --%>

			<form action="login.do" method="post">
				userid<input type="text" name="username"><br> password<input
					type="password" name="password"><br> <input
					type="submit" value="submit">

			</form>

		</div>
	</div>

</body>
</html>