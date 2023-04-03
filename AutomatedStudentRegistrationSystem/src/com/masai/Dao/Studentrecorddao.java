package com.masai.Dao;

import java.util.List;

import com.masai.Dto.Student;
import com.masai.Dto.Studentrecord;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public interface Studentrecorddao {
	public void Resigterstudent(Studentrecord stu)throws SomethingWentWrongException;
	public List<Student> getStudentListbatchwise() throws SomethingWentWrongException, NoRecordFoundException;
	public List<Student> getStudentList() throws SomethingWentWrongException, NoRecordFoundException;

}
