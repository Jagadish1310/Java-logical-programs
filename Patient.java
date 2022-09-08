package com.bitlabs.JdbcExample;

public class Patient {
	private int id;
	private String pName;
	private int age;
	private String city;
	private long mobile;
	private long Aadharnumber;
	private String Guardianname;
	private long guardianmobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAadharnumber() {
		return Aadharnumber;
	}
	public void setAadharnumber(long aadharnumber) {
		Aadharnumber = aadharnumber;
	}
	public String getGuardianname() {
		return Guardianname;
	}
	public void setGuardianname(String guardianname) {
		Guardianname = guardianname;
	}
	public long getGuardianmobile() {
		return guardianmobile;
	}
	public void setGuardianmobile(long guardianmobile) {
		this.guardianmobile = guardianmobile;
	}

}
