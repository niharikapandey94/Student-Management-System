package com.masai.Dao;



import com.masai.Dto.Student;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public interface StudentDao {
	public void addRegister(Student stu) throws  SomethingWentWrongException, NoRecordFoundException; 
	public String loginstudent(String email, String password) throws SomethingWentWrongException, NoRecordFoundException;
	public void Updatepassword(Student em) throws SomethingWentWrongException;
	public void delete(Student student) throws SomethingWentWrongException;
}
