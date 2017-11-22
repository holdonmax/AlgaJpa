package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class SalvaItens {

	public static void main(String[] args) {

		// imoprtar sempre o hibernate
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Carlos Alberto");
		cliente.setIdade(38);
		cliente.setProfissao("enfermeiro");
		cliente.setSexo("M");

		// iniciar transaçao para fazer inserções no banco
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso");
		em.close();
	}

}
