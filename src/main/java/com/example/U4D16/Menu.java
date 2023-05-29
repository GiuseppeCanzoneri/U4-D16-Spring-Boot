package com.example.U4D16;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {
	private List<MenuItem> menuItems;

	public Menu() {
		menuItems = new ArrayList<>();
	}

	public void addMenuItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}

}
