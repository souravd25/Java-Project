import java.util.ArrayList;

public class Inventory {
	public ArrayList<Product> products;
	
	public Inventory() {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Product findProductById(int id) {
		for(Product p : products) {
			if(p.getID() == id) {
				return p;
			}
		}
		return null;
	}
	
	public void displayAllProducts() {
		System.out.println("------Available Products------");
		for(Product p : products) {
			p.displayProduct();
		}
	}

}
