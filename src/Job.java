import java.time.LocalDateTime;

public class Job {

	private String JobTitle;
	private String JobCompany;
	LocalDateTime sdate;
	LocalDateTime edate;
	
	
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
