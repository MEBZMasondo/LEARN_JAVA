
public class StudentHonours extends Student {
	
	private String paperTopic;
	
	public StudentHonours() {
		super();
	}
	
	public StudentHonours(String stuName, int stuNumber, String paperTopic) {
		super(stuName, stuNumber);
		this.paperTopic = paperTopic;
	}
	
	public String getPaperTopic() {
		return paperTopic;
	}

	public void setPaperTopic(String paperTopic) {
		this.paperTopic = paperTopic;
	}
	
	@Override
	public String toString() {
		return "TYPE: HONOURS STUDENT \n" + "NAME: " + this.getStuName()  +  "\nSTU NUMBER: " +  this.getStuNumber() + "\nTOPIC: " + this.getPaperTopic(); 
	}
}