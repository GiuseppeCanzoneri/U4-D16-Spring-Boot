//package com.example.U4D16;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.example.U4D16.entities.MenuItem;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//public class Menu {
//	private List<MenuItem> menuItems;
//	private double coverCharge;
//
//	public Menu() {
//		menuItems = new ArrayList<>();
//	}
//
//	public void addMenuItem(MenuItem menuItem) {
//		menuItems.add(menuItem);
//	}
//
//	public double getTotalAmount(Order order) {
//		double totalAmount = order.getNumberOfGuests() + coverCharge;
//
//		for (OrderItem item : order.getItems()) {
//			totalAmount += item.getMenuItem().getPrice();
//		}
//
//		return totalAmount;
//	}
//}
