package com.model;

import org.apache.struts.action.ActionForm;

public class ServiceForm extends ActionForm{

	private String vesselName;
	private String owner;
	private String certificateNumber;
	private String make;
	private String serviceOn;
	private String nextDue;
	
	//Bouncy
	private String arches;	
	private String lifeline;	
	private String lifeLinePatches;
	private String labels;
	private String thawrt;
	
	//Canopy
	private String outerCanopy;
	private String innerCanopy;
	private String entranceFlaps;
	private String reflectorTape;	
	private String viewingPort;

	//Emergency Equipment
	private String bellow;
	private String bungs;
	private String knife;
	private String paddles;
	private String whistle;
	
	//Tests
	private String wpTest;
	private String nap;	
	private String floorScreen;

	//Upper Buoyancy
	private String ubTimeON;
	private String ubTimeOFF;
	private String ubINTReading;
	private String ubINTTemp;
	private String ubFinalReading;
	private String ubFinalTemp;
	private String ubBlowOFFSet;
	
	//Lower Buoyancy
	private String lbTimeON;
	private String lbTimeOFF;
	private String lbINTReading;
	private String lbINTTemp;
	private String lbFinalReading;
	private String lbFinalTemp;
	private String lbBlowOFFSet;
	
	//Floor
	private String fTimeON;	
	private String fTimeOFF;
	private String fINTReading;
	private String fINTTemp;
	private String fFinalReading;
	private String fFinalTemp;
	private String fBlowOFFSet;
	
	private String Comment;

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getServiceOn() {
		return serviceOn;
	}

	public void setServiceOn(String serviceOn) {
		this.serviceOn = serviceOn;
	}

	public String getNextDue() {
		return nextDue;
	}

	public void setNextDue(String nextDue) {
		this.nextDue = nextDue;
	}

	public String getArches() {
		return arches;
	}

	public void setArches(String arches) {
		this.arches = arches;
	}

	public String getLifeline() {
		return lifeline;
	}

	public void setLifeline(String lifeline) {
		this.lifeline = lifeline;
	}

	public String getLifeLinePatches() {
		return lifeLinePatches;
	}

