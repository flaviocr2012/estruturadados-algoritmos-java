package com.flavio.estruturadados.vetor.teste;

import com.flavio.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {

		Lista<Contato> vetor = new Lista<Contato>(1);

		Contato c1 = new Contato("Ana", "1234-5678", "ana@gmail.com");
		Contato c2 = new Contato("Maria", "1234-9876", "maria@gmail.com");
		Contato c3 = new Contato("Claudia", "1234-1234", "claudia@gmail.com");

		vetor.adiciona(c1);

//		VetorObjetos vetor = new VetorObjetos(2);
//		
//		vetor.adiciona(1);
//		
//		vetor.adiciona("elemento do tipo string");
//		
		System.out.println(vetor);

	}

}
