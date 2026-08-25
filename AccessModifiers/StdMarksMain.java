package AccessModifiers;

public class StdMarksMain {

	public static void main(String[] args) {
		StdMarks sm = new StdMarks();
		sm.setId(22993);
		sm.setMarks(89);
		sm.setName("ritesh");
		sm.getgrade();
		
System.out.println(sm.getName()+" with ID "+sm.getId()+" got "+sm.getMarks()+" marks with final grade of "+ sm.getgrade());
	}

}
