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
	private static JTextField textFieldNota;

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
		
		JLabel lblNota = new JLabel("Nota[]:");
		lblNota.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNota.setBounds(212, 120, 72, 31);
		frame.getContentPane().add(lblNota);
		
		textFieldNota = new JTextField();
		textFieldNota.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNota.setColumns(10);
		textFieldNota.setBounds(294, 122, 72, 30);
		frame.getContentPane().add(textFieldNota);
		
		JButton botaoProximo = new JButton("Pr\u00F3ximo");
		botaoProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ControllerAluno.criaNota();
				
			}
		});
		botaoProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoProximo.setBounds(216, 187, 150, 40);
		frame.getContentPane().add(botaoProximo);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		NotaForm.frame = frame;
	}

	public static JTextField getTextFieldNota() {
		return textFieldNota;
	}

	public static void setTextFieldNota(JTextField textFieldNota) {
		NotaForm.textFieldNota = textFieldNota;
	}
}
