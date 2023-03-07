package view;
import model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControllerAluno;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class AlunoForm {

	private static JFrame frmCadastro;
	private static JTextField textFieldNome;
	private static JTextField textFieldIdade;
	private static JTextField textFieldCpf;
	private static JTextField textFieldDataMat;
	private static JTextField textFieldEscola;
	private static JTextField textFieldSemestre;
	private JLabel lblIdade;
	private JLabel lblCpf;
	private JLabel lblDataMatricula;
	private JLabel lblEscola;
	private JLabel lblSemestre;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoForm window = new AlunoForm();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AlunoForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		
		
		frmCadastro = new JFrame();
		frmCadastro.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		frmCadastro.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCadastro.getContentPane().setLayout(null);
		
		
		
		JLabel lblNome = new JLabel("Nome:");								
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBounds(156, 48, 66, 31);
		frmCadastro.getContentPane().add(lblNome);
		
		textFieldNome = new JTextField();								
		textFieldNome.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNome.setBounds(232, 48, 200, 30);
		frmCadastro.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		
		
		lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIdade.setBounds(156, 87, 66, 31);
		frmCadastro.getContentPane().add(lblIdade);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldIdade.setColumns(10);
		textFieldIdade.setBounds(232, 88, 200, 30);
		frmCadastro.getContentPane().add(textFieldIdade);
		
		
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCpf.setBounds(176, 127, 46, 31);
		frmCadastro.getContentPane().add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldCpf.setColumns(10);
		textFieldCpf.setBounds(232, 128, 200, 30);
		frmCadastro.getContentPane().add(textFieldCpf);
		
		
		
		lblDataMatricula = new JLabel("Data Mat:");
		lblDataMatricula.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDataMatricula.setBounds(124, 168, 98, 31);
		frmCadastro.getContentPane().add(lblDataMatricula);
		
		textFieldDataMat = new JTextField();
		textFieldDataMat.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldDataMat.setColumns(10);
		textFieldDataMat.setBounds(232, 169, 200, 30);
		frmCadastro.getContentPane().add(textFieldDataMat);

		
		
		lblEscola = new JLabel("Escola:");
		lblEscola.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEscola.setBounds(152, 209, 70, 31);
		frmCadastro.getContentPane().add(lblEscola);
		
		textFieldEscola = new JTextField();
		textFieldEscola.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldEscola.setColumns(10);
		textFieldEscola.setBounds(232, 209, 200, 30);
		frmCadastro.getContentPane().add(textFieldEscola);

		
		
		lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSemestre.setBounds(120, 248, 102, 31);
		frmCadastro.getContentPane().add(lblSemestre);
		
		textFieldSemestre = new JTextField();
		textFieldSemestre.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldSemestre.setColumns(10);
		textFieldSemestre.setBounds(232, 249, 200, 30);
		frmCadastro.getContentPane().add(textFieldSemestre);
		
		
		
		JButton botaoProximo = new JButton("Pr\u00F3ximo");
		botaoProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textFieldNome.setText("Uilham de Oliveira");
				textFieldIdade.setText("18");
				textFieldCpf.setText("00505131092");
				textFieldDataMat.setText("07/03/2023");
				textFieldEscola.setText("Jose de Abreu");
				textFieldSemestre.setText("2");
			
				ControllerAluno.criaAluno();
			}
		});
		botaoProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoProximo.setBounds(258, 300, 150, 40);
		frmCadastro.getContentPane().add(botaoProximo);
		frmCadastro.setTitle("Cadastro de aluno");
		frmCadastro.setBounds(100, 100, 636, 440);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public static void setTextFieldNome(JTextField textFieldNome) {
		AlunoForm.textFieldNome = textFieldNome;
	}
	
	public static JFrame getFrmCadastro() {
		return frmCadastro;
	}

	public static void setFrmCadastro(JFrame frmCadastro) {
		AlunoForm.frmCadastro = frmCadastro;
	}


	public static JTextField getTextFieldIdade() {
		return textFieldIdade;
	}

	public static void setTextFieldIdade(JTextField textFieldIdade) {
		AlunoForm.textFieldIdade = textFieldIdade;
	}

	public static JTextField getTextFieldCpf() {
		return textFieldCpf;
	}

	public static void setTextFieldCpf(JTextField textFieldCpf) {
		AlunoForm.textFieldCpf = textFieldCpf;
	}

	public static JTextField getTextFieldDataMat() {
		return textFieldDataMat;
	}

	public static void setTextFieldDataMat(JTextField textFieldDataMat) {
		AlunoForm.textFieldDataMat = textFieldDataMat;
	}

	public static JTextField getTextFieldEscola() {
		return textFieldEscola;
	}

	public static void setTextFieldEscola(JTextField textFieldEscola) {
		AlunoForm.textFieldEscola = textFieldEscola;
	}

	public static JTextField getTextFieldSemestre() {
		return textFieldSemestre;
	}

	public static void setTextFieldSemestre(JTextField textFieldSemestre) {
		AlunoForm.textFieldSemestre = textFieldSemestre;
	}

	
}








