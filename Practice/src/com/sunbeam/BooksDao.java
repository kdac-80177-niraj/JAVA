package com.sunbeam;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BooksDao implements AutoCloseable {
	private Connection con;
	public BooksDao() throws Exception{
		con = DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(con!=null)
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(str);
			return date;
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int createBook(Books b) throws SQLException {
		int cnt;
		String sql = "insert into books values(default,?,?,?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, b.getName());
			stmt.setInt(2, b.getISBN());
			stmt.setString(3, b.getAuthor());
			stmt.setDouble(4, b.getPrice());
			String d1 = b.getDateOfIssue();
			Date utilDate = parseDate(d1);
			java.sql.Date sqlDate1 = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5, sqlDate1);
			String d2 = b.getDateOfRecollected();
			Date utilDate1 = parseDate(d2);
			java.sql.Date sqlDate2 = new java.sql.Date(utilDate1.getTime());
			stmt.setDate(6, sqlDate2);
			cnt = stmt.executeUpdate();
			
			return cnt;
		}
	}
	
	public void readBook() throws SQLException{
		String sql = "select * from books";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int isbn = rs.getInt("ISBN");
					String author = rs.getString("author");
					double price = rs.getDouble("price");
					java.sql.Date sDate1 = rs.getDate("issueDate");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String issueDate = sdf.format(sDate1);
					java.sql.Date sDate2 = rs.getDate("collectDate");
					String collectDate = sdf.format(sDate2);
					System.out.printf("%d,%s,%d,%s,%f,%s,%s\n",id,name,isbn,author,price,issueDate,collectDate);
				}
			}
		}
	}
	public void readBookOnRequirement(int id) throws SQLException{
		String sql = "select * from books where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id1 = rs.getInt("id");
					String name = rs.getString("name");
					int ISBN = rs.getInt("ISBN");
					String author = rs.getString("author");
					double price = rs.getDouble("price");
					java.sql.Date issueDate = rs.getDate("issueDate");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String issueDate1 = sdf.format(issueDate);
					java.sql.Date collectDate = rs.getDate("collectDate");
					String collectDate1 = sdf.format(collectDate);
					System.out.printf("%d,%s,%d,%s,%f,%s,%s\n",id,name,ISBN,author,price,issueDate1,collectDate1);
				}
			}
		}
	}
	
	public int updateBook(Books b, int id) throws SQLException {
		int cnt;
		String sql = "update books set name = ?,ISBN = ?,author = ?,price = ?,issueDate = ?,collectDate = ? where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1,b.getName());
			stmt.setInt(2, b.getISBN());
			stmt.setString(3,b.getAuthor());
			stmt.setDouble(4, b.getPrice());
			String issue = b.getDateOfIssue();
			Date utilDate = parseDate(issue);
			java.sql.Date sqlIssueDate = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5, sqlIssueDate);
			String collectDate = b.getDateOfRecollected();
			Date util = parseDate(collectDate);
			java.sql.Date sqlCollectDate = new java.sql.Date(util.getTime());
			stmt.setDate(6, sqlCollectDate);
			stmt.setInt(7, id);
			cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	public void deleteBook(int id) throws SQLException{
		String sql = "delete from books where ISBN = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}
	}
	
}
