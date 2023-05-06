package pizz;

public class Pizza {
	private String name;
	private String size;
//	private String crust;
	private String type;	//veg and nonveg
	private double price;
	private int stock;

	public Pizza() {
		
	}
	public Pizza(String name, String size, String type, double price, int stock) {
		this.name = name;
		this.size = size;
		this.type = type;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return this.stock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;	
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
