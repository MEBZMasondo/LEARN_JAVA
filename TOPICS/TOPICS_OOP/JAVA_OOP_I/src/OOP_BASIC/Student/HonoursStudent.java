
public class HonoursStudent extends Student {

	String honoursTopic;

	public HonoursStudent(String name, double yearMark, String honoursTopic) {
		super(name, yearMark);
		this.honoursTopic = honoursTopic;
	}

	public String getHonoursTopic() {
		return honoursTopic;
	}

	public void setHonoursTopic(String honoursTopic) {
		this.honoursTopic = honoursTopic;
	}

	@Override
	public String toString() {
		return "HonoursStudent [name=" + super.getName() + ", yearMark=" + super.getYearMark() + ", HonoursTopic=" + honoursTopic + "]";
	}

	
	
}
