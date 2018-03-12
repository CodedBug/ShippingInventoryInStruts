<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
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

</head>
<body id="top">

	<jsp:include page="menu.jsp"></jsp:include>

<<<<<<< HEAD
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
							<td><input type="hidden" name="hfName" value="HAND FLARES" />
							</td>
							<td><input type="text" id="Manufacturer"
								name="hfManufacturer" size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number"
								name="hfBatchNumber" size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="hfQuantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="hfPurchaseDate"
								name="hfPurchaseDate" size="15px" value="yyyy-mm-dd"
								class="date" />
							</td>
							<td><input type="text" id="hfExpiryDate" name="hfExpiryDate"
								size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><select id="Import_Type" name="hfImportType">
									<option value="LOCAL">Local</option>
									<option value="INTERNATIONAL">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="hfImportType"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Rocket Parachute</td>
							<td><input type="hidden" name="rpName"
								value="ROCKET PARACHUTE" /></td>
							<td><input type="text" id="Manufacturer"
								name="rpManufacturer" size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number"
								name="rpBatchNumber" size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="rpQuantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="rpPurchaseDate"
								name="rpPurchaseDate" size="15px" value="yyyy-mm-dd"
								class="date" />
							</td>
							<td><input type="text" id="rpExpiryDate" name="rpExpiryDate"
								size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><select id="Import_Type" name="rpImportType">
									<option value="LOCAL">Local</option>
									<option value="INTERNATIONAL">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="rpInvoiceURL"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Smoke Signal</td>
							<td><input type="hidden" name="ssName" value="SMOKE SIGNAL" />
							</td>
							<td><input type="text" id="Manufacturer"
								name="ssManufacturer" size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number"
								name="ssBatchNumber" size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="ssQuantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="ssPurchaseDate"
								name="ssPurchaseDate" size="15px" value="yyyy-mm-dd"
								class="date" />
							</td>
							<td><input type="text" id="ssExpiryDate" name="ssExpiryDate"
								size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><select id="Import_Type" name="ssImportType">
									<option value="LOCAL">Local</option>
									<option value="INTERNATIONAL">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="ssInvoiceURL"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Food Ration</td>
							<td><input type="hidden" name="frName" value="FOOD RATION" />
							</td>
							<td><input type="text" id="Manufacturer"
								name="frManufacturer" size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number"
								name="frBatchNumber" size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="frQuantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="frPurchaseDate"
								name="frPurchaseDate" size="15px" value="yyyy-mm-dd"
								class="date" />
							</td>
							<td><input type="text" id="frExpiryDate" name="frExpiryDate"
								size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><select id="Import_Type" name="frImportType">
									<option value="LOCAL">Local</option>
									<option value="INTERNATIONAL">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="frInvoiceURL"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>Water</td>
							<td><input type="hidden" name="wName" value="WATER" /></td>
							<td><input type="text" id="Manufacturer"
								name="wManufacturer" size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number" name="wBatchNumber"
								size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="wQuantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="wPurchaseDate"
								name="wPurchaseDate" size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><input type="text" id="wExpiryDate" name="wExpiryDate"
								size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><select id="Import_Type" name="wImportType">
									<option value="LOCAL">Local</option>
									<option value="INTERNATIONAL">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="wInvoiceURL"
								accept="application/pdf" /></td>

						</tr>
						<tr>
							<td>First Aid</td>
							<td><input type="hidden" name="faName" value="FIRST AID" />
							</td>
							<td><input type="text" id="Manufacturer"
								name="faManufacturer" size="10px" value="" />
							</td>
							<td><input type="text" id="Batch_Number"
								name="faBatchNumber" size="10px" value="" />
							</td>
							<td><input type="text" id="Quantity" name="faQuantity"
								size="10px" value="" />
							</td>
							<td><input type="text" id="faPurchaseDate"
								name="faPurchaseDate" size="15px" value="yyyy-mm-dd"
								class="date" />
							</td>
							<td><input type="text" id="faExpiryDate" name="faExpiryDate"
								size="15px" value="yyyy-mm-dd" class="date" />
							</td>
							<td><select id="Import_Type" name="faImportType">
									<option value="LOCAL">Local</option>
									<option value="INTERNATIONAL">International</option>
							</select></td>
							<td><input type="file" id="Invoice" name="faInvoiceURL"
								accept="application/pdf" /></td>

						</tr>
					</tbody>
				</table>



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

<logic:present name="purchaseAbstractForm" property="results">
<hr width="100%" size="1" noshade="true">
<bean:size id="size" name="purchaseAbstractForm" property="results"/>
<logic:equal name="size" value="0">
<center><font color="red">No Purchase Record Found</b></font></center>
</logic:equal>
<logic:greaterThan name="size" value="0">
<table border="1">
<tr>
<th>Purchase Id</th>
<th>Station User</th>
<th>Timestamp</th>
<th>Approval Status</th>
</tr>
<logic:iterate id="result" name="purchaseAbstractForm" property="results">
<tr>
<td><bean:write name="result" property="purchaseid"/></td>
<td><bean:write name="result" property="stationuser"/></td>
<td><bean:write name="result" property="timestamp"/></td>
<td><bean:write name="result" property="approval status"/></td>
</tr>
</logic:iterate>
</table>
</logic:greaterThan>
</logic:present>


	<!--<div class="wrapper row3">
		<br />
		<div id="grid" class="hoc clear">
			 ################################################################################################ 
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
				var res = "oye";
				$(document).ready(function() {
					$.ajax({
						url : "getPurchaseAbstract.do",
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
			<span id="table_abstract"></span>
			
		</div>
	</div>
-->


=======
	
>>>>>>> b74ae3fcd978ea105ff8ea3b7339412cd40dd425
</body>
</html>