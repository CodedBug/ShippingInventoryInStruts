package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.GetPurchaseUnitDataForm;
import com.model.GetPurchaseUnitRowData;
import com.model.InventoryRowData;
import com.model.PurchaseAbstractForm;
import com.model.PurchaseForm;
import com.model.PurchaseInventoryForm;
import com.model.PurchaseRowData;

public class GetPurchaseUnitDataDAO {
	private Connection con;

	public GetPurchaseUnitDataDAO() {
		con = MyConnection.getConnection();
	}

	/*
	 * public List<GetPurchaseUnitRowData> readInventory(
	 * GetPurchaseUnitDataForm gpudf, String stationName) {
	 */
	public List<GetPurchaseUnitRowData> readInventory(String stationName) {
		try {

			String strStationName = stationName;

			PreparedStatement stmtID = con
					.prepareStatement("select STATIONID from station where stationuser=?");
			stmtID.setString(1, strStationName);
			ResultSet rset = stmtID.executeQuery();
			int statioID=0;
			while (rset.next()) {
				statioID = rset.getInt("stationID");
			}

			PreparedStatement stmt2 = con
					.prepareStatement("select pu.batchno, pu.manufacturer, i.itemname, i.categoryname, pu.quantityleft, "
							+ "pu.expirydate, s.stationname, p.approved "
							+ "from purchaseunit pu, purchase p, item i, station s "
							+ "where s.stationid=? and p.approved='TRUE' and pu.itemid=i.id and p.stationid=s.stationid and pu.PURCHASEID=p.ID");
			stmt2.setInt(1, statioID);
			ResultSet rset2 = stmt2.executeQuery();

			System.out.println("Inside PurchaseInventoryDAO");

			List<GetPurchaseUnitRowData> list = new ArrayList<GetPurchaseUnitRowData>();
			while (rset2.next()) {
				GetPurchaseUnitRowData gpurData = new GetPurchaseUnitRowData();
				gpurData.setBatchNo(rset2.getString(1));
				gpurData.setManufacturer(rset2.getString(2));
				gpurData.setItemName(rset2.getString(3));
				gpurData.setCategoryName(rset2.getString(4));
				gpurData.setQuantityLeft(rset2.getString(5));
				gpurData.setExpiryDate(rset2.getString(6));
				gpurData.setStationName(rset2.getString(7));
				gpurData.setApproved(rset2.getString(8));
				list.add(gpurData);
			}

			return list;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
