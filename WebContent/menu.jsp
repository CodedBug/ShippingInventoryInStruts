<%@ page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="wrapper row0">
	<div id="topbar" class="hoc clear">
		<!-- ################################################################################################ -->
		<div class="fl_left">
			<%
				if (session.getAttribute("login") == null) {
					response.sendRedirect("/login.do");
				}
				Login login = (Login) session.getAttribute("login");
				if (login.getUser().getUsername().equals("Mohit")) {
			%>
			<ul class="nospace">
				<li><a href="station.do">Station</a>
				</li>
				<li><a href="viewApprovePurchase.do">View and Approve
						Purchase</a>
				</li>
				<li><a href="viewServiceCertificate.do">view Service
						Certificate</a>
				</li>
				<li>| <a href="logout.do">Logout</a>
				</li>
			</ul>
			<%
				}
			%>
			<%
				if (login.getUser().getUsername().equals("Abhi")) {
			%>
			<ul class="nospace">
				<li><a href="purchaseMenu.do">Purchase</a>
				</li>
				<li><a href="createServiceScreen.do">Create Service</a>
				</li>
				<li><a href="viewServiceCertificate.do">View Service
						Certificate</a>
				</li>
				<li><a href="robReport.do">ROB Report</a>
				</li>
				<li>| <a href="logout.do">Logout</a>
				</li>
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