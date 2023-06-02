package com.example.U4D16.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.U4D16.dao.ProdottiService;

public class ProdottiRunner implements CommandLineRunner {

	@Autowired
	ProdottiService prodottiService;

	@Override
	public void run(String... args) throws Exception {

		Pizza pizzaMargherita = new Pizza("Margherita, 7.50,13");
		prodottiService.create(pizzaMargherita);
	}
}
