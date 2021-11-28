package com.gustavo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gustavo.DAO.CategoriaDAO;
import com.gustavo.DAO.PessoaDAO;
import com.gustavo.models.*;

public class Teste {

	private EntityManager getEntityManager() {
		
		EntityManager entityManager = null;
		EntityManagerFactory factory = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("BancoPU");
			entityManager = factory.createEntityManager();
		} finally {
			factory.close();
		}
		return entityManager;
	}
	
	public static void main(String[] args) {
	
		// FIND
		//Pessoa pessoa = entityManager.find(Pessoa.class, 1);
		
		//Pessoa p = new Pessoa();
		
		//p.setId(0);
		//p.setNome("renata");
		
		/*PessoaDAO pd = new PessoaDAO();
		//pd.salvar(p);
		
		Categoria c = new Categoria(0,"asdasd");
		
		CategoriaDAO cd = new CategoriaDAO();
		//cd.salvar(c);
		cd.consultarById(2);*/
		
		//entityManager.getTransaction().begin();
		//entityManager.persist(cliente);
		//entityManager.getTransaction().commit();
		//System.out.println("Nome do cliente:" + pessoa.getNome());
		// DELETE
//		Cliente cliente = entityManager.find(Cliente.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();
		
		// MODIFY
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNome("FACEBOOK INC.");
		
//		entityManager.getTransaction().begin();
//		entityManager.merge(cliente);
//		entityManager.getTransaction().commit();

		//entityManager.close();
		//entityManagerFactory.close();
		
	}
	
}
