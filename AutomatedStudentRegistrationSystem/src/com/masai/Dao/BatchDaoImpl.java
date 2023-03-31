package com.masai.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.masai.Dto.Batchseat;
import com.masai.Dto.BatchseatImpl;
import com.masai.Dto.Course;
import com.masai.Dto.CourseImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class BatchDaoImpl implements BatchDao {
	
	
	
	
	
	
	public void addbatch(Batchseat br) throws SomethingWentWrongException {
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "INSERT INTO batch (bid,Batchname, cId, Coursename, totalSeats,seatsFilled,startdate, endDate) VALUES (?, ?,?, ?, ?, ?, ?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,br.getBid() );
			ps.setString(2, br.getBatchname());
			ps.setInt(3,br.getcId() );
			ps.setString(4, br.getCoursename());
			ps.setInt(5, br.getTotalSeats());
			ps.setInt(6, br.getSeatsFilled());
			ps.setDate(7, Date.valueOf(br.getStartdate()));
			ps.setDate(8, Date.valueOf(br.getEndDate()));
			
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
	
	
	public List<Batchseat>AvailableBatch() throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Batchseat> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT * FROM batch";
			PreparedStatement ps = conn.prepareStatement(query);
		
			
			
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No batch found");
			}
			while(rs.next()) {
			list.add(new BatchseatImpl(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getDate(7).toLocalDate(),rs.getDate(8).toLocalDate(),false));
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
	
	
	
	
	public List<Batchseat> searchbatachbybatchname(String  bname) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Batchseat> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId,Coursename, totalSeats,seatsFilled,startdate, endDate from batch  WHERE   Batchname=?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setString(1,bname);
			
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No  found");
			}
			while(rs.next()) {
list.add(new BatchseatImpl(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getDate(6).toLocalDate(),rs.getDate(7).toLocalDate(),false));
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
	
	
	
	
	
	public List<Batchseat> searchbatchbystartrange(LocalDate startDate) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Batchseat> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId,Coursename, totalSeats,seatsFilled,Batchname, endDate from batch  WHERE  startdate=?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setDate(1,Date.valueOf(startDate));
			
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No  batch found");
			}
			while(rs.next()) {
list.add(new BatchseatImpl(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getDate(6).toLocalDate(),rs.getDate(7).toLocalDate(),false));
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
	
	
	
	
	public List<Batchseat> searchbatchbyenddate(LocalDate lastDate) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Batchseat> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId,Coursename, totalSeats,seatsFilled,Batchname,startdate from batch  WHERE  endDate=?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setDate(1,Date.valueOf(lastDate));
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No course found");
			}
			while(rs.next()) {
				list.add(new BatchseatImpl(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getDate(6).toLocalDate(),rs.getDate(7).toLocalDate(),false));
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
	
	
	public List<Batchseat> searchbatchbycoursename(String Coursename) throws SomethingWentWrongException, NoRecordFoundException{
		Connection conn = null;
		List<Batchseat> list = new ArrayList<>();
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT cId, totalSeats,seatsFilled,Batchname,startdate,endDate from batch  WHERE Coursename =?";
			PreparedStatement ps = conn.prepareStatement(query);
		
			ps.setString(1,Coursename);
			
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No batch found");
			}
			while(rs.next()) {
				list.add(new BatchseatImpl(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getDate(6).toLocalDate(),rs.getDate(7).toLocalDate(),false));
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
	
	
	
	public void updateBatch(Batchseat bat) throws SomethingWentWrongException{
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "UPDATE batch SET  Batchname = ?,Coursename =?,totalSeats=?,seatsFilled =?,startdate=?,endDate=? WHERE Cid = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,bat.getBatchname());
			ps.setString(2,bat.getCoursename());  
			
			ps.setInt(3,bat.getTotalSeats());
			ps.setInt(4,bat.getSeatsFilled());
			ps.setDate(5, Date.valueOf(bat.getStartdate()));
			ps.setDate(6, Date.valueOf(bat.getEndDate()));
			ps.setInt(7,bat.getcId());
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
