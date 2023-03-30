package com.masai.Dto;

public class CourseImpl implements Course{


	private int cId;
	private String Cname;
	private int fees;
	private String cInfo;
	private int Duration_course_in_Y;
	private  Boolean is_deleted ;
	public CourseImpl(int cId, String cname, int fees, String cInfo, int duration_course_in_Y, Boolean is_deleted) {
		super();
		this.cId = cId;
		Cname = cname;
		this.fees = fees;
		this.cInfo = cInfo;
		Duration_course_in_Y = duration_course_in_Y;
		this.is_deleted = is_deleted;
	}
	
	public CourseImpl(int cId, String cname, int fees, String cInfo, int duration_course_in_Y) {
		super();
		this.cId = cId;
		Cname = cname;
		this.fees = fees;
		this.cInfo = cInfo;
		Duration_course_in_Y = duration_course_in_Y;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getcInfo() {
		return cInfo;
	}
	public void setcInfo(String cInfo) {
		this.cInfo = cInfo;
	}
	public int getDuration_course_in_Y() {
		return Duration_course_in_Y;
	}
	public void setDuration_course_in_Y(int duration_course_in_Y) {
		Duration_course_in_Y = duration_course_in_Y;
	}
	public Boolean getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}
	

	
	
}

