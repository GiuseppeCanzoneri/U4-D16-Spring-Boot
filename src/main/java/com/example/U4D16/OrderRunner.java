package com.example.U4D16;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(OrderRunner.class);

	private Menu menu;

	@Autowired
	public OrderRunner(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void run(String... args) {
		// Inizializzazione del menu

		// Creazione dell'ordine di esempio
		Table table = new Table();
		table.setTableNumber(7);
		table.setMaxGuests(6);
		table.setStatus(TableStatus.OCCUPIED);
		Order order = new Order();
		order.setOrderNumber(7);
		order.setStatus(OrderStatus.IN_PROGRESS);
		order.setNumberOfGuests(4);
		order.setAcquisitionTime(LocalDateTime.now());

		// Aggiunta di elementi all'ordine
		OrderItem item1 = new OrderItem();
		item1.setMenuItem(menu.getMenuItems().get(0));
		OrderItem item2 = new OrderItem();
		item2.setNote("Senza Ghiaccio");
		item2.setMenuItem(menu.getMenuItems().get(4));
		item1.setNote("Senza cipolla");
		order.addItem(item1);
		order.addItem(item2);

		OrderItem item3 = new OrderItem();
		item3.setMenuItem(menu.getMenuItems().get(3));
		item3.setNote("più salsiccia");
		OrderItem item4 = new OrderItem();
		item4.setMenuItem(menu.getMenuItems().get(5));
		item4.setNote("più ghiaccio");
		order.addItem(item3);
		order.addItem(item4);

		// Calcolo dell'importo totale dell'ordine
		double totalAmount = menu.getTotalAmount(order);

		// Stampa dell'ordine utilizzando il logger

		System.out.println();

		logger.info("Table Number:{}", table.getTableNumber());
		logger.info("Table MaxGuest: {}", table.getMaxGuests());
		logger.info("Table Status: {}", table.getStatus());

		System.out.println();

		logger.info("Order Number: {}", order.getOrderNumber());
		logger.info("Status: {}", order.getStatus());
		logger.info("Number of Guests: {}", order.getNumberOfGuests());

		System.out.println();

		logger.info("Acquisition Time: {}", order.getAcquisitionTime());

		System.out.println();

		for (OrderItem item : order.getItems()) {
			logger.info("Item: {}", item.getMenuItem().getName());
			logger.info("Note: {}", item.getNote());

			System.out.println();

			logger.info("Total Amount: {}", totalAmount);
		}
	}
}
