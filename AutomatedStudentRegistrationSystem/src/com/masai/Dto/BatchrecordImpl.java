package com.masai.Dto;

public class BatchrecordImpl implements BatchRecord{
	
	  
	
	
	
	
	private String batchname;
	private int batchNo;
	private int cId;
	private String firsttName;
	private  Boolean is_deleted;
	
	  
	public int getBatchNo() {
		return batchNo;
	}


	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}


	public String getBatchname() {
		return batchname;
	}


	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	
	public Boolean getIs_deleted() {
		return is_deleted;
	}


	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}


	public BatchrecordImpl(String batchname, int batchNo, int cId, String firsttName, Boolean is_deleted) {
		super();
		this.batchname = batchname;
		this.batchNo = batchNo;
		this.cId = cId;
		this.firsttName = firsttName;
		this.is_deleted = is_deleted;
	}


	public String getFirsttName() {
		return firsttName;
	}


	public void setFirsttName(String firsttName) {
		this.firsttName = firsttName;
	}


		
		
		

		
}