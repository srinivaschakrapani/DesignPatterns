package com.srini.test;

import com.srini.factory.TrainFactory;
import com.srini.trains.Train;

public class TestStrategyPattern {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		final String pantrycar = "MealsOnWheels";
		
		final String []fooditems = 		new String[] {"Veg Thali", "Egg Thali"};
		final long 	 tno 		 = 		12621;
		final String tname 		 = 		"Tamilnadu Express";
		final String src 		 = 		"Chennai";
		final String dest 		 = 		"New Delhi";

		// Get the Train instance
		// Can this be made more modularized ? long constructors v/s Builders ?
		Train tn = TrainFactory.getInstance(tno,tname,src,dest,pantrycar);
		//Provide the menu
		tn.toString();
		tn.getPc().provideMenu();
		tn.getPc().serveFood(fooditems);
		tn.getPc().billamt(fooditems);
		
	}
}