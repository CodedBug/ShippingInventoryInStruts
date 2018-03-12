<%@page import="com.model.*"  %>
<head>
</head>
<body>
<% 
Purchase purchase=(Purchase) session.getAttribute("purchase");
out.println("Approval status is "+purchase.isApproved());
out.println("<br>");
out.println();
%>
</body>
</html>