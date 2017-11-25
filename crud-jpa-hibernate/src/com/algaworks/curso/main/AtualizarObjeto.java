package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class AtualizarObjeto {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		//preciso de um objeto gerenciado
		Cliente cliente = em.find(Cliente.class, 2L);
		em.getTransaction().begin();
		cliente.setNome("Erick Alves dos Santos ");
		cliente.setIdade(28);
		cliente.setProfissao("Programador Java Sr.");
		cliente.setSexo("M"	);
		em.getTransaction().commit();
		
		System.out.println("Cliente Alterado com sucesso");
		
		
	}
}
