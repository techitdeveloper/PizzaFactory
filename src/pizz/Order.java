package pizz;

import java.util.Scanner;

public class Order {
	private double total;
	private String pizzaName;
	private String crustName;
	private String toppingName;
	// Pizza(String name, String size, String type, double price)
	public Order( ) {
		total = 0;
		
	}
	public Order(Pizza pizza, Crust crust, Topping topping) {
		this.pizzaName = pizza.getName();
		this.crustName = crust.getName();
		this.toppingName = topping.getName();
		total = pizza.getPrice();
		System.out.println("Do you want extra cheese? (35)");
		System.out.println("1 yes");
		System.out.println("2 no");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x == 1) {
			total += 35.00;
		}
		else {
			total += 0.00;
		}
		System.out.println("Order Placed:");
		System.out.println("Details: ");
		System.out.println("Pizza: " + pizza.getName() + " " + pizza.getSize());
		System.out.println("Crust: " + crust.getName() );
		System.out.println("Topping: " + topping.getName() + " " + topping.getType());
//		total = pizza.getPrice() + topping.getPrice();
//		System.out.println("Pizza Total " + total);
		
	}
	
	
	public double getTotal() {
		return this.total;
	}
	public String getPizzaName() {
		return this.pizzaName;
	}
	public String getCrustName() {
		return this.crustName;
	}
	public String getToppingName() {
		return this.toppingName;
	}
}
