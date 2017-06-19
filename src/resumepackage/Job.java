package resumepackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Job {

	private String JobTitle;
	private String JobCompany;
	private LocalDateTime sdate;
	private LocalDateTime edate;
	private ArrayList <String> JobDuties = new ArrayList<>();
	
	//Adding a constructor allows for access to the ArrayList by other classes.
	public Job(){
		this.JobDuties = new ArrayList<String>();
	}
	
	public void addDuty(String dutyString){
		
		this.JobDuties.add(dutyString);
		
	}
	
	public void addJob(int personID){
		
		String insertSQL = "insert in to jobs (personid, jobtitle, duties) values (?,?,?)";
		
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		PreparedStatement statement = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost/online_resume?user=root&password=password");
		//String insertsql = "insert into person (personid, jobtitle, duties) values (?,?,?)";
		statement = con.prepareStatement(insertSQL);
		statement.setInt(1, this.personid);
		statement.setString(2, this.jobtitle);
		statement.setString(3, this.duties);
		System.out.println(insertSQL);
		statement.executeUpdate();
	} catch (SQLException e) {e.printStackTrace();} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getJobCompany() {
		return JobCompany;
	}
	public void setJobCompany(String jobCompany) {
		JobCompany = jobCompany;
	}
	public LocalDateTime getSdate() {
		return sdate;
	}
	public void setSdate(LocalDateTime sdate) {
		this.sdate = sdate;
	}
	public LocalDateTime getEdate() {
		return edate;
	}
	public void setEdate(LocalDateTime edate) {
		this.edate = edate;
	}
}
