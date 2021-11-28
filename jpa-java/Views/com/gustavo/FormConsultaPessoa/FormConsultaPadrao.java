package com.gustavo.FormConsultaPessoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class FormConsultaPadrao extends JFrame {

	private JPanel contentPane;
	private JTextField tFArgumento;
	private JTable table;
	private javax.swing.JScrollPane jScrollPane1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormConsultaPadrao frame = new FormConsultaPadrao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormConsultaPadrao() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox JCbTipo = new JComboBox();
		JCbTipo.setModel(new DefaultComboBoxModel(new String[] {"ID", "Nome", "Email", "CPF"}));
		JCbTipo.setBounds(10, 39, 88, 28);
		contentPane.add(JCbTipo);
		
		JLabel lblConsultaPor = new JLabel("Consulta por:");
		lblConsultaPor.setBounds(10, 20, 88, 14);
		contentPane.add(lblConsultaPor);
		
		JLabel lblPesquisarPor = new JLabel("Digite o Argumento:");
		lblPesquisarPor.setBounds(115, 20, 123, 14);
		contentPane.add(lblPesquisarPor);
		
		tFArgumento = new JTextField();
		tFArgumento.setBounds(115, 39, 430, 28);
		contentPane.add(tFArgumento);
		tFArgumento.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(52);
		table.getColumnModel().getColumn(1).setPreferredWidth(172);
		table.getColumnModel().getColumn(2).setPreferredWidth(190);
		table.getColumnModel().getColumn(3).setPreferredWidth(191);
		table.setBounds(10, 84, 535, 257);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(584, 84, 175, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(584, 218, 175, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Alterar");
		btnNewButton_1_1.setBounds(584, 151, 175, 56);
		contentPane.add(btnNewButton_1_1);
		
	}
}
