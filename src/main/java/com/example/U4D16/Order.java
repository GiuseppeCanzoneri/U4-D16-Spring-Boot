package com.example.U4D16;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private int orderNumber;
	private OrderStatus status;
	private int numberOfGuests;
	private LocalDateTime acquisitionTime;
	private List<OrderItem> items;

	public void addItem(OrderItem item) {
		if (items == null) {
			items = new ArrayList<>();
		}
		items.add(item);
	}

}
