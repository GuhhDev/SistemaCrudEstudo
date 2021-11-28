package com.gustavo.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.gustavo.interfaces.*;
import com.gustavo.models.*;
import java.awt.*;

public class PessoaDAO implements IPessoa {

	/*
	 * Substituindo instancia de entityManager e ManagerFactory para algo mais
	 * abstrato, instanciando uma variável do tipo entityManager;
	 */
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		try {
			// Obtém o factory a partir da unidade de persistência.
			factory = Persistence.createEntityManagerFactory("BancoPU");
			// Cria um entity manager.
			entityManager = factory.createEntityManager();
			// Fecha o factory para liberar os recursos utilizado.
		} finally {
			factory.close();
		}
		return entityManager;
	}

	public void salvar(Pessoa pessoa) {
		EntityManager entityManager = getEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pessoa);
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			// por mensagem "erro ao salvar + item"
		} finally {
			entityManager.getTransaction().commit();
			// por mensagem "salvo com sucesso!"
		}
	}

	public void excluir(int id) {
		EntityManager entityManager = getEntityManager();
		try {
			// Inicia uma transação com o banco de dados.
			entityManager.getTransaction().begin();
			/*
			 * Consulta a pessoa na base de dados através do seu ID.
			 */
			Pessoa pessoa = consultar(id);
			System.out.println("Excluindo a pessoa: " + pessoa.getNome());

			// Remove a pessoa da base de dados.
			entityManager.remove(pessoa);
			// Finaliza a transação.
			entityManager.getTransaction().commit();
		} finally {
			entityManager.close();
		}
	}

	public void incluir(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

	public Pessoa consultar(int id) {
		EntityManager entityManager = getEntityManager();
		Pessoa pessoa = null;

		try {
			pessoa = entityManager.find(Pessoa.class, id);
		} finally {
			entityManager.close();
		}
		return pessoa;
	}

	public void alterar(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}
}