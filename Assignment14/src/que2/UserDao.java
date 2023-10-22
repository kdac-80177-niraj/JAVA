package que2;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import que1.DbUtil;

public class UserDao implements AutoCloseable {
	private Connection con;
	public UserDao() throws SQLException{
		con = DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(con != null)
				con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	static Date parseDate(String birth) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(birth);
			return date;
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int addUser(User u) throws SQLException {
		int cnt;
		String sql = "insert into users values(default,?,?,?,?,?,false,'voter')";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getF_name());
			stmt.setString(2, u.getL_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			String birth = u.getBdate();
			Date utilDate = parseDate(birth);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5, sqlDate);
			cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public void readUser() throws SQLException{
		String sql = "select * from users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String f_name = rs.getString("first_name");
					String l_name = rs.getString("last_name");
					String email = rs.getString("email");
					String pass = rs.getString("password");
					java.sql.Date sDate = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String bdate = sdf.format(sDate);
					Boolean b = rs.getBoolean("status");
					String role = rs.getString("role");
					System.out.printf("%d,%s,%s,%s,%s,%s,%s,%s\n",id,f_name,l_name,email,pass,bdate,b,role);
					
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int updateUser(User u,int id) throws SQLException{
		int cnt;
		String sql = "update users set first_name = ?,last_name = ?,email = ?,password=?,dob = ? where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getF_name());
			stmt.setString(2, u.getL_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			String birth = u.getBdate();
			Date utilDate = parseDate(birth);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5, sqlDate);
			stmt.setInt(6, id);
			cnt = stmt.executeUpdate();
			return cnt;
		} 
	}
	public void deleteUser(int id) throws SQLException{
		String sql = "delete from users where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Row delete.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
