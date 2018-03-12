<%@ page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		$("#Purchase_Date").datepicker();
	});
	$(function() {
		$("#Expiry_Date").datepicker();
	});
</script>
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
			<!-- ################################################################################################ -->
			<div id="purchase-detailed-table"></div>

			<form id="New_Purchase" class="" method="post" action="purchase.do">

				<table id="example-table">
					<thead>
						<tr>
							<th width="200">Item Type</th>
							<th tabulator-align="center">Opening Balance</th>
							<th>Manufacturer</th>
							<th>Batch Number</th>
							<th width="150">Quantity</th>
							<th>Purchase Date</th>
							<th>Expiry Date</th>
							<th>Import Type</th>
							<th>Invoice</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Hand Flares</td>
							<td></td>
							<td><input type="text" id="Manufacturer" name="Manufacturer"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="Batch Number"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="Quantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Purchase_Date"
								name="Purchase Date" size="15px" value="MM/DD/YYYY" />
							</td>
							<td><input type="text" id="Expiry_Date" name="Expiry Date"
								size="15px" value="MM/DD/YYYY" />
							</td>
							<td><select id="Import_Type" name="importType">
									<option value="Local">Local</option>
									<option value="International">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="Invoice"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Rocket Parachute</td>
							<td></td>
							<td><input type="text" id="Manufacturer" name="Manufacturer"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="Batch Number"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="Quantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Purchase_Date"
								name="Purchase Date" size="15px" value="MM/DD/YYYY" />
							</td>
							<td><input type="text" id="Expiry_Date" name="Expiry Date"
								size="15px" value="MM/DD/YYYY" />
							</td>
							<td><select id="Import_Type" name="importType">
									<option value="Local">Local</option>
									<option value="International">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="Invoice"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Smoke Signal</td>
							<td></td>
							<td><input type="text" id="Manufacturer" name="Manufacturer"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="Batch Number"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="Quantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Purchase_Date"
								name="Purchase Date" size="15px" value="MM/DD/YYYY" />
							</td>
							<td><input type="text" id="Expiry_Date" name="Expiry Date"
								size="15px" value="MM/DD/YYYY" />
							</td>
							<td><select id="Import_Type" name="importType">
									<option value="Local">Local</option>
									<option value="International">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="Invoice"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Food Ration</td>
							<td></td>
							<td><input type="text" id="Manufacturer" name="Manufacturer"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="Batch Number"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="Quantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Purchase_Date"
								name="Purchase Date" size="15px" value="MM/DD/YYYY" />
							</td>
							<td><input type="text" id="Expiry_Date" name="Expiry Date"
								size="15px" value="MM/DD/YYYY" />
							</td>
							<td><select id="Import_Type" name="importType">
									<option value="Local">Local</option>
									<option value="International">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="Invoice"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Water</td>
							<td></td>
							<td><input type="text" id="Manufacturer" name="Manufacturer"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="Batch Number"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="Quantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Purchase_Date"
								name="Purchase Date" size="15px" value="MM/DD/YYYY" />
							</td>
							<td><input type="text" id="Expiry_Date" name="Expiry Date"
								size="15px" value="MM/DD/YYYY" />
							</td>
							<td><select id="Import_Type" name="importType">
									<option value="Local">Local</option>
									<option value="International">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="Invoice"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>First Aid</td>
							<td></td>
							<td><input type="text" id="Manufacturer" name="Manufacturer"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="Batch Number"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="Quantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Purchase_Date"
								name="Purchase Date" size="15px" value="MM/DD/YYYY" />
							</td>
							<td><input type="text" id="Expiry_Date" name="Expiry Date"
								size="15px" value="MM/DD/YYYY" />
							</td>
							<td><select id="Import_Type" name="importType">
									<option value="Local">Local</option>
									<option value="International">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="Invoice"
								accept="application/pdf" /></td>

						</tr>
					</tbody>
				</table>
				
				
				<html:form action="/SaveOrderIndexed" >
    <table width="100%" border="1">
         
 
            <th width="25%" >Product ID</th>
            <th width="60%" >Name</th>
            <th width="15%">Quantity</th>
        |
        <logic:iterate id="purchaseItem" name="OrderIndexedForm" property="orderList">
            <html:hidden name="orderItem" property="productId" indexed="true" />
             
 
                |<bean:write name="orderItem" property="productId" />
                |<bean:write name="orderItem" property="productName" />
                |<html:text name="orderItem" property="quantity" size="30" indexed="true" />
            |
        </logic:iterate>
     
</table>
    <html:submit>Save</html:submit>
</html:form>
				
				
				
				
				
				
				
				
				
				
				
				<div id="topbar" class="hoc clear">
					<!-- ################################################################################################ -->
					<div class="fl_left">
						<input type="button" name="View Inventory" value="View Inventory" />
					</div>
					<div class="fl_right">
						<input type="submit" name="submit"
							value="Submit Purchase for Approval" /> <input type="button"
							name="Reset" value="Reset" />
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
			<div id="purchase-summary-table"></div>

			<script src="https://code.jquery.com/jquery-3.2.1.min.js"
				integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
				crossorigin="anonymous"></script>
			<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"
				integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU="
				crossorigin="anonymous"></script>
			<script type="text/javascript"
				src="./staticResources/tabulator/js/tabulator.min.js"></script>

			<script type="text/javascript"
				src="./staticResources/tabulator/moment-with-locales.min.js"></script>

			<script type="text/javascript">
				//sample data
				var tabledata = [ {
					Purchase_ID : 1,
					Station_User : "Abhi",
					Purchase_Type : "1",
					TimeStamp : "1/21/2018 12:27 AM",
					Approved : "Yes"
				},
				];
				$("#purchase-summary-table").tabulator({
					height : 200, // set height of table to enable virtual DOM
					data : tabledata, //load initial data into table
					layout : "fitColumns", //fit columns to width of table (optional)
					columns : [ //Define Table Columns
					{
						title : "Purchase_ID",
						field : "Purchase_ID",
						sorter : "number"
					}, {
						title : "Station_User",
						field : "Station_User",
						sorter : "string"
					}, {
						title : "Purchase_Type",
						field : "Purchase_Type",
						sorter : "string"
					}, {
						title : "TimeStamp",
						field : "TimeStamp",
						sorter : "date"
					}, {
						title : "Approved?",
						field : "Approved",
						sorter : "boolean"
					}, ],
					rowClick : function(e, Purchase_ID, data, row) { //trigger an alert message when the row is clicked
						alert("Row " + Purchase_ID + " Clicked!!!!");
					}
				});
			</script>
			<!-- ################################################################################################ -->
		</div>
	</div>
</body>
</html>