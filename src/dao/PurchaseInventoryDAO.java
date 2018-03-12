package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.InventoryRowData;
import com.model.PurchaseAbstractForm;
import com.model.PurchaseForm;
import com.model.PurchaseInventoryForm;
import com.model.PurchaseRowData;

public class PurchaseInventoryDAO {
	private Connection con;

	public PurchaseInventoryDAO() {
		con = MyConnection.getConnection();
	}

	public List<InventoryRowData> readInventory(PurchaseInventoryForm pif) {
		try {
			int purchaseID = Integer.parseInt(pif.getPurchaseID());

			PreparedStatement stmt2 = con
					.prepareStatement("select pu.batchno, pu.manufacturer, i.itemname, i.categoryname, pu.quantity, pu.purchasedate, pu.expirydate, pu.importtype, p.creationtime, s.stationname,p.approved "
							+ "from purchaseunit pu, purchase p, item i, station s "
							+ "where pu.purchaseid=? and p.approved='TRUE' and p.id=? and pu.itemid=i.id and p.stationid=s.stationid");
			stmt2.setInt(1, purchaseID);
			stmt2.setInt(2, purchaseID);
			ResultSet rset2 = stmt2.executeQuery();

			System.out.println("Inside PurchaseInventoryDAO");

			List<InventoryRowData> list=new ArrayList<InventoryRowData>();
			while (rset2.next()) {
				InventoryRowData irData = new InventoryRowData();
				irData.setBatchNo(rset2.getString(1));
				irData.setManufacturer(rset2.getString(2));
				irData.setItemName(rset2.getString(3));
				irData.setCategoryName(rset2.getString(4));
				irData.setQuantity(rset2.getString(5));
				irData.setPurchaseDate(rset2.getString(6));
				irData.setExpiryDate(rset2.getString(7));
				irData.setImportType(rset2.getString(8));
				irData.setCreateTime(rset2.getString(9));
				irData.setStationName(rset2.getString(10));
				irData.setApproved(rset2.getString(11));
				
				list.add(irData);
			}

			return list;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
