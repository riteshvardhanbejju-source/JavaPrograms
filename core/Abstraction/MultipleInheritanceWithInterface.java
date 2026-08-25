package core.Abstraction;
interface Teacher{
	public int evaluation();
}
interface Sports{
	public int sportsscore();
}
class Result implements Teacher,Sports{
	@Override
	public int sportsscore() {
		return (50+45);
	}
	@Override
	public int evaluation() {
		return (36+57+99);
	}
}
public class MultipleInheritanceWithInterface {

	public static void main(String[] args) {
		Result rs = new Result();
		int sp = rs.sportsscore();
		System.out.println("sports score : "+sp);
		int mr = rs.evaluation();
		System.out.println("academic score : "+mr);
		int total=sp+mr;
		System.out.println("total Score : "+total);
	}

}
