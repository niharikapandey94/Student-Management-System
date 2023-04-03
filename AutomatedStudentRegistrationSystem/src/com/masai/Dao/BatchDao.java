package com.masai.Dao;

import java.time.LocalDate;
import java.util.List;

import com.masai.Dto.Batchseat;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public interface BatchDao {
	public void addbatch(Batchseat br) throws SomethingWentWrongException;
	public List<Batchseat> searchbatachbybatchname(String  bname) throws SomethingWentWrongException, NoRecordFoundException;
	public List<Batchseat> searchbatchbystartrange(LocalDate startDate) throws SomethingWentWrongException, NoRecordFoundException;
	public List<Batchseat> searchbatchbyenddate(LocalDate lastDate) throws SomethingWentWrongException, NoRecordFoundException;
	public List<Batchseat> searchbatchbycoursename(String Coursename) throws SomethingWentWrongException, NoRecordFoundException;
	public void updateBatch(Batchseat bat) throws SomethingWentWrongException;
	public List<Batchseat> AvailableBatch()throws SomethingWentWrongException, NoRecordFoundException;

}
