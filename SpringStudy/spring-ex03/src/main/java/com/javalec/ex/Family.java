package com.javalec.ex;

public class Family {

	String papaName;
	String mamiName;
	String sisterName;
	String brotherName;
	
	public Family(String papaName, String mamiName) {
		super();
		this.papaName = papaName;
		this.mamiName = mamiName;
	}


	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}


	public String getPapaName() {
		return papaName;
	}


	public String getMamiName() {
		return mamiName;
	}


	public String getSisterName() {
		return sisterName;
	}


	public String getBrotherName() {
		return brotherName;
	}
	
	
	
}
