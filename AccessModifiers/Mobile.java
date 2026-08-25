package AccessModifiers;

public class Mobile {
	private String brand;
	private String model;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		if(brand=="" || brand.trim().isEmpty()) {
			System.out.println("brand cannot be empty");
		}
		else
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if (model=="" || model.trim().isEmpty()) {
			System.out.println("model cannot be empty");
		}
		else
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("price cannot be negative");
		}
		this.price = price;
	}
}
