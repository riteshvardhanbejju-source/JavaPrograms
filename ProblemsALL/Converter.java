package ProblemsALL;

public class Converter {
	public double celsius;
	public double fahrenheit;
		public double CeltoFah() {
			double fahren = (celsius*1.8)+32;
			return fahren;
			
	}
		public double fahtocel() {
			double cels=(fahrenheit - 32)/1.8;
			return cels;
		}
}
