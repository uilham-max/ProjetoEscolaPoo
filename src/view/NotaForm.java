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

public class NotaForm {

	private static JFrame frame;
	private static JTextField textFieldNota1;
	public static JLabel lblNota1;
	private static JTextField textFieldNota2;
	private static JTextField textFieldNota3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotaForm window = new NotaForm();
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
	public NotaForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota1.setBounds(211, 120, 73, 31);
		frame.getContentPane().add(lblNota1);
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota1.setColumns(10);
		textFieldNota1.setBounds(294, 122, 72, 30);
		frame.getContentPane().add(textFieldNota1);
		
		JButton botaoProximo = new JButton("Pr\u00F3ximo");
		botaoProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ControllerAluno.criaNota();
				
			}
		});
		botaoProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoProximo.setBounds(216, 272, 150, 40);
		frame.getContentPane().add(botaoProximo);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota2.setBounds(211, 161, 73, 31);
		frame.getContentPane().add(lblNota2);
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota2.setColumns(10);
		textFieldNota2.setBounds(294, 163, 72, 30);
		frame.getContentPane().add(textFieldNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota3.setBounds(211, 202, 73, 31);
		frame.getContentPane().add(lblNota3);
		
		textFieldNota3 = new JTextField();
		textFieldNota3.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota3.setColumns(10);
		textFieldNota3.setBounds(294, 204, 72, 30);
		frame.getContentPane().add(textFieldNota3);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		NotaForm.frame = frame;
	}

	public static JTextField getTextFieldNota1() {
		return textFieldNota1;
	}

	public static void setTextFieldNota1(JTextField textFieldNota) {
		NotaForm.textFieldNota1 = textFieldNota;
	}

	public static JTextField getTextFieldNota2() {
		return textFieldNota2;
	}

	public static void setTextFieldNota2(JTextField textFieldNota2) {
		NotaForm.textFieldNota2 = textFieldNota2;
	}

	public static JTextField getTextFieldNota3() {
		return textFieldNota3;
	}

	public static void setTextFieldNota3(JTextField textFieldNota3) {
		NotaForm.textFieldNota3 = textFieldNota3;
	}
}
