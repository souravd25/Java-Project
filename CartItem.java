
public class CartItem {
	public Product product;
	public int quantity;
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}
	
	public void displayCartItem() {
		System.out.println(product.getName() + " x " + quantity + " = $" + getTotalPrice());
	}

}
