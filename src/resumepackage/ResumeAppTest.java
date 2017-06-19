package resumepackage;

public class ResumeAppTest {

	public static void main(String[] args) {
		
		/*
		Person me = new Person("Jordan", "Bonaparte", "abonaparte4@yahoo.com");
		
		me.addRecord();
		
		System.out.println("Your full name is: " + me.getFname() + " " + me.getLname() + " and your e-mail address is " + me.getEmail());

		System.out.println(me.getFname() + "'s ID number is " + me.getPersonid());
		*/
		
		//Create a new job
		Job job = new Job();
		job.setJobCompany("Montgomery College");
		job.setJobTitle("Teacher of Things");
		job.addDuty("Was doing stuff");
		job.addDuty("Got all things done.");
		job.addDuty("Completed stuff");
	}

}
