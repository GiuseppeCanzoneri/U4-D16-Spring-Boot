package com.example.U4D16;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Component
@Scope("prototype")

public class Merchandise extends MenuItem {
	// Classe per gli articoli di oggettistica
	// Non ha bisogno di campi aggiuntivi

}