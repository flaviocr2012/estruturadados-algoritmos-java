package com.flavio.estruturadados.vetor.teste;

import com.flavio.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos();
		
		Contato c1 = new Contato("Ana", "1234-5678", "ana@gmail.com");
		Contato c2 = new Contato("Maria", "1234-9876", "maria@gmail.com");
		Contato c3 = new Contato("Claudia", "1234-1234", "claudia@gmail.com");
		
		Contato c4 = new Contato("Ana", "1234-5678", "ana@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		System.out.println(vetor);
	}

}
