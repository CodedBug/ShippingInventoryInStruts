package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.ApproveStationPurchaseForm;
import com.model.Login;
import com.model.PurchaseForm;
import com.model.User;
import com.model.UserType;

//import com.sun.org.apache.bcel.internal.generic.Type;

public class ApproveStationPurchaseDAO {
	private Connection con;

	public ApproveStationPurchaseDAO() {
		con = MyConnection.getConnection();
	}

	public boolean insertPurchase(
			ApproveStationPurchaseForm approveStationPurchaseForm) {
		try {

			// think about nullpointer exception of con and stmt and rset

			int stationid = 1;// need to get the station id of the current
								// station user

			PreparedStatement stmt1 = con
					.prepareStatement("UPDATE purchase SET approved = 'TRUE' WHERE ID=?");

			// stmt1.setInt(1,stationid);
			stmt1.setInt(1, Integer.parseInt(approveStationPurchaseForm
					.getPurchaseID()));
			int purchaseUpdate = stmt1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

}
