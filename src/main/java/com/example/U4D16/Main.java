package com.example.U4D16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		MenuItemPrinter menuItemPrinter = context.getBean(MenuItemPrinter.class);

		menuItemPrinter.printMenu();
	}
}
