//package com.example.U4D16;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//
//@Component
//@Scope("prototype")
//public class Order {
//	private int orderNumber;
//	private OrderStatus status;
//	private int numberOfGuests;
//	private LocalDateTime acquisitionTime;
//	private List<OrderItem> items;
//
//	public void addItem(OrderItem item) {
//		if (items == null) {
//			items = new ArrayList<>();
//		}
//		items.add(item);
//	}
//
//}
