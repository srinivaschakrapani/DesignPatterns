package com.srini.pantryvendors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.srini.contracts.Pantrycar;

public class MealsOnWheels implements Pantrycar {
	
	static Map<String, Integer> menu = new  HashMap<String, Integer>();
	
	static {
		menu.put("Veg Thali", 120);
		menu.put("Egg Thali", 130);
		menu.put("Non-Veg Thali", 150);
	}
	
	@Override
	public String toString() {
		return "Pantry Vendor ===> [ MealsOnWheels ]";
	}

	@Override
	public double billamt(String[] foodItems) {
		// TODO Auto-generated method stub
		double totalamt = 0.0;
		for(String item:foodItems) {
			double itemCost = menu.get(item);
			totalamt += itemCost;
		}
		
		System.out.println(" ============= Billing details ============ ");
		System.out.println(" Items = "+ Arrays.toString(foodItems) + " Bill Amount = " + totalamt);
		return totalamt;
	}

	@Override
	public String serveFood(String[] foodItems) {
		// TODO Auto-generated method stub
		System.out.println(" ============ Serving food ============== ");
		System.out.println(Arrays.toString(foodItems));
		return foodItems.toString();
	}

	@Override
	public void provideMenu() {
		// TODO Auto-generated method stub
		System.out.println(" ============== Menu Items ============== ");

		for(Map.Entry m : menu.entrySet()) {
			System.out.println("Item : " + m.getKey() + "   Price : " + m.getValue());
		}
	}

}
