package com.gustavo.interfaces;

import javax.persistence.EntityManager;
import com.gustavo.interfaces.*;
import com.gustavo.models.Pessoa;

public interface IPessoa {

	void salvar(Pessoa pessoa);
	
	void excluir(int id);
	
	void incluir(Pessoa pessoa);
	
	Pessoa consultar(int id);
	
	void alterar(Pessoa pessoa);
}
