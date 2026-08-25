package core.OPPS;
class Studata{
	private int id;
	private String name;
	private int number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
public class GettersSetters {

	public static void main(String[] args) {
		Studata sd = new Studata();
		sd.setId(304);
		sd.setName("ritesh");
		sd.setNumber(998477638);
		System.out.println(sd.getId()+" "+sd.getName()+" "+sd.getNumber());
	}

}
