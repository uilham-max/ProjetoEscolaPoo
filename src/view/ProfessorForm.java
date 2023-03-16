package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import controller.ControllerProfessor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfessorForm {

	private static JFrame frame;
	private static JTextField textFieldNome;
	private static JTextField textFieldIdade;
	private static JTextField textFieldCpf;
	private static JTextField textFieldInscMatricula;
	private static JTextField textFieldEscola;
	private static JTextField textFieldArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfessorForm window = new ProfessorForm();
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
	public ProfessorForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 612, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBounds(128, 22, 66, 31);
		frame.getContentPane().add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(204, 24, 307, 30);
		frame.getContentPane().add(textFieldNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIdade.setBounds(128, 63, 66, 31);
		frame.getContentPane().add(lblIdade);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldIdade.setColumns(10);
		textFieldIdade.setBounds(204, 64, 307, 30);
		frame.getContentPane().add(textFieldIdade);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCpf.setBounds(148, 103, 46, 31);
		frame.getContentPane().add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldCpf.setColumns(10);
		textFieldCpf.setBounds(204, 104, 307, 30);
		frame.getContentPane().add(textFieldCpf);
		
		JLabel lblDataMatricula = new JLabel("Matricula:");
		lblDataMatricula.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDataMatricula.setBounds(92, 144, 102, 31);
		frame.getContentPane().add(lblDataMatricula);
		
		textFieldInscMatricula = new JTextField();
		textFieldInscMatricula.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldInscMatricula.setColumns(10);
		textFieldInscMatricula.setBounds(204, 145, 307, 30);
		frame.getContentPane().add(textFieldInscMatricula);
		
		textFieldEscola = new JTextField();
		textFieldEscola.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldEscola.setColumns(10);
		textFieldEscola.setBounds(204, 185, 307, 30);
		frame.getContentPane().add(textFieldEscola);
		
		JLabel lblEscola = new JLabel("Escola:");
		lblEscola.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEscola.setBounds(124, 185, 70, 31);
		frame.getContentPane().add(lblEscola);
		
		JLabel lblSemestre = new JLabel("Area:");
		lblSemestre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSemestre.setBounds(134, 223, 102, 31);
		frame.getContentPane().add(lblSemestre);
		
		textFieldArea = new JTextField();
		textFieldArea.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldArea.setColumns(10);
		textFieldArea.setBounds(204, 225, 307, 30);
		frame.getContentPane().add(textFieldArea);
		
		JButton botaoProximo = new JButton("Pr\u00F3ximo");
		botaoProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textFieldNome.setText("Bryan Teixera");
				textFieldIdade.setText("27");
				textFieldCpf.setText("00505131092");
				textFieldInscMatricula.setText("1040");
				textFieldEscola.setText("Instututo Federal");
//				textFieldArea.setText("Tecnologia");
			
				ControllerProfessor.criarProfessor();
			}
		});
		botaoProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoProximo.setBounds(233, 280, 150, 40);
		frame.getContentPane().add(botaoProximo);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		ProfessorForm.frame = frame;
	}

	public static JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public static void setTextFieldNome(JTextField textFieldNome) {
		ProfessorForm.textFieldNome = textFieldNome;
	}

	public static JTextField getTextFieldIdade() {
		return textFieldIdade;
	}

	public static void setTextFieldIdade(JTextField textFieldIdade) {
		ProfessorForm.textFieldIdade = textFieldIdade;
	}

	public static JTextField getTextFieldCpf() {
		return textFieldCpf;
	}

	public static void setTextFieldCpf(JTextField textFieldCpf) {
		ProfessorForm.textFieldCpf = textFieldCpf;
	}

	public static JTextField getTextFieldInscMatricula() {
		return textFieldInscMatricula;
	}

	public static void setTextFieldInscMatricula(JTextField textFieldInscMatricula) {
		ProfessorForm.textFieldInscMatricula = textFieldInscMatricula;
	}

	public static JTextField getTextFieldEscola() {
		return textFieldEscola;
	}

	public static void setTextFieldEscola(JTextField textFieldEscola) {
		ProfessorForm.textFieldEscola = textFieldEscola;
	}

	public static JTextField getTextFieldArea() {
		return textFieldArea;
	}

	public static void setTextFieldArea(JTextField textFieldArea) {
		ProfessorForm.textFieldArea = textFieldArea;
	}


	
}
