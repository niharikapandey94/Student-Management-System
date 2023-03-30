package com.masai.Dto;

import java.time.LocalDate;


public interface Batchseat {
	
	public String getBatchname();
		


	public void setBatchname(String batchname);
		
	


	public int getcId(); 
		
	


	public void setcId(int cId);
		


	public String getCoursename();
		


	public void setCoursename(String coursename);
	


	public int getTotalSeats();
		


	public void setTotalSeats(int totalSeats);
	


	public int getSeatsFilled();


	public void setSeatsFilled(int seatsFilled) ;


	public LocalDate getStartdate();


	public void setStartdate(LocalDate startdate);


	public LocalDate getEndDate();


	public void setEndDate(LocalDate endDate) ;


	public Boolean getIs_deleted();


	public void setIs_deleted(Boolean is_deleted) ;

	public int getBid();
		


	public void setBid(int bid);
		

	

	

	

}
