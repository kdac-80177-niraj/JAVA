package que1;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	Scanner sc = new Scanner(System.in);
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(con!=null)
				con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//Add new Candidate
	public int AddCandidate(Canddidate c) throws SQLException {
		int cnt;
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	public int updateCandidate(Canddidate c,int id) throws SQLException {
		int cnt1;
		String sql = "UPDATE candidates SET name = ?,party = ?,votes =? where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, id);
			cnt1 = stmt.executeUpdate();
			return cnt1;
		} 
	}
	
	public List<PartyVotes> partyWiseVotes() throws SQLException{
		List<PartyVotes> list = new ArrayList<>();
		String sql = "select party,count(votes) from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("count(votes)");
					PartyVotes p1 = new PartyVotes(party,votes);
					list.add(p1);
				}
			}
		} 
		return list;
	}

}
