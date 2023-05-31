package com.example.U4D16;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Component
@Scope("prototype")

public class Drink extends MenuItem {
	private String nutritionalInfo;

}