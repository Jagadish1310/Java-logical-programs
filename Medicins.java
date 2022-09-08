package com.bitlabs.JdbcExample;

public class Medicins {
	private int m_id;
	private String mname;
	private int cost;
	private String suppliername;
	private int quantity;
	private String manufacture_date;
	private String Expiry_date;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public String getExpiry_date() {
		return Expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		Expiry_date = expiry_date;
	}

}
