<!--<//%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>-->
<!--<bean:write name="login" property="lastLoginTimeStamp" />-->
<%@ page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="requiredResources.jsp"></jsp:include>

<link
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css"
	rel="stylesheet">
<link
	href="https://cdn.datatables.net/buttons/1.5.1/css/buttons.dataTables.min.css"
	rel="stylesheet">
<link
	href="https://cdn.datatables.net/select/1.2.5/css/select.dataTables.min.css"
	rel="stylesheet">
<link href="./staticResources/dataTables/editor.dataTables.min.css"
	rel="stylesheet">

</head>
<body id="top">

	<div class="wrapper row0">
		<div id="topbar" class="hoc clear">
			<!-- ################################################################################################ -->
			<div class="fl_left">

				<%
					Login login = (Login) session.getAttribute("login");
					if (login.getUser().getUsername().equals("Mohit")) {
				%>
				<ul class="nospace">
					<li><a href="#">Station</a></li>
					<li><a href="#">View and Approve Purchase</a></li>
					<li><a href="#">view Service Certificate</a></li>
				</ul>
				<%
					}
				%>
				<%
					if (login.getUser().getUsername().equals("Abhi")) {
				%>
				<ul class="nospace">
					<li><a href="#">Purchase</a></li>
					<li><a href="#">Create Service</a></li>
					<li><a href="#">View Service Certificate</a></li>
					<li><a href="#">ROB Report</a></li>
				</ul>
				<%
					}
				%>

			</div>
		</div>
	</div>

	<div class="wrapper row1">
		<header id="header" class="hoc clear"> <!-- ################################################################################################ -->
		<div id="logo" class="fl_left">
			<h1>
				<%
					out.println(login.getUser().getUsername());
				%>
			</h1>
			<p>
				<%
					out.println(login.getLastLoginTimeStamp());
				%>
			</p>
		</div>
		<!-- ################################################################################################ -->
		<!-- ################################################################################################ -->
		</header>
	</div>


	<div class="wrapper row3">
		<br />
		<div id="table" class="hoc clear">

			<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
			<script
				src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
			<script
				src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
			<script
				src="https://cdn.datatables.net/select/1.2.5/js/dataTables.select.min.js"></script>
			<script type="text/javascript"
				src="./staticResources/dataTables/dataTables.editor.min.js"></script>

			<script>
				var editor; // use a global for the submit and return data rendering in the examples

				$(document)
						.ready(
								function() {
									editor = new $.fn.dataTable.Editor({
										ajax : "../php/staff.php",
										table : "#example",
										fields : [ {
											label : "First name:",
											name : "first_name"
										}, {
											label : "Last name:",
											name : "last_name"
										}, {
											label : "Position:",
											name : "position"
										}, {
											label : "Office:",
											name : "office"
										}, {
											label : "Extension:",
											name : "extn"
										}, {
											label : "Start date:",
											name : "start_date",
											type : "datetime"
										}, {
											label : "Salary:",
											name : "salary"
										} ]
									});

									$('#example')
											.DataTable(
													{
														dom : "Bfrtip",
														ajax : "../php/staff.php",
														columns : [
																{
																	data : null,
																	render : function(
																			data,
																			type,
																			row) {
																		// Combine the first and last names into a single table field
																		return data.first_name
																				+ ' '
																				+ data.last_name;
																	}
																},
																{
																	data : "position"
																},
																{
																	data : "office"
																},
																{
																	data : "extn"
																},
																{
																	data : "start_date"
																},
																{
																	data : "salary",
																	render : $.fn.dataTable.render
																			.number(
																					',',
																					'.',
																					0,
																					'$')
																} ],
														select : true,
														buttons : [ {
															extend : "create",
															editor : editor
														}, {
															extend : "edit",
															editor : editor
														}, {
															extend : "remove",
															editor : editor
														} ]
													});
								});
			</script>
			<table id="example" class="display" width="100%" cellspacing="0">
				<thead>
					<tr>
						<th>Name</th>
						<th>Position</th>
						<th>Office</th>
						<th>Extn.</th>
						<th>Start date</th>
						<th>Salary</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th>Name</th>
						<th>Position</th>
						<th>Office</th>
						<th>Extn.</th>
						<th>Start date</th>
						<th>Salary</th>
					</tr>
				</tfoot>
			</table>
			<!-- ################################################################################################ -->
		</div>
	</div>

</body>
</html>