	public void setLifeLinePatches(String lifeLinePatches) {
		this.lifeLinePatches = lifeLinePatches;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getThawrt() {
		return thawrt;
	}

	public void setThawrt(String thawrt) {
		this.thawrt = thawrt;
	}

	public String getOuterCanopy() {
		return outerCanopy;
	}

	public void setOuterCanopy(String outerCanopy) {
		this.outerCanopy = outerCanopy;
	}

	public String getInnerCanopy() {
		return innerCanopy;
	}

	public void setInnerCanopy(String innerCanopy) {
		this.innerCanopy = innerCanopy;
	}

	public String getEntranceFlaps() {
		return entranceFlaps;
	}

	public void setEntranceFlaps(String entranceFlaps) {
		this.entranceFlaps = entranceFlaps;
	}

	public String getReflectorTape() {
		return reflectorTape;
	}

	public void setReflectorTape(String reflectorTape) {
		this.reflectorTape = reflectorTape;
	}

	public String getViewingPort() {
		return viewingPort;
	}

	public void setViewingPort(String viewingPort) {
		this.viewingPort = viewingPort;
	}

	public String getBellow() {
		return bellow;
	}

	public void setBellow(String bellow) {
		this.bellow = bellow;
	}

	public String getBungs() {
		return bungs;
	}

	public void setBungs(String bungs) {
		this.bungs = bungs;
	}

	public String getKnife() {
		return knife;
	}

	public void setKnife(String knife) {
		this.knife = knife;
	}

	public String getPaddles() {
		return paddles;
	}

	public void setPaddles(String paddles) {
		this.paddles = paddles;
	}

	public String getWhistle() {
		return whistle;
	}

	public void setWhistle(String whistle) {
		this.whistle = whistle;
	}

	public String getWpTest() {
		return wpTest;
	}

	public void setWpTest(String wpTest) {
		this.wpTest = wpTest;
	}

	public String getNap() {
		return nap;
	}

	public void setNap(String nap) {
		this.nap = nap;
	}

	public String getFloorScreen() {
		return floorScreen;
	}

	public void setFloorScreen(String floorScreen) {
		this.floorScreen = floorScreen;
	}

	public String getUbTimeON() {
		return ubTimeON;
	}

	public void setUbTimeON(String ubTimeON) {
		this.ubTimeON = ubTimeON;
	}

	public String getUbTimeOFF() {
		return ubTimeOFF;
	}

	public void setUbTimeOFF(String ubTimeOFF) {
		this.ubTimeOFF = ubTimeOFF;
	}

	public String getUbINTReading() {
		return ubINTReading;
	}

	public void setUbINTReading(String ubINTReading) {
		this.ubINTReading = ubINTReading;
	}

	public String getUbINTTemp() {
		return ubINTTemp;
	}

	public void setUbINTTemp(String ubINTTemp) {
		this.ubINTTemp = ubINTTemp;
	}

	public String getUbFinalReading() {
		return ubFinalReading;
	}

	public void setUbFinalReading(String ubFinalReading) {
		this.ubFinalReading = ubFinalReading;
	}

	public String getUbFinalTemp() {
		return ubFinalTemp;
	}

	public void setUbFinalTemp(String ubFinalTemp) {
		this.ubFinalTemp = ubFinalTemp;
	}

	public String getUbBlowOFFSet() {
		return ubBlowOFFSet;
	}

	public void setUbBlowOFFSet(String ubBlowOFFSet) {
		this.ubBlowOFFSet = ubBlowOFFSet;
	}

	public String getLbTimeON() {
		return lbTimeON;
	}

	public void setLbTimeON(String lbTimeON) {
		this.lbTimeON = lbTimeON;
	}

	public String getLbTimeOFF() {
		return lbTimeOFF;
	}

	public void setLbTimeOFF(String lbTimeOFF) {
		this.lbTimeOFF = lbTimeOFF;
	}

	public String getLbINTReading() {
		return lbINTReading;
	}

	public void setLbINTReading(String lbINTReading) {
		this.lbINTReading = lbINTReading;
	}

	public String getLbINTTemp() {
		return lbINTTemp;
	}

	public void setLbINTTemp(String lbINTTemp) {
		this.lbINTTemp = lbINTTemp;
	}

	public String getLbFinalReading() {
		return lbFinalReading;
	}

	public void setLbFinalReading(String lbFinalReading) {
		this.lbFinalReading = lbFinalReading;
	}

	public String getLbFinalTemp() {
		return lbFinalTemp;
	}

	public void setLbFinalTemp(String lbFinalTemp) {
		this.lbFinalTemp = lbFinalTemp;
	}

	public String getLbBlowOFFSet() {
		return lbBlowOFFSet;
	}

	public void setLbBlowOFFSet(String lbBlowOFFSet) {
		this.lbBlowOFFSet = lbBlowOFFSet;
	}

	public String getfTimeON() {
		return fTimeON;
	}

	public void setfTimeON(String fTimeON) {
		this.fTimeON = fTimeON;
	}

	public String getfTimeOFF() {
		return fTimeOFF;
	}

	public void setfTimeOFF(String fTimeOFF) {
		this.fTimeOFF = fTimeOFF;
	}

	public String getfINTReading() {
		return fINTReading;
	}

	public void setfINTReading(String fINTReading) {
		this.fINTReading = fINTReading;
	}

	public String getfINTTemp() {
		return fINTTemp;
	}

	public void setfINTTemp(String fINTTemp) {
		this.fINTTemp = fINTTemp;
	}

	public String getfFinalReading() {
		return fFinalReading;
	}

	public void setfFinalReading(String fFinalReading) {
		this.fFinalReading = fFinalReading;
	}

	public String getfFinalTemp() {
		return fFinalTemp;
	}

	public void setfFinalTemp(String fFinalTemp) {
		this.fFinalTemp = fFinalTemp;
	}

	public String getfBlowOFFSet() {
		return fBlowOFFSet;
	}

	public void setfBlowOFFSet(String fBlowOFFSet) {
		this.fBlowOFFSet = fBlowOFFSet;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
	
			
	
}