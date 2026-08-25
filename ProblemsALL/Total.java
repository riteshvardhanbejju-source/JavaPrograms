package ProblemsALL;

public class Total {
	int eng;
	int total;
	int maths;
	int hindi;
	double avg;
	public double getAvg() {
		return avg = total/3;
	}
//	private void Marks() {
//		total = eng+maths+hindi;
//		System.out.println(total);
//	}
//	private double Average() {
//		double Avg = total/3;
//		return Avg;
//	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getTotal() {
		return total = eng+maths+hindi;
	}


}
