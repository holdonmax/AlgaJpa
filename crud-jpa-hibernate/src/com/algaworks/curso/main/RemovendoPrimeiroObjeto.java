package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class RemovendoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 6L);

		// sintaxe acima usa a classe enidade e a posiçao
		// depois vai deletar a mesma
		em.getTransaction().begin();

		// alteraçoes no banco necessidaram do getTransacion
		// o begin e o commit pra armazenar as mudanças

		em.remove(cliente);

		em.getTransaction().commit();

		System.out.println("Objeto removido com sucesso");

	}

}
