<%@ page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
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

			<table id="example-table">
				<tbody>
					<tr>
						<td>Purchase ID</td>
						<td>Station User</td>
						<td>Timestamp</td>
						<td>Approve Status</td>
						<td>Approve Action</td>
						<td>Inventory Action</td>

						<logic:iterate name="listPurchase" id="listPurchaseId">
							<tr>
								<td><bean:write name="listPurchaseId" property="purchaseID" />
								</td>

								<td><bean:write name="listPurchaseId"
										property="stationUser" />
								</td>
								<td><bean:write name="listPurchaseId"
										property="creationtime" />
								</td>
								<td><bean:write name="listPurchaseId"
										property="approvalStatus" />
								</td>
								<td><form action="approveStationPurchase.do" target="_blank">
										<input type="hidden" name="purchaseID"
											value="<bean:write name="listPurchaseId" property="purchaseID" />">
										<input type="submit" value="Approve" />
									</form> 
								</td>
								<td><form action="viewPurchaseInventory.do" target="_blank">
										<input type="hidden" name="purchaseID"
											value="<bean:write name="listPurchaseId" property="purchaseID" />">
										<input type="submit" value="View Inventory" />
									</form> 
								</td>
							</tr>
						</logic:iterate>
				</tbody>
			</table>



		</div>
	</div>

	<!-- <div class="wrapper row3">
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
				var res = null;

				$(document)
						.ready(
								function() {
									$('#table_abstract').empty();
									$
											.ajax({
												url : "getPurchaseAbstract.do",
												context : document.body,
												success : function(response) {

													$('#table_abstract').html(
															response);

													$(".table_abstract_id")
															.on(
																	'click',
																	function() {
																		var name = $(
																				this)
																				.data(
																						'tname');

																		$
																				.ajax({

																					//url : "getStationPurchase.do",
																					url : "approveStationPurchase.do",
																					//data: "purchaseID="+$(this).text(),
																					data : "purchaseID="
																							+ name,
																					context : document.body,
																					success : function(
																							response) {
																						console
																								.log(name);

																					},
																					error : function(
																							e) {
																						console
																								.log(e.responseText);
																						alert('Error: '
																								+ e);
																					}
																				});
																	});

													$(
															".table_abstract_inventory_id")
															.on(
																	'click',
																	function() {
																		var name = $(
																				this)
																				.data(
																						'tname');

																		$
																				.ajax({
																					url : "viewPurchaseInventory.do",
																					data : "purchaseID="
																							+ name,
																					context : document.body,
																					success : function(
																							response) {
																						console
																								.log(name);

																					},
																					error : function(
																							e) {
																						console
																								.log(e.responseText);
																						alert('Error: '
																								+ e);
																					}
																				});
																	});

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
	</div> -->
</body>
</html>