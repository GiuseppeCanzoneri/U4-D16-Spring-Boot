package com.example.U4D16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		MenuItemPrinter menuItemPrinter = context.getBean(MenuItemPrinter.class);
		menuItemPrinter.printMenu();

		// Aggiungi qui il codice per visualizzare gli ordini
		// ...
	}
}
