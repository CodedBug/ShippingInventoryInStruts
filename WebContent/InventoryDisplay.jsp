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

</head>
<body id="top">

	<jsp:include page="menu.jsp"></jsp:include>
	<div class="wrapper row3">
		<br />
		<div id="table" class="hoc clear">
			<table id="example-table">
				<thead>
					<tr>
						<th>Item Type</th>
						<th>Opening Balance</th>
						<th>Manufacturer</th>
						<th>Batch Number</th>
						<th>Quantity</th>
						<th>Purchase Date</th>
						<th>Expiry Date</th>
						<th>Import Type</th>
						<th>Station Name</th>
						<th>Invoice</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<logic:iterate name="listInventory" id="listInventoryID">
							<td><bean:write name="listInventoryID" property="itemName" />
							</td>

							<td><input type="hidden" name="hfName" value="Hand Flares" />
							</td>

							<td><bean:write name="listInventoryID"
									property="manufacturer" /></td>

							<td><bean:write name="listInventoryID" property="batchNo" />
							</td>

							<td><bean:write name="listInventoryID" property="quantity" />
							</td>

							<td><bean:write name="listInventoryID"
									property="purchaseDate" /></td>

							<td><bean:write name="listInventoryID" property="expiryDate" />
							</td>

							<td><bean:write name="listInventoryID" property="importType" />
							</td>

							<td><bean:write name="listInventoryID"
									property="stationName" /></td>

							<td></td>

						</logic:iterate>
					</tr>
				</tbody>
			</table>

		</div>
	</div>

</body>
</html>