//package com.example.U4D16;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.example.U4D16.entities.Drink;
//import com.example.U4D16.entities.Merchandise;
//import com.example.U4D16.entities.Pizza;
//
//@Configuration
//
//public class MenuConfiguration {
//	@Value("${cover.charge}")
//	private double coverCharge;
//
//	@Bean
//	Menu menu() {
//		Menu menu = new Menu();
//		menu.setCoverCharge(coverCharge);
//
//		// Creazione delle pizze
//		Pizza margherita = new Pizza();
//		margherita.setName("Margherita");
//		margherita.setPrezzo(7.5);
//		margherita.setToppings(Arrays.asList("Prosciutto", "Funghi", "Peperoni"));
//
//		Pizza hawaiian = new ToppingDecorator(margherita, "Ananas", 1.5);
//		hawaiian.setName("Hawaiian Pizza");
//		hawaiian.setToppings(Arrays.asList("Meno ananas + patatine"));
//		Pizza doubleHamMargherita = new ToppingDecorator(margherita, "Prosciutto", 2.0);
//		doubleHamMargherita.setName("Margherita + Doppio Prosciutto");
//
//		Pizza familySizeMargherita = new FamilySizeDecorator(margherita, 14.0);
//		familySizeMargherita.setName("Margherita (Dimensione Famiglia)");
//
//		// Creazione delle bevande
//		Drink coke = new Drink();
//		coke.setName("Coca-Cola (0.75cl)");
//		coke.setPrezzo(2.5);
//		coke.setNutritionalInfo("Calories: 140, Sugar: 39g");
//
//		Drink water = new Drink();
//		water.setName("Water (0,33cl)");
//		water.setPrezzo(1.0);
//		water.setNutritionalInfo("Calories: 0, Sugar: 0g");
//
//		// Creazione degli articoli di oggettistica
//		Merchandise tShirt = new Merchandise();
//		tShirt.setName("Godfather's Pizza T-Shirt");
//		tShirt.setPrezzo(15.0);
//
//		// Aggiunta degli elementi al menu
//		menu.addMenuItem(margherita);
//		menu.addMenuItem(hawaiian);
//		menu.addMenuItem(doubleHamMargherita);
//		menu.addMenuItem(familySizeMargherita);
//		menu.addMenuItem(coke);
//		menu.addMenuItem(water);
//		menu.addMenuItem(tShirt);
//
//		return menu;
//	}

//}
