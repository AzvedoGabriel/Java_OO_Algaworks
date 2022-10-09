package com.algaworks.curso.javaeoo.instanciando.acessando.atributos.projeto;

public class Cachorro {
	String nome;
	String raca; 
	char sexo;
	int idade;
	
	public void exibirInformacoes() {
	
		System.out.println("Nome: " + nome);
		System.out.println("Raça: " + raca);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
	}
}
