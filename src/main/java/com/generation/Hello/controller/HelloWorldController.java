package com.generation.Hello.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/lista-bsm")
	public String listaBsm(){
			ArrayList <String> bsm = new ArrayList<String>();
			bsm.add("Responsabilidade Pessoal");
			bsm.add("Mentalidade de crescimento");
			bsm.add("Orientação ao futuro");
			bsm.add("Persistência");
			bsm.add("Comunicação");
			bsm.add("Trabalho em equipe");
			bsm.add("Proativida");
			bsm.add("Orientação ao detalhe");
			
			return "Bsms: "+bsm;
	}
	
	@GetMapping("/Objetivos-pessoais")
	public String objetivos() {
			ArrayList<String> obj = new ArrayList<String>();
			obj.add("Estudar mais programação");
			obj.add("Estudar mais o bloco 1");
			obj.add("Ver mais video aulas");
			obj.add("Fazer mais listas de exercicios");
		return "Objetivos: "+obj;
	}
	
}
