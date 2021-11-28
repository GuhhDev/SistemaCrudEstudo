package com.gustavo.FormSistemaMenu;

import java.awt.EventQueue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.gustavo.FormCategoria.FormCategoria;
import com.gustavo.FormCategoria.FormCategoriaView;
import com.gustavo.FormPessoa.FormPessoa;

import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSistemaMenu {

	private JFrame frmSistemaTech;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSistemaMenu window = new FormSistemaMenu();
					window.frmSistemaTech.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormSistemaMenu() {
		initialize();
	}

	private void initialize() {
		frmSistemaTech = new JFrame();
		frmSistemaTech.setTitle("Sistema TechPRO");
		frmSistemaTech.setBounds(100, 100, 652, 423);
		frmSistemaTech.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmSistemaTech.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmPessoa = new JMenuItem("Pessoa");
		mntmPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chamando categoria 
				FormPessoa formPessoa = new FormPessoa(); 
				frmSistemaTech.setTitle("Pessoa");
				formPessoa.setVisible(true);
			}
		});
		mnNewMenu.add(mntmPessoa);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mntmCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chamando categoria 
				FormCategoria formCategoria = new FormCategoria(); 
				formCategoria.setVisible(true);
			}
		});
		mnNewMenu.add(mntmCategoria);
		
		JMenu mnNewMenu_1 = new JMenu("Visualizar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmVisualizar = new JMenuItem("Visualizar Categoria");
		mntmVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCategoriaView view = new FormCategoriaView();
				view.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmVisualizar);
		
		JMenu mnNewMenu_2 = new JMenu("Usu\u00E1rio");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Estabelecimento");
		menuBar.add(mnNewMenu_3);
		
	}

}
