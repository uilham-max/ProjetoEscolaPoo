package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.ControllerAluno;
import controller.ControllerLista;
import model.Aluno;
import model.Disciplina;
import model.Professor;

import javax.swing.JTextArea;

public class MostrarDados {

	private static JFrame frame;
	private JTable table;
	public static JComboBox comboBoxAluno;
	public static JComboBox comboBoxProfessor;
	public static JTextArea textAreaMostrarDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarDados window = new MostrarDados();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MostrarDados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//quando clicar na combo box esse codigo que roda
		//---------------------------ALUNOS-------------------------------
		comboBoxAluno = new JComboBox();
		comboBoxAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxAluno.getSelectedItem() != "Alunos") {
					comboBoxProfessor .setSelectedIndex(0);
					//chamar o método mostrarItemSelecionadoAluno na ControllerLista passando a combobox com o item selecionado
					ControllerLista.mostrarItemSelecionadoAluno(comboBoxAluno.getSelectedIndex());
				}
			}
		});
		comboBoxAluno.setBounds(159, 150, 182, 36);
		frame.getContentPane().add(comboBoxAluno);
		
		// criar uma comboBox em ControllerLista passando a comboBoxAluno
		ControllerLista.criarComboBoxAluno(comboBoxAluno);
		
		//quando clicar na combo box esse codigo que roda
		//-------------------------PROFESSORES--------------------------------------------
		
		comboBoxProfessor = new JComboBox();
		comboBoxProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxProfessor.getSelectedItem() != "Professores") {
					comboBoxAluno.setSelectedIndex(0);
					ControllerLista.mostrarItemSelecionadoProfessor(comboBoxProfessor.getSelectedIndex());
				}
			}
		});
		comboBoxProfessor.setBounds(159, 200, 182, 36);
		frame.getContentPane().add(comboBoxProfessor);

		ControllerLista.criarComboBoxProfessor(comboBoxProfessor);
		
		
		JLabel lblProfessores = new JLabel("Professores:");
		lblProfessores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProfessores.setBounds(23, 196, 125, 36);
		frame.getContentPane().add(lblProfessores);
		
		JLabel lblNewLabelAlunos = new JLabel("Alunos:");
		lblNewLabelAlunos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabelAlunos.setBounds(73, 150, 75, 36);
		frame.getContentPane().add(lblNewLabelAlunos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(null);
				MostrarDados.getFrame().dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVoltar.setBounds(174, 267, 150, 40);
		frame.getContentPane().add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 56, 320, 414);
		frame.getContentPane().add(scrollPane);
		
		textAreaMostrarDados = new JTextArea();
		textAreaMostrarDados.setEditable(false);
		scrollPane.setViewportView(textAreaMostrarDados);
		
		JLabel lblNewLabelInformações = new JLabel("Informa\u00E7\u00F5es");
		lblNewLabelInformações.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabelInformações.setBounds(485, 10, 155, 36);
		frame.getContentPane().add(lblNewLabelInformações);
		
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		MostrarDados.frame = frame;
	}


	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
