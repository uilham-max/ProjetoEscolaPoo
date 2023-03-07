package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controller.ControllerAluno;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.SecureDirectoryStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisciplinaForm {

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
					DisciplinaForm window = new DisciplinaForm();
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
	public DisciplinaForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 694, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDisciplina = new JLabel("Nome da Disciplina:");
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomeDisciplina.setBounds(32, 38, 215, 31);
		frame.getContentPane().add(lblNomeDisciplina);
		
		textFieldNomeDisciplina = new JTextField();
		textFieldNomeDisciplina.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNomeDisciplina.setColumns(10);
		textFieldNomeDisciplina.setBounds(257, 38, 379, 30);
		frame.getContentPane().add(textFieldNomeDisciplina);
		
		JButton botaoProximo = new JButton("Pr\u00F3ximo");
		botaoProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

//				textFieldNomeDisciplina.setText("POO");
				
				ControllerAluno.fim();
				
			}
		});
		botaoProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoProximo.setBounds(373, 224, 171, 40);
		frame.getContentPane().add(botaoProximo);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota1.setBounds(158, 79, 73, 31);
		frame.getContentPane().add(lblNota1);
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota1.setColumns(10);
		textFieldNota1.setBounds(257, 81, 72, 30);
		frame.getContentPane().add(textFieldNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota2.setBounds(158, 120, 73, 31);
		frame.getContentPane().add(lblNota2);
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota2.setColumns(10);
		textFieldNota2.setBounds(257, 121, 72, 30);
		frame.getContentPane().add(textFieldNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota3.setBounds(158, 161, 73, 31);
		frame.getContentPane().add(lblNota3);
		
		textFieldNota3 = new JTextField();
		textFieldNota3.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota3.setColumns(10);
		textFieldNota3.setBounds(257, 161, 72, 30);
		frame.getContentPane().add(textFieldNota3);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				ControllerAluno.criaDisciplina();
				
				
				
			}
		});
		botaoSalvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoSalvar.setBounds(158, 224, 171, 40);
		frame.getContentPane().add(botaoSalvar);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		DisciplinaForm.frame = frame;
	}

	public static JTextField getTextFieldNomeDisciplina() {
		return textFieldNomeDisciplina;
	}

	public static void setTextFieldNomeDisciplina(JTextField textFieldNomeDisciplina) {
		DisciplinaForm.textFieldNomeDisciplina = textFieldNomeDisciplina;
	}

	public static JTextField getTextFieldNota1() {
		return textFieldNota1;
	}

	public static void setTextFieldNota1(JTextField textFieldNota1) {
		DisciplinaForm.textFieldNota1 = textFieldNota1;
	}

	public static JTextField getTextFieldNota2() {
		return textFieldNota2;
	}

	public static void setTextFieldNota2(JTextField textFieldNota2) {
		DisciplinaForm.textFieldNota2 = textFieldNota2;
	}

	public static JTextField getTextFieldNota3() {
		return textFieldNota3;
	}

	public static void setTextFieldNota3(JTextField textFieldNota3) {
		DisciplinaForm.textFieldNota3 = textFieldNota3;
	}
}
