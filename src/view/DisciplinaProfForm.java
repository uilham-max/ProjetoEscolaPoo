package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controller.ControllerProfessor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisciplinaProfForm {

	private static JFrame frame;
	private static JTextField textFieldNomeDisciplina;
	private static JTextField textFieldNota1;
	private static JTextField textFieldNota2;
	private static JTextField textFieldNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisciplinaProfForm window = new DisciplinaProfForm();
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
	public DisciplinaProfForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDisciplina = new JLabel("Disciplina:");
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomeDisciplina.setBounds(57, 34, 106, 31);
		frame.getContentPane().add(lblNomeDisciplina);
		
		textFieldNomeDisciplina = new JTextField();
		textFieldNomeDisciplina.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNomeDisciplina.setColumns(10);
		textFieldNomeDisciplina.setBounds(189, 34, 254, 30);
		frame.getContentPane().add(textFieldNomeDisciplina);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota1.setBounds(90, 75, 73, 31);
		frame.getContentPane().add(lblNota1);
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota1.setColumns(10);
		textFieldNota1.setBounds(189, 77, 72, 30);
		frame.getContentPane().add(textFieldNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota2.setBounds(90, 116, 73, 31);
		frame.getContentPane().add(lblNota2);
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota2.setColumns(10);
		textFieldNota2.setBounds(189, 117, 72, 30);
		frame.getContentPane().add(textFieldNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota3.setBounds(90, 157, 73, 31);
		frame.getContentPane().add(lblNota3);
		
		textFieldNota3 = new JTextField();
		textFieldNota3.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota3.setColumns(10);
		textFieldNota3.setBounds(189, 157, 72, 30);
		frame.getContentPane().add(textFieldNota3);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				textFieldNomeDisciplina.setText("poo");
//				textFieldNota1.setText("5");
//				textFieldNota2.setText("9");
//				textFieldNota3.setText("6");
				ControllerProfessor.criaDisciplina();
			
			}
		});
		botaoSalvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoSalvar.setBounds(57, 219, 171, 40);
		frame.getContentPane().add(botaoSalvar);
		
		JButton botaoTerminar = new JButton("Terminar");
		botaoTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				ControllerProfessor.fim();
				DisciplinaProfForm.getFrame().dispose();
			}
		});
		botaoTerminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoTerminar.setBounds(272, 219, 171, 40);
		frame.getContentPane().add(botaoTerminar);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		DisciplinaProfForm.frame = frame;
	}

	public static JTextField getTextFieldNomeDisciplina() {
		return textFieldNomeDisciplina;
	}

	public static void setTextFieldNomeDisciplina(JTextField textFieldNomeDisciplina) {
		DisciplinaProfForm.textFieldNomeDisciplina = textFieldNomeDisciplina;
	}

	public static JTextField getTextFieldNota1() {
		return textFieldNota1;
	}

	public static void setTextFieldNota1(JTextField textFieldNota1) {
		DisciplinaProfForm.textFieldNota1 = textFieldNota1;
	}

	public static JTextField getTextFieldNota2() {
		return textFieldNota2;
	}

	public static void setTextFieldNota2(JTextField textFieldNota2) {
		DisciplinaProfForm.textFieldNota2 = textFieldNota2;
	}

	public static JTextField getTextFieldNota3() {
		return textFieldNota3;
	}

	public static void setTextFieldNota3(JTextField textFieldNota3) {
		DisciplinaProfForm.textFieldNota3 = textFieldNota3;
	}

}
