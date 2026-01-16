
public class Product {
	public int id;
	public String name;
	public double price;
	
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void displayProduct() {
		System.out.println("ID: " + id + " Name: " + name + " Price: $" + price);
		
	}

}
