package paper3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BugDAO implements AutoCloseable{
	private Connection con;
	public static Date parseDate(String str) {
		Date d = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			d = sdf.parse(str);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return d;
	}
	public BugDAO() throws SQLException {
		super();
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
	
	public int addBug(Bug b) throws SQLException {
		int cnt=0;
		String sql = "insert into bugs values(default,?,?,?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1,b.getTitle());
			stmt.setString(2, b.getDescription());
			stmt.setString(3, b.getStatus());
			stmt.setInt(4, b.getAssignedTo());
			String date1 = b.getCreated();
			Date utilDate1 = parseDate(date1);
			java.sql.Date sqlCreatedDate = new java.sql.Date(utilDate1.getTime());
			stmt.setDate(5, sqlCreatedDate);
			String date2 = b.getModified();
			Date utilDate2 = parseDate(date2);
			java.sql.Date sqlModifiedDate = new java.sql.Date(utilDate2.getTime());
			stmt.setDate(6, sqlModifiedDate);
			//stmt.setDate(5, b.getCreated());
			cnt = stmt.executeUpdate();
			return cnt;	
		}
		/*
		 * 2. "UPDATE bugs SET status = 'closed', modified = ? WHERE id = ?";
		 */
		/*
		 * 3. SELECT bugs.title, bugs.created, members.name
FROM bugs
JOIN members ON bugs.assigned_to = members.id
WHERE bugs.status = 'open'
ORDER BY bugs.created ASC;

		 */
		/*
		 * 4. SELECT members.name, COUNT(bugs.id) as open_bug_count
FROM members
LEFT JOIN bugs ON members.id = bugs.assigned_to AND bugs.status = 'open'
GROUP BY members.name;

		 */
		
		/*
		 * 5. "UPDATE bugs SET assigned_to = ?, modified = ? WHERE id = ?";
		 */
		/*
		 * 6. 
		 */
	}
	
}
