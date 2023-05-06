package pizz;

import java.util.*;
public class Inventory {
	List<Pizza> pizzaList = new ArrayList();
	List<Crust> crustList = new ArrayList();
	List<Topping> toppingList = new ArrayList();
	List<Sides> sidesList = new ArrayList();
	private int pizzaStock = 10;
	private int crustStock = 20;
	private int toppingStock = 30;
	private int sidesStock = 40;
	
	public int getPizzaStock() {
		return this.pizzaStock;
		
	}
	public void setPizzaStock(int stock) {
		this.pizzaStock = stock;
	}
	public int getCrustStock() {
		return this.crustStock;
		
	}
	public void setCrustStock(int stock) {
		this.crustStock = stock;
	}
	public int getToppingStock() {
		return this.toppingStock;
		
	}
	public void setToppingStock(int stock) {
		this.toppingStock = stock;
	}
	public int getSidesStock() {
		return this.sidesStock;
		
	}
	public void setSidesStock(int stock) {
		this.sidesStock = stock;
	}
	
	//Initializing Inventory
	public Inventory() {
		//Veg Pizza
		pizzaList.add(new Pizza("Deluxe Veggie", "Regular", "veg", 150.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Deluxe Veggie", "Medium", "veg", 200.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Deluxe Veggie", "Large", "veg", 325.00, this.getPizzaStock()));
		
		pizzaList.add(new Pizza("Cheese and corn", "Regular", "veg", 175.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Cheese and corn", "Medium", "veg", 375.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Cheese and corn", "Large", "veg", 475.00, this.getPizzaStock()));
		
		pizzaList.add(new Pizza("Paneer Tikka", "Regular", "veg", 160.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Paneer Tikka", "Medium", "veg", 290.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Paneer Tikka", "Large", "veg", 340.00, this.getPizzaStock()));
		
		//Non-veg Pizza
		pizzaList.add(new Pizza("Non-Veg Supreme", "Regular", "nonveg", 190.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Non-Veg Supreme", "Medium", "nonveg", 325.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Non-Veg Supreme", "Large", "nonveg", 425.00, this.getPizzaStock()));

		pizzaList.add(new Pizza("Chicken Tikka", "Regular", "nonveg", 210.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Chicken Tikka", "Medium", "nonveg", 370.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Chicken Tikka", "Large", "nonveg", 500.00, this.getPizzaStock()));
		
		pizzaList.add(new Pizza("Pepper Barbecue Chicken", "Regular", "nonveg", 220.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Pepper Barbecue Chicken", "Medium", "nonveg", 380.00, this.getPizzaStock()));
		pizzaList.add(new Pizza("Pepper Barbecue Chicken", "Large", "nonveg", 525.00, this.getPizzaStock()));
		
		//Adding Crust
		crustList.add(new Crust("New hand tossed", this.getCrustStock()));
		crustList.add(new Crust("Wheat thin crust", this.getCrustStock()));
		crustList.add(new Crust("Cheese Burst", this.getCrustStock()));
		crustList.add(new Crust("Fresh pan pizza", this.getCrustStock()));
		
		//Veg Toppings
		toppingList.add(new Topping("Black olive", "veg", 20.00, this.getToppingStock()));
		toppingList.add(new Topping("Capsicum", "veg", 25.00, this.getToppingStock()));
		toppingList.add(new Topping("Paneer", "veg", 35.00, this.getToppingStock()));
		toppingList.add(new Topping("Mushroom", "veg", 30.00, this.getToppingStock()));
		toppingList.add(new Topping("Fresh tomato", "veg", 10.00, this.getToppingStock()));
		
		//Non Veg Topping
		toppingList.add(new Topping("Chicken tikka", "nonveg", 35.00, this.getToppingStock()));
		toppingList.add(new Topping("Barbeque chicken", "nonveg", 45.00, this.getToppingStock()));
		toppingList.add(new Topping("Grilled chicken", "nonveg", 40.00, this.getToppingStock()));
		
		//Sides
		sidesList.add(new Sides("Cold drink", 55.00, this.getSidesStock()));
		sidesList.add(new Sides("Mousse cake", 90.00, this.getSidesStock()));
	}
	

	
	public void updatePizzaStock(int index, int newStock, String type) {
	    int count = 0;
	    for (Pizza pizza : pizzaList) {
	        if (pizza.getType().equals(type)) {
	            if (count == index) {
	                pizza.setStock(newStock);
	                return;
	            }
	            count++;
	        }
	    }
	    System.out.println("No pizza of type " + type + " found at index " + index);
	}

	
	public void updateCrustStock(int index, int newStock) {
	    if (index < 0 || index >= crustList.size()) {
	        System.out.println("Invalid index");
	        return;
	    }
	    Crust crust = crustList.get(index);
	    crust.setStock(newStock);
	}
	
	public void updateToppingStock(int index, int newStock, String type) {
	    int count = 0;
	    for (Topping topping : toppingList) {
	        if (topping.getType().equals(type)) {
	            if (count == index) {
	                topping.setStock(newStock);
	                return;
	            }
	            count++;
	        }
	    }
	    System.out.println("No pizza of type " + type + " found at index " + index);
	}
	
	public void updateSidesStock(int index, int newStock) {
	    if (index < 0 || index >= sidesList.size()) {
	        System.out.println("Invalid index");
	        return;
	    }
	    Sides sides = sidesList.get(index);
	    sides.setStock(newStock);
	}

	
	public void displayVegPizza() {
		
		System.out.println("********** Veg Pizzas: **********");
		int i = 1;
		for(Pizza pizza : pizzaList) {
			if(pizza.getType().equals("veg")) {

				System.out.println(i +" " + pizza.getName() + " " + pizza.getSize() + " " + 
						pizza.getPrice() + " Stock: " + pizza.getStock());
				i++;
			}
		}
	}
	public List<Pizza> selectVegPizza() {
		List<Pizza> vegPizza = new ArrayList();
		for(Pizza pizza : pizzaList) {
			if(pizza.getType().equals("veg")) {
				vegPizza.add(pizza);
			}
		}
		return vegPizza;
	}
	public void displayNonVegPizza() {
		System.out.println("********** Non-Veg Pizzas: **********");
		int i = 1;
		for(Pizza pizza : pizzaList) {
			if(pizza.getType().equals("nonveg")) {

				System.out.println(i +" " + pizza.getName() + " " + pizza.getSize() + " " + pizza.getPrice()
				+ " Stock: " + pizza.getStock());
				i++;
			}
		}
	}
	public List<Pizza> selectNonVegPizza() {
		List<Pizza> vegPizza = new ArrayList();
		for(Pizza pizza : pizzaList) {
			if(pizza.getType().equals("nonveg")) {
				vegPizza.add(pizza);
			}
		}
		return vegPizza;
	}
	
	public void displayCrust() {
		System.out.println("********** Crust **********");
		int i = 1;
		for(Crust crust: crustList) {
			System.out.println(i +" " + crust.getName() + " Stock: " + crust.getStock());
			i++;
		}
	}
	
	public List<Crust> selectCrust() {
		List<Crust> crus = new ArrayList();
		for(Crust crust: crustList) {
			crus.add(crust);
		}
		return crus;
	}
	
	public void displayVegTopping() {
		
		System.out.println("********** Veg Topping: **********");
		int i = 1;
		for(Topping topping : toppingList) {
			if(topping.getType().equals("veg")) {

				System.out.println(i +" " + topping.getName() + " " + topping.getPrice() + " Stock: " + topping.getStock());
				i++;
			}
		}
	}
	public List<Topping> selectVegTopping() {
		List<Topping> top = new ArrayList();
		for(Topping topping : toppingList) {
			if(topping.getType().equals("veg")) {
				top.add(topping);
			}
		}
		return top;
	}
	public void displayNonVegTopping() {
		
		System.out.println("********** Non Veg Topping: **********");
		int i = 1;
		for(Topping topping : toppingList) {
			if(topping.getType().equals("nonveg")) {

				System.out.println(i +" " + topping.getName() + " " + topping.getPrice() + " Stock: " + topping.getStock());
				i++;
			}
		}
	}
	public List<Topping> selectNonVegTopping() {
		List<Topping> top = new ArrayList();
		for(Topping topping : toppingList) {
			if(topping.getType().equals("nonveg")) {
				top.add(topping);
			}
		}
		return top;
	}
	
	public void displaySides() {
		System.out.println("********** Sides **********");
		int i = 1;
		for(Sides sides: sidesList) {
			System.out.println(i + " " +sides.getName() + " " + sides.getPrice() + " Stock: " + sides.getStock());
			i++;
		}
		System.out.println("3 None");
	}
	
	public List<Sides> selectSides() {
		List<Sides> side = new ArrayList();
		for(Sides sides: sidesList) {
			side.add(sides);
		}
		return side;
	}
	
	public void updateInventory() {
		System.out.println("1 Update Pizza");
		System.out.println("2 Update Crust");
		System.out.println("3 Update Topping");
		System.out.println("4 Update Sides");
		System.out.println("Enter Option ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n;
		switch (input) {
		case 1: 
			Pizza pizza = new Pizza();
			System.out.println("Enter pizza name: ");
			sc.nextLine();
			String in = sc.nextLine();
			if(ifPizzaAvailable(in) != -1) {
				System.out.println("Pizza Already Available in inventory ");
				System.out.println("Enter stock: ");
				n = sc.nextInt();
				pizzaList.get(ifPizzaAvailable(in)).setStock(n);
			}
			else {
				pizza.setName(in);
				System.out.println("Select Size: ");
				System.out.println("1 Regular");
				System.out.println("2 Medium");
				System.out.println("3 Large");
				System.out.println("Enter Option: ");
				n = sc.nextInt();
				if(n==1) {
					pizza.setSize("Regular");
				}else if(n==2) {
					pizza.setSize("Medium");
				}else if(n==3) {
					pizza.setSize("Large");
				}
				System.out.println("Select Type: ");
				System.out.println("1 Veg");
				System.out.println("2 Nonveg");
				System.out.println("Enter Option: ");
				n = sc.nextInt();
				if(n==1) {
					pizza.setType("veg");
				}else if(n==2) {
					pizza.setType("nonveg");
				}
				System.out.println("Set Price: ");
				double price = sc.nextDouble();
				pizza.setPrice(price);
				System.out.println("Set Stock");
				n = sc.nextInt();
				pizza.setStock(n);
				pizzaList.add(pizza);
			}
			System.out.println("Updated Successfully!");
			break;
		case 2: 
			Crust crust = new Crust();
			System.out.println("Enter name: ");
			sc.nextLine();
			String name = sc.nextLine();
			if(ifCrustAvailable(name) != -1) {
				System.out.println("Crust already available in inventory ");
				System.out.println("Enter Stock: ");
				int st = sc.nextInt();
				crustList.get(ifCrustAvailable(name)).setStock(st);
			}
			else {
				crust.setName(name);
				System.out.println("Enter Stock: ");
				int st = sc.nextInt();
				crust.setStock(st);
				crustList.add(crust);
			}
			System.out.println("Updated Successfully!");
			break;
		case 3: 
			Topping topping = new Topping();
			System.out.println("Enter topping name: ");
			sc.nextLine();
			String toppingName = sc.nextLine();
			if(ifToppingAvailable(toppingName) != -1) {
				System.out.println("Topping already available in inventory ");
				System.out.println("Set Stock");
				n = sc.nextInt();
				sidesList.get(ifToppingAvailable(toppingName)).setStock(n);
				
			}else {
				topping.setName(toppingName);
				System.out.println("Select Type: ");
				System.out.println("1 Veg");
				System.out.println("2 Nonveg");
				System.out.println("Enter Option: ");
				n = sc.nextInt();
				if(n==1) {
					topping.setType("veg");
				}else if(n==2) {
					topping.setType("nonveg");
				}
				System.out.println("Set Price: ");
				double toppingPrice = sc.nextDouble();
				topping.setPrice(toppingPrice);
				System.out.println("Set Stock");
				n = sc.nextInt();
				topping.setStock(n);
				toppingList.add(topping);
			}
			
			System.out.println("Updated Successfully!");
			break;
			
		case 4: 
			Sides sides = new Sides();
			System.out.println("Enter name: ");
			sc.nextLine();
			String sideName = sc.nextLine();
			if(ifSidesAvailable(sideName) != -1) {
				System.out.println("Sides already available in inventory ");
				System.out.println("Set Stock");
				n = sc.nextInt();
				sidesList.get(ifSidesAvailable(sideName)).setStock(n);
			}else {
				sides.setName(sideName);
				System.out.println("Set Price: ");
				double sidesPrice = sc.nextDouble();
				sides.setPrice(sidesPrice);
				System.out.println("Set Stock");
				n = sc.nextInt();
				sides.setStock(n);
				sidesList.add(sides);
			}
			System.out.println("Updated Successfully!");
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
	}
	
	public int ifPizzaAvailable(String name) {
		int index = 0;
		for(Pizza pizza: pizzaList) {
			if(pizza.getName().trim().equalsIgnoreCase(name.trim())) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public int ifCrustAvailable(String name) {
		int index = 0;
		for(Crust crust: crustList) {
			if(crust.getName().trim().equalsIgnoreCase(name.trim())) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public int ifToppingAvailable(String name) {
		int index = 0;
		for(Topping topping: toppingList) {
			if(topping.getName().trim().equalsIgnoreCase(name.trim())) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public int ifSidesAvailable(String name) {
		int index = 0;
		for(Sides sides: sidesList) {
			if(sides.getName().trim().equalsIgnoreCase(name.trim())) {
				return index;
			}
			index++;
		}
		return -1;
	}

}
