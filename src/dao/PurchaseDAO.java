package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.Login;
import com.model.PurchaseForm;
import com.model.User;
import com.model.UserType;

//import com.sun.org.apache.bcel.internal.generic.Type;

public class PurchaseDAO {
	private Connection con;

	public PurchaseDAO() {
		con = MyConnection.getConnection();
	}

	public boolean insertPurchase(PurchaseForm purchaseForm) {
		try {

			// think about nullpointer exception of con and stmt and rset

			int stationid = 1;// need to get the station id of the current
								// station user

			PreparedStatement stmt1 = con
					.prepareStatement("insert into purchase values(purchase_seq.nextval,?,localtimestamp,'FALSE')");
			stmt1.setInt(1, stationid);
			int purchaseinsert = stmt1.executeUpdate();

			// for hand flares
			String hfName = purchaseForm.getHfName();
			String hfManufacturer = purchaseForm.getHfManufacturer();
			String hfBatchNumber = purchaseForm.getHfBatchNumber();
			int hfQuantity = Integer.parseInt(purchaseForm.getHfQuantity());
			java.util.Date hfPurchaseDate = new java.util.Date(
					purchaseForm.getHfPurchaseDate());
			java.util.Date hfExpiryDate = new java.util.Date(
					purchaseForm.getHfExpiryDate());
			String hfImportType = purchaseForm.getHfImportType();
			String hfInvoiceURL = purchaseForm.getHfInvoiceURL();

			/*
			 * PreparedStatement stmtItmName=con.prepareStatement(
			 * "select id from item where itemname=?");
			 * stmtItmName.setString(1,hfName); ResultSet
			 * rset=stmtItmName.executeQuery(); int itemid=-1;
			 * 
			 * if(rset.next()) itemid=rset.getInt(1);
			 */

			System.out.println(hfName + " " + hfManufacturer + " "
					+ hfBatchNumber + " " + " " + hfQuantity + " "
					+ hfPurchaseDate + " " + hfExpiryDate + " " + hfImportType
					+ " " + hfInvoiceURL);

			// pu purchase unit
			// insert into purchaseunit
			// values(pu_seq.nextval,item_seq.currval,2,sysdate,sysdate,'LOCAL','/file/zz',purchase_seq.currval);

			// pd is purchase date

			java.sql.Date hfpd = new java.sql.Date(hfPurchaseDate.getTime());
			java.sql.Date hfed = new java.sql.Date(hfExpiryDate.getTime());

			PreparedStatement hfpuStmt = con
					.prepareStatement("insert into purchaseUnit values(pu_seq.nextval,?,?,?,?,?,?,?,?,purchase_seq.currval,?) ");
			hfpuStmt.setInt(1, 1);// it should be fetched from item table
			hfpuStmt.setString(2, hfBatchNumber);
			hfpuStmt.setString(3, hfManufacturer);
			hfpuStmt.setInt(4, hfQuantity);
			hfpuStmt.setDate(5, hfpd);
			hfpuStmt.setDate(6, hfed);
			hfpuStmt.setString(7, hfImportType);
			hfpuStmt.setString(8, hfInvoiceURL);
			hfpuStmt.setInt(9, hfQuantity);

			hfpuStmt.executeUpdate();

			// one purchase unit entry is done till now
			// rocket parachute

			String rpName = purchaseForm.getRpName();
			String rpManufacturer = purchaseForm.getRpManufacturer();
			String rpBatchNumber = purchaseForm.getRpBatchNumber();
			int rpQuantity = Integer.parseInt(purchaseForm.getRpQuantity());
			java.util.Date rpPurchaseDate = new java.util.Date(
					purchaseForm.getRpPurchaseDate());
			java.util.Date rpExpiryDate = new java.util.Date(
					purchaseForm.getRpExpiryDate());
			String rpImportType = purchaseForm.getRpImportType();
			String rpInvoiceURL = purchaseForm.getRpInvoiceURL();

			System.out.println(rpName + " " + rpManufacturer + " "
					+ rpBatchNumber + " " + " " + rpQuantity + " "
					+ rpPurchaseDate + " " + rpExpiryDate + " " + rpImportType
					+ " " + rpInvoiceURL);

			java.sql.Date rppd = new java.sql.Date(rpPurchaseDate.getTime());
			java.sql.Date rped = new java.sql.Date(rpExpiryDate.getTime());

			PreparedStatement rppuStmt = con
					.prepareStatement("insert into purchaseUnit values(pu_seq.nextval,?,?,?,?,?,?,?,?,purchase_seq.currval,?) ");
			rppuStmt.setInt(1, 2);
			rppuStmt.setString(2, rpBatchNumber);
			rppuStmt.setString(3, rpManufacturer);
			rppuStmt.setInt(4, rpQuantity);
			rppuStmt.setDate(5, rppd);
			rppuStmt.setDate(6, rped);
			rppuStmt.setString(7, rpImportType);
			rppuStmt.setString(8, rpInvoiceURL);
			rppuStmt.setInt(9, rpQuantity);
			rppuStmt.executeUpdate();

			// ==================================================
			// smoke signal

			String ssName = purchaseForm.getSsName();
			String ssManufacturer = purchaseForm.getSsManufacturer();
			String ssBatchNumber = purchaseForm.getSsBatchNumber();
			int ssQuantity = Integer.parseInt(purchaseForm.getSsQuantity());
			java.util.Date ssPurchaseDate = new java.util.Date(
					purchaseForm.getSsPurchaseDate());
			java.util.Date ssExpiryDate = new java.util.Date(
					purchaseForm.getSsExpiryDate());
			String ssImportType = purchaseForm.getSsImportType();
			String ssInvoiceURL = purchaseForm.getSsInvoiceURL();

			System.out.println(ssName + " " + ssManufacturer + " "
					+ ssBatchNumber + " " + " " + ssQuantity + " "
					+ ssPurchaseDate + " " + ssExpiryDate + " " + ssImportType
					+ " " + ssInvoiceURL);

			/*
			 * stmtItmName.clearParameters();
			 * 
			 * stmtItmName.setString(1,ssName); rset=stmtItmName.executeQuery();
			 * itemid=-1;
			 * 
			 * if(rset.next()) itemid=rset.getInt(1);
			 */

			java.sql.Date sspd = new java.sql.Date(rpPurchaseDate.getTime());
			java.sql.Date ssed = new java.sql.Date(rpExpiryDate.getTime());

			PreparedStatement sspuStmt = con
					.prepareStatement("insert into purchaseUnit values(pu_seq.nextval,?,?,?,?,?,?,?,?,purchase_seq.currval,?) ");

			sspuStmt.setInt(1, 3);
			sspuStmt.setString(2, ssBatchNumber);
			sspuStmt.setString(3, ssManufacturer);
			sspuStmt.setInt(4, ssQuantity);
			sspuStmt.setDate(5, sspd);
			sspuStmt.setDate(6, ssed);
			sspuStmt.setString(7, ssImportType);
			sspuStmt.setString(8, ssInvoiceURL);
			sspuStmt.setInt(9, ssQuantity);

			sspuStmt.executeUpdate();

			// =================================================
			// food ration no category

			String frName = purchaseForm.getFrName();
			String frManufacturer = purchaseForm.getFrManufacturer();
			String frBatchNumber = purchaseForm.getFrBatchNumber();
			int frQuantity = Integer.parseInt(purchaseForm.getFrQuantity());
			java.util.Date frPurchaseDate = new java.util.Date(
					purchaseForm.getFrPurchaseDate());
			java.util.Date frExpiryDate = new java.util.Date(
					purchaseForm.getFrExpiryDate());
			String frImportType = purchaseForm.getFrImportType();
			String frInvoiceURL = purchaseForm.getFrInvoiceURL();

			System.out.println(frName + " " + frManufacturer + " "
					+ frBatchNumber + " " + " " + frQuantity + " "
					+ frPurchaseDate + " " + frExpiryDate + " " + frImportType
					+ " " + frInvoiceURL);

			/*
			 * stmtItmName.clearParameters();
			 * 
			 * stmtItmName.setString(1,frName); rset=stmtItmName.executeQuery();
			 * itemid=-1;
			 * 
			 * if(rset.next()) itemid=rset.getInt(1);
			 */

			java.sql.Date frpd = new java.sql.Date(frPurchaseDate.getTime());
			java.sql.Date fred = new java.sql.Date(frExpiryDate.getTime());

			PreparedStatement frpuStmt = con
					.prepareStatement("insert into purchaseUnit values(pu_seq.nextval,?,?,?,?,?,?,?,?,purchase_seq.currval,?) ");

			frpuStmt.setInt(1, 4);
			frpuStmt.setString(2, frBatchNumber);
			frpuStmt.setString(3, frManufacturer);
			frpuStmt.setInt(4, frQuantity);
			frpuStmt.setDate(5, frpd);
			frpuStmt.setDate(6, fred);
			frpuStmt.setString(7, frImportType);
			frpuStmt.setString(8, frInvoiceURL);
			frpuStmt.setInt(9, frQuantity);

			frpuStmt.executeUpdate();

			// =================================================
			// water no category

			String wName = purchaseForm.getwName();
			String wManufacturer = purchaseForm.getwManufacturer();
			String wBatchNumber = purchaseForm.getwBatchNumber();
			int wQuantity = Integer.parseInt(purchaseForm.getwQuantity());
			java.util.Date wPurchaseDate = new java.util.Date(
					purchaseForm.getwPurchaseDate());
			java.util.Date wExpiryDate = new java.util.Date(
					purchaseForm.getwExpiryDate());
			String wImportType = purchaseForm.getwImportType();
			String wInvoiceURL = purchaseForm.getwInvoiceURL();

			System.out.println(wName + " " + wManufacturer + " " + wBatchNumber
					+ " " + " " + wQuantity + " " + wPurchaseDate + " "
					+ wExpiryDate + " " + wImportType + " " + wInvoiceURL);

			/*
			 * stmtItmName.clearParameters();
			 * 
			 * stmtItmName.setString(1,wName); rset=stmtItmName.executeQuery();
			 * itemid=-1;
			 * 
			 * if(rset.next()) itemid=rset.getInt(1);
			 */

			java.sql.Date wpd = new java.sql.Date(wPurchaseDate.getTime());
			java.sql.Date wed = new java.sql.Date(wExpiryDate.getTime());

			PreparedStatement wpuStmt = con
					.prepareStatement("insert into purchaseUnit values(pu_seq.nextval,?,?,?,?,?,?,?,?,purchase_seq.currval,?) ");
			wpuStmt.setInt(1, 5);
			wpuStmt.setString(2, wBatchNumber);
			wpuStmt.setString(3, wManufacturer);

			wpuStmt.setInt(4, wQuantity);

			wpuStmt.setDate(5, wpd);
			wpuStmt.setDate(6, wed);
			wpuStmt.setString(7, wImportType);
			wpuStmt.setString(8, wInvoiceURL);
			wpuStmt.setInt(9, wQuantity);

			wpuStmt.executeUpdate();

			// =============================================================
			// first aid no category

			String faName = purchaseForm.getFaName();
			String faManufacturer = purchaseForm.getFaManufacturer();
			String faBatchNumber = purchaseForm.getFaBatchNumber();
			int faQuantity = Integer.parseInt(purchaseForm.getFaQuantity());
			java.util.Date faPurchaseDate = new java.util.Date(
					purchaseForm.getFaPurchaseDate());
			java.util.Date faExpiryDate = new java.util.Date(
					purchaseForm.getFaExpiryDate());
			String faImportType = purchaseForm.getFaImportType();
			String faInvoiceURL = purchaseForm.getFaInvoiceURL();

			System.out.println(faName + " " + faManufacturer + " "
					+ faBatchNumber + " " + " " + faQuantity + " "
					+ faPurchaseDate + " " + faExpiryDate + " " + faImportType
					+ " " + faInvoiceURL);

			/*
			 * stmtItmName.clearParameters();
			 * 
			 * stmtItmName.setString(1,faName); rset=stmtItmName.executeQuery();
			 * itemid=-1;
			 * 
			 * if(rset.next()) itemid=rset.getInt(1);
			 */

			java.sql.Date fapd = new java.sql.Date(wPurchaseDate.getTime());
			java.sql.Date faed = new java.sql.Date(wExpiryDate.getTime());

			PreparedStatement fapuStmt = con
					.prepareStatement("insert into purchaseUnit values(pu_seq.nextval,?,?,?,?,?,?,?,?,purchase_seq.currval,?) ");
			fapuStmt.setInt(1, 6);
			fapuStmt.setString(2, faBatchNumber);
			fapuStmt.setString(3, faManufacturer);

			fapuStmt.setInt(4, faQuantity);
			fapuStmt.setDate(5, fapd);
			fapuStmt.setDate(6, faed);
			fapuStmt.setString(7, faImportType);
			fapuStmt.setString(8, faInvoiceURL);
			fapuStmt.setInt(9, faQuantity);

			fapuStmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

}
