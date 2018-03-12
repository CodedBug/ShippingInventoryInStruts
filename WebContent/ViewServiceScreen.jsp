<%@ page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="requiredResources.jsp"></jsp:include>


</head>
<body id="top">
	<jsp:include page="menu.jsp"></jsp:include>

	<div class="wrapper row3">
		<br />
		<div id="table" class="hoc clear">
			<!-- ################################################################################################ -->
			<div id="purchase-detailed-table"></div>

			<form id="New_Purchase" class="" method="post">

				<!-- ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ########### -->
				<table id="example-table">

					<tr>
						<td>Vessel Name</td>
						<td><input type="text" id="Vessel_Name" name="vesselName"
							size="15px" /></td>
						<td>Owner</td>
						<td><input type="text" id="Owner" name="owner" size="15px"
							value="" />
						</td>
						<td>Certificate Number</td>
						<td><input type="text" id="Certificate_Number"
							name="certificateNumber" size="15px" value="" />
						</td>
						<td>Make</td>
						<td><input type="text" id="Make" name="make" size="15px"
							value="" /></td>

					</tr>
					<tr>
						<td>Service On</td>
						<td><input type="text" id="Service_On" name="serviceOn"
							size="15px" value="" /></td>

						<td>Next Due</td>
						<td><input type="text" id="Next_Due" name="nextDue"
							size="15px" value="MM/DD/YYYY" /></td>

					</tr>
				</table>

				<!-- ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ########### -->
				<table>
					<thead>
						<th>Bouncy</th>
					</thead>
					<tr>
						<td>Arches</td>
						<td>
							<fieldset id="arches">
								OK<input type="radio" value="OK" name="arches"> REN<input
									type="radio" value="REN" name="arches">
							</fieldset></td>

						<td>Lifeline</td>
						<td>
							<fieldset id="Lifeline">
								OK<input type="radio" value="OK" name="lifeline"> REN<input
									type="radio" value="REN" name="lifeline">
							</fieldset></td>

						<td>Lifeline Patches</td>
						<td>
							<fieldset id="Lifeline_Patches">
								OK<input type="radio" value="OK" name="lifeLinePatches">
								REN<input type="radio" value="REN" name="lifeLinePatches">
							</fieldset></td>

						<td>Labels</td>
						<td>
							<fieldset id="Labels">
								OK<input type="radio" value="OK" name="labels"> REN<input
									type="radio" value="REN" name="labels">
							</fieldset></td>

						<td>Thawrt</td>
						<td>
							<fieldset id="Thawrt">
								OK<input type="radio" value="OK" name="thawrt"> REN<input
									type="radio" value="REN" name="thawrt">
							</fieldset></td>

					</tr>
				</table>



				<table>
					<thead>
						<th>Canopy</th>
					</thead>
					<tr>
						<td>Outer Canopy</td>
						<td>
							<fieldset id="Outer_Canopy">
								OK<input type="radio" value="OK" name="outerCanopy"> REN<input
									type="radio" value="REN" name="outerCanopy">
							</fieldset></td>

						<td>Inner Canopy</td>
						<td>
							<fieldset id="Inner_Canopy">
								OK<input type="radio" value="OK" name="innerCanopy"> REN<input
									type="radio" value="REN" name="innerCanopy">
							</fieldset></td>

						<td>Entrance Flaps</td>
						<td>
							<fieldset id="Entrance_Flaps">
								OK<input type="radio" value="OK" name="entranceFlaps">
								REN<input type="radio" value="REN" name="entranceFlaps">
							</fieldset></td>

						<td>Reflector Tape</td>
						<td>
							<fieldset id="Reflector_Tape">
								OK<input type="radio" value="OK" name="reflectorTape">
								REN<input type="radio" value="REN" name="reflectorTape">
							</fieldset></td>

						<td>Viewing Port</td>
						<td>
							<fieldset id="Viewing_Port">
								OK<input type="radio" value="OK" name="viewingPort"> REN<input
									type="radio" value="REN" name="viewingPort">
							</fieldset></td>

					</tr>
				</table>

				<table>
					<thead>
						<th>Emergency Equipment</th>
					</thead>
					<tbody>
						<tr>
							<td>Bellow</td>
							<td>
								<fieldset id="Bellow">
									OK<input type="radio" value="OK" name="bellow"> REN<input
										type="radio" value="REN" name="bellow">
								</fieldset></td>

							<td>Bungs</td>
							<td>
								<fieldset id="Bungs">
									OK<input type="radio" value="OK" name="bungs"> REN<input
										type="radio" value="REN" name="bungs">
								</fieldset></td>

							<td>Knife</td>
							<td>
								<fieldset id="Knife">
									OK<input type="radio" value="OK" name="knife"> REN<input
										type="radio" value="REN" name="knife">
								</fieldset></td>

							<td>Paddles</td>
							<td>
								<fieldset id="Paddles">
									OK<input type="radio" value="OK" name="paddles"> REN<input
										type="radio" value="REN" name="paddles">
								</fieldset></td>

							<td>Whistle</td>
							<td>
								<fieldset id="Whistle">
									OK<input type="radio" value="OK" name="whistle"> REN<input
										type="radio" value="REN" name="whistle">
								</fieldset></td>

						</tr>
					</tbody>
				</table>

				<!-- ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ########### -->
				<table style="width: 200px; float: left;">
					<thead>
						<th>Water</th>
					</thead>
					<tbody>
						<tr>
							<td><select id="select_water1" name="selectWater1">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="input_water1" name="inputWater1"
								size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="select_water2" name="selectWater2">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="input_water2" name="inputWater2"
								size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="select_water3" name="selectWater3">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="input_water3" name=inputWater3
								size="10px" value="" />
							</td>
						</tr>
					</tbody>
				</table>

				<table style="width: 200px; float: left;">
					<thead>
						<th>Ration</th>
					</thead>
					<tbody>
						<tr>
							<td><select id="select_ration1" name="selectRation1">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputRation1" name="inputRation1"
								size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="select_ration2" name="selectRation2">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputRation2" name="inputRation2"
								size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectRation3" name="selectRation3">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputRation3" name="inputRation3"
								size="10px" value="" />
							</td>
						</tr>
					</tbody>
				</table>
				<table style="width: 200px; float: left;">
					<thead>
						<th>HandFlares</th>
					</thead>
					<tbody>
						<tr>
							<td><select id="selectHandFlares1" name="selectHandFlares1">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputHandFlares1"
								name="inputHandFlares1" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectHandFlares2" name="selectHandFlares2">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputHandFlares2"
								name="inputHandFlares2" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectHandFlares3" name="selectHandFlares3">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputHandFlares3"
								name="inputHandFlares3" size="10px" value="" />
							</td>
						</tr>
					</tbody>
				</table>

				<table style="width: 200px; float: left;">
					<thead>
						<th>Smoke Floats</th>
					</thead>
					<tbody>
						<tr>
							<td><select id="selectSmokeFloats1"
								name="selectSmokeFloats1">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputSmokeFloats1"
								name="inputSmokeFloats1" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectSmokeFloats2"
								name="selectSmokeFloats2">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputSmokeFloats2"
								name="inputSmokeFloats2" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectSmokeFloats3"
								name="selectSmokeFloats3">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputSmokeFloats3"
								name="inputSmokeFloats3" size="10px" value="" />
							</td>
						</tr>
					</tbody>
				</table>

				<table style="width: 200px; float: left;">
					<thead>
						<th>Rocket Parachute</th>
					</thead>
					<tbody>
						<tr>
							<td><select id="selectRocketParachute1"
								name="selectRocketParachute1">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputRocketParachute1"
								name="inputRocketParachute1" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectRocketParachute2"
								name="selectRocketParachute2">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputRocketParachute2"
								name="input_Rocket_Parachute2" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectRocketParachute3"
								name="selectRocketParachute3">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputRocketParachute3"
								name="inputRocketParachute3" size="10px" value="" />
							</td>
						</tr>
					</tbody>

				</table>

				<table style="width: 200px; float: left;">
					<thead>
						<th>First Aid</th>
					</thead>
					<tbody>
						<tr>
							<td><select id="selectFirstAid1" name="selectFirstAid1">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputFirstAid1"
								name="input_First_Aid1" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectFirstAid2" name="selectFirstAid2">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputFirstAid2"
								name="inputFirstAid2" size="10px" value="" />
							</td>
						</tr>
						<tr>
							<td><select id="selectFirstAid3" name="selectFirstAid3">
									<option value="" selected="selected">Please select an
										option</option>
									<option value="Batch Number - Expiry Date - On Hand Quantity">Batch
										Number - Expiry Date - On Hand Quantity</option>

							</select></td>

							<td><input type="text" id="inputFirstAid3"
								name="inputFirstAid3" size="10px" value="" />
							</td>
						</tr>
					</tbody>

				</table>
				<!-- ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ###########  ########### -->

				<table style="width: 300px; float: left;">
					<thead>
						<th rowspan="2">Tests</th>
					</thead>
					<tbody>
						<tr>

							<td>WP Test</td>
							<td><input type="text" id="wpTest" name="wpTest" size="10px"
								value="" />
							</td>
						</tr>
						<tr>
							<td>NAP</td>
							<td><input type="text" id="nap" name="nap" size="10px"
								value="" />
							</td>
						</tr>
						<tr>

							<td>Floor Screen</td>
							<td><input type="text" id="Floor_Screen" name="floorScreen"
								size="10px" value="" />
							</td>
						</tr>
					</tbody>

				</table>


				<table>

					<tr>
						<td></td>
						<td>Time On</td>
						<td>Time Off</td>
						<td>Int Reading</td>
						<td>Int Temp</td>
						<td>Final Reading</td>
						<td>Final Temp</td>
						<td>Blow Off Set</td>
					</tr>
					<tr>
						<td>Upper Buoyancy</td>
						<td><input type="text" id="ubTimeON" name="ubTimeON"
							size="10px" /></td>
						<td><input type="text" id="ubTimeOFF" name="ubTimeOFF"
							size="10px" /></td>
						<td><input type="text" id="ubINTReading" name="ubINTReading"
							size="10px" /></td>
						<td><input type="text" id="ubINTTemp" name="ubINTTemp"
							size="10px" /></td>
						<td><input type="text" id="ubFinalReading"
							name="ubFinalReading" size="10px" /></td>
						<td><input type="text" id="ub_FinalTemp" name="ubFinalTemp"
							size="10px" /></td>
						<td><input type="text" id="ub_BlowOFFSet" name="ubBlowOFFSet"
							size="10px" /></td>
					</tr>
					<tr>
						<td>Lower Buoyancy</td>
						<td><input type="text" id="lbTimeON" name="lbTimeON"
							size="10px" /></td>
						<td><input type="text" id="lbTimeOFF" name="lbTimeOFF"
							size="10px" /></td>
						<td><input type="text" id="lbINTReading" name="lbINTReading"
							size="10px" /></td>
						<td><input type="text" id="lbINTTemp" name="lbINTTemp"
							size="10px" /></td>
						<td><input type="text" id="lbFinalReading"
							name="lbFinalReading" size="10px" /></td>
						<td><input type="text" id="lbFinalTemp" name="lbFinalTemp"
							size="10px" /></td>
						<td><input type="text" id="lbBlowOFFSet" name="lbBlowOFFSet"
							size="10px" /></td>
					</tr>

					<tr>
						<td>Floor</td>
						<td><input type="text" id="fTimeON" name="fTimeON"
							size="10px" /></td>
						<td><input type="text" id="fTimeOFF" name="fTimeOFF"
							size="10px" /></td>
						<td><input type="text" id="fINTReading" name="fINTReading"
							size="10px" /></td>
						<td><input type="text" id="fINTTemp" name="fINTTemp"
							size="10px" /></td>
						<td><input type="text" id="fFinalReading"
							name="fFinalReading" size="10px" /></td>
						<td><input type="text" id="fFinalTemp" name="fFinalTemp"
							size="10px" /></td>
						<td><input type="text" id="fBlowOFFSet" name="fBlowOFFSet"
							size="10px" /></td>
					</tr>


					</tbody>
				</table>

				General Comment: <input type="text" id="Comment" name="Comment"
					size="10px" />

				<div id="topbar" class="hoc clear">
					<!-- ################################################################################################ -->

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


</body>
</html>