import java.util.ArrayList;

public class Cart {
	public ArrayList<CartItem> items;
	
	public Cart() {
		items = new ArrayList<>();
		
	}
	
	public void addItem(Product product, int quantity) {
		items.add(new CartItem(product,quantity));
	}
	
	public void displayCart() {
		System.out.println("----- Cart Items -----");
		for(CartItem item : items) {
			item.displayCartItem();
		}
		
		System.out.println("Total: $" + getTotal());
	}
	
	public double getTotal() {
		double total = 0;
		for(CartItem item : items) {
			total += item.getTotalPrice();		
			}
		return total;
	}
	
	public ArrayList<CartItem> getItems(){
		return items;
	}
}
