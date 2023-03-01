package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DisciplinaForm {

	private JFrame frame;
	private JTextField textFieldNomeDisciplina;
	private JTextField textFieldNumeroNotas;

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
		frame.setBounds(100, 100, 694, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDisciplina = new JLabel("Disciplina:");
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomeDisciplina.setBounds(147, 128, 106, 31);
		frame.getContentPane().add(lblNomeDisciplina);
		
		textFieldNomeDisciplina = new JTextField();
		textFieldNomeDisciplina.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNomeDisciplina.setColumns(10);
		textFieldNomeDisciplina.setBounds(263, 128, 200, 30);
		frame.getContentPane().add(textFieldNomeDisciplina);
		
		JButton botaoProximo = new JButton("Pr\u00F3ximo");
		botaoProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			}
		});
		botaoProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoProximo.setBounds(263, 246, 150, 40);
		frame.getContentPane().add(botaoProximo);
		
		JLabel lblNumeroNotas = new JLabel("N\u00BA de Notas:");
		lblNumeroNotas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNumeroNotas.setBounds(127, 169, 126, 31);
		frame.getContentPane().add(lblNumeroNotas);
		
		textFieldNumeroNotas = new JTextField();
		textFieldNumeroNotas.setFont(new Font("Dialog", Font.BOLD, 15));
		textFieldNumeroNotas.setColumns(10);
		textFieldNumeroNotas.setBounds(263, 170, 200, 30);
		frame.getContentPane().add(textFieldNumeroNotas);
	}
}
