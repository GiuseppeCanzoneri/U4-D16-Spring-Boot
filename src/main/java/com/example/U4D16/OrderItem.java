package com.example.U4D16;

import com.example.U4D16.entities.MenuItem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
	private MenuItem menuItem;
	private String note;

}