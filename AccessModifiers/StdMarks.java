package AccessModifiers;

public class StdMarks {
	private int id;
	private String name;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getgrade() {
		if(marks>85 && marks<=100)
		return "Grade A";
		else if(marks>60 && marks<=85)
		return "Grade B";
		else if(marks>35 && marks<=60)
		return "Grade D";
		else
			return "fail";
	}
}