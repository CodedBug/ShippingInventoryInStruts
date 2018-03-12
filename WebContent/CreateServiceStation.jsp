<%@ page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="requiredResources.jsp"></jsp:include>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="./staticResources/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		//$(".date").datepicker({ dateFormat: "yy-mm-dd" });
		$(".date").datepicker();
	});
</script>
</head>
<body id="top">

	<jsp:include page="menu.jsp"></jsp:include>

	<div class="wrapper row3">
		<br />
		<div id="table" class="hoc clear">
			<!-- ################################################################################################ -->
			<div id="purchase-detailed-table"></div>

			<form id="station" class="" method="post" action="createStation.do">

				<table id="example-table">

					<tr>
						<td>Station Name</td>
						<td><input type="text" name="stationName" value="" />
						</td>

						<td>UserName</td>
						<td><input type="text" name="userName" value="" /></td>

					</tr>
				</table>
				<table>
					<tr>
						<td>Approval Number</td>
						<td><input type="text" name="approvalNumber" value="" />
						</td>
						<td>Date of Issue</td>
						<td><input type="text" id="dateOfIssue" name="dateOfIssue"
							size="15px" value="mm-dd-yyy" class="date" />
						</td>
						<td>Date of Validation</td>
						<td><input type="text" id="dateOfValidation"
							name="dateOfValidation" size="15px" value="mm-dd-yyy"
							class="date" />
						</td>
						<td>Intermediate Inspection</td>
						<td><input type="text" id="intermediateInspection"
							name="intermediateInspection" size="15px" value="mm-dd-yyy"
							class="date" />
						</td>
					</tr>
					<tr>
						<td>Approval for Servicing of</td>
						<td colspan="2"><input type="checkbox"
							name="approvalForServicing" value="LifeRaft">LifeRaft <input
							type="checkbox" name="approvalForServicing" value="LIfeJacket">LIfeJacket
							<input type="checkbox" name="approvalForServicing" value="HRU">HRU
							<input type="checkbox" name="approvalForServicing"
							value="rescueBar">Rescue Bar <input type="checkbox"
							name="approvalForServicing" value="immersionSuit">Immersion
							Suit</td>
						<td>Approval for OEM</td>
						<td colspan="2"><input type="checkbox" name="approvalForOEM"
							value="OEM_ABC">OEM_ABC <input type="checkbox"
							name="approvalForOEM" value="OEM_XYZ">OEM_XYZ <input
							type="checkbox" name="approvalForServicing" value="OEM_CAS">OEM_CAS</td>
						<td>Active Status</td>
						<td>
							<fieldset id="active">
								Active<input type="radio" value="ACTIVE" name="active">
								Inactive<input type="radio" value="INACTIVE" name="active">
							</fieldset></td>
					</tr>
				</table>



				<div id="topbar" class="hoc clear">
					<!-- ################################################################################################ -->

					<div class="fl_right">
						<input type="submit" name="submit" value="Create Station" /> <input
							type="button" name="Reset" value="Reset" />
					</div>
				</div>
			</form>

			<!-- ################################################################################################ -->
		</div>
	</div>

	<div class="wrapper row3">
		<br />
		<div id="grid" class="hoc clear">
			<!-- ################################################################################################ -->
			<table>
				<thead>
					<tr>
						<td>Station ID</td>
						<td>Station Name</td>
						<td>Username</td>
						<td>Approval Number</td>
						<td>DOI</td>
						<td>DOV</td>
						<td>DOII</td>
						<td>Approval for Servicing</td>
						<td>Approval for OEM</td>
						<td>Active?</td>
				</thead>
				<tbody>
					<logic:iterate name="listStation" id="listStationID">
						<tr>

							<td><bean:write name="listStationID" property="stationID" />
							</td>
							<td><bean:write name="listStationID" property="stationName" />
							</td>
							<td><bean:write name="listStationID" property="stationUser" />
							</td>
							<td><bean:write name="listStationID"
									property="approvalNumber" />
							</td>
							<td><bean:write name="listStationID" property="DOI" />
							</td>
							<td><bean:write name="listStationID" property="DOV" />
							</td>
							<td><bean:write name="listStationID" property="DOII" />
							</td>

						</tr>
					</logic:iterate>
				</tbody>
			</table>
			<!-- 
			<script src="https://code.jquery.com/jquery-3.2.1.min.js"
				integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
				crossorigin="anonymous"></script>
			<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"
				integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU="
				crossorigin="anonymous"></script>

			<script type="text/javascript">
				var res = null;
				$(document).ready(function() {
					$.ajax({
						url : "getStationAbstract.do",
						context : document.body,
						success : function(response) {
							$('#table_abstract').html(response);

						},
						error : function(e) {
							console.log(e.responseText);
							alert('Error: ' + e);
						}
					});
				});
			</script>
			<span id="table_abstract"></span> -->

		</div>
	</div>
</body>
</html>