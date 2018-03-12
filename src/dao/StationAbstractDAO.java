package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.PurchaseAbstractForm;
import com.model.PurchaseForm;
import com.model.PurchaseRowData;
import com.model.StationAbstractForm;
import com.model.StationRowData;

public class StationAbstractDAO {
	private Connection con;

	public StationAbstractDAO() {
		con = MyConnection.getConnection();
	}

	public List readPurchase(StationAbstractForm paf) {
		try {

			// think about nullpointer exception of con and stmt and rset

			List<StationRowData> list = paf.getResults();

			PreparedStatement stmt2 = con
					.prepareStatement("select * from station");
			ResultSet rset2 = stmt2.executeQuery();

			System.out.println("Inside StationAbstractDAO");

			while (rset2.next()) {
				StationRowData prData = new StationRowData();
				prData.setStationID(rset2.getString(1));
				prData.setStationName(rset2.getString(2));
				prData.setStationUser(rset2.getString(3));
				prData.setActiveStatus(rset2.getString(4));
				prData.setApprovalNumber(rset2.getString(5));
				prData.setDOI(rset2.getString(6));
				prData.setDOV(rset2.getString(7));
				prData.setDOII(rset2.getString(8));

				System.out.println("Station id" + prData.getStationID() + " "
						+ "Station Name" + prData.getStationName() + " "
						+ "Station User" + prData.getStationUser() + " "
						+ "Active Status" + prData.getActiveStatus() + " "
						+ "Approval Number" + prData.getApprovalNumber() + " "
						+ "DOI" + prData.getDOI() + " " + "DOV"
						+ prData.getDOV() + " " + "DOII" + prData.getDOII());
				list.add(prData);
			}

			return list;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
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

	}

}
