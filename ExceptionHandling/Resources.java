package ExceptionHandling;

public class Resources  implements AutoCloseable{
	public void show() {
		System.out.println("example  of autocloseable");
	}
	@Override
	public void close() throws Exception {
		System.out.println("this is Executed automatically");
	}
		
	public static void main(String[] args) throws Exception {
		try(Resources mr = new Resources()){
			mr.show();
		}
		System.out.println("end of main");
	
	}

}
