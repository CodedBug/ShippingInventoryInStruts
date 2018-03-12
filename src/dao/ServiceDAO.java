package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.Login;
import com.model.PurchaseForm;
import com.model.ServiceForm;
import com.model.User;
import com.model.UserType;
//import com.sun.org.apache.bcel.internal.generic.Type;

public class ServiceDAO {
private Connection con;

public ServiceDAO()
{
	con=MyConnection.getConnection();
}
public boolean insertService(ServiceForm serviceForm)
{
	try
	{
		
		 // think about nullpointer exception of con and stmt and rset 
		
		int stationid=1;//need to get the station id of the current station user
		
		String vesselName=serviceForm.getVesselName();
		String owner=serviceForm.getOwner();
		int certificateNumber=Integer.parseInt(serviceForm.getCertificateNumber());
		String make=serviceForm.getMake();
		java.util.Date serviceOn=new java.util.Date(serviceForm.getServiceOn());
		java.util.Date nextDue=new java.util.Date(serviceForm.getNextDue());
		
		java.util.Date wpTest=new java.util.Date(serviceForm.getWpTest());
		java.util.Date nap=new java.util.Date(serviceForm.getNap());
		java.util.Date floorScreen=new java.util.Date(serviceForm.getFloorScreen());
		
		String Comment=serviceForm.getComment();
		
		java.sql.Date serviceOnDate=new java.sql.Date(serviceOn.getTime());
		java.sql.Date nextDueDate=new java.sql.Date(nextDue.getTime());
		java.sql.Date wpTestDate=new java.sql.Date(wpTest.getTime());
		java.sql.Date napDate=new java.sql.Date(nap.getTime());
		java.sql.Date floorScreenDate=new java.sql.Date(floorScreen.getTime());
		
		PreparedStatement stmtService=con.prepareStatement("insert into service values(service_seq.nextval,?,?,?,?,?,?,?,?,?,?)");
		stmtService.setString(1,vesselName);
		stmtService.setString(2,owner);
		stmtService.setInt(3,certificateNumber);
		stmtService.setString(4,make);
		stmtService.setDate(5,serviceOnDate);
		stmtService.setDate(6,nextDueDate);
		stmtService.setDate(7,wpTestDate);
		stmtService.setDate(8,napDate);
		stmtService.setDate(9,floorScreenDate);
		stmtService.setString(10,Comment);
	    int serviceinsert=stmtService.executeUpdate();  
		
	    
	    String arches=serviceForm.getArches();	
		String lifeline=serviceForm.getLifeline();	
		String lifeLinePatches=serviceForm.getLifeLinePatches();
		String labels=serviceForm.getLabels();
		String thawrt=serviceForm.getThawrt();
		PreparedStatement stmtBouncy=con.prepareStatement("insert into bouncy values(bouncy_seq.nextval,?,?,?,?,?,service_seq.currval)");
		stmtBouncy.setString(1,arches);
		stmtBouncy.setString(2,lifeline);
		stmtBouncy.setString(3,lifeLinePatches);
		stmtBouncy.setString(4,labels);
		stmtBouncy.setString(5,thawrt);
		stmtBouncy.executeUpdate(); 
		
		String outerCanopy=serviceForm.getOuterCanopy();
		String innerCanopy=serviceForm.getInnerCanopy();
		String entranceFlaps=serviceForm.getEntranceFlaps();
		String reflectorTape=serviceForm.getReflectorTape();	
		String viewingPort=serviceForm.getViewingPort();
		PreparedStatement stmtCanopy=con.prepareStatement("insert into canopy values(canopy_seq.nextval,?,?,?,?,?,service_seq.currval)");
		stmtCanopy.setString(1,outerCanopy);
		stmtCanopy.setString(2,innerCanopy);
		stmtCanopy.setString(3,entranceFlaps);
		stmtCanopy.setString(4,reflectorTape);
		stmtCanopy.setString(5,viewingPort);
		stmtCanopy.executeUpdate(); 
		
		String bellow=serviceForm.getBellow();
		String bungs=serviceForm.getBungs();
		String knife=serviceForm.getKnife();
		String paddles=serviceForm.getPaddles();
		String whistle=serviceForm.getWhistle();
		PreparedStatement stmtee=con.prepareStatement("insert into emergencyequipment values(ee_seq.nextval,?,?,?,?,?,service_seq.currval)");
		stmtee.setString(1,bellow);
		stmtee.setString(2,bungs);
		stmtee.setString(3,knife);
		stmtee.setString(4,paddles);
		stmtee.setString(5,whistle);
		stmtee.executeUpdate(); 
		
		//Upper Buoyancy
		int ubTimeON=Integer.parseInt(serviceForm.getUbTimeON());
		int ubTimeOFF=Integer.parseInt(serviceForm.getUbTimeOFF());
		int ubINTReading=Integer.parseInt(serviceForm.getUbINTReading());
		int ubINTTemp=Integer.parseInt(serviceForm.getUbINTTemp());
		int ubFinalReading=Integer.parseInt(serviceForm.getUbFinalReading());
		int ubFinalTemp=Integer.parseInt(serviceForm.getUbFinalTemp());
		int ubBlowOFFSet=Integer.parseInt(serviceForm.getUbBlowOFFSet());
		PreparedStatement stmtUB=con.prepareStatement("insert into buoyancy values(buoyancy_seq.nextval,?,?,?,?,?,?,?,?,service_seq.currval)");
		stmtUB.setString(1,"UB");
		stmtUB.setInt(2,ubTimeON);
		stmtUB.setInt(3,ubTimeOFF);
		stmtUB.setInt(4,ubINTReading);
		stmtUB.setInt(5,ubINTTemp);
		stmtUB.setInt(6,ubFinalReading);
		stmtUB.setInt(7,ubFinalTemp);
		stmtUB.setInt(8,ubBlowOFFSet);
		stmtUB.executeUpdate(); 
		
		//Lower Buoyancy
		int lbTimeON=Integer.parseInt(serviceForm.getLbTimeON());
		int lbTimeOFF=Integer.parseInt(serviceForm.getLbTimeOFF());
		int lbINTReading=Integer.parseInt(serviceForm.getLbINTReading());
		int lbINTTemp=Integer.parseInt(serviceForm.getLbINTTemp());
		int lbFinalReading=Integer.parseInt(serviceForm.getLbFinalReading());
		int lbFinalTemp=Integer.parseInt(serviceForm.getLbFinalTemp());
		int lbBlowOFFSet=Integer.parseInt(serviceForm.getLbBlowOFFSet());
		PreparedStatement stmtLB=con.prepareStatement("insert into buoyancy values(buoyancy_seq.nextval,?,?,?,?,?,?,?,?,service_seq.currval)");
		stmtLB.setString(1,"LB");
		stmtLB.setInt(2,lbTimeON);
		stmtLB.setInt(3,lbTimeOFF);
		stmtLB.setInt(4,lbINTReading);
		stmtLB.setInt(5,lbINTTemp);
		stmtLB.setInt(6,lbFinalReading);
		stmtLB.setInt(7,lbFinalTemp);
		stmtLB.setInt(8,lbBlowOFFSet);
		stmtLB.executeUpdate(); 
		
		//Floor
		int fTimeON=Integer.parseInt(serviceForm.getfTimeON());
		int fTimeOFF=Integer.parseInt(serviceForm.getfTimeOFF());
		int fINTReading=Integer.parseInt(serviceForm.getfINTReading());
		int fINTTemp=Integer.parseInt(serviceForm.getfINTTemp());
		int fFinalReading=Integer.parseInt(serviceForm.getfFinalReading());
		int fFinalTemp=Integer.parseInt(serviceForm.getfFinalTemp());
		int fBlowOFFSet=Integer.parseInt(serviceForm.getfBlowOFFSet());
		PreparedStatement stmtF=con.prepareStatement("insert into buoyancy values(buoyancy_seq.nextval,?,?,?,?,?,?,?,?,service_seq.currval)");
		stmtF.setString(1,"F");
		stmtF.setInt(2,fTimeON);
		stmtF.setInt(3,fTimeOFF);
		stmtF.setInt(4,fINTReading);
		stmtF.setInt(5,fINTTemp);
		stmtF.setInt(6,fFinalReading);
		stmtF.setInt(7,fFinalTemp);
		stmtF.setInt(8,fBlowOFFSet);
		stmtF.executeUpdate(); 
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
	
	return true;
			
}

}
