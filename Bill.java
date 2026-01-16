import java.util.Date;
import java.text.SimpleDateFormat;

public class Bill {
	public Cart cart;
	public String date;
	
	public Bill(Cart cart) {
		this.cart = cart;
		this.date = getCurrentDate();
	}

	public String getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date currentDate = new Date();
		return formatter.format(currentDate);
	}
	
	public void printBill() {
		System.out.println("\n====== Supermarket Bill ======");
		System.out.println("Date: " + date);
		System.out.println("------------------------------");
		cart.displayCart();
		System.out.println("==============================");
		System.out.println("Thank you for shopping with us!!");
	}
	
	
	
	
	

}
