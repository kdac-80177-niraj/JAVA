package que2;
import java.text.SimpleDateFormat;
import java.util.*;

public class User {
	private int id;
	private String f_name;
	private String l_name;
	private String email;
	private String Password;
	private String bdate;
	private Boolean status;
	private String role;
	Scanner sc = new Scanner(System.in);
	
	
	public User() {
		super();
	}
	
	public User(int id, String f_name, String l_name, String email, String password, String bdate, Boolean status,
			String role) {
		super();
		this.id = id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.Password = password;
		this.bdate = bdate;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(str);
			return date;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void accept() {
		System.out.println("Enter first name: ");
		this.f_name = sc.next();
		System.out.println("Enter last name: ");
		this.l_name = sc.next();
		System.out.println("Enter email: ");
		this.email = sc.next();
		System.out.println("Enter password: ");
		this.Password = sc.next();
		System.out.println("Enter birth date(dd-mm-yyyy): ");
		this.bdate = sc.next();
		Date utilDate = parseDate(this.bdate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", Password="
				+ Password + ", bdate=" + bdate + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
	
}
