package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		// metodo recebe a classe que é a entidade no primeiro argumento
		// segundo argumento recebe valor do Id o codigo.

		Cliente cliente = em.find(Cliente.class, 16L);// acrescentar o L no
														// integer pra
														// transfirmar num long
		if (cliente != null) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Profissao: " + cliente.getProfissao());
			System.out.println("Sexo: " + cliente.getSexo());

		} else {
			System.out.println("Cliente nao encontrado!!!");
		}
	}
}
