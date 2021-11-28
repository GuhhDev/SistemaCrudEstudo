package com.gustavo.FormPadrao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import java.awt.event.*;

public class FormPadrao extends JFrame {

	private JPanel contentPane;

	protected static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	protected static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPadrao frame = new FormPadrao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public FormPadrao() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 220, 434, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(335, 11, 89, 23);
		btnSalvar.addActionListener(new ConfirmActionListener());
		panel.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(236, 11, 89, 23);
		panel.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(109, 11, 89, 23);
		panel.add(btnExcluir);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 11, 89, 23);
		panel.add(btnNovo);
		
	}
	
	// Eventos criados para serem utilizados nas telas herdadas
		protected void onSalvarClick(ActionEvent event) {}
		private class ConfirmActionListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {onSalvarClick(event);
				//JOptionPane.showMessageDialog(null, this.getClass());
		    }
		}
	
}
