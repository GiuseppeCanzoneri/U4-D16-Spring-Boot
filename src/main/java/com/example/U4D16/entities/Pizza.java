package com.example.U4D16.entities;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Component
@Scope("prototype")
@Entity

public class Pizza extends Prodotti implements MenuItem {
	public Pizza(String string) {

	}

	private List<String> toppings;

	@Override
	public String getPrice() {

		return null;
	}

}