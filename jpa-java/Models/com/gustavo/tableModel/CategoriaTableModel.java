package com.gustavo.tableModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;

import com.gustavo.models.Categoria;
import com.gustavo.DAO.CategoriaDAO;

	public class CategoriaTableModel extends AbstractTableModel {
		
		CategoriaDAO categoriaDao = new CategoriaDAO();
		
		
		// Variável do tipo list, setando a lista na variável dados;
		public List<Categoria> dados = new ArrayList<Categoria>();
		
		//Construtor busca categoria por ID ( RETORNA 1  categoria , na lista )
		public void buscarTodosOuId(int id) {
			
			if (id == 0) {
				dados = categoriaDao.consultarTodos();
			} else {
				dados = categoriaDao.consultarByIdList(id);
			}
		}
		//Construtor busca todas as categorias ( retorna todos na lista )
		public CategoriaTableModel() {
			
		}
		
		private String[] colunas = {"id", "nome"};
		
		 public String getColumnName(int column) {
		    return colunas[column];

		}   
		public int getRowCount() {
			
			return dados.size();
			
		}
		public int getColumnCount() {
			return colunas.length;
		}
		public Object getValueAt(int linha, int coluna) {
			
			switch (coluna) {
			case 0:
				return dados.get(linha).getId();
			case 1:
				return dados.get(linha).getNome();
			}
			return null;
		}
		
	public void addRow(Categoria dadosCategoria) {
		this.dados.add(dadosCategoria);
		this.fireTableDataChanged();
	}
		
	public void removeRow(int linha) {
		this.dados.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}

}
