package com.gustavo.FormPessoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.gustavo.DAO.*;
import com.gustavo.FormPadrao.FormPadrao;
import com.gustavo.models.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FormPessoa extends FormPadrao {
	private JTextField tFNome;
	private JTextField tFSobrenome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPessoa frame = new FormPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormPessoa() {
		setBounds(100, 100, 450, 300);
		
		tFNome = new JTextField();
		tFNome.setBounds(10, 83, 414, 20);
		getContentPane().add(tFNome);
		tFNome.setColumns(10);
		
		tFSobrenome = new JTextField();
		tFSobrenome.setColumns(10);
		tFSobrenome.setBounds(10, 139, 414, 20);
		getContentPane().add(tFSobrenome);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 58, 414, 14);
		getContentPane().add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(10, 114, 414, 14);
		getContentPane().add(lblSobrenome);
	}

	@Override
	protected void onSalvarClick(ActionEvent event) {
		super.onSalvarClick(event);
		Pessoa p = new Pessoa(0, tFNome.getText(),tFSobrenome.getText());
		PessoaDAO pd = new PessoaDAO();
		pd.salvar(p);
		JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		limpaCampo();
	
	}
	
	private void limpaCampo() {
		tFNome.setText("");
		tFSobrenome.setText("");
		tFNome.requestFocus();
	}
}
