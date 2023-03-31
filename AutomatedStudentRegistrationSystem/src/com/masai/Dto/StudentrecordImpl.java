package com.masai.Dto;

public class StudentrecordImpl implements Studentrecord {
	
	private int batchno;
    private String batchname;
    private int cid;
    private int bid;
    private String email;
    private String fathername;
    private String mothername;
    private double tenthPercentage;
    private double twelthPercentage;
    private String gender;
	public StudentrecordImpl(int batchno, String batchname, int cid, int bid, String email, String fathername,
			String mothername, double tenthPercentage, double twelthPercentage, String gender) {
		super();
		this.batchno = batchno;
		this.batchname = batchname;
		this.cid = cid;
		this.bid = bid;
		this.email = email;
		this.fathername = fathername;
		this.mothername = mothername;
		this.tenthPercentage = tenthPercentage;
		this.twelthPercentage = twelthPercentage;
		this.gender = gender;
	}
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public double getTenthPercentage() {
		return tenthPercentage;
	}
	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public double getTwelthPercentage() {
		return twelthPercentage;
	}
	public void setTwelthPercentage(double twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
    
	
	

}
