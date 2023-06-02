package com.example.U4D16.entities;

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
public abstract class Merchandise extends Prodotti implements MenuItem {
	// Classe per gli articoli di oggettistica
	// Non ha bisogno di campi aggiuntivi

}