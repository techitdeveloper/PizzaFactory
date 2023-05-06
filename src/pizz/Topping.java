package pizz;

public class Topping {
	//name, type, price
	private String name;
	private String type;
	private double price;
	private int stock;
	public Topping() {
		
	}
	public Topping(String name, String type, double price, int stock) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.stock = stock;
	}
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public double getPrice() {
		return this.price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
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
