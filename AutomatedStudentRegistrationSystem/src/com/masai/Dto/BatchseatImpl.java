package com.masai.Dto;

import java.time.LocalDate;
import java.util.Date;

public class BatchseatImpl implements Batchseat {
	
	
    private int bid;
	


	private String Batchname;
	private int cId;
	private String Coursename;
	private int totalSeats;
	private int seatsFilled;
	private LocalDate  startdate;
	private LocalDate  endDate;
	private  Boolean is_deleted ;
	
	
	public String getBatchname() {
		return Batchname;
	}


	public void setBatchname(String batchname) {
		Batchname = batchname;
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getCoursename() {
		return Coursename;
	}


	public void setCoursename(String coursename) {
		Coursename = coursename;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public int getSeatsFilled() {
		return seatsFilled;
	}


	public void setSeatsFilled(int seatsFilled) {
		this.seatsFilled = seatsFilled;
	}


	public LocalDate getStartdate() {
		return startdate;
	}


	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public Boolean getIs_deleted() {
		return is_deleted;
	}


	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}
	
	
	
	
	public BatchseatImpl(String batchname, int cId, String coursename, int totalSeats, int seatsFilled,
			LocalDate startdate, LocalDate endDate, Boolean is_deleted) {
		super();
		Batchname = batchname;
		this.cId = cId;
		Coursename = coursename;
		this.totalSeats = totalSeats;
		this.seatsFilled = seatsFilled;
		this.startdate = startdate;
		this.endDate = endDate;
		this.is_deleted = is_deleted;
	}


	public BatchseatImpl(int bid, String batchname, int cId, String coursename, int totalSeats, int seatsFilled,
			LocalDate startdate, LocalDate endDate, Boolean is_deleted) {
		super();
		this.bid = bid;
		Batchname = batchname;
		this.cId = cId;
		Coursename = coursename;
		this.totalSeats = totalSeats;
		this.seatsFilled = seatsFilled;
		this.startdate = startdate;
		this.endDate = endDate;
		this.is_deleted = is_deleted;
	}


	public BatchseatImpl(String batchname) {
		super();
		Batchname = batchname;
	}


	

	
	


	

	


	

	
	
	

	


	
}


	
	
	
	
	
	
	
	


