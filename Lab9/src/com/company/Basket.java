package com.company;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * An basket keeps a list of items. It needs to be notified when item details change.
 */
public class Basket implements Observer {
	private ArrayList<Item>items;
	private double totalPrice; // This should ALWAYS be the sum of the prices of all items in the basket 
	
	public Basket() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		// We can't add this item if it is already in the basket
		if (!items.contains(item)) {
			items.add(item);
			item.addObserver(Basket.this);
			totalPrice += item.getPrice();
		}
	}
	
	public void removeItem(Item item) {
		if (items.contains(item)) {
			// We have this item, so we can remove it
			items.remove(item);
			totalPrice -= item.getPrice();
			item.deleteObserver(Basket.this);
		}
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void update(Observable o, Object arg) {
		totalPrice=0;
		for (Item item:
			 items) {
			totalPrice += item.getPrice();
		}
	}
}
