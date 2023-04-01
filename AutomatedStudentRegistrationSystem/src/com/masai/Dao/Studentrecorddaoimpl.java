package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Dto.Student;
import com.masai.Dto.StudentImpl;
import com.masai.Dto.Studentrecord;
import com.masai.Dto.StudentrecordImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class Studentrecorddaoimpl implements Studentrecorddao {
	
	public void Resigterstudent(Studentrecord stu)throws SomethingWentWrongException {
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "INSERT INTO  studentrecord (batchname,cid,bid,email,fathername,mothername,tenth_percentage,twelth_percentage,gender) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,stu.getBatchname());
			ps.setInt(2,stu.getCid());
			
			ps.setInt(3, stu.getBid());
			ps.setString(4,stu.getEmail());
			ps.setString(5, stu.getFathername());
			ps.setString(6, stu.getMothername());
			ps.setDouble(7, stu.getTenthPercentage());
			ps.setDouble(8, stu.getTwelthPercentage());
			ps.setString(9, stu.getGender());
			ps.executeUpdate();
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to insert the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
	}
	
	
	
	public List<Student> getStudentListbatchwise() throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Student> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT stu.first_name,stu.last_name,stu.address,stu. mobile_no,stu.email,stu.password,rec.fathername,rec.mothername,rec.tenth_percentage,rec.twelth_percentage,rec.gender from student stu inner join studentrecord rec on stu.email=rec.email where stu.is_deleted=false";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No Student found");
			}
			while(rs.next()) {
				list.add(new StudentImpl(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),new StudentrecordImpl(rs.getString(7),rs.getString(8),rs.getDouble(9),rs.getDouble(10),rs.getString(11))));
			}
			
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to update the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
		return list;
	}
	public List<Student> getStudentList() throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Student> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT first_name,last_name,address,mobile_no,email,password from student where is_deleted=false";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No Student found");
			}
			while(rs.next()) {
				list.add(new StudentImpl(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
				}
			
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to update the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
		return list;
	}
	
	

}



