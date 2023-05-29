package com.example.U4D16;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToppingDecorator extends PizzaDecorator {
	private String toppingName;
	private double toppingPrice;

	public ToppingDecorator(Pizza pizza, String toppingName, double toppingPrice) {
		super(pizza);
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}

	@Override
	public String getName() {
		return pizza.getName() + " + " + toppingName;
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + toppingPrice;
	}
}
