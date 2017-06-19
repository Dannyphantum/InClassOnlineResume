package resumepackage;
import java.time.LocalDateTime;

public class Education {

	private String degree;
	private String institution;
	LocalDateTime year;
	
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public LocalDateTime getYear() {
		return year;
	}
	public void setYear(LocalDateTime year) {
		this.year = year;
	}
	
}

