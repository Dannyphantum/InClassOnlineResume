package resumepackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Person {

		private int personid;
		private String fname;
		private String lname;
		private String email;
		private ArrayList <Job> myjoblist;
		private ArrayList <Education> myedulist;
		private ArrayList <Skills> myskillslist;
		
public Person(String pfname, String plname, String pemail){
			
			this.fname = pfname;
			this.lname = plname;
			this.email = pemail;
			setMyjoblist(new ArrayList <Job>());
			myedulist = new ArrayList <Education>();
			myskillslist = new ArrayList <Skills>();
		}

		public int getPersonid() {
			return personid;
}

		public void setPersonid(int id) {
			this.personid = id;
}
		
		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
		
		public void addJob(Job JobToAdd){
			
			getMyjoblist().add(JobToAdd);
		}
		
		ResultSet rs = null;
		
		public void addRecord() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = null;
				PreparedStatement statement = null;
				con = DriverManager.getConnection("jdbc:mysql://localhost/online_resume?user=root&password=password");
				String addsql = "insert into person (fname, lname, email) values (?,?,?)";
				statement = con.prepareStatement(addsql);
				statement.setString(1, this.fname);
				statement.setString(2, this.lname);
				statement.setString(3, this.email);
				System.out.println(addsql);
				statement.executeUpdate();
				
				
				String idsql = "select * from person where email = ?";
				statement = con.prepareStatement(idsql);
				statement.setString(1, this.email);
				rs = statement.executeQuery();
				rs.next();
				
				this.setPersonid(rs.getInt("id"));
				
			} catch (SQLException e) {e.printStackTrace();} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public ArrayList <Job> getMyjoblist() {
			return myjoblist;
		}

		public void setMyjoblist(ArrayList <Job> myjoblist) {
			this.myjoblist = myjoblist;
		}
}
