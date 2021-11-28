package com.gustavo.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.gustavo.interfaces.ICategoria;
import com.gustavo.models.*;

public class CategoriaDAO implements ICategoria {

	private EntityManagerFactory factory = null;
	private EntityManager entityManager = null;

	private EntityManager getEntityManager() {
		
		try {
			// Obt�m o factory a partir da unidade de persist�ncia.
		if (factory == null)
			factory = Persistence.createEntityManagerFactory("BancoPU");
			// Cria um entity manager.
		if (entityManager == null)	
			entityManager = factory.createEntityManager();
			// Fecha o factory para liberar os recursos utilizado.
		} finally {
			//factory.close();
		}
		return entityManager;
		}

	public void salvar(Categoria categoria) {
		entityManager = getEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(categoria);
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			// por mensagem "erro ao salvar + item"
		} finally {
			entityManager.getTransaction().commit();
			// por mensagem "salvo com sucesso!"
		}
	}

	public void excluir(int id) {
		// TODO Auto-generated method stub

	}

	public void incluir(Categoria categoria) {
		// TODO Auto-generated method stub

	}

	// M�todo consultar id, do tipo Categoria, cria vari�vel para fazer o find;
	public Categoria consultarById(int id) {
		entityManager = getEntityManager();
		Categoria categoria = null;

		try {
			categoria = entityManager.find(Categoria.class, id);
		} finally {
			// entityManager.close();
		}
		return categoria;
	}

	/*
	 * M�todo consultar Id + o resto; faz uma vari�vel que recebe o list categoria
	 * do tipo arrayList, instancia uma vari�vel do tipo categoria e faz o
	 * find(redundante, pois j� existe um m�todo fazendo isso) depois adiciona o
	 * categoria(vari�vel com apenas id) no categorias (vari�vel setado com o
	 * List<Categorias>());
	 */
	public List<Categoria> consultarByIdList(int id) {
		entityManager = getEntityManager();

		List<Categoria> categorias = new ArrayList<Categoria>();
		Categoria categoria = new Categoria();
		categoria = entityManager.find(Categoria.class, id);
		// entityManager.find(Categoria.class, id);
		categorias.add(categoria);
		return categorias;
	}

	public void alterar(Categoria categoria) {
		// TODO Auto-generated method stub

	}

	public List<Categoria> consultarTodos() {
		entityManager = getEntityManager();
		TypedQuery<Categoria> consulta = entityManager.createQuery("SELECT cat FROM Categoria cat", Categoria.class);
		List<Categoria> categorias = consulta.getResultList();
		return categorias;
	}
}