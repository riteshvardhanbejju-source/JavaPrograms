package core.OPPS;
class Book{
	int id;
	String name;
	String author;
	double cost;
	public Book() {
		System.out.println("Default Constructor");
	}
	public Book(int id, String name,String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Book(int id, String name,String author,double cost) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.cost = cost;
	}
	public void display() {
		System.out.println(id+" "+name+" ");
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Book b1 = new Book();// calling default constructor	
		Book b2 = new Book(101,"Java","James Gosling");
		b2.display();
		Book b3 = new Book(106,"The Story of My Experiments with Truth and Hind Swaraj","Mahatma Gandhi",50);
		b3.display();
	}



}




