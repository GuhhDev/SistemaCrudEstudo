package com.gustavo.FormCategoria;
import java.awt.EventQueue;
import javax.swing.JFrame;
import com.gustavo.DAO.*;
import com.gustavo.FormPadrao.FormPadrao;
import com.gustavo.models.*;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FormCategoria extends FormPadrao {
	private JTextField tFDescricao;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCategoria frame = new FormCategoria();
					frame.setVisible(true);
					frame.setTitle("Categoria");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FormCategoria() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		tFDescricao = new JTextField();
		tFDescricao.setBounds(40, 99, 339, 20);
		getContentPane().add(tFDescricao);
		tFDescricao.setColumns(10);
		
		JLabel nLNome = new JLabel("Digite a Categoria:");
		nLNome.setBounds(43, 67, 180, 14);
		getContentPane().add(nLNome);
	}
	@Override
	protected void onSalvarClick(ActionEvent event) {
		super.onSalvarClick(event);
		Categoria c = new Categoria(0, tFDescricao.getText());
		CategoriaDAO cd = new CategoriaDAO();
		cd.salvar(c);
		//JOptionPane.showMessageDialog(null, MensagemPadrao.MENSAGEM_SALVAR);
	}
}