package com.example.U4D16;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Component
@Scope("prototype")
public class Pizza extends MenuItem {
	private List<String> toppings;

}