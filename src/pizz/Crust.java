package pizz;

public class Crust {
	private String name;
	private int stock;
	public Crust() {
		
	}
	public Crust(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
