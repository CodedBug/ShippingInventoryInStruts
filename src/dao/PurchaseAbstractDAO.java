package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.model.PurchaseAbstractForm;
import com.model.PurchaseForm;
import com.model.PurchaseRowData;


public class PurchaseAbstractDAO {
private Connection con;

public PurchaseAbstractDAO()
{
	con=MyConnection.getConnection();
}

public List readPurchase(PurchaseAbstractForm paf)
{
	try
	{
		
		 // think about nullpointer exception of con and stmt and rset 
		
		List<PurchaseRowData> list=paf.getResults();
		
		int stationid=1;//need to get the station id of the current station user
		
		
		PreparedStatement stmt1=con.prepareStatement("select stationuser from station where stationid=?");
		stmt1.setInt(1,stationid);
	    ResultSet rset1=stmt1.executeQuery();  
	    
	    String stationUser=null;
	    
		if(rset1.next())
			stationUser=rset1.getString(1);
		
		PreparedStatement stmt2=con.prepareStatement("select * from purchase where stationid=?");
		stmt2.setInt(1,stationid);
	    ResultSet rset2=stmt2.executeQuery();  
	    
	    System.out.println("Inside PurchaseAbstractDAO");
	    
		while(rset2.next())
			{
			PurchaseRowData prData=new PurchaseRowData();
			prData.setStationUser(stationUser);
			prData.setPurchaseID(rset2.getString(1));
			prData.setCreationtime(rset2.getString(3));
			prData.setApprovalStatus(rset2.getString(4));
			System.out.println("purchase id"+prData.getPurchaseID()+" "+"station user "+prData.getStationUser()+" "+"timestamp"+prData.getCreationtime()+" "+"approval status"+prData.getApprovalStatus()+" ");
			list.add(prData);
			}
		
		return list;
						
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return null;	
	}
			
}

}
