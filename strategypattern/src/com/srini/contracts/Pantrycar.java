package com.srini.contracts;

public interface Pantrycar {
	double billamt(String[] foodItems);
	String serveFood(String[] foodItems);
	void provideMenu();
}
