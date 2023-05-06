package pizz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaSystem {
	public static List<Order> finalOrders = new ArrayList();
	public static List<Sides> sidesOrders = new ArrayList();
	public static double grandTotal = 0;
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		while(true) {
			
		
	try {
		System.out.println("1 Veg Pizza");
		System.out.println("2 Non Veg Pizza");
		System.out.println("3 Update Inventory");
		System.out.println("Enter Option :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		//Veg
		if(n == 1) {
			inventory.displayVegPizza();
			System.out.println();
			System.out.println("Enter Option :");
			n = sc.nextInt();
			List<Pizza> list = inventory.selectVegPizza();
			
			Pizza pizza = new Pizza();
			pizza.setName(list.get(n-1).getName());
			pizza.setType(list.get(n-1).getType());
			pizza.setSize(list.get(n-1).getSize());
			pizza.setPrice(list.get(n-1).getPrice());
			
			//Check If out of stock;
			if(list.get(n-1).getStock() < 1) {
				System.out.println("Out of Stock!!");
				break;
			}
			//updating stock
			inventory.updatePizzaStock(n-1, list.get(n-1).getStock() -1, "veg");
				
			inventory.displayCrust();
			n = sc.nextInt();
			List<Crust> crustList = inventory.selectCrust();
			Crust crust = new Crust();
			crust.setName(crustList.get(n-1).getName());

			
			//Check If out of stock;
			if(crustList.get(n-1).getStock() < 1) {
				System.out.println("Out of Stock!!");
				break;
			}
			
			//updating stock
			inventory.updateCrustStock(n-1, crustList.get(n-1).getStock() -1);
			
			inventory.displayVegTopping();
			n = sc.nextInt();
			List<Topping> toppingList = inventory.selectVegTopping();
			Topping topping = new Topping();
			topping.setName(toppingList.get(n-1).getName());
			topping.setPrice(toppingList.get(n-1).getPrice());
			topping.setType(toppingList.get(n-1).getType());

			//Check If out of stock;
			if(toppingList.get(n-1).getStock() < 1) {
				System.out.println("Out of Stock!!");
				break;
			}
			
			//updating stock
			inventory.updateToppingStock(n-1, toppingList.get(n-1).getStock() -1, "veg");
			
			inventory.displaySides();
			n = sc.nextInt();
			if(n == 1 || n==2) {
				List<Sides> sidesList = inventory.selectSides();
				Sides side = new Sides();
				side.setName(sidesList.get(n-1).getName());
				side.setPrice(sidesList.get(n-1).getPrice());
				
				Order order = new Order(pizza, crust, topping);
				
				double total = order.getTotal() + side.getPrice();
				System.out.println("Sides: " + side.getName() + " " + 55.00);
				System.out.println("Total: " + total);

				//Check If out of stock;
				if(sidesList.get(n-1).getStock() < 1) {
					System.out.println("Out of Stock!!");
					break;
				}
				
				finalOrders.add(order);
				sidesOrders.add(side);
				grandTotal += total;
				
				//updating stock
				inventory.updateSidesStock(n-1, sidesList.get(n-1).getStock() -1);
				
			}else {
//				Placing Order
				Order order = new Order(pizza, crust, topping);
				double total = order.getTotal();
				System.out.println("Sides: None: " + 00.00);
				System.out.println("Total: " + total);
				inventory.setSidesStock(inventory.getSidesStock());
				
				finalOrders.add(order);
				grandTotal += total;
			}
			
			
		}
		
		//Non Veg
		else if(n == 2) {
			inventory.displayNonVegPizza();
			System.out.println();
			System.out.println("Enter Option :");
			n = sc.nextInt();
			List<Pizza> list = inventory.selectNonVegPizza();
			
			Pizza pizza = new Pizza();
			pizza.setName(list.get(n-1).getName());
			pizza.setType(list.get(n-1).getType());
			pizza.setSize(list.get(n-1).getSize());
			pizza.setPrice(list.get(n-1).getPrice());
			
			//Check If out of stock;
			if(list.get(n-1).getStock() < 1) {
				System.out.println("Out of Stock!!");
				break;
			}
			
			//updating stock
			inventory.updatePizzaStock(n-1, list.get(n-1).getStock() -1, "nonveg");
			
				
			inventory.displayCrust();
			n = sc.nextInt();
			List<Crust> crustList = inventory.selectCrust();
			Crust crust = new Crust();
			crust.setName(crustList.get(n-1).getName());
			
			//Check If out of stock;
			if(crustList.get(n-1).getStock() < 1) {
				System.out.println("Out of Stock!!");
				break;
			}

			//updating stock
			inventory.updateCrustStock(n-1, crustList.get(n-1).getStock() -1);
			
			inventory.displayNonVegTopping();
			n = sc.nextInt();
			List<Topping> toppingList = inventory.selectNonVegTopping();
			Topping topping = new Topping();
			topping.setName(toppingList.get(n-1).getName());
			topping.setPrice(toppingList.get(n-1).getPrice());
			topping.setType(toppingList.get(n-1).getType());
			
			//Check If out of stock;
			if(toppingList.get(n-1).getStock() < 1) {
				System.out.println("Out of Stock!!");
				break;
			}

			//updating stock
			inventory.updateToppingStock(n-1, toppingList.get(n-1).getStock() -1, "nonveg");
			
			inventory.displaySides();
			n = sc.nextInt();
			if(n == 1 || n==2) {
				List<Sides> sidesList = inventory.selectSides();
				Sides side = new Sides();
				side.setName(sidesList.get(n-1).getName());
				side.setPrice(sidesList.get(n-1).getPrice());
				
				Order order = new Order(pizza, crust, topping);
				double total = order.getTotal() + side.getPrice();
				System.out.println("Sides: " + side.getName() + " " + 55.00);
				System.out.println("Total: " + total);

				//Check If out of stock;
				if(sidesList.get(n-1).getStock() < 1) {
					System.out.println("Out of Stock!!");
					break;
				}
				
				finalOrders.add(order);
				sidesOrders.add(side);
				grandTotal += total;
				
				//updating stock
				inventory.updateSidesStock(n-1, sidesList.get(n-1).getStock() -1);
				
			}else {
//				Placing Order
				Order order = new Order(pizza, crust, topping);
				double total = order.getTotal();
				System.out.println("Sides: None: " + 00.00);
				System.out.println("Total: " + total);
				
				finalOrders.add(order);
				grandTotal += total;
				
			}
		}
		//Update Inventory
		else if(n == 3){
			inventory.updateInventory();
		}
			
	} catch(Exception e) {
		System.out.println("Wrong Option");
	}	
	System.out.println("Enter 0 to exit, or any other key to continue:");
	Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    if (input.equals("0")) {
        break;
    }
		}
		displayOrders(finalOrders);
		displaySides(sidesOrders);
		System.out.println("---------------------------------------");
		System.out.println("|Grad Total| " + grandTotal);
		System.out.println("---------------------------------------");
	System.out.println("Thank you for using our services!");
	}
	
	public static void displayOrders(List<Order> list) {
		if(list.isEmpty()) {
			return;
		}
		System.out.println("****************Orders*****************");
		System.out.println("");
		for(Order order: list) {
			System.out.println("Pizza: " + order.getPizzaName());
			System.out.println("Crust: " + order.getCrustName());
			System.out.println("Topping: " + order.getToppingName());
			System.out.println("");
		}
		System.out.println("---------------------------------------");
	}
	
	public static void displaySides(List<Sides> list) {
		if(list.isEmpty()) {
			return;
		}
		System.out.println("***************Sides*******************");
		System.out.println("");
		for(Sides order: list) {
			System.out.println("Side Order: " + order.getName());
		}
		System.out.println("");
		System.out.println("***************************************");
	}
}
