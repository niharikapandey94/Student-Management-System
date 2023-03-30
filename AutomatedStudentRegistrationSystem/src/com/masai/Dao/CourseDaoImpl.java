package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Dto.Course;
import com.masai.Dto.CourseImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class CourseDaoImpl implements CourseDao  {
	
	
	public void addcourse(Course cr) throws SomethingWentWrongException {
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "INSERT INTO  course (cId,Cname,fees,cInfo,duration_in_years) VALUES (?, ?, ?, ?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,cr.getcId());
			ps.setString(2,cr.getCname());
			ps.setInt(3, cr.getFees());
			ps.setString(4,cr.getcInfo());
			ps.setInt(5, cr.getDuration_course_in_Y());
			
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
	
	public List<Course> searchCoursebycoursename(String  Cname) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Course> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId,fees,cInfo,duration_in_years FROM course WHERE Cname=?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setString(1,Cname);
			
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No course found");
			}
			while(rs.next()) {
				list.add(new CourseImpl(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
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
	
	
	
	
	
	public List<Course> searchCoursebydurationrange(int Duration) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Course> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId,Cname,fees,cInfo FROM course WHERE duration_in_years=?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setInt(1,Duration);
			
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No course found");
			}
			while(rs.next()) {
				list.add(new CourseImpl(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
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
	
	
	
	
	public List<Course> searchCoursebyFeerange(int fees) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Course> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId,Cname,cInfo duration_in_years FROM course WHERE fees=?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setInt(1,fees);
			
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No course found");
			}
			while(rs.next()) {
				list.add(new CourseImpl(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
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
	
	
	
	
	public void updateCourseDetails(Course cr) throws SomethingWentWrongException{
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "UPDATE course SET cname = ?, fees= ?, duration_in_years =?< cInfo = ? WHERE  cId = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, cr.getCname());
			ps.setInt(2, cr.getFees());
			ps.setInt(3, cr.getDuration_course_in_Y());
			ps.setString(4, cr.getcInfo());
			ps.setInt(5, cr.getcId());
			
			ps.executeUpdate();
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to update the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}	
	}
}
	


