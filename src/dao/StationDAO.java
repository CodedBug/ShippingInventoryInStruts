package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.StationForm;

//import com.sun.org.apache.bcel.internal.generic.Type;

public class StationDAO {
	private Connection con;

	public StationDAO() {
		con = MyConnection.getConnection();
	}

	public boolean insertStation(StationForm stationForm) {
		try {

			String stationName = stationForm.getStationName();
			String userName = stationForm.getUserName();
			int approvalNumber = Integer.parseInt(stationForm
					.getApprovalNumber());

			java.util.Date dateOfIssue = new java.util.Date(
					stationForm.getDateOfIssue());
			java.util.Date intermediateInspection = new java.util.Date(
					stationForm.getIntermediateInspection());
			java.util.Date dateOfValidation = new java.util.Date(
					stationForm.getDateOfValidation());

			String[] approvalForServicing = stationForm
					.getApprovalForServicing();
			String[] approvalForOEM = stationForm.getApprovalForOEM();

			String active = stationForm.getActive();

			for (int i = 0; i < approvalForOEM.length; i++) {
				System.out.println(approvalForOEM[i]);
			}

			for (int i = 0; i < approvalForServicing.length; i++) {
				System.out.println(approvalForServicing[i]);
			}

			java.sql.Date dateOfIssueTime = new java.sql.Date(
					dateOfIssue.getTime());
			java.sql.Date intermediateInspectionTime = new java.sql.Date(
					intermediateInspection.getTime());
			java.sql.Date dateOfValidationTime = new java.sql.Date(
					dateOfValidation.getTime());

			PreparedStatement stmtstation = con
					.prepareStatement("insert into station values(station_seq.nextval,?,?,?,?,?,?,?)");
			stmtstation .setString(1, stationName);
			stmtstation .setString(2, userName);
			stmtstation .setString(3, active);
			stmtstation .setInt(4, approvalNumber);
			stmtstation .setDate(5, dateOfIssueTime);
			stmtstation .setDate(6, intermediateInspectionTime);
			stmtstation .setDate(7, dateOfValidationTime);

			 int stationinsert = stmtstation.executeUpdate();

			PreparedStatement stmtoem=null;
			for (int i = 0; i < approvalForOEM.length; i++) {
				stmtoem = con
						.prepareStatement("insert into stationoem values(station_seq.currval,?)");
				stmtoem.setString(1, approvalForOEM[i]);
				stmtoem.executeUpdate();
				stmtoem.clearParameters();
			}

			PreparedStatement stmtsi = null;
			for (int i = 0; i < approvalForServicing.length; i++) {
				stmtsi = con
						.prepareStatement("insert into stationserviceitem values(station_seq.currval,?)");
				stmtsi.setString(1, approvalForServicing[i]);
				stmtsi.executeUpdate();
				stmtsi.clearParameters();
			}
			
			stmtstation.close();
			stmtoem.close();
			stmtsi.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return true;

	}

}
