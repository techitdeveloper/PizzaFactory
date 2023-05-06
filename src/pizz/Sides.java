package pizz;

public class Sides {
	private String name;
	private double price;
	private int stock;
	
	public Sides() {
		this.name = "";
		this.price = 0.00;
//		this.stock = 10;
	}
	
	public Sides(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return this.stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
} 
