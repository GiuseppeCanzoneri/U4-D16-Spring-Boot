//package com.example.U4D16;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.example.U4D16.entities.Drink;
//import com.example.U4D16.entities.MenuItem;
//import com.example.U4D16.entities.Pizza;
//
//@Component
//
//public class MenuItemPrinter {
//	private Menu menu;
//
//	@Autowired
//	public void setMenu(Menu menu) {
//		this.menu = menu;
//	}
//
//	public void printMenu() {
//
//		System.out.println();
//		System.out.println("Menù Pizzeria");
//		System.out.println();
//		for (MenuItem menuItem : menu.getMenuItems()) {
//			System.out.println("Name: " + menuItem.getName());
//			System.out.println("Price: " + menuItem.getPrice());
//
//			if (menuItem instanceof Pizza) {
//				Pizza pizza = (Pizza) menuItem;
//				System.out.println("Toppings: " + pizza.getToppings());
//			} else if (menuItem instanceof Drink) {
//				Drink drink = (Drink) menuItem;
//				System.out.println("Nutritional Info: " + drink.getNutritionalInfo());
//			}
//
//			System.out.println();
//		}
//	}
//}
