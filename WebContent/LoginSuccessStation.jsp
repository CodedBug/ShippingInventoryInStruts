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
<%-- 
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
</logic:present> --%>

</body>
</html>