import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Inventory inventory = new Inventory();
		Cart cart = new Cart();
		
		inventory.addProduct(new Product(1, "Milk", 2.5));
		inventory.addProduct(new Product(2, "Bread", 1.6));
		inventory.addProduct(new Product(3, "Rice", 50.0));
		inventory.addProduct(new Product(4, "Pulse", 20.0));
		inventory.addProduct(new Product(5, "Eggs (12)", 6.5));
		inventory.addProduct(new Product(6, "Chips", 40));
		inventory.addProduct(new Product(7, "Chocolates", 22));
		
		System.out.println("===Welcome to Supermarket Billing System ===");
		
		while(true) {
			inventory.displayAllProducts();
			
			System.out.println("\nEnter product ID to add to cart (or 0 to finish) ");
			int id = scanner.nextInt();
			
			if (id == 0) break;
			
			Product selectedProduct = inventory.findProductById(id);
			if(selectedProduct == null) {
				System.out.println("Product not found. Try again.");
				continue;
			}
			
			System.out.println("Enter quantity: ");
			int qty = scanner.nextInt();
			
			if(qty<=0) {
				System.out.println("Quantity must be atleast 1.");
				continue;
			}
			
			cart.addItem(selectedProduct, qty);
			System.out.println("Added to cart sucessfully!!\n");
			
			
		}
		
		if (cart.getItems().isEmpty()) {
			System.out.println("No items in cart. Exiting......");
			
		}
		else {
			Bill bill = new Bill(cart);
			bill.printBill();
		}
		scanner.close();
	}
	
	

}
